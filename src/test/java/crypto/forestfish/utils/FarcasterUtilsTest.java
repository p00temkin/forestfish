package crypto.forestfish.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.objects.evm.farcaster.FnameLookupResponse;

public class FarcasterUtilsTest {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(FarcasterUtilsTest.class);
	
	@Test
	public void testSimpleFIDLookup() {
		FnameLookupResponse fnr = FarcasterUtils.getInfoForFID(1L);
		assertEquals("Make sure FID 1 reply (owner) is correctly parsed", "0x8773442740c17c9d0f0b87022c722f9a136206ed", fnr.getTransfers().get(0).getOwner());
		assertEquals("Make sure FID 1 reply (username) is correctly parsed", "farcaster", fnr.getTransfers().get(0).getUsername());
		assertTrue("Make sure FID 1 reply (fid) is correctly parsed", 1L == fnr.getTransfers().get(0).getId());
	}

}
