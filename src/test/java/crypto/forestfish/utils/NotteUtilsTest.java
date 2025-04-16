package crypto.forestfish.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.objects.api.notte.HealthStatus;
import crypto.forestfish.objects.api.notte.ObserveAction;
import crypto.forestfish.objects.api.notte.ObserveResponse;
import crypto.forestfish.objects.api.notte.SessionStatus;

public class NotteUtilsTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(NotteUtilsTest.class);

	//@Ignore
	@Test
	public void testSimpleSessionStart() {

		boolean flush_screenshots = false;
		boolean flush_json_bodies = false;
		boolean keep_alive = true;
		String url = "https://www.github.com";

		// Check health of API
		HealthStatus hs = NotteUtils.healthCheck();
		LOGGER.info("NOTTE API status: " + hs.getStatus());
		if (!"healthy".equals(hs.getStatus())) {
			LOGGER.warn("NOTTE API unavailable, skipping unit test");
		} else {
			// API KEY REQUIRED
			String apikey = ConfigUtils.getNotteAPIKey();
			if (null != apikey) {
				SessionStatus ssr = NotteUtils.sessionStart(apikey, flush_screenshots, flush_json_bodies);
				if (null != ssr) {
					LOGGER.info("Created new NOTTE session with id: " + ssr.getSession_id());
					ObserveResponse or = NotteUtils.observe(apikey, ssr.getSession_id(), url, keep_alive, flush_screenshots, flush_json_bodies);
					if (null != or) {
						assertEquals("Make sure we have an active session", "active", or.getSession().getStatus());
						LOGGER.info("Session status: " + or.getSession().getStatus());
						LOGGER.info("Session id: " + or.getSession().getSession_id());
						LOGGER.info("Session timeout: " + or.getSession().getTimeout_minutes());
						System.out.println("\n" + url + ":");
						for (ObserveAction a: or.getSpace().getActions()) {
							System.out.println(" - available action: " + a.getId() + " category: " + a.getCategory() + " desc: " + a.getDescription());
						}	
						assertTrue("Make sure we have available actions", or.getSpace().getActions().size()>0);
					}
				}
			} else {
				LOGGER.warn("No Notte API key env found, will not perform test");
			}

		}

	}

}
