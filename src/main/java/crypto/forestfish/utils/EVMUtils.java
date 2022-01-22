package crypto.forestfish.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.bouncycastle.jcajce.provider.digest.SHA3;
import org.bouncycastle.util.encoders.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.contracts.eip20.generated.ERC20;
import org.web3j.contracts.eip721.generated.ERC721;
import org.web3j.crypto.Hash;
import org.web3j.crypto.RawTransaction;
import org.web3j.crypto.Sign;
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
import crypto.forestfish.objects.evm.EVMLocalWallet;
import crypto.forestfish.objects.evm.EVMWalletBalance;

public class EVMUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(EVMUtils.class);

	public static void printSignedMessage(EVMLocalWallet localWallet, String message) {

		/**
		 *  sign a message
		 */
		byte[] messageToSign = message.getBytes();

		// Create prefix
		String prefix = "\u0019Ethereum Signed Message:\n" + messageToSign.length;

		// Concat prefix and message
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );

		try {
			outputStream.write(prefix.getBytes());
			outputStream.write(messageToSign);
		} catch (IOException e) {
			throw new RuntimeException("Error when generating signature", e);
		}

		// Hash the prefixed message
		byte[] hashedPrefixedMessage = Hash.sha3(outputStream.toByteArray());

		//Sign the hashed message with the credentials private key
		Sign.SignatureData signedMessage = Sign.signMessage(
				hashedPrefixedMessage, localWallet.getCredentials().getEcKeyPair(), false);

		// Convert sig values from bytes[] to int / hex strings
		String hexSigR = Numeric.toHexString(signedMessage.getR());
		String hexSigS = Numeric.toHexString(signedMessage.getS());
		String hexSigV = Numeric.toHexString(signedMessage.getV());
		String signedM = "0x" + hexSigR.replaceFirst("0x", "") + hexSigS.replaceFirst("0x", "") + hexSigV.replaceFirst("0x", "");

		LOGGER.info("Signed message with wallet " + localWallet.getWalletName() + ": " + signedM);

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
		try {
			Web3ClientVersion clientVersion = web3j.web3ClientVersion().sendAsync().get();
			System.out.println("Client version for nodeURL " + bchain.getNodeURL() + ": " + clientVersion.getWeb3ClientVersion());
		} catch (Exception e) {
			LOGGER.error("printNodeClientVersion() e: " + e.getMessage());
			System.exit(1);
		}
	}

	public static EVMWalletBalance getWalletBalanceMain(Web3j web3j, EVMBlockChain bchain, EVMLocalWallet localWallet) {
		int nrRetriesLeft = 10;
		if (nrRetriesLeft>0) {
			nrRetriesLeft--;
			try {
				Web3ClientVersion clientVersion = web3j.web3ClientVersion().sendAsync().get();
				LOGGER.debug("Client version: " + clientVersion.getWeb3ClientVersion());

				BigDecimal balanceInETH = localWallet.getWalletBalanceInEth(web3j);
				BigInteger balanceInWEI = localWallet.getWalletBalanceInWei(web3j);
				return new EVMWalletBalance(balanceInETH, balanceInWEI);
				
			} catch (Exception e) {
				LOGGER.warn("getWalletBalanceMain() e: " + e.getMessage());
			}
		}

		return null;
	}

	public static void printWalletBalance(Web3j web3j, EVMBlockChain bchain, EVMLocalWallet localWallet) {

		try {
			Web3ClientVersion clientVersion = web3j.web3ClientVersion().sendAsync().get();
			LOGGER.debug("Client version: " + clientVersion.getWeb3ClientVersion());
		} catch (Exception e) {
			LOGGER.error("printWalletBalance() e: " + e.getMessage());
			System.exit(1);
		}

		EVMWalletBalance evmw = getWalletBalanceMain(web3j, bchain, localWallet);
		System.out.println(" * wallet address " + localWallet.getCredentials().getAddress() + " balance " +  evmw.getBalanceInETH() + " " + bchain.getTokenName() + " [" + evmw.getBalanceInWEI() + " wei]");
	}

	public static void printWalletBalanceForCustomERC20(Web3j web3j, EVMBlockChain bchain, EVMLocalWallet localWallet, ERC20Contract customTokenContract) {

		/**
		 *  Connect to ETH client
		 */
		try {
			Web3ClientVersion clientVersion = web3j.web3ClientVersion().sendAsync().get();
			LOGGER.debug("Client version: " + clientVersion.getWeb3ClientVersion());
		} catch (Exception e) {
			LOGGER.error("init printWalletBalanceForCustomERC20() e: " + e.getMessage());
			System.exit(1);
		}

		/**
		 *  print custom ERC20 token balance
		 */
		try {
			ERC20 customERC20TokensHeldInWallet = ERC20.load(customTokenContract.getContractAdress(), web3j, localWallet.getCredentials(), new DefaultGasProvider());
			BigInteger balanceInWEI = customERC20TokensHeldInWallet.balanceOf(localWallet.getCredentials().getAddress()).send();

			// Handle custom per token fractions
			if (false ||
					(0 != customTokenContract.getWeiFraction().compareTo(localWallet.getDefaultDivide())) ||
					(0 != customTokenContract.getWeiMultiple().compareTo(localWallet.getDefaultMultiple())) ||
					false) {
				LOGGER.debug("we have a custom fraction/multiple setting for customToken " + customTokenContract.getTokenName());
				LOGGER.debug(" - customTokenContract.getWeiFraction(): " + customTokenContract.getWeiFraction());
				LOGGER.debug(" - customTokenContract.getWeiMultiple(): " + customTokenContract.getWeiMultiple());
				balanceInWEI = balanceInWEI.multiply(customTokenContract.getWeiMultiple());
			}

			BigDecimal balanceInETH = EVMUtils.convertBalanceInWeiToEth(balanceInWEI, web3j);
			System.out.println(" * wallet address " + localWallet.getCredentials().getAddress() + " balance " +  balanceInETH + " " + customTokenContract.getTokenName() + " [" + balanceInWEI + " wei]");

		} catch (Exception e) {
			if (e.getMessage().equals("Empty value (0x) returned from contract")) {
				System.out.println(" * wallet addrezz " + localWallet.getCredentials().getAddress() + " balance " +  0 + " " + customTokenContract.getTokenName() + " [" + 0 + " wei]");
			} else {
				LOGGER.error("printWalletBalanceForCustomERC20() e: " + e.getMessage());
				System.exit(1);
			}
		}

	}

	public static BigDecimal convertBalanceInWeiToEth(BigInteger balance, Web3j web3j) {
		try {
			BigDecimal ethBalanceFULL = Convert.fromWei(balance.toString(), Unit.ETHER);
			return ethBalanceFULL;
		} catch (Exception e) {
			LOGGER.warn("convertBalanceInWeiToEth() e: " + e.getMessage());
			System.exit(1);
		}
		return null;
	}

	public static void printLatestBlockNumber(Web3j web3j, EVMBlockChain bchain) {
		try {
			EthBlockNumber result = web3j.ethBlockNumber().sendAsync().get(); 
			System.out.println(bchain.getName() + " (chainid: " + bchain.getChainID() + ") latest block number: " + result.getBlockNumber().toString());
		} catch (Exception e) {
			LOGGER.error("printLatestBlockNumber() e: " + e.getMessage());
			System.exit(1);
		}
	}

	public static void printCurrentStandardGasPriceInGWEI(Web3j web3j, EVMBlockChain bchain) {
		try {
			EthGasPrice gasPrice =  web3j.ethGasPrice().send();
			System.out.println(bchain.getName() + " (chainid: " + bchain.getChainID() + ") current STANDARD gas price : " + gasPrice.getGasPrice().divide(new BigInteger("1000000000")) + " GWEI");
		} catch (Exception e) {
			LOGGER.error("printCurrentStandardGasPriceInGWEI() e: " + e.getMessage());
			System.exit(1);
		}
	}

	public static Integer getCurrentStandardGasPriceInGWEI(Web3j web3j, EVMBlockChain bchain) {
		int failCounter = 0;
		while (failCounter<200) {
			try {
				EthGasPrice gasPrice =  web3j.ethGasPrice().send();
				BigInteger bint = gasPrice.getGasPrice().divide(new BigInteger("1000000000"));
				return Integer.parseInt("" + bint.toString());
			} catch (Exception e) {
				ProviderException pException = EVMUtils.handleProviderException(e);
				failCounter++;
				LOGGER.warn("[" + failCounter + "] pException: " + pException.toString());
				SystemUtils.sleepInSeconds(1);
			}
		}
		LOGGER.error("getCurrentStandardGasPriceInGWEI(), unable to complete request");
		SystemUtils.halt();
		return null;
	}

	private static ProviderException handleProviderException(Exception e) {
		ProviderException pException = EVMUtils.determineIfRecoverableException(e.getMessage());
		if (pException == ProviderException.RECOVERABLE) {
			LOGGER.warn("Got a recoverable provider exception: " + e.getMessage() + ", will sleep 5 secs and try again..");
			SystemUtils.sleepInSeconds(5);
		} else if (pException == ProviderException.FATAL) {
			LOGGER.error("We got a unrecoverable/fatal provider exception (" + e.getMessage() + "), halting");
			SystemUtils.halt();
		} else if (pException == ProviderException.UNKNOWN) {
			LOGGER.warn("We got an unknown provider exception (" + e.getMessage() + "), assuming its a recoverable exception: " + e.getMessage() + ", will sleep 5 secs and try again..");
			SystemUtils.sleepInSeconds(5);
		} else {
			LOGGER.warn("We got an unhandled provider exception (" + e.getMessage() + "), this needs to be mapped to a ProviderException object");
			SystemUtils.halt();
		}
		return pException;
	}

	private static ProviderException determineIfRecoverableException(String exceptionMessage) {
		// Invalid response received: 502; <html><head><title>502 Bad Gateway</title></head><body><center><h1>502 Bad Gateway</h1></center></body></html>
		if (exceptionMessage.contains("502 Bad Gateway")) {
			return ProviderException.RECOVERABLE;
		}
		return ProviderException.UNKNOWN;
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

	public static String sendTX(Web3j web3j, EVMBlockChain bchain, EVMLocalWallet wallet, String contractAddress, String rawData, int initialConfirmTimeInSeconds, String strGasLimit) {

		String hash = null;
		boolean confirmedTransaction = false;
		int transactionAttemptCount = 0;
		boolean bumpNoonce = false; // to force a new transaction

		while (!confirmedTransaction && transactionAttemptCount<5) {
			transactionAttemptCount++;

			try {
				EthGetTransactionCount ethGetTransactionCount = web3j.ethGetTransactionCount(wallet.getCredentials().getAddress(), DefaultBlockParameterName.PENDING).send();
				BigInteger nonce =  ethGetTransactionCount.getTransactionCount();
				if (bumpNoonce) nonce = nonce.add(new BigInteger("1"));

				//DefaultGasProvider gp = new DefaultGasProvider();
				//BigInteger gasPrice = gp.getGasPrice();
				//BigInteger gasLimit = gp.getGasLimit();

				LOGGER.info("Getting gasprice, gasLimit is set to " + strGasLimit);

				BigInteger gasPrice = null;
				if (transactionAttemptCount > 1) {
					gasPrice = web3j.ethGasPrice().send().getGasPrice().multiply(new BigInteger("2")); // increase by 100%
					LOGGER.info("Double the gas price since this is attempt " + transactionAttemptCount);
				} else {
					gasPrice = web3j.ethGasPrice().send().getGasPrice();
				}

				BigInteger gasLimit = new BigInteger(strGasLimit);
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
					} else if (response.getError().getMessage().contains("nonce too low")) {
						// https://ethereum.stackexchange.com/questions/78044/error-nonce-too-low
						bumpNoonce = true;
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
					}
				}

			} catch (Exception ex) {
				if (ex.getMessage().contains("timeout")) {
					LOGGER.info("Got a timeout .. will retry .. ex: " + ex.getMessage());
					transactionAttemptCount--; // lets not count timeouts as actual attempts??
				} else {
					LOGGER.error("ex: " + ex.getMessage());
					SystemUtils.halt();
				}
			}
		}

		if (confirmedTransaction) {
			return hash;
		} else {
			return null;
		}

	}

	/**
	 * https://www.oodlestechnologies.com/blogs/validating-ethereum-address/
	 * @param ethereumAddress
	 * @return
	 */
	public static boolean isValidEthereumAddress(String ethereumAddress) {

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
		int txCounter = 0;
		boolean txAttemptsCompleted = false;
		while (!txAttemptsCompleted && txCounter <= txRetryThreshold) {
			LOGGER.info("Sending request: " + hexData);
			
			String txHASH = EVMUtils.sendTX(maticWeb3j, maticBlockChain, maticWallet, aavegotchiContractAddress, hexData, confirmTimeInSecondsBeforeRetry, gasLimit);
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

}
