package crypto.forestfish.utils;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SadUtilsTest {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(SadUtilsTest.class);

	//@Ignore
	@Test
	public void testBlindUpdate() {
		SADUtils.blindUpdate("http://192.168.100.69:8000/api/v1/a3", "Agent #3", "This is text from agent 3");
	}

}
