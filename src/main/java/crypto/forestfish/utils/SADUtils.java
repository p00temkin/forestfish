package crypto.forestfish.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.objects.api.sad.UpdateRequest;

public class SADUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(SADUtils.class);
	
	public static void blindUpdate(String _url, String _name, String _chatmsg) {
		int trycounter = 0;
		Boolean validpojo = false;
		while (!validpojo && (trycounter <= 50)) {
			trycounter++;
			try {
				UpdateRequest ur = new UpdateRequest(_name, _chatmsg);
				String jsonBody = JSONUtils.createJSONFromPOJO(ur);
				String body = HttpRequestUtils.getBodyUsingUrlPOSTRequestWithJsonBody(_url, jsonBody);
				if (body.contains("{\"status\":\"ok\"}")) return;
				LOGGER.warn("Got unknown body as reply: " + body);
			} catch (Exception e) {
				LOGGER.info("Caught HTTP exception: " + e.getMessage());
			}
			SystemUtils.sleepInSeconds(5);
		}
	}
	
	public static void blindUpdate(String _url, String _name, String _chatmsg, int duration_in_seconds) {
		int trycounter = 0;
		Boolean validpojo = false;
		while (!validpojo && (trycounter <= 50)) {
			trycounter++;
			try {
				UpdateRequest ur = new UpdateRequest(_name, _chatmsg, duration_in_seconds);
				String jsonBody = JSONUtils.createJSONFromPOJO(ur);
				String body = HttpRequestUtils.getBodyUsingUrlPOSTRequestWithJsonBody(_url, jsonBody);
				if (body.contains("{\"status\":\"ok\"}")) return;
				LOGGER.warn("Got unknown body as reply: " + body);
			} catch (Exception e) {
				LOGGER.info("Caught HTTP exception: " + e.getMessage());
			}
			SystemUtils.sleepInSeconds(5);
		}
	}
	
}
