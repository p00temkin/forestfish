package crypto.forestfish.objects.avm;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.algorand.algosdk.account.Account;

import crypto.forestfish.enums.AccountOrigin;
import crypto.forestfish.utils.FilesUtils;
import crypto.forestfish.utils.JSONUtils;
import crypto.forestfish.utils.SystemUtils;

public class AlgoLocalWallet {

	private static final Logger LOGGER = LoggerFactory.getLogger(AlgoLocalWallet.class);

	private String walletName;
	private String mnemonic;
	private String address;

	public AlgoLocalWallet() {
		super();
	}

	public AlgoLocalWallet(String _walletName, AccountOrigin _walletOrigin, String _mnemonic, String _address) {
		initiateWallet(_walletName, _walletOrigin, _mnemonic, _address);
	}

	public AlgoLocalWallet(String _walletName, AccountOrigin _walletOrigin, String _address) {
		initiateWallet(_walletName, _walletOrigin, "xxx", _address);
	}

	private void initiateWallet(String _walletName, AccountOrigin walletOrigin, String _mnemonic, String _address) {
		this.walletName = _walletName;
		this.mnemonic = _mnemonic;
		this.address = _address;

		File walletDirectory = new File(".avm/wallets/" + walletName);
		if (!walletDirectory.exists()) walletDirectory.mkdirs();

		if (walletDirectory.listFiles().length == 0) {

			// No existing wallet so assume mnemonic creation in scope
			if (walletOrigin == AccountOrigin.RECOVERY_MNEMONIC) {

				if (_mnemonic.contains("xxx")) {
					LOGGER.error("No mnemonic provided, will not attempt to create wallet" );
					SystemUtils.halt();
				}

				// Sanity check
				Account generatedAccount = null;
				try {
					generatedAccount = new Account(_mnemonic);
					if (!generatedAccount.getAddress().toString().equals(_address)) {
						LOGGER.error("Mnemonic " + _mnemonic + " does not generate an account with specified address " + _address);
						LOGGER.error("The mnemonic specified instead generates an account with address: " + generatedAccount.getAddress());
						SystemUtils.halt();
					}

					// All good, flush JSON to file
					String json = JSONUtils.createJSONFromPOJO(this);
					String outfilePath = ".avm/wallets/" + _walletName + "/algowallet.json";
					FilesUtils.writeToFileUNIX(json, outfilePath);

				} catch (Exception e) {
					LOGGER.error("e: " + e.getMessage());
					SystemUtils.halt();
				}
			} else if (walletOrigin == AccountOrigin.EXISTING_LOCALWALLETFILE) {
				LOGGER.error("You specified using a local AVM wallet file but did not find it under .avm/wallets/" + _walletName);
				SystemUtils.halt();
			} else {
				System.out.println("TODO: handle walletOrigin " + walletOrigin);
				SystemUtils.halt();
			}
		} else {

			if ((null != walletDirectory) && (walletDirectory.listFiles().length != 1)) {
				LOGGER.warn("More than one wallet file? Cannot handle this atm.");
				SystemUtils.halt();
			}

			LOGGER.debug("Found an existing wallet!");

			try {
				File f = walletDirectory.listFiles()[0];
				String json = FilesUtils.readAllFromFileWithPath(f.getAbsolutePath());
				AlgoLocalWallet wallet = JSONUtils.createPOJOFromJSON(json, AlgoLocalWallet.class);

				this.address = wallet.getAddress();
				this.walletName = wallet.getWalletName();
				this.mnemonic = wallet.getMnemonic();
				
				if (_mnemonic.contains("xxx")) {
					LOGGER.debug("No mnemonic provided, will not attempt to verify credentials for wallet with name " + _walletName);
				} else {
					
					// Sanity check
					Account generatedAccount = null;
					try {
						generatedAccount = new Account(_mnemonic);
						if (!generatedAccount.getAddress().toString().equals(_address)) {
							LOGGER.error("Mnemonic " + _mnemonic + " does not generate an account with specified address " + _address);
							LOGGER.error("The mnemonic specified instead generates an account with address: " + generatedAccount.getAddress());
							SystemUtils.halt();
						}
						
						// check that the specified address matches the mnemonic
						if (generatedAccount.getAddress().toString().equals(this.address.toString())) {
							// all checks out ..
						} else {
							LOGGER.error("Mnemonic " + _mnemonic + " does not generate an account with specified address " + _address);
							LOGGER.error("The mnemonic specified instead generates an account with address: " + generatedAccount.getAddress());
							SystemUtils.halt();
						}
						
						// check that the specified address matches the wallet file
						if (this.address.toString().equals(this.address.toString())) {
							// all checks out ..
						} else {
							LOGGER.error("The wallet file with name " + _walletName + " does not include an account with specified address " + _address);
							LOGGER.error("The wallet file specifies an account with address: " + this.address);
							SystemUtils.halt();
						}
						
					} catch (Exception e) {
						LOGGER.error("e: " + e.getMessage());
						SystemUtils.halt();
					}
				}

				LOGGER.debug("Just restored ALGO wallet with name " + this.walletName + " from " + f.getAbsolutePath());
			} catch (Exception e) {
				LOGGER.warn("e: " + e.getMessage());
				SystemUtils.halt();
			}

		}

	}

	public String getMnemonic() {
		return mnemonic;
	}

	public void setMnemonic(String mnemonic) {
		this.mnemonic = mnemonic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWalletName() {
		return walletName;
	}

	public void setWalletName(String walletName) {
		this.walletName = walletName;
	}

	public Account fetchAccount() {
		Account generatedAccount = null;
		try {
			generatedAccount = new Account(this.mnemonic);
		} catch (Exception e) {
			LOGGER.error("e: " + e.getMessage());
			SystemUtils.halt();
		}
		if (generatedAccount == null) {
			LOGGER.error("Unable to generate Algorand account from this wallet");
			LOGGER.error("address: " + this.address);
			LOGGER.error("mnemonic: " + this.mnemonic);
			SystemUtils.halt();
		}
		return generatedAccount;
	}

}
