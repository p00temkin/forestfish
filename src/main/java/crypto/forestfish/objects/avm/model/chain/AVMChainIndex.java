package crypto.forestfish.objects.avm.model.chain;

import java.util.HashMap;

import crypto.forestfish.enums.avm.AVMChain;

public class AVMChainIndex {

	private HashMap<AVMChain, AVMChainInfo> networks = new HashMap<>();

	public AVMChainIndex() {
		super();
	}
	
	public AVMChainIndex(HashMap<AVMChain, AVMChainInfo> networks) {
		super();
		this.networks = networks;
	}

	public HashMap<AVMChain, AVMChainInfo> getNetworks() {
		return networks;
	}

	public void setNetworks(HashMap<AVMChain, AVMChainInfo> networks) {
		this.networks = networks;
	}

}
