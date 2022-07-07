package crypto.forestfish.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import org.bouncycastle.jcajce.provider.digest.SHA3;
import org.bouncycastle.util.encoders.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.contracts.eip20.generated.ERC20;
import org.web3j.contracts.eip721.generated.ERC721;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.Keys;
import org.web3j.crypto.RawTransaction;
import org.web3j.crypto.Sign;
import org.web3j.crypto.Sign.SignatureData;
import org.web3j.crypto.TransactionEncoder;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.response.EthBlockNumber;
import org.web3j.protocol.core.methods.response.EthGasPrice;
import org.web3j.protocol.core.methods.response.EthGetTransactionCount;
import org.web3j.protocol.core.methods.response.EthGetTransactionReceipt;
import org.web3j.protocol.core.methods.response.EthSendTransaction;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.tx.gas.DefaultGasProvider;
import org.web3j.utils.Convert;
import org.web3j.utils.Numeric;
import org.web3j.utils.Convert.Unit;

import crypto.forestfish.enums.EVMChain;
import crypto.forestfish.enums.ProviderException;
import crypto.forestfish.objects.evm.ERC20Contract;
import crypto.forestfish.objects.evm.EVMBlockChain;
import crypto.forestfish.objects.evm.ProviderExceptionEvent;
import crypto.forestfish.objects.evm.EVMLocalWallet;
import crypto.forestfish.objects.evm.EVMWalletBalance;
import crypto.forestfish.objects.ipfs.WalletBalance;

public class EVMUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(EVMUtils.class);

	static String SIGN_PREFIX = "\u0019Ethereum Signed Message:\n32";

	public static String signSTR(EVMLocalWallet localWallet, String message) {
		return sign(localWallet.getCredentials(), message);
	}

	public static String sign(Credentials cred, String message) {
		byte[] hash = message.getBytes(StandardCharsets.UTF_8);
		Sign.SignatureData signature = Sign.signPrefixedMessage(hash, cred.getEcKeyPair());
		String r = Numeric.toHexString(signature.getR());
		String s = Numeric.toHexString(signature.getS());
		String v = Numeric.toHexString(signature.getV()).replace("0x", "");
		return new StringBuilder(r)
				.append(s)
				.append(v)
				.toString();
	}

	private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

	public static String bytesToHex(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
		for (int j = 0; j < bytes.length; j++) {
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = HEX_ARRAY[v >>> 4];
			hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
		}
		return new String(hexChars);
	}

	public static void printNodeClientVersion(Web3j web3j, EVMBlockChain bchain) {
		int nrRetriesLeft = 10;
		while (nrRetriesLeft>0) {
			nrRetriesLeft--;
			try {
				Web3ClientVersion clientVersion = web3j.web3ClientVersion().sendAsync().get();
				System.out.println("Client version for nodeURL " + bchain.getNodeURL() + ": " + clientVersion.getWeb3ClientVersion());
			} catch (Exception ex) {
				LOGGER.warn("nrRetriesLeft: " + nrRetriesLeft + " printNodeClientVersion() ex: " + ex.getMessage());
				ProviderExceptionEvent evmE = handleProviderException(ex);
				if (evmE.isNodeInteraction()) nrRetriesLeft--; 
				if (evmE.isSleepBeforeRetry()) SystemUtils.sleepInSeconds(evmE.getSleepTimeInSecondsRecommended());
				if (evmE.getExceptionType() == ProviderException.FATAL) SystemUtils.halt();
			}
		}
	}

	public static EVMWalletBalance getWalletBalanceMain(Web3j web3j, EVMBlockChain bchain, EVMLocalWallet localWallet) {
		int nrRetriesLeft = 10;
		while (nrRetriesLeft>0) {
			nrRetriesLeft--;
			try {
				Web3ClientVersion clientVersion = web3j.web3ClientVersion().sendAsync().get();
				LOGGER.debug("Client version: " + clientVersion.getWeb3ClientVersion());
				BigDecimal balanceInETH = localWallet.getWalletBalanceInEth(web3j);
				BigInteger balanceInWEI = localWallet.getWalletBalanceInWei(web3j);
				return new EVMWalletBalance(balanceInETH, balanceInWEI);
			} catch (Exception ex) {
				LOGGER.warn("nrRetriesLeft: " + nrRetriesLeft + " getWalletBalanceMain() ex: " + ex.getMessage());
				ProviderExceptionEvent evmE = handleProviderException(ex);
				if (evmE.isNodeInteraction()) nrRetriesLeft--; 
				if (evmE.isSleepBeforeRetry()) SystemUtils.sleepInSeconds(evmE.getSleepTimeInSecondsRecommended());
				if (evmE.getExceptionType() == ProviderException.FATAL) SystemUtils.halt();
			}
		}
		return null;
	}

	public static void printWalletBalance(Web3j web3j, EVMBlockChain bchain, EVMLocalWallet localWallet) {
		int nrRetriesLeft = 10;
		while (nrRetriesLeft>0) {
			nrRetriesLeft--;
			try {
				Web3ClientVersion clientVersion = web3j.web3ClientVersion().sendAsync().get();
				LOGGER.debug("Client version: " + clientVersion.getWeb3ClientVersion());
			} catch (Exception ex) {
				LOGGER.warn("nrRetriesLeft: " + nrRetriesLeft + " printWalletBalance() ex: " + ex.getMessage());
				ProviderExceptionEvent evmE = handleProviderException(ex);
				if (evmE.isNodeInteraction()) nrRetriesLeft--; 
				if (evmE.isSleepBeforeRetry()) SystemUtils.sleepInSeconds(evmE.getSleepTimeInSecondsRecommended());
				if (evmE.getExceptionType() == ProviderException.FATAL) SystemUtils.halt();
			}
			EVMWalletBalance evmw = getWalletBalanceMain(web3j, bchain, localWallet);
			System.out.println(" * wallet address " + localWallet.getCredentials().getAddress() + " balance " +  evmw.getBalanceInETH() + " " + bchain.getTokenName() + " [" + evmw.getBalanceInWEI() + " wei]");
		}
	}

	public static WalletBalance getWalletBalanceForERC20Token(Web3j web3j, EVMBlockChain bchain, String walletAddress, ERC20Contract customTokenContract) {
		BigDecimal balanceInETH = null;
		BigInteger balanceInWEI = null;

		/**
		 *  Connect to ETH client
		 */
		int nrRetriesLeft = 10;
		while (nrRetriesLeft>0) {
			nrRetriesLeft--;
			try {
				Web3ClientVersion clientVersion = web3j.web3ClientVersion().sendAsync().get();
				LOGGER.debug("Client version: " + clientVersion.getWeb3ClientVersion());
			} catch (Exception ex) {
				LOGGER.warn("nrRetriesLeft: " + nrRetriesLeft + " getWalletBalanceForERC20Token() ex: " + ex.getMessage());
				ProviderExceptionEvent evmE = handleProviderException(ex);
				if (evmE.isNodeInteraction()) nrRetriesLeft--; 
				if (evmE.isSleepBeforeRetry()) SystemUtils.sleepInSeconds(evmE.getSleepTimeInSecondsRecommended());
				if (evmE.getExceptionType() == ProviderException.FATAL) SystemUtils.halt();
			}
		}

		/**
		 *  print ERC20 token balance
		 */
		nrRetriesLeft = 10;
		while (nrRetriesLeft>0) {
			nrRetriesLeft--;
			try {
				// Why do we need to supply credentials to ERC20.load()? Just create a fake entry for now
				String pk = "0x9999999999999999999999999999999999999999999999999999999999999999";
				Credentials credentials = Credentials.create(pk);

				ERC20 customERC20Contract = ERC20.load(customTokenContract.getContractAdress(), web3j, credentials, new DefaultGasProvider());
				LOGGER.debug("ERC20 contract address: " + customERC20Contract.getContractAddress());

				balanceInWEI = customERC20Contract.balanceOf(walletAddress).send();

				// Handle custom per token fractions
				if (false ||
						(0 != customTokenContract.getWeiFraction().compareTo(getDefaultDivide())) ||
						(0 != customTokenContract.getWeiMultiple().compareTo(getDefaultMultiple())) ||
						false) {
					LOGGER.debug("we have a custom fraction/multiple setting for customToken " + customTokenContract.getTokenName());
					LOGGER.debug(" - customTokenContract.getWeiFraction(): " + customTokenContract.getWeiFraction());
					LOGGER.debug(" - customTokenContract.getWeiMultiple(): " + customTokenContract.getWeiMultiple());
					balanceInWEI = balanceInWEI.multiply(customTokenContract.getWeiMultiple());
				}
				balanceInETH = EVMUtils.convertBalanceInWeiToEth(balanceInWEI, web3j);
				return new WalletBalance(balanceInETH, balanceInWEI);

			} catch (Exception ex) {
				if (ex.getMessage().equals("Empty value (0x) returned from contract")) {
					System.out.println(" * wallet address " + walletAddress + " balance " +  0 + " " + customTokenContract.getTokenName() + " [" + 0 + " wei]");
				} else {
					LOGGER.warn("nrRetriesLeft: " + nrRetriesLeft + " getWalletBalanceForERC20Token() ex: " + ex.getMessage());
					ProviderExceptionEvent evmE = handleProviderException(ex);
					if (evmE.isNodeInteraction()) nrRetriesLeft--; 
					if (evmE.isSleepBeforeRetry()) SystemUtils.sleepInSeconds(evmE.getSleepTimeInSecondsRecommended());
					if (evmE.getExceptionType() == ProviderException.FATAL) SystemUtils.halt();
				}
			}
		}

		return null;
	}

	public static void printWalletBalanceForERC20Token(Web3j web3j, EVMBlockChain bchain, String walletAddress, ERC20Contract customTokenContract) {
		WalletBalance bal = getWalletBalanceForERC20Token(web3j, bchain, walletAddress, customTokenContract);
		if (null != bal) {
			System.out.println(" * wallet address " + walletAddress + " balance " +  bal.getBalance() + " " + customTokenContract.getTokenName() + " [" + bal.getBalanceInWEI() + " wei]");
		}
	}

	public static BigDecimal convertBalanceInWeiToEth(BigInteger balance, Web3j web3j) {
		int nrRetriesLeft = 10;
		while (nrRetriesLeft>0) {
			nrRetriesLeft--;
			try {
				BigDecimal ethBalanceFULL = Convert.fromWei(balance.toString(), Unit.ETHER);
				return ethBalanceFULL;
			} catch (Exception ex) {
				LOGGER.warn("nrRetriesLeft: " + nrRetriesLeft + " convertBalanceInWeiToEth() ex: " + ex.getMessage());
				ProviderExceptionEvent evmE = handleProviderException(ex);
				if (evmE.isNodeInteraction()) nrRetriesLeft--; 
				if (evmE.isSleepBeforeRetry()) SystemUtils.sleepInSeconds(evmE.getSleepTimeInSecondsRecommended());
				if (evmE.getExceptionType() == ProviderException.FATAL) SystemUtils.halt();
			}
		}
		return null;
	}

	public static void printLatestBlockNumber(Web3j web3j, EVMBlockChain bchain) {
		int nrRetriesLeft = 10;
		while (nrRetriesLeft>0) {
			nrRetriesLeft--;
			try {
				EthBlockNumber result = web3j.ethBlockNumber().sendAsync().get(); 
				LOGGER.info(bchain.getName() + " (chainid: " + bchain.getChainID() + ") latest block number: " + result.getBlockNumber().toString());
			} catch (Exception ex) {
				LOGGER.warn("nrRetriesLeft: " + nrRetriesLeft + " printLatestBlockNumber() ex: " + ex.getMessage());
				ProviderExceptionEvent evmE = handleProviderException(ex);
				if (evmE.isNodeInteraction()) nrRetriesLeft--; 
				if (evmE.isSleepBeforeRetry()) SystemUtils.sleepInSeconds(evmE.getSleepTimeInSecondsRecommended());
				if (evmE.getExceptionType() == ProviderException.FATAL) SystemUtils.halt();
			}
		}
	}

	public static void printCurrentStandardGasPriceInGWEI(Web3j web3j, EVMBlockChain bchain) {
		int nrRetriesLeft = 10;
		while (nrRetriesLeft>0) {
			nrRetriesLeft--;
			try {
				EthGasPrice gasPrice =  web3j.ethGasPrice().send();
				LOGGER.info(bchain.getName() + " (chainid: " + bchain.getChainID() + ") current STANDARD gas price : " + gasPrice.getGasPrice().divide(new BigInteger("1000000000")) + " GWEI");
			} catch (Exception ex) {
				LOGGER.warn("nrRetriesLeft: " + nrRetriesLeft + " printCurrentStandardGasPriceInGWEI() ex: " + ex.getMessage());
				ProviderExceptionEvent evmE = handleProviderException(ex);
				if (evmE.isNodeInteraction()) nrRetriesLeft--; 
				if (evmE.isSleepBeforeRetry()) SystemUtils.sleepInSeconds(evmE.getSleepTimeInSecondsRecommended());
				if (evmE.getExceptionType() == ProviderException.FATAL) SystemUtils.halt();
			}
		}
	}

	public static Integer getCurrentStandardGasPriceInGWEI(Web3j web3j, EVMBlockChain bchain) {
		int nrRetriesLeft = 10;
		while (nrRetriesLeft>0) {
			nrRetriesLeft--;
			try {
				EthGasPrice gasPrice =  web3j.ethGasPrice().send();
				BigInteger bint = gasPrice.getGasPrice().divide(new BigInteger("1000000000"));
				return Integer.parseInt("" + bint.toString());
			} catch (Exception ex) {
				LOGGER.warn("nrRetriesLeft: " + nrRetriesLeft + " getCurrentStandardGasPriceInGWEI() ex: " + ex.getMessage());
				ProviderExceptionEvent evmE = handleProviderException(ex);
				if (evmE.isNodeInteraction()) nrRetriesLeft--; 
				if (evmE.isSleepBeforeRetry()) SystemUtils.sleepInSeconds(evmE.getSleepTimeInSecondsRecommended());
				if (evmE.getExceptionType() == ProviderException.FATAL) SystemUtils.halt();
			}
		}
		LOGGER.error("getCurrentStandardGasPriceInGWEI(), unable to complete request");
		SystemUtils.halt();
		return null;
	}

	public static void printDetailsOfOwnedNFTs(Web3j web3j, EVMBlockChain bchain, EVMLocalWallet wallet, String nftContractAddress, BigInteger tokenID) {

		/**
		 *  Connect to ETH client
		 */
		try {
			Web3ClientVersion clientVersion = web3j.web3ClientVersion().sendAsync().get();
			LOGGER.debug("Client version: " + clientVersion.getWeb3ClientVersion());
		} catch (Exception e) {
			LOGGER.error("printDetailsOfOwnedNFTs() e: " + e.getMessage());
			System.exit(1);
		}

		ERC721 nftContract = ERC721.load(nftContractAddress, web3j, wallet.getCredentials(), null);

		try {
			System.out.println("\n\n------------------------- NFT ERC721 " + nftContract.getContractAddress() + " -------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			String contractBinary = nftContract.getContractBinary(); // Bin file was not provided
			System.out.println(" - contractBinary: " + contractBinary);

			String approvedRC = nftContract.getApproved(tokenID).send();
			System.out.println(" - approvedRC: " + approvedRC);

			BigInteger balanceOf = nftContract.balanceOf(wallet.getCredentials().getAddress()).send();
			System.out.println(" - nr owned by wallet: " + balanceOf);

			BigInteger weiValue = new BigInteger("5");

			System.out.println("adress: " + wallet.getCredentials().getAddress());
			System.out.println("tokenID: " + tokenID);
			System.out.println("weiValue: " + weiValue);
			System.out.println("nftContract.getContractAddress(): " + nftContract.getContractAddress());

		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

	public static String sendTX(Web3j web3j, EVMBlockChain bchain, EVMLocalWallet wallet, String contractAddress, String rawData, int initialConfirmTimeInSeconds, String strFallbackGasPrice, String strGasLimit) {

		String hash = null;
		boolean confirmedTransaction = false;
		int transactionAttemptCount = 0;
		boolean doubleGasPrice = false;
		boolean bumpNoonce = false; // to force a new transaction

		while (!confirmedTransaction && transactionAttemptCount<5) {
			transactionAttemptCount++;

			try {
				EthGetTransactionCount ethGetTransactionCount = web3j.ethGetTransactionCount(wallet.getCredentials().getAddress(), DefaultBlockParameterName.PENDING).send();
				BigInteger nonce =  ethGetTransactionCount.getTransactionCount();
				if (bumpNoonce) nonce = nonce.add(new BigInteger("1"));

				DefaultGasProvider gp0 = new DefaultGasProvider();
				BigInteger gasPrice = gp0.getGasPrice();
				System.out.println("DefaultGasProvider gasPrice: " + gasPrice);
				//BigInteger gasLimit = gp.getGasLimit();

				LOGGER.info("Getting gasprice.. fallback gasprice is " + strFallbackGasPrice);
				//BigInteger gasPrice = null;
				try {
					if ((transactionAttemptCount > 1) || doubleGasPrice) {
						gasPrice = web3j.ethGasPrice().send().getGasPrice().multiply(new BigInteger("2")); // increase by 100%
						LOGGER.info("Double the gas price since this is attempt " + transactionAttemptCount);
					} else {
						gasPrice = web3j.ethGasPrice().send().getGasPrice();
					}
				} catch (Exception e) {
					LOGGER.warn("Caught exception while getting gasprice: " + e.getMessage() + ", moving forward with fallback gasPrice " + strFallbackGasPrice);
					gasPrice = new BigInteger(strFallbackGasPrice);
				}
				LOGGER.info("Moving forward with gasprice " + gasPrice.toString());

				BigInteger gasLimit = null;
				if (null == strGasLimit) {
					LOGGER.info("Using default gasLimit");
					DefaultGasProvider gp = new DefaultGasProvider();
					gasLimit = gp.getGasLimit();
				} else {
					LOGGER.info("Using specified gasLimit of " + strGasLimit);
					gasLimit = new BigInteger(strGasLimit);
				}
				LOGGER.info("Proceeding with tx using gasPrice: " + gasPrice + ", gasLimit: " + gasLimit + " and noonce " + nonce + ", transactionAttemptCount=" + transactionAttemptCount); 

				RawTransaction rawTransaction = RawTransaction.createTransaction(nonce, gasPrice, gasLimit, contractAddress, rawData);
				byte[] signedMessage = TransactionEncoder.signMessage(rawTransaction, Long.parseLong(bchain.getChainID() + ""), wallet.getCredentials());
				String hexSignedMessage = Numeric.toHexString(signedMessage);

				EthSendTransaction response = web3j.ethSendRawTransaction(hexSignedMessage).send();
				hash = response.getTransactionHash();
				if (null == hash) {
					if (response.getError().getMessage().contains("already known")) {
						LOGGER.warn("Transaction gave an \"already known\" response, which means you may have submitted the same transaction twice");
						confirmedTransaction = true; // this feels wrong
					} else if (response.getError().getMessage().contains("replacement transaction underpriced")) {
						// https://ethereum.stackexchange.com/questions/27256/error-replacement-transaction-underpriced/44875
						LOGGER.warn("Transaction gave an \"replacement transaction\" response, which means you may have submitted the same transaction twice");
						confirmedTransaction = true; // let this slide only if in HA mode?
					} else if (response.getError().getMessage().contains("transaction underpriced")) {
						doubleGasPrice = true;
					} else if (response.getError().getMessage().contains("nonce too low")) {
						// https://ethereum.stackexchange.com/questions/78044/error-nonce-too-low
						bumpNoonce = true;
					} else if (response.getError().getMessage().contains("insufficient funds for gas")) {
						LOGGER.error("Out of funds!");					
						SystemUtils.halt();
					} else {
						LOGGER.error("response ERROR data: " + response.getError().getData());
						LOGGER.error("response ERROR message: " + response.getError().getMessage());
						LOGGER.error("response ERROR code: " + response.getError().getCode());
						LOGGER.error("response ID: " + response.getId());
						LOGGER.error("response rawresponse: " + response.getRawResponse());
						SystemUtils.halt();
					}
				} else {
					LOGGER.info("txhash: " + hash);
					LOGGER.info("response ID: " + response.getId());
					//LOGGER.info("response result: " + response.getResult()); // same as txhash
				}

				// At least give it a few seconds
				LOGGER.info("Giving transaction an initial " + initialConfirmTimeInSeconds + " seconds to get a confirmation ..");
				SystemUtils.sleepInSeconds(initialConfirmTimeInSeconds);

				// Wait for a successful transaction
				if (null != response.getTransactionHash()) {
					LOGGER.info("lets go with " + response.getTransactionHash());

					int receiptPollCounter = 0;
					while (!confirmedTransaction) {
						EthGetTransactionReceipt ethGetTransactionReceipt = web3j.ethGetTransactionReceipt(response.getTransactionHash()).send();
						LOGGER.info("ethGetTransactionReceipt: " + ethGetTransactionReceipt.getTransactionReceipt().isPresent() + " for txhash " + response.getTransactionHash());
						SystemUtils.sleepInSeconds(10);
						if (ethGetTransactionReceipt.getTransactionReceipt().isPresent()) confirmedTransaction = true;
						receiptPollCounter++;

						if (receiptPollCounter>20) {
							LOGGER.warn("Unable to grab tx receipt for " + response.getTransactionHash());
						}

						if (receiptPollCounter>50) {
							LOGGER.error("Unable to grab tx receipt for " + response.getTransactionHash() + ", have tried " + receiptPollCounter + " times");
						}
					}
				}

			} catch (Exception ex) {
				ProviderExceptionEvent evmE = handleProviderException(ex);
				if (evmE.isNodeInteraction()) transactionAttemptCount--; 
				if (evmE.isSleepBeforeRetry()) SystemUtils.sleepInSeconds(evmE.getSleepTimeInSecondsRecommended());
				if (evmE.getExceptionType() == ProviderException.FATAL) SystemUtils.halt();
			}
		}

		if (confirmedTransaction) {
			return hash;
		} else {
			return null;
		}

	}


	private static ProviderExceptionEvent handleProviderException(Exception ex) {	
		boolean nodeInteraction = false;
		boolean sleepBeforeRetry = false;
		int sleepTimeInSecondsRecommended = 5;
		ProviderException exceptionType = ProviderException.UNKNOWN;
		if (ex.getMessage().contains("timeout")) {
			LOGGER.info("Got a timeout .. will retry .. ex: " + ex.getMessage());
			nodeInteraction = false;
			exceptionType = ProviderException.RECOVERABLE;
		} else if (ex.getMessage().contains("must be in format")) {
			LOGGER.info("Issue getting gas price .. will retry .. ex: " + ex.getMessage());
			sleepBeforeRetry = true;
			sleepTimeInSecondsRecommended = 5;
			exceptionType = ProviderException.RECOVERABLE;
		} else if (ex.getMessage().contains("Unexpected character")) {
			LOGGER.info("Got an unknown/invalid RPC reply .. will retry .. ex: " + ex.getMessage());
			sleepBeforeRetry = true;
			sleepTimeInSecondsRecommended = 5;
			exceptionType = ProviderException.RECOVERABLE;
		} else if (ex.getMessage().contains("404;")) {
			LOGGER.warn("Got a 404 non JSON response .. will retry .. ex: " + ex.getMessage());
			sleepBeforeRetry = true;
			sleepTimeInSecondsRecommended = 5;
			exceptionType = ProviderException.RECOVERABLE;
		} else if (ex.getMessage().contains("502 Bad Gateway")) {
			// 502; <html><head><title>502 Bad Gateway</title></head><body><center><h1>502 Bad Gateway</h1></center></body></html>
			LOGGER.warn("Got a 502 non JSON response .. will retry .. ex: " + ex.getMessage());
			sleepBeforeRetry = true;
			sleepTimeInSecondsRecommended = 5;
			exceptionType = ProviderException.RECOVERABLE;	
		} else if (ex.getMessage().contains("Invalid response received: 429")) {
			if (ex.getMessage().contains("daily request count exceeded")) {
				LOGGER.info("RPC Node limit reached " + ex.getMessage() + ", we should cool down");
				sleepBeforeRetry = true;
				sleepTimeInSecondsRecommended = 3600;
				exceptionType = ProviderException.RECOVERABLE;
			} else {
				LOGGER.error("Unknown 429 error: " + ex.getMessage() + ", update handleEVMInteractionException() .. exiting");
				exceptionType = ProviderException.UNKNOWN;
			}
		} else {
			exceptionType = ProviderException.UNKNOWN;
			LOGGER.warn("Unknown error: " + ex.getMessage() + ", update handleEVMInteractionException()");
		}

		return new ProviderExceptionEvent(exceptionType, nodeInteraction, sleepBeforeRetry, sleepTimeInSecondsRecommended);
	}


	/**
	 * https://www.oodlestechnologies.com/blogs/validating-ethereum-address/
	 * @param ethereumAddress
	 * @return
	 */
	public static boolean isValidEthereumAddress(String ethereumAddress) {

		if (null == ethereumAddress) return false;
		if (!ethereumAddress.startsWith("0x")) return false;
		if (ethereumAddress.length() != 42) return false;
		
		// to fetch the part after 0x
		String subAddr = ethereumAddress.substring(2);

		// Make it to original lower case address
		String subAddrLower = subAddr.toLowerCase();

		// Create a SHA3256 hash (Keccak-256)
		SHA3.DigestSHA3 digestSHA3 = new SHA3.Digest256();
		digestSHA3.update(subAddrLower.getBytes());
		String digestMessage = Hex.toHexString(digestSHA3.digest());
		/*
		 * Check each letter is upper case or not if it is upper case then the
		 * corresponding binary position of the hashed address should be 1 i.e the
		 * message digest letter should be getter than 7 as 7 is the last Hex digit
		 * which starts with 0 in binary rest of all 8 to f starts with 1 (i.e 7: 0111, 8: 1000)
		 */
		for (short i = 0; i < subAddr.length(); i++) {
			if (subAddr.charAt(i) >= 65 && subAddr.charAt(i) <= 91) {
				String ss = Character.toString(digestMessage.charAt(i));
				if (!(Integer.parseInt(ss, 16) > 7)) {
					return false;
				}
			}
		}
		return true;

	}


	public static EVMBlockChain createBlockchain(EVMChain chain, String providerURL) {
		EVMBlockChain blockChain = null;

		if (chain == EVMChain.ETHEREUM) blockChain = new EVMBlockChain("Ethereum", "ETH", 1, providerURL, "https://etherscan.io/");
		if (chain == EVMChain.POLYGON) blockChain = new EVMBlockChain("Polygon", "MATIC", 1, providerURL, "https://polygonscan.com/");

		if (null == blockChain) {
			LOGGER.error("Not sure how to create a blockchain of type " + chain);
			SystemUtils.halt();
		}
		return blockChain;
	}


	public static boolean makeRequest(String hexData, int txRetryThreshold, int confirmTimeInSecondsBeforeRetry, Web3j maticWeb3j, EVMBlockChain maticBlockChain, EVMLocalWallet maticWallet, String aavegotchiContractAddress, String gasLimit) {
		String fallbackGasPrice = "30000000000";
		return makeRequest(hexData, txRetryThreshold, confirmTimeInSecondsBeforeRetry, maticWeb3j, maticBlockChain, maticWallet, aavegotchiContractAddress, fallbackGasPrice, gasLimit);
	}


	public static boolean makeRequest(String hexData, int txRetryThreshold, int confirmTimeInSecondsBeforeRetry, Web3j maticWeb3j, EVMBlockChain maticBlockChain, EVMLocalWallet maticWallet, String aavegotchiContractAddress, String fallbackGasPrice, String gasLimit) {
		int txCounter = 0;
		boolean txAttemptsCompleted = false;
		while (!txAttemptsCompleted && txCounter <= txRetryThreshold) {
			LOGGER.info("Sending request: " + hexData);

			String txHASH = EVMUtils.sendTX(maticWeb3j, maticBlockChain, maticWallet, aavegotchiContractAddress, hexData, confirmTimeInSecondsBeforeRetry, fallbackGasPrice, gasLimit);
			if (null == txHASH) {
				LOGGER.warn("Transaction failed, will sleep 10 seconds and try again (attempt #" + txCounter + ")");
				SystemUtils.sleepInSeconds(10);
				txCounter++;
			} else {
				System.out.println("txHASH: " + txHASH);
				txAttemptsCompleted = true;
			}

			if (!txAttemptsCompleted && txCounter == 20) {
				LOGGER.warn("Unable to get a transaction receipt after multiple attempts .. we can still check if kinship still got bumped");
			}

		}
		return txAttemptsCompleted;
	}


	public static BigInteger getDefaultDivide() {
		return new BigInteger("1000000000000000000");
	}

	public static BigInteger getDefaultMultiple() {
		return new BigInteger("1");
	}

	public static boolean verify(String signature, String message, String address) {
		byte[] msgHash = message.getBytes();

		String r_string = "0x" + signature.replace("0x","").substring(0, 64);
		String s_string = "0x" + signature.replace("0x","").substring(64, 128);
		String v_string = "0x" + signature.replace("0x","").substring(128, 130);

		byte[] rbyte = Numeric.hexStringToByteArray(r_string);
		byte[] sbyte = Numeric.hexStringToByteArray(s_string);
		byte v = Numeric.hexStringToByteArray(v_string)[0];

		SignatureData sd =
				new SignatureData(
						v,
						rbyte,
						sbyte);

		LOGGER.debug("validate v: " + Numeric.toHexString(sd.getV()));
		LOGGER.debug("validate r: " + Numeric.toHexString(sd.getR()));
		LOGGER.debug("validate s: " + Numeric.toHexString(sd.getS()));

		String addressRecovered = null;
		boolean match = false;

		try {
			BigInteger recoveredKey = Sign.signedPrefixedMessageToKey(msgHash, sd);
			if (recoveredKey != null) {
				addressRecovered = "0x" + Keys.getAddress(recoveredKey);
				LOGGER.debug("addressRecovered: " + addressRecovered);
				if (addressRecovered.equals(address)) match = true;
			}

		} catch (SignatureException e) {
			e.printStackTrace();
		} 

		return match;
	}

}
