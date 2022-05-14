package crypto.forestfish.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.crypto.Credentials;

public class EVMUtilsTest {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(EVMUtils.class);

	@Test
	public void signAndVerify() {
		
		// https://hukenneth.medium.com/ethereum-using-web3-js-for-message-signing-7e2935b2958c
		String message = "Hello, I am Kenneth!";
		String privateKey1 = "0xb5b1870957d373ef0eeffecc6e4812c0fd08f554b37b233526acc331bf1544f7";
		Credentials credentials = Credentials.create(privateKey1);
		assertEquals("Ensure correct ETH address", "0x12890d2cce102216644c59dae5baed380d84830c", credentials.getAddress());
		System.out.println("address: " + credentials.getAddress());
		String signature = EVMUtils.sign(credentials, message);
		assertEquals("Ensure correct signature", "0xd1741c3b54e1c95f00f6c85e1922de23ce4bd61b5e48b990bd3d21f3492a9f1d0x04fa324d0a13787dff529ce9a58587ea965e18b08864a23025c39748cb8fb5911c", signature);
		System.out.println("signature: " + signature);
		boolean verified = EVMUtils.verify(signature, message, credentials.getAddress());
		System.out.println("verified: " + verified);
		assertEquals("Ensure we can verify the signed message", true, verified);
	}
	
	// see clients/web3j/sign.js for web3j example
}
