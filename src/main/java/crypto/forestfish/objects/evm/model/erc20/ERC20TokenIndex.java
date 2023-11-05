package crypto.forestfish.objects.evm.model.erc20;

import java.util.HashMap;

public class ERC20TokenIndex {

	private HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

	public ERC20TokenIndex() {
		super();
	}
	
	public ERC20TokenIndex(HashMap<String, EVMERC20TokenInfo> tokens) {
		super();
		this.tokens = tokens;
	}

	public HashMap<String, EVMERC20TokenInfo> getTokens() {
		return tokens;
	}

	public void setTokens(HashMap<String, EVMERC20TokenInfo> tokens) {
		this.tokens = tokens;
	}

}
