package crypto.forestfish.objects.avm;

import java.util.HashMap;

import crypto.forestfish.enums.avm.AVMChain;

public class AVMPortfolioSimple {

	private String account_address;
	private HashMap<AVMChain, AVMChainPortfolio> chainportfolio = new HashMap<>();

	public AVMPortfolioSimple() {
		super();
	}

	public AVMPortfolioSimple(String _account_address, HashMap<AVMChain, AVMChainPortfolio> _chainportfolio) {
		super();
		this.account_address = _account_address;
		this.chainportfolio = _chainportfolio;
	}

	public HashMap<AVMChain, AVMChainPortfolio> getChainportfolio() {
		return chainportfolio;
	}

	public void setChainportfolio(HashMap<AVMChain, AVMChainPortfolio> _chainportfolio) {
		this.chainportfolio = _chainportfolio;
	}

	public String getAccount_address() {
		return account_address;
	}

	public void setAccount_address(String _account_address) {
		this.account_address = _account_address;
	}

}
