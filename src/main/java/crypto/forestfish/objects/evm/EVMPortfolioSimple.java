package crypto.forestfish.objects.evm;

import java.util.HashMap;

import crypto.forestfish.enums.evm.EVMChain;

public class EVMPortfolioSimple {

	private String account_address;
	private HashMap<EVMChain, EVMChainPortfolio> chainportfolio = new HashMap<>();

	public EVMPortfolioSimple() {
		super();
	}

	public EVMPortfolioSimple(String _account_address, HashMap<EVMChain, EVMChainPortfolio> _chainportfolio) {
		super();
		this.account_address = _account_address;
		this.chainportfolio = _chainportfolio;
	}

	public HashMap<EVMChain, EVMChainPortfolio> getChainportfolio() {
		return chainportfolio;
	}

	public void setChainportfolio(HashMap<EVMChain, EVMChainPortfolio> _chainportfolio) {
		this.chainportfolio = _chainportfolio;
	}

	public String getAccount_address() {
		return account_address;
	}

	public void setAccount_address(String _account_address) {
		this.account_address = _account_address;
	}

}
