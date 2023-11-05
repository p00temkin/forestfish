package crypto.forestfish.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.objects.jwt.JWTSignedDecodeResult;
import crypto.forestfish.objects.jwt.JWTUnsignedDecodeResult;

public class JWTUtilsTest {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(JWTUtilsTest.class);

	@Test
	public void decodeKnownJWTString() {

		JWTUnsignedDecodeResult jwtResult1 = JWTUtils.decodeJWT("foo");
		assertTrue("Make sure the JWT is flagged as invalid", jwtResult1.isInvalid_jwt());
		
		// https://jwt.io/
		String jwtString = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";

		JWTUnsignedDecodeResult jwtResult2 = JWTUtils.decodeJWT(jwtString);
		assertFalse("Make sure the JWT is valid", jwtResult2.isInvalid_jwt());
		assertEquals("Make sure alg is parsed properly", "HS256", jwtResult2.getAlg());
		assertEquals("Make sure typ is parsed properly", "JWT", jwtResult2.getTyp());
		assertEquals("Make sure payload is parsed properly", "{\"sub\":\"1234567890\",\"name\":\"John Doe\",\"iat\":1516239022}", jwtResult2.getPayloadJSON());
	}

	@Ignore
	@Test
	public void signatureVerifyUsingJWKS() {

		String jwtString = "jwt_string_goes_here";
		String b2ctenant = "tenant_goes_here";
		String b2cflow = "flowname_goes_here";
		
		JWTSignedDecodeResult jwt_decoded_result = JWTUtils.decodeAndVerifyJWTUsingAzureB2C(jwtString, b2ctenant, b2cflow);
		if (null != jwt_decoded_result) {
			System.out.println("sig valid: " + jwt_decoded_result.isSignature_valid());
		} else {
			System.out.println("Failed to validate");
		}

	}

}
