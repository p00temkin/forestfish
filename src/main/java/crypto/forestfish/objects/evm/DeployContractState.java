package crypto.forestfish.objects.evm;

import java.util.HashMap;

public class DeployContractState {

	private HashMap<String, HashMap<String, String>> deploytimestamps = new HashMap<>(); // <chainid, <timestamp, address>>
	
	public DeployContractState() {
		super();
	}
	
	public DeployContractState(HashMap<String, HashMap<String, String>> deploytimestamps) {
		super();
		this.deploytimestamps = deploytimestamps;
	}

	public HashMap<String, HashMap<String, String>> getDeploytimestamps() {
		return deploytimestamps;
	}

	public void setDeploytimestamps(HashMap<String, HashMap<String, String>> deploytimestamps) {
		this.deploytimestamps = deploytimestamps;
	}
	
}
