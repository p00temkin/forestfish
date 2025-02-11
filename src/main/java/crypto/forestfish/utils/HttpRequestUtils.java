package crypto.forestfish.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.URL;
import java.net.URLConnection;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpRequestUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(HttpRequestUtils.class);
	
	public static String getBodyUsingGETUrlRequest(String _url) {
		try {
			Document doc = Jsoup.connect(_url).ignoreContentType(true)
					.get();
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

	public static String getBodyUsingGETUrlRequestOpportunistic(String _url) {
		try {
			Document doc = Jsoup.connect(_url)
					.timeout(10000) // 10 secs
					.ignoreContentType(true).
					get();
			String res = Jsoup.parse(doc.toString()).body().text();
			return res;
		} catch (ConnectException ce) {
			LOGGER.debug("Connection exception: " + ce.getMessage());
		} catch (HttpStatusException he) {
			LOGGER.debug("HTTP status exception: " + he.getMessage());
		} catch (Exception e) {
			LOGGER.debug("e: " + e.getMessage());
		}
		return "";
	}

	public static byte[] downloadImage(String _imageUrl) {
		try {
			URL url = new URL(_imageUrl);
			ByteArrayOutputStream output = new ByteArrayOutputStream();

			URLConnection connection = url.openConnection();
			connection.setConnectTimeout(10000); // 10 secs

			try (InputStream stream = connection.getInputStream()) {
				byte[] buffer = new byte[4096];
				while (true) {
					int bytesRead = stream.read(buffer);
					if (bytesRead < 0) { break; }
					output.write(buffer, 0, bytesRead);
				}
				return output.toByteArray();
			} 
		} catch (Exception e) {
			LOGGER.warn("e: " + e.getMessage());
			LOGGER.warn("exception class: " + e.getClass());
		}

		return null;
	}

	public static String getBodyUsingGETUrlRequestWithCustomHeader(String _url, String _customHeaderName, String _customHeaderValue) {
		try {
			Document doc = Jsoup.connect(_url)
					.ignoreContentType(true)
					.header(_customHeaderName, _customHeaderValue)
					.get();
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

	public static String getBodyUsingGETUrlRequestWithCustomHeaderLoop(String _url, String _customHeaderName, String _customHeaderValue) {
		while (true) {
			try {
				Document doc = Jsoup.connect(_url)
						.ignoreContentType(true)
						.header(_customHeaderName, _customHeaderValue)
						.get();
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
			SystemUtils.sleepInSeconds(5);
		}
	}

	public static String getBodyUsingUrlGETWalletRequestWithJWTToken(String _jwtToken) {
		try {
			Document doc = Jsoup.connect("https://frame.syndicate.io/api/v2/getWallets")
					.header("Authorization", "Bearer " + _jwtToken)
					.ignoreContentType(true)
					.get();
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

	public static String getBodyUsingGETUrlRequestAndJWTToken(String _url, String _jwtToken) {
		try {
			Document doc = Jsoup.connect(_url)
					.header("Authorization", "Bearer " + _jwtToken)
					.ignoreContentType(true)
					.get();
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

	public static String getBodyUsingUrlPOSTRequestWithJsonBody(String _url, String _jsonBody) {
		try {
			Document doc = Jsoup.connect(_url).ignoreContentType(true)
					.requestBody(_jsonBody)
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

	public static String getBodyUsingUrlPOSTRequestWithJsonBodyAndHeader(String _url, String jsonBody, String _customHeaderName, String _customHeaderValue) {
		try {
			Document doc = Jsoup.connect(_url).ignoreContentType(true)
					.requestBody(jsonBody)
					.followRedirects(true)
					.header("Accept", "application/json")
					.header("Content-Type", "application/json")
					.header(_customHeaderName, _customHeaderValue)
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

	public static String getBodyUsingUrlPOSTRequestWithJsonBodyAndHeaderRAW(String _url, String jsonBody, String _customHeaderName, String _customHeaderValue) {
		try {
			Document doc = Jsoup.connect(_url).ignoreContentType(true)
					.ignoreHttpErrors(true)
					.requestBody(jsonBody)
					.followRedirects(true)
					.header("Accept", "application/json")
					.header("Content-Type", "application/json")
					.header(_customHeaderName, _customHeaderValue)
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

	public static String getBodyUsingUrlPOSTRequestWithJsonBodyAndHeaderRAWLoop(String _url, String jsonBody, String _customHeaderName, String _customHeaderValue) {
		while (true) {
			try {
				Document doc = Jsoup.connect(_url).ignoreContentType(true)
						.ignoreHttpErrors(true)
						.requestBody(jsonBody)
						.followRedirects(true)
						.header("Accept", "application/json")
						.header("Content-Type", "application/json")
						.header(_customHeaderName, _customHeaderValue)
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
			SystemUtils.sleepInSeconds(5);
		}
	}
}
