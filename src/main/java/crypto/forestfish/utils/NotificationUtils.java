package crypto.forestfish.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.pushover.client.MessagePriority;
import net.pushover.client.PushoverClient;
import net.pushover.client.PushoverMessage;
import net.pushover.client.PushoverRestClient;
import net.pushover.client.Status;

public class NotificationUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(NotificationUtils.class);

	public static void pushover(String apiTokenUser, String apiTokenApp, String title, String message,
			MessagePriority messageprio, String url, String urltitle, String selectedSound) {
		if ("".equals(apiTokenUser) || "".equals(apiTokenApp)) {
			LOGGER.debug("Skipping pushover notification");
		} else {
			int retries_left = 10;
			if (retries_left > 0) {
				retries_left--;
				try {
					PushoverClient client = new PushoverRestClient();   
					client.pushMessage(PushoverMessage.builderWithApiToken(apiTokenApp)
							.setUserId(apiTokenUser)
							.build());

					Status result = client.pushMessage(PushoverMessage
							.builderWithApiToken(apiTokenApp)
							.setUserId(apiTokenUser)
							.setMessage(message)
							.setPriority(messageprio) // HIGH|NORMAL|QUIET
							.setTitle(title)
							.setUrl(url)
							.setTitleForURL(urltitle)
							.setSound(selectedSound)
							.build());

					LOGGER.info(String.format("status: %d, request id: %s", result.getStatus(), result.getRequestId()));

				} catch (Exception e) {
					System.out.println("Exception: " + e.getMessage());
					SystemUtils.halt();
				}
			}
		}
	}

	public static void pushover(String apiTokenUser, String apiTokenApp, String title, String message) {
		if ("".equals(apiTokenUser) || "".equals(apiTokenApp)) {
			LOGGER.debug("Skipping pushover notification");
		} else {
			int retries_left = 10;
			if (retries_left > 0) {
				retries_left--;
				try {
					PushoverClient client = new PushoverRestClient();   
					client.pushMessage(PushoverMessage.builderWithApiToken(apiTokenApp)
							.setUserId(apiTokenUser)
							.build());

					Status result = client.pushMessage(PushoverMessage
							.builderWithApiToken(apiTokenApp)
							.setUserId(apiTokenUser)
							.setMessage(message)
							.build());

					LOGGER.info(String.format("status: %d, request id: %s", result.getStatus(), result.getRequestId()));

				} catch (Exception e) {
					System.out.println("Exception: " + e.getMessage());
					SystemUtils.halt();
				}
			}
		}
	}
	
}
