package crypto.forestfish.objects.evm;

import java.util.HashMap;

public class DevContractState {
	
	private HashMap<String, DeployContractState> contracts = new HashMap<>(); // name <chainid, <timestamp, address>>
	private HashMap<String, String> providerurls = new HashMap<>(); // <chainid, providerURL>
	private HashMap<String, String> chainnames = new HashMap<>(); // <chainid, name>
	
	public DevContractState() {
		super();
	}

	public HashMap<String, DeployContractState> getContracts() {
		return contracts;
	}

	public void setContracts(HashMap<String, DeployContractState> contracts) {
		this.contracts = contracts;
	}
	
	public void addContract(String name, DeployContractState contractstate) {
		contracts.put(name, contractstate);
	}

	public HashMap<String, String> getProviderurls() {
		return providerurls;
	}

	public void setProviderurls(HashMap<String, String> providerurls) {
		this.providerurls = providerurls;
	}

	public HashMap<String, String> getChainnames() {
		return chainnames;
	}

	public void setChainnames(HashMap<String, String> chainnames) {
		this.chainnames = chainnames;
	}

	public void addNewProvider(String chain, String providerURL) {
		this.providerurls.put(chain, providerURL);
	}

	public void addNewChainNameMapping(String chain, String name) {
		this.chainnames.put(chain, name);
	}
	
}
