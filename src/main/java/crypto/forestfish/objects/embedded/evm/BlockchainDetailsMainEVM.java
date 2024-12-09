package crypto.forestfish.objects.embedded.evm;

import java.util.HashMap;

import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.objects.evm.model.chain.EVMChainInfo;

public class BlockchainDetailsMainEVM {

	public static HashMap<EVMChain, EVMChainInfo> getMainnetEVMNetworks() {
		HashMap<EVMChain, EVMChainInfo> networks1 = BlockchainDetailsMainEVM1.getMainnetEVMNetworks();
		HashMap<EVMChain, EVMChainInfo> networks2 = BlockchainDetailsMainEVM2.getMainnetEVMNetworks();
		networks1.putAll(networks2);
		return networks1;
	}

}
