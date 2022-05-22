package crypto.forestfish.utils;

import java.io.IOException;
import java.net.ConnectException;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpRequestUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(HttpRequestUtils.class);
	
	public static String getBodyUsingGETUrlRequest(String url) {
		try {
			Document doc = Jsoup.connect(url).ignoreContentType(true).get();
			String res = Jsoup.parse(doc.toString()).body().text();
			return res;
		} catch (ConnectException ce) {
			LOGGER.warn("Connection exception: " + ce.getMessage());
		} catch (HttpStatusException he) {
			LOGGER.warn("HTTP status exception: " + he.getMessage());
		} catch (IOException e) {
			LOGGER.warn("e: " + e.getMessage());
			LOGGER.warn("exception class: " + e.getClass());
		}
		return "";
	}
	
	public static String getBodyUsingGETUrlRequestAndJWTToken(String url, String jwtToken) {
		try {
			Document doc = Jsoup.connect(url)
					.header("Authorization", "Bearer " + jwtToken)
					.ignoreContentType(true).get();
			String res = Jsoup.parse(doc.toString()).body().text();
			return res;
		} catch (ConnectException ce) {
			LOGGER.warn("Connection exception: " + ce.getMessage());
		} catch (HttpStatusException he) {
			LOGGER.warn("HTTP status exception: " + he.getMessage());
		} catch (IOException e) {
			LOGGER.warn("e: " + e.getMessage());
			LOGGER.warn("exception class: " + e.getClass());
		}
		return "";
	}
	
	public static String getBodyUsingUrlPOSTRequestWithJsonBody(String url, String jsonBody) {
		try {
			Document doc = Jsoup.connect(url).ignoreContentType(true)
					.requestBody(jsonBody)
					.header("Content-Type", "application/json")
					.post();
			String res = Jsoup.parse(doc.toString()).body().text();
			return res;
		} catch (ConnectException ce) {
			LOGGER.warn("Connection exception: " + ce.getMessage());
		} catch (HttpStatusException he) {
			LOGGER.warn("HTTP status exception: " + he.getMessage());
		} catch (IOException e) {
			LOGGER.warn("e: " + e.getMessage());
			LOGGER.warn("exception class: " + e.getClass());
		}
		return "";
	}
}
