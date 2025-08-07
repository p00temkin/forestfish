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

import crypto.forestfish.objects.api.notte.ActionRequest;
import crypto.forestfish.objects.api.notte.ErrorDetail;
import crypto.forestfish.objects.api.notte.HealthStatus;
import crypto.forestfish.objects.api.notte.ObserveRequest;
import crypto.forestfish.objects.api.notte.ObserveResponse;
import crypto.forestfish.objects.api.notte.SessionStartRequest;
import crypto.forestfish.objects.api.notte.SessionStatus;
import crypto.forestfish.objects.api.sad.UpdateRequest;
import crypto.forestfish.objects.http.HttpCustomResponse;

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
