package crypto.forestfish.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(ConfigUtils.class);

	public static String getNotteAPIKey() {
		String secret = null;
		String secret_env = System.getenv("NOTTEAPIKEY");
		if (null == secret_env) {
			LOGGER.info("NOTTEAPIKEY env variable not set");
		} else {
			LOGGER.info("NOTTEAPIKEY env variable set to " + StringsUtils.cutStringFromLeft(secret_env, 10) + " .. " + StringsUtils.cutStringFromRight(secret_env, 5));
			return secret_env;
		}
		return secret;
	}
	
}
