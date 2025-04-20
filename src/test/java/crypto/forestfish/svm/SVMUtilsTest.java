package crypto.forestfish.svm;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.p2p.solanaj.core.PublicKey;
import org.p2p.solanaj.rpc.Cluster;
import org.p2p.solanaj.rpc.RpcClient;
import org.p2p.solanaj.rpc.RpcException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SVMUtilsTest {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(SVMUtilsTest.class);

	@Test
	public void simpletest() {

		RpcClient client = new RpcClient(Cluster.TESTNET);

		long balance = 0L;
		try {
			balance = client.getApi().getBalance(new PublicKey("QqCCvshxtqMAL2CVALqiJB7uEeE5mjSPsseQdDzsRUo"));
			System.out.println("balance: " + balance);
			assertTrue("Ensure account has positive value", balance > 0L);
		} catch (RpcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
