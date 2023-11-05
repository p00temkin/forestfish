package crypto.forestfish.objects.avm;

import java.util.HashMap;

public class AVMChainPortfolio {

	private String account_address;
	private String chain;
	private AVMAccountBalance nativeBalance;
	private HashMap<String, AVMAccountBalance> tokens = new HashMap<>();
	private HashMap<String, AVMNftAccountBalance> nfttokens = new HashMap<>();
	
	private Long txCount = 0L;
	private Long calculatedMinimumBalance = 0L;
	private Long total_apps_optedin = 0L;
	private Long total_created_apps = 0L;
	boolean accounts_holds_assets = false;
	
	public AVMChainPortfolio() {
		super();
	}

	public AVMChainPortfolio(String _account_address, String chain, AVMAccountBalance _nativeBalance, Long _txCount, HashMap<String, AVMAccountBalance> _tokens, HashMap<String, AVMNftAccountBalance> _nfttokens) {
		super();
		this.account_address = _account_address;
		this.chain = chain;
		this.nativeBalance = _nativeBalance;
		this.txCount = _txCount;
		this.tokens = _tokens;
		this.nfttokens = _nfttokens;
	}
	
	public AVMChainPortfolio(String _account_address, String chain, AVMAccountBalance _nativeBalance, Long _txCount, HashMap<String, AVMAccountBalance> _tokens, HashMap<String, AVMNftAccountBalance> _nfttokens, Long _calculatedMinimumBalance, Long _total_apps_optedin, Long _total_created_apps, Boolean _accounts_holds_assets) {
		super();
		this.account_address = _account_address;
		this.chain = chain;
		this.nativeBalance = _nativeBalance;
		this.txCount = _txCount;
		this.tokens = _tokens;
		this.nfttokens = _nfttokens;
		this.calculatedMinimumBalance = _calculatedMinimumBalance;
		this.total_apps_optedin = _total_apps_optedin;
		this.total_created_apps = _total_created_apps;
		this.accounts_holds_assets = _accounts_holds_assets;
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

	public HashMap<String, AVMAccountBalance> getTokens() {
		return tokens;
	}

	public void setTokens(HashMap<String, AVMAccountBalance> tokens) {
		this.tokens = tokens;
	}

	public HashMap<String, AVMNftAccountBalance> getNfttokens() {
		return nfttokens;
	}

	public void setNfttokens(HashMap<String, AVMNftAccountBalance> nfttokens) {
		this.nfttokens = nfttokens;
	}

	public Long getTxCount() {
		return txCount;
	}

	public void setTxCount(Long txCount) {
		this.txCount = txCount;
	}

	public Long getCalculatedMinimumBalance() {
		return calculatedMinimumBalance;
	}

	public void setCalculatedMinimumBalance(Long calculatedMinimumBalance) {
		this.calculatedMinimumBalance = calculatedMinimumBalance;
	}

	public Long getTotal_apps_optedin() {
		return total_apps_optedin;
	}

	public void setTotal_apps_optedin(Long total_apps_optedin) {
		this.total_apps_optedin = total_apps_optedin;
	}

	public Long getTotal_created_apps() {
		return total_created_apps;
	}

	public void setTotal_created_apps(Long total_created_apps) {
		this.total_created_apps = total_created_apps;
	}

	public boolean isAccounts_holds_assets() {
		return accounts_holds_assets;
	}

	public void setAccounts_holds_assets(boolean accounts_holds_assets) {
		this.accounts_holds_assets = accounts_holds_assets;
	}
	
}
