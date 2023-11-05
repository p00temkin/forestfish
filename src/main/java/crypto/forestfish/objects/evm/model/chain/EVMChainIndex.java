package crypto.forestfish.objects.evm.model.chain;

import java.util.HashMap;

import crypto.forestfish.enums.evm.EVMChain;

public class EVMChainIndex {

	private HashMap<EVMChain, EVMChainInfo> networks = new HashMap<>();

	public EVMChainIndex() {
		super();
	}
	
	public EVMChainIndex(HashMap<EVMChain, EVMChainInfo> networks) {
		super();
		this.networks = networks;
	}

	public HashMap<EVMChain, EVMChainInfo> getNetworks() {
		return networks;
	}

	public void setNetworks(HashMap<EVMChain, EVMChainInfo> networks) {
		this.networks = networks;
	}

}
