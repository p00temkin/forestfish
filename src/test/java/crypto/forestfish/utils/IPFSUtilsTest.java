package crypto.forestfish.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IPFSUtilsTest {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(IPFSUtilsTest.class);
	
	@Test
	public void testIPFSCIDV0() {
		// https://ipfs-search.readthedocs.io/en/latest/ipfs_datatypes.html
		assertTrue("Make sure the IPFS CIDV0 is valid", IPFSUtils.isValidCIDV0("QmWyDJmrr6cRwEpTF2VGhWDi4uytrDHT8S5BptVdkbhjpv"));
	}

	@Test
	public void testIPFSCIDV1() {
		// https://ipfs-search.readthedocs.io/en/latest/ipfs_datatypes.html
		assertTrue("Make sure the IPFS CIDV1 is valid", IPFSUtils.isValidCIDV1("bafkreihqmkkhyq35uwiis5ed5mtudmv5abzdzzgop2urwp44uxutczahv4"));
	}
}
