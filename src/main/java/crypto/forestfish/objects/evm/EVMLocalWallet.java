package crypto.forestfish.objects.evm;

import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.crypto.Bip32ECKeyPair;
import org.web3j.crypto.Bip39Wallet;
import org.web3j.crypto.exception.CipherException;
import org.web3j.utils.Numeric;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.ECKeyPair;
import org.web3j.crypto.MnemonicUtils;
import org.web3j.crypto.WalletUtils;
import crypto.forestfish.enums.AccountOrigin;
import crypto.forestfish.objects.embedded.BlockchainDetailsGeneric;
import crypto.forestfish.utils.EVMUtils;
import crypto.forestfish.utils.StringsUtils;
import crypto.forestfish.utils.SystemUtils;

public class EVMLocalWallet {

	private static final Logger LOGGER = LoggerFactory.getLogger(EVMLocalWallet.class);

	@SuppressWarnings("unused")
	private static final int PRIVATE_KEY_RADIX = 16;
	private static SecureRandom RANDOM = new SecureRandom();

	private String walletName;
	private String walletPassword;

	// only used during account creation
	private Credentials credentials = null;
	private Bip39Wallet walletBIP39 = null;

	public EVMLocalWallet(String _wallet_name, AccountOrigin _wallet_origin, String _wallet_password) {
		super();
		this.walletName = _wallet_name;
		this.walletPassword = _wallet_password;

		File walletDirectory = new File(".evm/wallets/" + _wallet_name);
		if (!walletDirectory.exists()) walletDirectory.mkdirs();

		if (walletDirectory.listFiles().length == 0) {

			// INTENTION TO LOAD FROM EXISTING WALLET FAILED
			if (_wallet_origin == AccountOrigin.EXISTING_LOCALWALLETFILE) {
				LOGGER.error("The local wallet file " + _wallet_name + " does not exist");
				SystemUtils.halt();

				// CREATE A NEW WALLET
			} else if (_wallet_origin == AccountOrigin.NEW_LOCALWALLETFILE) {

			        byte[] initialEntropy = new byte[16];
			        RANDOM.nextBytes(initialEntropy);
			        String generated_mnemonic = MnemonicUtils.generateMnemonic(initialEntropy);

					LOGGER.info("Creating wallet from generated mnemonic \"" + generated_mnemonic + "\"");
					byte[] seed = MnemonicUtils.generateSeed(generated_mnemonic, "");
					Bip32ECKeyPair masterKeypair = Bip32ECKeyPair.generateKeyPair(seed);
					Bip32ECKeyPair childKeypair = Bip32ECKeyPair.deriveKeyPair(masterKeypair, BlockchainDetailsGeneric.derivationPathETH0);
					this.credentials = Credentials.create(childKeypair);
					System.out.println(" * This mnemonic gives us the address: " + this.credentials.getAddress());

					try {
						// Create the wallet file
						WalletUtils.generateWalletFile(_wallet_password, childKeypair, walletDirectory, false);
					} catch (IOException e) {
						LOGGER.error("e: " + e.getMessage());
						SystemUtils.halt();
					} catch (CipherException e) {
						LOGGER.error("e: " + e.getMessage());
						SystemUtils.halt();
					}

			} else if (_wallet_origin == AccountOrigin.RECOVERY_MNEMONIC) {
				LOGGER.error("You need to use a different constructor if you are creating a wallet from a mnemonic");
				SystemUtils.halt();
			} else {
				LOGGER.warn("Not sure how to proceed, no existing wallet and we need passphrase/mnemonic to proceed since we are not ordered to create a brand new wallet");
				SystemUtils.halt();
			}

		} else {
			if (walletDirectory.listFiles().length != 1) {
				LOGGER.warn("More than one wallet file? Cannot handle this atm.");
				SystemUtils.halt();
			}
			LOGGER.debug("Found an existing wallet!");
			try {
				this.credentials = WalletUtils.loadCredentials(_wallet_password, walletDirectory.listFiles()[0]);
			} catch (IOException e) {
				LOGGER.warn("e: " + e.getMessage());
				SystemUtils.halt();
			} catch (CipherException e) {
				LOGGER.warn("e: " + e.getMessage());
				SystemUtils.halt();
			}
		}

	}

	public EVMLocalWallet(String _walletname, AccountOrigin _wallet_origin, String _wallet_password, String _secret) {
		super();
		this.walletName = _walletname;
		this.walletPassword = _wallet_password;

		File walletDirectory = new File(".evm/wallets/" + _walletname);
		if (!walletDirectory.exists()) walletDirectory.mkdirs();

		if (walletDirectory.listFiles().length == 0) {

			// No existing wallet so assume mnemonic creation in scope
			if (_wallet_origin == AccountOrigin.RECOVERY_MNEMONIC) {

				if (EVMUtils.isValidMnemonic(_secret)) {
					LOGGER.error("No/invalid mnemonic provided, will not attempt to create wallet" );
					SystemUtils.halt();
				}

				if (walletDirectory.listFiles().length > 1) {
					LOGGER.warn("More than one wallet file? Cannot handle this atm. walletDirectory: " + walletDirectory.getName());
					SystemUtils.halt();
				} else if (walletDirectory.listFiles().length == 1) {
					LOGGER.debug("Found an existing wallet with name " + _walletname + ". Going to use this first.");
					try {
						this.credentials = WalletUtils.loadCredentials(_wallet_password, walletDirectory.listFiles()[0]);
					} catch (IOException e) {
						LOGGER.warn("e: " + e.getMessage());
						SystemUtils.halt();
					} catch (CipherException e) {
						LOGGER.warn("e: " + e.getMessage());
						SystemUtils.halt();
					}
				} else {

					LOGGER.debug("Recovering wallet from mnemonic .. " + StringsUtils.cutStringFromLeft(_secret, 3) + "...");
					byte[] seed = MnemonicUtils.generateSeed(_secret, "");
					Bip32ECKeyPair masterKeypair = Bip32ECKeyPair.generateKeyPair(seed);
					Bip32ECKeyPair childKeypair = Bip32ECKeyPair.deriveKeyPair(masterKeypair, BlockchainDetailsGeneric.derivationPathETH0);
					this.credentials = Credentials.create(childKeypair);
					System.out.println(" * This mnemonic gives us the address: " + this.credentials.getAddress());

					try {
						// Create the wallet file
						WalletUtils.generateWalletFile(_wallet_password, childKeypair, walletDirectory, false);
						this.credentials = WalletUtils.loadCredentials(_wallet_password, walletDirectory);
					} catch (IOException e) {
						LOGGER.error("e: " + e.getMessage());
						SystemUtils.halt();
					} catch (CipherException e) {
						LOGGER.error("e: " + e.getMessage());
						SystemUtils.halt();
					}

				}
			} else if (_wallet_origin == AccountOrigin.PRIVATEKEY) {

				if (walletDirectory.listFiles().length > 1) {
					LOGGER.warn("More than one wallet file? Cannot handle this atm. walletDirectory: " + walletDirectory.getName());
					SystemUtils.halt();
				} else if (walletDirectory.listFiles().length == 1) {
					LOGGER.debug("Found an existing wallet with name " + _walletname + ". Going to use this first.");
					try {
						this.credentials = WalletUtils.loadCredentials(_wallet_password, walletDirectory.listFiles()[0]);
					} catch (IOException e) {
						LOGGER.warn("e: " + e.getMessage());
						SystemUtils.halt();
					} catch (CipherException e) {
						LOGGER.warn("e: " + e.getMessage());
						SystemUtils.halt();
					}
				} else {

					if (!EVMUtils.isValidPrivateKey(_secret)) {
						LOGGER.error("No/invalid private key provided, will not attempt to create wallet" );
						//SystemUtils.halt();
					}
					
					if (_secret.startsWith("0x")) _secret = _secret.replaceFirst("0x", "");
					LOGGER.info("Recovering wallet from privatekey .. " + StringsUtils.cutStringFromLeft(_secret, 3) + "...");

					this.credentials = Credentials.create(_secret);
					LOGGER.info(" * This private key gives us the address: " + this.credentials.getAddress());
					ECKeyPair keyPair = ECKeyPair.create(Numeric.toBigInt(_secret));

					try {
						// Create the wallet file
						WalletUtils.generateWalletFile(_wallet_password, keyPair, walletDirectory, false);
					} catch (IOException e) {
						LOGGER.error("e: " + e.getMessage());
						SystemUtils.halt();
					} catch (CipherException e) {
						LOGGER.error("e: " + e.getMessage());
						SystemUtils.halt();
					}

				}

			} else {
				LOGGER.error("Not sure how to proceed, no existing wallet and we need no use of mnemonic to proceed??");
				SystemUtils.halt();
			}

		} else {
			if (walletDirectory.listFiles().length != 1) {
				LOGGER.warn("More than one wallet file? Cannot handle this atm.");
				SystemUtils.halt();
			}
			LOGGER.debug("Found an existing wallet with name " + _walletname + ". Will use this first.");
			try {
				this.credentials = WalletUtils.loadCredentials(_wallet_password, walletDirectory.listFiles()[0]);
			} catch (IOException e) {
				LOGGER.error("e: " + e.getMessage());
				SystemUtils.halt();
			} catch (CipherException e) {
				LOGGER.error("e: " + e.getMessage());
				SystemUtils.halt();
			}
		}

	}

	public String getWalletName() {
		return walletName;
	}

	public void setWalletName(String walletName) {
		this.walletName = walletName;
	}

	public String getWalletPassword() {
		return walletPassword;
	}

	public void setWalletPassword(String walletPassword) {
		this.walletPassword = walletPassword;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public Bip39Wallet getWalletBIP39() {
		return walletBIP39;
	}

	public void setWalletBIP39(Bip39Wallet walletBIP39) {
		this.walletBIP39 = walletBIP39;
	}

	// convenience
	public String getAddress() {
		return this.getCredentials().getAddress();
	}

}
