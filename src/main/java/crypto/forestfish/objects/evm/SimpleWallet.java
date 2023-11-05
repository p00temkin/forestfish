package crypto.forestfish.objects.evm;

import org.web3j.crypto.Credentials;

public class SimpleWallet {

	private String mnemonic;
	private Credentials cred0;
	private String privkey0;
	
	public SimpleWallet() {
		super();
	}

	public SimpleWallet(String _mnemonic, Credentials _cred0, String _privkey0) {
		super();
		this.mnemonic = _mnemonic;
		this.cred0 = _cred0;
		this.privkey0 = _privkey0;
	}

	public String getMnemonic() {
		return mnemonic;
	}

	public void setMnemonic(String mnemonic) {
		this.mnemonic = mnemonic;
	}

	public Credentials getCred0() {
		return cred0;
	}

	public void setCred0(Credentials cred0) {
		this.cred0 = cred0;
	}

	public String getPrivkey0() {
		return privkey0;
	}

	public void setPrivkey0(String privkey0) {
		this.privkey0 = privkey0;
	}

}
