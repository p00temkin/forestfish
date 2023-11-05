package crypto.forestfish.objects.avm;

import java.util.HashMap;

import org.web3j.crypto.Credentials;

import crypto.forestfish.enums.avm.AVMChain;

public class AVMPortfolio {

	private String account_address;
	private HashMap<AVMChain, AVMChainPortfolio> chainportfolio = new HashMap<>();
	private Credentials cred;
	private Long timestamp_in_seconds;

	public AVMPortfolio() {
		super();
	}

	public AVMPortfolio(String _account_address, HashMap<AVMChain, AVMChainPortfolio> _chainportfolio, Long _timestamp_in_seconds) {
		super();
		this.account_address = _account_address;
		this.chainportfolio = _chainportfolio;
		this.timestamp_in_seconds = _timestamp_in_seconds;
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
