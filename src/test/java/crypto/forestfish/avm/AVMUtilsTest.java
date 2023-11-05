package crypto.forestfish.avm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.algorand.algosdk.account.Account;

import crypto.forestfish.utils.AVMUtils;

public class AVMUtilsTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(AVMUtilsTest.class);

	@Test
	public void testRandomAccountCreation() {

		Account acc1 = AVMUtils.createNewRandomAccount();
		
		LOGGER.info("Generated account with address: " + acc1.getAddress());
		assertEquals("Ensure proper Algorand address generated", 58, acc1.getAddress().toString().length());
		
        LOGGER.info("Mnemonic: " + acc1.toMnemonic());
        assertEquals("Ensure proper Algorand mnemonic generated", 25, acc1.toMnemonic().split(" ").length);
	}

}
