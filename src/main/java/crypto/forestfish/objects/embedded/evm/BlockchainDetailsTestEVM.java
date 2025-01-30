package crypto.forestfish.objects.embedded.evm;

import java.util.HashMap;

import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.objects.evm.model.chain.EVMChainInfo;

public class BlockchainDetailsTestEVM {

	public static HashMap<EVMChain, EVMChainInfo> getTestnetEVMNetworks() {
		HashMap<EVMChain, EVMChainInfo> networks1 = BlockchainDetailsTestEVM1.getTestnetEVMNetworks();
		HashMap<EVMChain, EVMChainInfo> networks2 = BlockchainDetailsTestEVM2.getTestnetEVMNetworks();
		networks1.putAll(networks2);
		return networks1;
	}

}
