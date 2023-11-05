package crypto.forestfish.objects.evm;

import java.util.HashMap;

import crypto.forestfish.enums.evm.EVMChain;

public class EVMPortfolioDiff {

	private String account_address;
	private HashMap<EVMChain, EVMChainPortfolioDiff> chainportfolio_diff = new HashMap<>();

	public EVMPortfolioDiff() {
		super();
	}

	public EVMPortfolioDiff(String _account_address, HashMap<EVMChain, EVMChainPortfolioDiff> _chainportfolio_diff) {
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

	public HashMap<EVMChain, EVMChainPortfolioDiff> getChainportfolio_diff() {
		return chainportfolio_diff;
	}

	public void setChainportfolio_diff(HashMap<EVMChain, EVMChainPortfolioDiff> chainportfolio_diff) {
		this.chainportfolio_diff = chainportfolio_diff;
	}

}
