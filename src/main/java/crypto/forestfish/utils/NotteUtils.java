package crypto.forestfish.utils;

import java.io.File;
import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;

import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.objects.api.nuit.ActionRequest;
import crypto.forestfish.objects.api.nuit.ErrorDetail;
import crypto.forestfish.objects.api.nuit.ObserveRequest;
import crypto.forestfish.objects.api.nuit.ObserveResponse;
import crypto.forestfish.objects.api.nuit.SessionStartRequest;
import crypto.forestfish.objects.api.nuit.SessionStatus;
import crypto.forestfish.objects.http.HttpCustomResponse;

public class NotteUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(NotteUtils.class);

	public static ObserveResponse action(String _apikey, String _session_id, String action_id, Boolean _keep_alive, Boolean _flush_screenshot, Boolean _flush_body) {
		ObserveResponse oresponse = null;
		int trycounter = 0;
		Boolean validpojo = false;
		Integer response_code = 0;
		while (!validpojo && (trycounter <= 50)) {
			trycounter++;
			try {
				ActionRequest ar = new ActionRequest(_session_id, action_id, _keep_alive, _keep_alive);
				String jsonBody = JSONUtils.createJSONFromPOJO(ar);
				
				// debug
				System.out.println("action json: ");
				System.out.println(jsonBody);
				
				HttpCustomResponse hcr = getBodyUsingPOSTURLRequest(_apikey, "https://api.notte.cc/env/step", jsonBody);
				if (null != hcr) {
					if (_flush_body) flushBody(_session_id, hcr.getResponse_body());
					if (hcr.getResponse_body().startsWith("{") && hcr.getResponse_body().endsWith("}")) {
						oresponse = JSONUtils.createPOJOFromJSONOpportunistic(hcr.getResponse_body(), ObserveResponse.class);
						if (null != oresponse) {
							if (_flush_screenshot) flushScreenshot(oresponse);
							return oresponse;
						}
					}
				} else {
					LOGGER.info("Unknown NUIT endpoint reply");
				}
			} catch (Exception e) {
				LOGGER.info("Caught NUIT exception: " + e.getMessage());
			}
			
			if (response_code == 0) {
				LOGGER.info("Unable to create NUIT session, response_code=" + response_code + ", DNS issues?");
				return null; // dns issue
			}
			if (response_code == 401) {
				LOGGER.info("Unable to create NUIT session, response_code=" + response_code + ", API key issue?");
				return null; // api key issue
			}
			SystemUtils.sleepInSeconds(5);
		}
		return oresponse;	
	}
	
	public static ObserveResponse observe(String _apikey, String _session_id, String url, Boolean _keep_alive, Boolean _flush_screenshot, Boolean _flush_body) {
		ObserveResponse oresponse = null;
		int trycounter = 0;
		Boolean validpojo = false;
		Integer response_code = 0;
		while (!validpojo && (trycounter <= 50)) {
			trycounter++;
			try {
				ObserveRequest or = new ObserveRequest(_session_id, url, _keep_alive);
				String jsonBody = JSONUtils.createJSONFromPOJO(or);
				HttpCustomResponse hcr = getBodyUsingPOSTURLRequest(_apikey, "https://api.notte.cc/env/observe", jsonBody);
				if (null != hcr) {
					if (_flush_body) flushBody(_session_id, hcr.getResponse_body());
					if (hcr.getResponse_body().startsWith("{") && hcr.getResponse_body().endsWith("}")) {
						oresponse = JSONUtils.createPOJOFromJSONOpportunistic(hcr.getResponse_body(), ObserveResponse.class);
						if (null != oresponse) {
							validpojo = true;
							if (_flush_screenshot) flushScreenshot(oresponse);
							return oresponse;
						}
					}
				} else {
					LOGGER.info("Unknown NUIT endpoint reply");
				}
			} catch (Exception e) {
				LOGGER.info("Caught NUIT exception: " + e.getMessage());
			}
			
			if (response_code == 0) {
				LOGGER.info("Unable to create NUIT session, response_code=" + response_code + ", DNS issues?");
				return null; // dns issue
			}
			if (response_code == 401) {
				LOGGER.info("Unable to create NUIT session, response_code=" + response_code + ", API key issue?");
				return null; // api key issue
			}
			SystemUtils.sleepInSeconds(5);
		}
		return oresponse;	
	}
	
	private static void flushBody(String _session_id, String _response_body) {
		String outfilename = "";
		int index = 1;
		while ("".equals(outfilename)) {
			File f = new File(_session_id + "_body_" + index + ".json");
			if (!f.exists()) {
				outfilename = _session_id + "_body_" + index + ".json";
			}
			index = index + 1;
		}
		FilesUtils.appendToFileUNIXNoException(_response_body, outfilename);
	}

	private static void flushScreenshot(ObserveResponse or) {
		if ((null != or.getScreenshot()) && (or.getScreenshot().length() > 200)) {
			String outfilename = "";
			int index = 1;
			while ("".equals(outfilename)) {
				File f = new File(or.getSession().getSession_id() + "_" + index + ".png");
				if (!f.exists()) {
					outfilename = or.getSession().getSession_id() + "_" + index + ".png";
				}
				index = index + 1;
			}
			try {
				StringsUtils.decodeBase64PNGToFile(or.getScreenshot(), outfilename);
			} catch (IOException e) {
				LOGGER.error("Caught exception while flushing to disk: " + e.getMessage());
				SystemUtils.halt();
			}
		}
	}

	public static SessionStatus sessionStart(String _apikey, Boolean _flush_body) {
		SessionStatus ssr = null;
		int trycounter = 0;
		Boolean validpojo = false;
		Integer response_code = 0;
		while (!validpojo && (trycounter <= 50)) {
			trycounter++;
			try {
				SessionStartRequest ss = new SessionStartRequest();
				String jsonBody = JSONUtils.createJSONFromPOJO(ss);
				HttpCustomResponse hcr = getBodyUsingPOSTURLRequest(_apikey, "https://api.notte.cc/session/start", jsonBody);
				if (null != hcr) {
					if (hcr.getResponse_body().startsWith("{") && hcr.getResponse_body().endsWith("}")) {
						ssr = JSONUtils.createPOJOFromJSONOpportunistic(hcr.getResponse_body(), SessionStatus.class);
						if (null != ssr) {
							if (_flush_body) flushBody(ssr.getSession_id(), hcr.getResponse_body());
							validpojo = true;
							return ssr;
						}
					}
				} else {
					LOGGER.info("Unknown NUIT endpoint reply");
				}
			} catch (Exception e) {
				LOGGER.info("Caught NUIT exception: " + e.getMessage());
			}
			
			if (response_code == 0) {
				LOGGER.info("Unable to create NUIT session, response_code=" + response_code + ", DNS issues?");
				return null; // dns issue
			}
			if (response_code == 401) {
				LOGGER.info("Unable to create NUIT session, response_code=" + response_code + ", API key issue?");
				return null; // api key issue
			}
			SystemUtils.sleepInSeconds(5);
		}
		return ssr;	
	}
	

	public static HttpCustomResponse getBodyUsingPOSTURLRequest(String jwtToken, String url, String body) {
		boolean keep_trying = true;
		int trycounter = 30;
		while (keep_trying && trycounter>0) {
			trycounter--;
			try {

				Response response = Jsoup.connect(url)
						.timeout(0)
						.header("Authorization", "Bearer " + jwtToken)
						.userAgent("Mozilla")
						.header("Content-Type", "application/json")
						.requestBody(body)
						.method(Method.POST)
						.ignoreHttpErrors(true)
						.ignoreContentType(true)
						.execute();

				//System.out.println("status: " + response.statusMessage() + " statuscode: " + response.statusCode());
				
				/*
				 * 
				Status	Description
				200	Successful request.
				400	Check that the parameters were correct.
				401	The API key used was missing.
				403	The API key used was invalid.
				404	The resource was not found.
				429	The rate limit was exceeded.
				5xx	Indicates an error with Notte servers.
				 */

				if (response.statusCode() == 200) {
					Document doc = response.parse();
					String res = Jsoup.parse(doc.toString()).body().text();
					return new HttpCustomResponse(false, response.statusCode(), res, "");
				} else if (false ||
						(response.statusCode() == 404) ||
						(response.statusCode() == 403) ||
						(response.statusCode() == 401) ||
						(response.statusCode() == 400) ||
						false) {
					
					if ((response.statusCode() == 404)) {
						System.out.println("404");
						ErrorDetail ed = JSONUtils.createPOJOFromJSON(response.body(), ErrorDetail.class);
						System.out.println("detail: " + ed.getDetail()+ " session: " + ed.getSession_id());
						System.out.println("resp: " + response.body() + " message: " + response.statusMessage());
						System.exit(1);
					}
					
					Document doc = response.parse();
					String res = Jsoup.parse(doc.toString()).body().text();
					return new HttpCustomResponse(false, response.statusCode(), "", res);
				} else if (
						false ||
						(response.statusCode() == 408) ||
						((response.statusCode() >= 500) && (response.statusCode() <= 599)) ||
						false) {
					
					// Error JSON absent for 524
					if (response.body().startsWith("{") && response.body().endsWith("}")) {
						ErrorDetail ed = JSONUtils.createPOJOFromJSON(response.body(), ErrorDetail.class);
						System.out.println("detail: " + ed.getDetail()+ " session: " + ed.getSession_id());
						System.out.println("resp: " + response.body() + " message: " + response.statusMessage());
					} else {
						System.out.println("response body: " + StringsUtils.cutAndPadStringToN(response.body(), 10));
					}
					keep_trying = true;
				} else {
					LOGGER.warn("unhandled statuscode: " + response.statusCode());
					keep_trying = true;
				}
			} catch (ConnectException ce) {
				LOGGER.warn("Connection exception: " + ce.getMessage());
				keep_trying = true;
			} catch (UnknownHostException e) {
				LOGGER.info("Got unknown host exception, DNS not working?");
				keep_trying = false;
			} catch (Exception e) {
				LOGGER.warn("e: " + e.getMessage());
				LOGGER.warn("exception class: " + e.getClass());
				keep_trying = false;
			}
			if (keep_trying) {
				LOGGER.info("Will retry in 5 seconds.. trycounter=" + trycounter);
				SystemUtils.sleepInSeconds(5);
			}
		}
		return null;
	}

}
