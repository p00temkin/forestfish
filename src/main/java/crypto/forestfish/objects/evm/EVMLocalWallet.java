package crypto.forestfish.objects.evm;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.crypto.Bip32ECKeyPair;
import org.web3j.crypto.Bip39Wallet;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.ECKeyPair;
import org.web3j.crypto.MnemonicUtils;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.response.EthGetBalance;
import org.web3j.utils.Convert;
import org.web3j.utils.Convert.Unit;
import crypto.forestfish.enums.WalletOrigin;
import crypto.forestfish.utils.SystemUtils;

public class EVMLocalWallet {

    private static final Logger LOGGER = LoggerFactory.getLogger(EVMLocalWallet.class);

    private int HARDENED_BIT = 0x80000000;
    private static final int PRIVATE_KEY_RADIX = 16;

    private String walletName;
    private String walletPassword;

    // Derived
    private Credentials credentials = null;
    private Bip39Wallet walletBIP39 = null;

    public EVMLocalWallet(String walletName, WalletOrigin walletOrigin, String walletPassword) {
        super();
        this.walletName = walletName;
        this.walletPassword = walletPassword;

        File walletDirectory = new File(walletName);
        if (!walletDirectory.exists()) walletDirectory.mkdirs();

        if (walletDirectory.listFiles().length == 0) {

            // INTENTION TO LOAD FROM EXISTING WALLET FAILED
            if (walletOrigin == WalletOrigin.EXISTING_LOCALWALLETFILE) {
                LOGGER.error("The local wallet file " + walletName + " does not exist");
                SystemUtils.halt();

                // CREATE A NEW WALLET
            } else if (walletOrigin == WalletOrigin.NEW_LOCALWALLETFILE) {
                try {
                    LOGGER.info("Creating a new wallet");
                    this.walletBIP39 = WalletUtils.generateBip39Wallet(walletPassword, walletDirectory);
                    this.credentials = WalletUtils.loadBip39Credentials(walletPassword, this.walletBIP39.getMnemonic());
                    
                    System.out.println(" * mnemonic for this new wallet is: " + this.walletBIP39.getMnemonic());
                    System.out.println(" * address for this new wallet is: " + this.credentials.getAddress());
                    
                } catch (CipherException e) {
                    LOGGER.warn("e: " + e.getMessage());
                    SystemUtils.halt();
                } catch (IOException e) {
                    LOGGER.warn("e: " + e.getMessage());
                    SystemUtils.halt();
                }
            } else if (walletOrigin == WalletOrigin.RECOVERY_MNEMONIC) {
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
                this.credentials = WalletUtils.loadCredentials(walletPassword, walletDirectory.listFiles()[0]);
            } catch (IOException e) {
                LOGGER.warn("e: " + e.getMessage());
                SystemUtils.halt();
            } catch (CipherException e) {
                LOGGER.warn("e: " + e.getMessage());
                SystemUtils.halt();
            }
        }

    }

    public EVMLocalWallet(String walletName, WalletOrigin walletOrigin, String walletPassword, String mnemonicSTR) {
        super();
        this.walletName = walletName;
        this.walletPassword = walletPassword;

        File walletDirectory = new File(walletName);
        if (!walletDirectory.exists()) walletDirectory.mkdirs();

        if (walletDirectory.listFiles().length == 0) {

            // No existing wallet so assume mnemonic creation in scope
            if (walletOrigin == WalletOrigin.RECOVERY_MNEMONIC) {

                if (mnemonicSTR.contains("xxx")) {
                    LOGGER.error("No mnemonic provided, will not attempt to create wallet" );
                    SystemUtils.halt();
                }
                
                if (walletDirectory.listFiles().length > 1) {
                    LOGGER.warn("More than one wallet file? Cannot handle this atm. walletDirectory: " + walletDirectory.getName());
                    SystemUtils.halt();
                } else if (walletDirectory.listFiles().length == 1) {
                    System.out.println("Found an existing wallet with name " + walletName + ". Going to use this first.");
                    try {
                        this.credentials = WalletUtils.loadCredentials(walletPassword, walletDirectory.listFiles()[0]);
                    } catch (IOException e) {
                        LOGGER.warn("e: " + e.getMessage());
                        SystemUtils.halt();
                    } catch (CipherException e) {
                        LOGGER.warn("e: " + e.getMessage());
                        SystemUtils.halt();
                    }
                } else {

                    System.out.println("Recovering wallet from mnemonic .. " + mnemonicSTR);
                    byte[] seed = MnemonicUtils.generateSeed(mnemonicSTR, "");
                    Bip32ECKeyPair masterKeypair = Bip32ECKeyPair.generateKeyPair(seed);
                    final int[] path = {44 | HARDENED_BIT, 60 | HARDENED_BIT, 0 | HARDENED_BIT, 0, 0};
                    Bip32ECKeyPair childKeypair = Bip32ECKeyPair.deriveKeyPair(masterKeypair, path);
                    this.credentials = Credentials.create(childKeypair);
                    System.out.println(" * This mnemonic gives us the address: " + this.credentials.getAddress());

                    try {
                        // Create the wallet file
                        WalletUtils.generateWalletFile(walletPassword, childKeypair, walletDirectory, false);
                        this.credentials = WalletUtils.loadCredentials(walletPassword, walletDirectory);
                    } catch (IOException e) {
                        LOGGER.error("e: " + e.getMessage());
                        SystemUtils.halt();
                    } catch (CipherException e) {
                        LOGGER.error("e: " + e.getMessage());
                        SystemUtils.halt();
                    }
                   
                }
            } else if (walletOrigin == WalletOrigin.PRIVATEKEY) {
                
                if (walletDirectory.listFiles().length > 1) {
                    LOGGER.warn("More than one wallet file? Cannot handle this atm. walletDirectory: " + walletDirectory.getName());
                    SystemUtils.halt();
                } else if (walletDirectory.listFiles().length == 1) {
                    System.out.println("Found an existing wallet with name " + walletName + ". Going to use this first.");
                    try {
                        this.credentials = WalletUtils.loadCredentials(walletPassword, walletDirectory.listFiles()[0]);
                    } catch (IOException e) {
                        LOGGER.warn("e: " + e.getMessage());
                        SystemUtils.halt();
                    } catch (CipherException e) {
                        LOGGER.warn("e: " + e.getMessage());
                        SystemUtils.halt();
                    }
                } else {

                    System.out.println("Recovering wallet from privatekey .. " + mnemonicSTR);
                    
                    BigInteger key = new BigInteger(mnemonicSTR, PRIVATE_KEY_RADIX);
                    ECKeyPair keyPair = ECKeyPair.create(key);
                    
                    this.credentials = Credentials.create(keyPair);

                    try {
                        // Create the wallet file
                        WalletUtils.generateWalletFile(walletPassword, keyPair, walletDirectory, false);
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
            LOGGER.info("Found an existing wallet with name " + walletName + ". Will use this first.");
            try {
                this.credentials = WalletUtils.loadCredentials(walletPassword, walletDirectory.listFiles()[0]);
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

    public BigDecimal getWalletBalanceInEth(Web3j web3j) {
        try {
            EthGetBalance ethGetBalance = web3j.ethGetBalance(this.getCredentials().getAddress(), DefaultBlockParameterName.PENDING).send();
            BigDecimal ethBalanceFULL = Convert.fromWei(ethGetBalance.getBalance().toString(), Unit.ETHER);
            return ethBalanceFULL;
        } catch (IOException e) {
            LOGGER.warn("e: " + e.getMessage());
            SystemUtils.halt();
        }
        return null;
    }

    public BigInteger getWalletBalanceInWei(Web3j web3j) {
        try {
            EthGetBalance ethGetBalance = web3j.ethGetBalance(this.getCredentials().getAddress(), DefaultBlockParameterName.PENDING).send();
            return ethGetBalance.getBalance();
        } catch (IOException e) {
            LOGGER.error("e: " + e.getMessage());
            SystemUtils.halt();
        }
        return null;
    }

    // convenience
    public String getAddress() {
        return this.getCredentials().getAddress();
    }

}
