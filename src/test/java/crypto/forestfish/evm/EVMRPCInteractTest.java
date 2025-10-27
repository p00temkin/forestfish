package crypto.forestfish.evm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.objects.evm.connector.EVMBlockChainConnector;
import crypto.forestfish.utils.EVMUtils;

public class EVMRPCInteractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(EVMRPCInteractTest.class);
    
	@Test
	public void testRPCInteract_ETH() {
		
		EVMBlockChainConnector connector = new EVMBlockChainConnector(EVMChain.ETH, true, false);
		BigInteger latestBlockNR = EVMUtils.getLatestBlockNumber(connector);
		assertTrue("Ensure sane ETH blocknr", latestBlockNR.longValue() > 1L);
		LOGGER.info("latestBlockNR: " + latestBlockNR);
		
		BigInteger chainID = EVMUtils.getChainId(connector);
		assertEquals("Ensure correct ETH chain id", chainID.longValue(), 1L);
		LOGGER.info("chainID: " + chainID);
		
		BigDecimal networkGasPriceInGwei = EVMUtils.getCurrentNetworkGasPriceInGWEI(connector);
		LOGGER.info("networkGasPriceInGwei: " + networkGasPriceInGwei.doubleValue());
		assertTrue("Ensure sane ETH gas price", networkGasPriceInGwei.doubleValue()>0.05d);
	}
	
	@Test
	public void testRPCInteract_POLYGON() {
		
		EVMBlockChainConnector connector = new EVMBlockChainConnector(EVMChain.POLYGON, true, false);
		BigInteger latestBlockNR = EVMUtils.getLatestBlockNumber(connector);
		assertTrue("Ensure sane ETH blocknr", latestBlockNR.longValue() > 1L);
		LOGGER.info("latestBlockNR: " + latestBlockNR);
		
		BigInteger chainID = EVMUtils.getChainId(connector);
		assertEquals("Ensure correct ETH chain id", chainID.longValue(), 137L);
		LOGGER.info("chainID: " + chainID);
		
		BigDecimal networkGasPriceInGwei = EVMUtils.getCurrentNetworkGasPriceInGWEI(connector);
		assertTrue("Ensure correct ETH chain id", networkGasPriceInGwei.doubleValue()>1);
		LOGGER.info("networkGasPriceInGwei: " + networkGasPriceInGwei.setScale(0, RoundingMode.HALF_UP));
	}
	
}
