package crypto.forestfish.objects.embedded.evm;

import java.util.HashMap;

import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.objects.evm.model.chain.EVMChainIndex;
import crypto.forestfish.objects.evm.model.chain.EVMChainInfo;
import crypto.forestfish.utils.JSONUtils;

public class BlockchainDetailsEVM {

	public static EVMChainIndex generateEVMChainIndex() {
		HashMap<EVMChain, EVMChainInfo> networks = new HashMap<>();
		HashMap<EVMChain, EVMChainInfo> mainnets = BlockchainDetailsMainEVM.getMainnetEVMNetworks();
		HashMap<EVMChain, EVMChainInfo> testnets = BlockchainDetailsTestEVM.getTestnetEVMNetworks();
		networks.putAll(mainnets);
		networks.putAll(testnets);
		return new EVMChainIndex(networks);
	}

	public static String generateEVMChainIndexJSON() {
		EVMChainIndex idx = generateEVMChainIndex();
		return JSONUtils.createJSONFromPOJO(idx);
	}

}
