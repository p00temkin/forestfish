package crypto.forestfish.objects.avm;

import java.util.HashMap;

import crypto.forestfish.enums.avm.AVMChain;

public class AVMPortfolioDiff {

	private String account_address;
	private HashMap<AVMChain, AVMChainPortfolioDiff> chainportfolio_diff = new HashMap<>();

	public AVMPortfolioDiff() {
		super();
	}

	public AVMPortfolioDiff(String _account_address, HashMap<AVMChain, AVMChainPortfolioDiff> _chainportfolio_diff) {
		super();
		this.account_address = _account_address;
		this.chainportfolio_diff = _chainportfolio_diff;
	}


	public String getAccount_address() {
		return account_address;
	}

	public void setAccount_address(String _account_address) {
		this.account_address = _account_address;
	}

	public HashMap<AVMChain, AVMChainPortfolioDiff> getChainportfolio_diff() {
		return chainportfolio_diff;
	}

	public void setChainportfolio_diff(HashMap<AVMChain, AVMChainPortfolioDiff> chainportfolio_diff) {
		this.chainportfolio_diff = chainportfolio_diff;
	}

}
