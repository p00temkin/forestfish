package crypto.forestfish.evm;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.objects.evm.DeployContractState;
import crypto.forestfish.objects.evm.DevContractState;
import crypto.forestfish.utils.JSONUtils;
import crypto.forestfish.utils.SystemUtils;

public class DevContractStateTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(DevContractStateTest.class);
    
	@Test
	public void testSetup1() {
		
		// Create dev contract state
		DevContractState state = new DevContractState();
		state.addNewProvider("1337", "http://127.0.0.1:7545");
		state.addNewChainNameMapping("1337", "Ganache");

		// First contract "Contract1", add 2 deployments
		HashMap<String, HashMap<String, String>> deploytimestamps = new HashMap<>();
		HashMap<String, String> c1_deployments = new HashMap<>();
		c1_deployments.put(String.valueOf(System.currentTimeMillis()), "0xC226E43672Bd6CDdf0d509F8cf6E473016F07C51");
		SystemUtils.sleepInSeconds(5);
		c1_deployments.put(String.valueOf(System.currentTimeMillis()), "0x6a45bf846184DdC1DEfeDc2FD769dD9186d42d23");
		deploytimestamps.put("1337", c1_deployments);
		DeployContractState contract1 = new DeployContractState(deploytimestamps);
		state.addContract("Contract1", contract1);
		
		// Serialize/deserialize
		String jsonSTR = JSONUtils.createJSONFromDevContractState(state);
		LOGGER.info("json: ");
		System.out.println(jsonSTR);
		DevContractState state1 = JSONUtils.createDevContractState(jsonSTR);
		System.out.println("Contract uniq contract size(): " + state1.getContracts().size());
		System.out.println("Contract1 uniq chain size(): " + state1.getContracts().get("Contract1").getDeploytimestamps().size());
		System.out.println("Contract1 uniq deployment size(): " + state1.getContracts().get("Contract1").getDeploytimestamps().size());
		
		// Asserts
		assertEquals("Verify recovered state size is 1", state1.getContracts().size(), 1);
		assertEquals("Verify chain size is 1", state1.getContracts().get("Contract1").getDeploytimestamps().size(), 1);
		assertEquals("Verify deployments size is 2", state1.getContracts().get("Contract1").getDeploytimestamps().get("1337").size(), 2);
	}
	
}
