package crypto.forestfish.avm;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.enums.avm.AVMChain;
import crypto.forestfish.objects.avm.connector.AVMBlockChainConnector;
import crypto.forestfish.utils.AVMUtils;

public class AVMNodeInteractTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(AVMNodeInteractTest.class);

	@Test
	public void testNodeInteract_MAINNET() {
		
		AVMBlockChainConnector connector = new AVMBlockChainConnector(AVMChain.MAINNET, true);
		Long lastRound = AVMUtils.getLastRound(connector);

		assertTrue("Ensure sane lastRound", lastRound > 1L);
		LOGGER.info("lastRound: " + lastRound);
	}
	
	@Test
	public void testNodeInteract_TESTNET() {
		
		AVMBlockChainConnector connector = new AVMBlockChainConnector(AVMChain.TESTNET, true);
		Long lastRound = AVMUtils.getLastRound(connector);

		assertTrue("Ensure sane lastRound", lastRound > 1L);
		LOGGER.info("lastRound: " + lastRound);
	}
	
	@Test
	public void testNodeInteract_BETANET() {
		
		AVMBlockChainConnector connector = new AVMBlockChainConnector(AVMChain.BETANET, true);
		Long lastRound = AVMUtils.getLastRound(connector);

		assertTrue("Ensure sane lastRound", lastRound > 1L);
		LOGGER.info("lastRound: " + lastRound);
	}

	@Test
	public void testNodeInteract_VOI_TESTNET() {
		
		AVMBlockChainConnector connector = new AVMBlockChainConnector(AVMChain.VOI_TESTNET, true);
		Long lastRound = AVMUtils.getLastRound(connector);

		assertTrue("Ensure sane lastRound", lastRound > 1L);
		LOGGER.info("lastRound: " + lastRound);
	}
	
}
