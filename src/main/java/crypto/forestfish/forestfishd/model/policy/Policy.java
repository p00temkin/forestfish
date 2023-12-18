package crypto.forestfish.forestfishd.model.policy;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.enums.evm.EVMChain;

public class Policy {
	
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(Policy.class);

	@SuppressWarnings("serial")
	private HashMap<String, Boolean> blockchains_enabled = new HashMap<String, Boolean>() {{
		this.put(EVMChain.POLYGON.toString(), true);
		this.put(EVMChain.ETH.toString(), true);
	}};
	
	// geoip access policy
	@SuppressWarnings("serial")
	private HashMap<String, Boolean> allowedCC = new HashMap<>() {{
		this.put("ALL", true); // no restriction
		
		// Examples
		//this.put("LOCALHOST", true);
		//this.put("RFC1918", true);
		//this.put("US", true);
		
	}};
	
	private HashMap<String, Role> accounts = new HashMap<>();

	public Policy() {
		super();
	}

	public HashMap<String, Boolean> getBlockchains_enabled() {
		return blockchains_enabled;
	}

	public void setBlockchains_enabled(HashMap<String, Boolean> blockchains_enabled) {
		this.blockchains_enabled = blockchains_enabled;
	}

	public HashMap<String, Role> getAccounts() {
		return accounts;
	}

	public void setAccounts(HashMap<String, Role> accounts) {
		this.accounts = accounts;
	}

	public HashMap<String, Boolean> getAllowedCC() {
		return allowedCC;
	}

	public void setAllowedCC(HashMap<String, Boolean> allowedCC) {
		this.allowedCC = allowedCC;
	}

	public void update() {
		// Make sure we handle all accounts in lowercase
		HashMap<String, Role> accounts_lc = new HashMap<>();
		for (String address: accounts.keySet()) {
			Role r = accounts.get(address);
			accounts_lc.put(address.toLowerCase(), r);
		}
		this.accounts = accounts_lc;
	}
	
}
