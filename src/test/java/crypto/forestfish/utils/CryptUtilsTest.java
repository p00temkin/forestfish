package crypto.forestfish.utils;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CryptUtilsTest {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(CryptUtils.class);

	@Test
	public void testGenerateToken() {
		String token = CryptUtils.generateSafe288BITToken();
		System.out.println("generated token: " + token);
	}

}
