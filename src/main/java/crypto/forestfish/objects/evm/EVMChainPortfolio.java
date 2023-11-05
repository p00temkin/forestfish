package crypto.forestfish.objects.evm;

import java.util.HashMap;

public class EVMChainPortfolio {

	private String account_address;
	private String chain;
	private EVMAccountBalance nativeBalance;
	private String txCount;
	private HashMap<String, EVMAccountBalance> erc20tokens = new HashMap<>();
	private HashMap<String, EVMNftAccountBalance> erc721tokens = new HashMap<>();
	private HashMap<String, EVMNftAccountBalance> erc1155tokens = new HashMap<>();
	
	public EVMChainPortfolio() {
		super();
	}

	public EVMChainPortfolio(String _account_address, String chain, EVMAccountBalance _nativeBalance, String _txCount, HashMap<String, EVMAccountBalance> _erc20tokens, HashMap<String, EVMNftAccountBalance> _erc721tokens, HashMap<String, EVMNftAccountBalance> _erc1155tokens) {
		super();
		this.account_address = _account_address;
		this.chain = chain;
		this.nativeBalance = _nativeBalance;
		this.txCount = _txCount;
		this.erc20tokens = _erc20tokens;
		this.erc721tokens = _erc721tokens;
		this.erc1155tokens = _erc1155tokens;
	}

	public EVMAccountBalance getNativeBalance() {
		return nativeBalance;
	}

	public void setNativeBalance(EVMAccountBalance nativeBalance) {
		this.nativeBalance = nativeBalance;
	}

	public HashMap<String, EVMAccountBalance> getErc20tokens() {
		return erc20tokens;
	}

	public void setErc20tokens(HashMap<String, EVMAccountBalance> erc20tokens) {
		this.erc20tokens = erc20tokens;
	}

	public HashMap<String, EVMNftAccountBalance> getErc721tokens() {
		return erc721tokens;
	}

	public void setErc721tokens(HashMap<String, EVMNftAccountBalance> erc721tokens) {
		this.erc721tokens = erc721tokens;
	}


	public String getChain() {
		return chain;
	}

	public void setChain(String chain) {
		this.chain = chain;
	}

	public String getAccount_address() {
		return account_address;
	}

	public void setAccount_address(String account_address) {
		this.account_address = account_address;
	}

	public HashMap<String, EVMNftAccountBalance> getErc1155tokens() {
		return erc1155tokens;
	}

	public void setErc1155tokens(HashMap<String, EVMNftAccountBalance> erc1155tokens) {
		this.erc1155tokens = erc1155tokens;
	}

	public String getTxCount() {
		return txCount;
	}

	public void setTxCount(String txCount) {
		this.txCount = txCount;
	}
	
}
