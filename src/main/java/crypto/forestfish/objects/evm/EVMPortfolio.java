package crypto.forestfish.objects.evm;

import java.util.HashMap;

import org.web3j.crypto.Credentials;

import crypto.forestfish.enums.evm.EVMChain;

public class EVMPortfolio {

	private String account_address;
	private HashMap<EVMChain, EVMChainPortfolio> chainportfolio = new HashMap<>();
	private Credentials cred;
	private Long timestamp_in_seconds;

	public EVMPortfolio() {
		super();
	}

	public EVMPortfolio(String _account_address, HashMap<EVMChain, EVMChainPortfolio> _chainportfolio, Long _timestamp_in_seconds) {
		super();
		this.account_address = _account_address;
		this.chainportfolio = _chainportfolio;
		this.timestamp_in_seconds = _timestamp_in_seconds;
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

	public Credentials getCred() {
		return cred;
	}

	public void setCred(Credentials cred) {
		this.cred = cred;
	}

	public Long getTimestamp_in_seconds() {
		return timestamp_in_seconds;
	}

	public void setTimestamp_in_seconds(Long timestamp_in_seconds) {
		this.timestamp_in_seconds = timestamp_in_seconds;
	}

}
