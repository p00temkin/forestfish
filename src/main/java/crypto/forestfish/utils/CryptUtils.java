package crypto.forestfish.utils;

import java.security.SecureRandom;
import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CryptUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(CryptUtils.class);
    
	public static String generateSafe288BITToken() {
	    SecureRandom random = new SecureRandom();
	    byte[] bytes = new byte[36]; // 36 bytes * 8 = 288 bits
	    random.nextBytes(bytes);
	    String token = Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
	    return token;
	}
	
}
