package crypto.forestfish.utils;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.netflix.graphql.dgs.client.CustomMonoGraphQLClient;
import com.netflix.graphql.dgs.client.GraphQLResponse;
import com.netflix.graphql.dgs.client.HttpResponse;
import com.netflix.graphql.dgs.client.MonoGraphQLClient;

import reactor.core.publisher.Mono;

public class GraphQLUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(GraphQLUtils.class);

	public static Mono<GraphQLResponse> executeQuery(String url, String graphqlQuery,
			HashMap<String, Object> queryArgs, Integer retryLimit, Integer sleepTimeInSecondsBetweenRetries) {

		int theGraphErrorCount = 0;

		while (theGraphErrorCount<=retryLimit) {

			if (theGraphErrorCount>0) {
				LOGGER.info("Making GraphQL query towards " + url + ", theGraphErrorCount=" + theGraphErrorCount + ", retryLimit=" + retryLimit);
			} else {
				LOGGER.info("Making GraphQL query towards " + url);
			}

			try {
				CustomMonoGraphQLClient client = MonoGraphQLClient.createCustomReactive(url, (requestUrl, headers, body) -> {
					HttpHeaders httpHeaders = new HttpHeaders();
					headers.forEach(httpHeaders::addAll);
					RestTemplate restTemplate = new RestTemplate();
					int graphErrorCount = 0;
					while (graphErrorCount<=retryLimit) {
						try {
							if (graphErrorCount>0) LOGGER.info("graphErrorCount: " + graphErrorCount);
							ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.POST, new HttpEntity<>(body, httpHeaders),String.class);
							return Mono.just(new HttpResponse(exchange.getStatusCode().value(), exchange.getBody(), exchange.getHeaders()));
						} catch (Exception e) {
							if (e.getMessage().contains("504 Gateway Time-out")) {
								LOGGER.warn("transitory exception: " + e.getMessage());
								SystemUtils.sleepInSeconds(sleepTimeInSecondsBetweenRetries);
								graphErrorCount++;
							} else if (e.getMessage().startsWith("522")) {
								LOGGER.warn("transitory exception: " + e.getMessage());
								SystemUtils.sleepInSeconds(sleepTimeInSecondsBetweenRetries);
								graphErrorCount++;
							} else {
								LOGGER.warn("unknown exception: " + e.getMessage());
								SystemUtils.sleepInSeconds(sleepTimeInSecondsBetweenRetries);
								graphErrorCount++;
							}
						}
						graphErrorCount++;
					}
					LOGGER.error("Unable to properly setup a session with \"theGraph\"");
					return null;
				});

				// Abort unless we have a connection
				if (null == client) {
					LOGGER.error("Unable to properly setup a session with \"theGraph\"");
					SystemUtils.halt();
				}
				Mono<GraphQLResponse> graphQLResponse = client.reactiveExecuteQuery(graphqlQuery, queryArgs);
				if (graphQLResponse.block().hasErrors()) {
					theGraphErrorCount++;
				} else {
					return graphQLResponse;
				}

				LOGGER.info("Hold on 5 secs ..");
				SystemUtils.sleepInSeconds(5);

			} catch (Exception e) {
				LOGGER.warn("Caught exception: " + e.getMessage());
				LOGGER.info("Hold on 5 secs ..");
				SystemUtils.sleepInSeconds(5);
			}

		}

		LOGGER.error("Unable to properly communicate with \"theGraph\"");
		return null;
	}
}
