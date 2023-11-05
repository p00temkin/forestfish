package crypto.forestfish.objects.avm;

import java.util.HashMap;

public class AVMChainPortfolioDiff {

	private String account_address;
	private String chain;
	private AVMAccountBalance nativeBalance;
	private String txCount;
	private HashMap<Long, AVMAccountBalance> asatokens = new HashMap<>();
	private HashMap<Long, AVMNftAccountBalance> arctokens = new HashMap<>();
	
	public AVMChainPortfolioDiff() {
		super();
	}

	public AVMChainPortfolioDiff(String account_address, String chain, AVMAccountBalance nativeBalance, String txCount, HashMap<Long, AVMAccountBalance> asatokens, HashMap<Long, AVMNftAccountBalance> arctokens) {
		super();
		this.account_address = account_address;
		this.chain = chain;
		this.nativeBalance = nativeBalance;
		this.txCount = txCount;
		this.asatokens = asatokens;
		this.arctokens = arctokens;
	}

	public AVMAccountBalance getNativeBalance() {
		return nativeBalance;
	}

	public void setNativeBalance(AVMAccountBalance nativeBalance) {
		this.nativeBalance = nativeBalance;
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

	public String getTxCount() {
		return txCount;
	}

	public void setTxCount(String txCount) {
		this.txCount = txCount;
	}

	public HashMap<Long, AVMAccountBalance> getAsatokens() {
		return asatokens;
	}

	public void setAsatokens(HashMap<Long, AVMAccountBalance> asatokens) {
		this.asatokens = asatokens;
	}

	public HashMap<Long, AVMNftAccountBalance> getArctokens() {
		return arctokens;
	}

	public void setArctokens(HashMap<Long, AVMNftAccountBalance> arctokens) {
		this.arctokens = arctokens;
	}
	
}
