package crypto.forestfish.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.objects.api.nuit.ObserveAction;
import crypto.forestfish.objects.api.nuit.ObserveResponse;
import crypto.forestfish.objects.api.nuit.SessionStatus;

public class NotteUtilsTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(NotteUtilsTest.class);

	@Test
	public void testSimpleSessionStart() {

		boolean flush_screenshots = true;
		boolean flush_json_bodies = true;
		boolean keep_alive = true;
		String url = "https://www.github.com";

		// API KEY REQ
		String apikey = ConfigUtils.getNotteAPIKey();
		if (null != apikey) {
			SessionStatus ssr = NotteUtils.sessionStart(apikey, flush_json_bodies);
			if (null != ssr) {
				System.out.println("Session ID: " + ssr.getSession_id());
				ObserveResponse or = NotteUtils.observe(apikey, ssr.getSession_id(), url, keep_alive, flush_screenshots, flush_json_bodies);
				if (null != or) {
					assertEquals("Make sure we have an active session", "active", or.getSession().getStatus());
					System.out.println("Session status: " + or.getSession().getStatus());
					System.out.println("Session id: " + or.getSession().getSession_id());
					System.out.println("Session timeout: " + or.getSession().getTimeout_minutes());
					for (ObserveAction a: or.getSpace().getActions()) {
						System.out.println("available action: " + a.getId() + " category: " + a.getCategory() + " desc: " + a.getDescription());
					}	
					assertTrue("Make sure we have available actions", or.getSpace().getActions().size()>0);
				}
			}
		} else {
			LOGGER.warn("No Notte API key env found, will not perform test");
		}

	}

}
