package crypto.forestfish.utils;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.contracts.eip20.generated.ERC20;
import org.web3j.contracts.eip721.generated.ERC721;
import org.web3j.crypto.Bip32ECKeyPair;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.Keys;
import org.web3j.crypto.MnemonicUtils;
import org.web3j.crypto.RawTransaction;
import org.web3j.crypto.Sign;
import org.web3j.crypto.Sign.SignatureData;
import org.web3j.crypto.TransactionEncoder;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.protocol.core.methods.response.EthBlockNumber;
import org.web3j.protocol.core.methods.response.EthChainId;
import org.web3j.protocol.core.methods.response.EthGasPrice;
import org.web3j.protocol.core.methods.response.EthGetBalance;
import org.web3j.protocol.core.methods.response.EthGetCode;
import org.web3j.protocol.core.methods.response.EthGetTransactionCount;
import org.web3j.protocol.core.methods.response.EthGetTransactionReceipt;
import org.web3j.protocol.core.methods.response.EthSendTransaction;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.exceptions.TransactionException;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.tx.*;
import org.web3j.tx.gas.DefaultGasProvider;
import org.web3j.tx.gas.StaticGasProvider;
import org.web3j.utils.Convert;
import org.web3j.utils.Numeric;
import org.web3j.utils.Convert.Unit;

import crypto.forestfish.enums.AccountOrigin;
import crypto.forestfish.enums.BlockchainType;
import crypto.forestfish.enums.ExceptionType;
import crypto.forestfish.enums.TokenCategory;
import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.enums.evm.EVMPriceMechanism;
import crypto.forestfish.objects.evm.connector.EVMBlockChainConnector;
import crypto.forestfish.objects.evm.connector.EVMBlockChainUltraConnector;
import crypto.forestfish.objects.evm.model.chain.EVMChainIndex;
import crypto.forestfish.objects.evm.model.chain.EVMChainInfo;
import crypto.forestfish.objects.evm.model.chain.EVMCurrency;
import crypto.forestfish.objects.evm.model.erc20.ERC20TokenIndex;
import crypto.forestfish.objects.evm.model.erc20.EVMERC20TokenInfo;
import crypto.forestfish.objects.evm.model.nft.EVMERC721TokenInfo;
import crypto.forestfish.objects.evm.model.nft.EVMNFTIndex;
import crypto.forestfish.objects.evm.EVMLocalWallet;
import crypto.forestfish.objects.evm.EVMNativeValue;
import crypto.forestfish.objects.evm.EVMNftAccountBalance;
import crypto.forestfish.objects.evm.EVMPortfolio;
import crypto.forestfish.objects.evm.EVMPortfolioDiff;
import crypto.forestfish.objects.evm.EVMPortfolioSimple;
import crypto.forestfish.objects.evm.EVMProviderExceptionActionState;
import crypto.forestfish.objects.evm.EVMProviderException;
import crypto.forestfish.objects.evm.EVMTransactionExceptionEvent;
import crypto.forestfish.objects.evm.NonceCheckStatus;
import crypto.forestfish.objects.evm.PendingTxStatus;
import crypto.forestfish.objects.evm.EVMPortfolioDiffResult;
import crypto.forestfish.objects.embedded.BlockchainDetailsGeneric;
import crypto.forestfish.objects.embedded.evm.BlockchainDetailsEVM;
import crypto.forestfish.objects.evm.EVMAccountBalance;
import crypto.forestfish.objects.evm.EVMChainPortfolio;
import crypto.forestfish.objects.evm.EVMChainPortfolioDiff;

public class EVMUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(EVMUtils.class);

	public static String SIGN_PREFIX = "\u0019Ethereum Signed Message:\n32";
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

	public static String generate12wordMnemonic() {
		byte[] initialEntropy = new byte[16];
		SecureRandom SECURE_RANDOM = new SecureRandom();
		SECURE_RANDOM.nextBytes(initialEntropy);
		String mnemonic = MnemonicUtils.generateMnemonic(initialEntropy);
		return mnemonic;
	}

	public static String generate24wordMnemonic() {
		byte[] initialEntropy = new byte[32];
		SecureRandom SECURE_RANDOM = new SecureRandom();
		SECURE_RANDOM.nextBytes(initialEntropy);
		String mnemonic = MnemonicUtils.generateMnemonic(initialEntropy);
		return mnemonic;
	}

	public static Long getLatestBlockNumberFromNodeAsHealthCheck(EVMChain chain, String nodeURL, Web3j web3j) {
		String meth = "getLatestBlockNumberFromNodeAsHealthCheck()";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = false;
		while ((nodeCallAttemptCount<2) && (requestCount<3)) { // early exit
			requestCount++;
			try {
				EthBlockNumber result = web3j.ethBlockNumber().sendAsync().get(); 
				return result.getBlockNumber().longValue();
			} catch (Exception ex) {
				// RPC call exceptions (readonly), without connector
				EVMProviderException evmE = analyzeProviderException(chain, nodeURL, ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++;
				if (evmE.isSleepBeforeRetry()) {
					SystemUtils.sleepInSeconds(evmE.getSleepTimeInSecondsRecommended());
				} else {
					SystemUtils.sleepInSeconds(1); // Always sleep for 1 sec
				}
				if (evmE.getExceptionType() == ExceptionType.FATAL) SystemUtils.halt();
				if (evmE.isSwitchNode()) return null;
				LOGGER.warn("requestCount: " + requestCount + " nodeCallAttemptCount: " + nodeCallAttemptCount + " get latest block call to nodeURL " + nodeURL);
			} 
		}
		return null; // intentional null response on fail here
	}

	public static String getNodeClientVersion(EVMBlockChainConnector _connector) {
		String meth = "getNodeClientVersion";
		boolean tx_attempt = false;
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Web3ClientVersion clientVersion = _connector.getProvider_instance().web3ClientVersion().sendAsync().get();
				String version = clientVersion.getWeb3ClientVersion();
				if (null != version) {
					return version
							.replace("\n", "")
							.replace("\r", "");
				}
				return "-";
			} catch (Exception ex) {
				// RPC call exceptions (readonly)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			} 
		}
		return "-";
	}

	public static void printNodeClientVersion(EVMBlockChainConnector connector) {
		System.out.println("Client version for nodeURL " + connector.getCurrent_blockexplorerURL() + ": " + getNodeClientVersion(connector));
	}

	public static EVMAccountBalance getWalletBalanceNativeCurrency(EVMBlockChainConnector _connector, EVMLocalWallet _localWallet) {
		String meth = "getWalletBalanceNativeCurrency()";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = false;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				return getAccountNativeBalance(_connector, _localWallet.getAddress());
			} catch (Exception ex) {
				// RPC call exceptions (readonly)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
		}
		return null;
	}

	public static boolean isContractAddress(EVMBlockChainConnector _connector, String _address) {
		String meth = "isContractAddress()";
		boolean tx_attempt = false;
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				EthGetCode ethGetCode = _connector.getProvider_instance().ethGetCode(_address, DefaultBlockParameterName.LATEST).send();
				String s=ethGetCode.getCode();
				System.out.println("Bytecode length of address " + _address + ": " + s.length());
				if (s.length()>5) {
					return true;
				} else {
					return false;
				}
			} catch (Exception ex) {
				// RPC call exceptions (readonly)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
		}
		return false;
	}

	public static EVMAccountBalance getAccountNativeBalance(EVMBlockChainConnector _connector, String _address) {
		String meth = "getAccountNativeBalance()";
		boolean tx_attempt = false;
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				EthGetBalance ethGetBalance = null;
				
				ethGetBalance = _connector.getProvider_instance().ethGetBalance(_address, DefaultBlockParameterName.PENDING).send();
				if (null == ethGetBalance.getResult()) {
					// chains such as BERACHAIN will not respond to PENDING, needs FINALIZED
					ethGetBalance = _connector.getProvider_instance().ethGetBalance(_address, DefaultBlockParameterName.FINALIZED).send();
				}
				if (null == ethGetBalance.getResult()) {
					LOGGER.warn("Unable to get a proper balance response");
					return null;
				}
				
				BigInteger balanceWEI = ethGetBalance.getBalance();
				BigDecimal balanceETH = Convert.fromWei(ethGetBalance.getBalance().toString(), Unit.ETHER);
				BigDecimal balanceInGWEI = Convert.fromWei(ethGetBalance.getBalance().toString(), Unit.GWEI);
				boolean isEmpty = true;
				if ((null != balanceWEI) && balanceWEI.compareTo(BigInteger.ZERO) > 0) isEmpty = false;
				BigDecimal scaledBalanceInGWEI = balanceInGWEI.setScale(0, RoundingMode.HALF_UP);
				return new EVMAccountBalance(balanceWEI.toString(), scaledBalanceInGWEI.toString(), balanceETH.round(new MathContext(7)).toString(), _connector.getChaininfo().getNativeCurrency(), isEmpty);
			} catch (Exception ex) {
				// RPC call exceptions (readonly)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain, out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static void printWalletBalance(EVMBlockChainConnector connector, EVMLocalWallet localWallet) {
		EVMAccountBalance evmwb = getWalletBalanceNativeCurrency(connector, localWallet);
		if (null != evmwb) {
			System.out.println(" * wallet address " + localWallet.getCredentials().getAddress() + " balance " +  evmwb.getBalanceInETH() + " " + connector.getChaininfo().getNativeCurrency().getSymbol() + " [" + evmwb.getBalanceInWEI() + " wei]");
		}
	}

	public static EVMAccountBalance getAccountBalanceForERC20Token(EVMBlockChainConnector connector, String account_address, String tokenName) {
		EVMERC20TokenInfo tokenInfo = connector.getChaininfo().getTokenIndex().getTokens().get(tokenName);
		return getAccountBalanceForERC20Token(connector, account_address, tokenInfo);
	}

	public static EVMAccountBalance getAccountBalanceForERC20Token(EVMBlockChainConnector _connector, String _account_address, EVMERC20TokenInfo _tokenInfo) {
		String meth = "getAccountBalanceForERC20Token() (chain: " + _connector.getChain().name() + ", token: " + _tokenInfo.getSymbol() + ")";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = false;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				// Readonly ERC20
				TransactionManager transactionManager = new ReadonlyTransactionManager(_connector.getProvider_instance(), _account_address);
				ERC20 customERC20Contract = ERC20.load(_tokenInfo.getContractAddress(), _connector.getProvider_instance(), transactionManager, new DefaultGasProvider());
				BigInteger balanceInWEI = customERC20Contract.balanceOf(_account_address).send();
				BigDecimal balanceInETH = EVMUtils.convertBalanceInWeiToDecimals(balanceInWEI, _tokenInfo.getDecimals());
				BigDecimal balanceInGWEI = EVMUtils.convertBalanceInWeiToGwei(balanceInWEI); 
				boolean isEmpty = true;
				if ((null != balanceInWEI) && balanceInWEI.compareTo(BigInteger.ZERO) > 0) isEmpty = false;
				BigDecimal scaledBalanceInGWEI = balanceInGWEI.setScale(0, RoundingMode.HALF_UP);
				return new EVMAccountBalance(balanceInWEI.toString(), scaledBalanceInGWEI.toString(), balanceInETH.toPlainString(), new EVMCurrency(_tokenInfo.getName(), _tokenInfo.getSymbol(), _tokenInfo.getDecimals()), isEmpty);
			} catch (Exception ex) {
				// RPC call exceptions (readonly)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain, out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static EVMNftAccountBalance getAccountBalanceForERC721Token(EVMBlockChainConnector connector, String account_address, String tokenName) {
		EVMERC721TokenInfo tokenInfo = connector.getChaininfo().getNftindex().getErc721tokens().get(tokenName);
		return getAccountBalanceForERC721Token(connector, account_address, tokenInfo);
	}

	public static EVMNftAccountBalance getAccountBalanceForERC721Token(EVMBlockChainConnector _connector, String _account_address, EVMERC721TokenInfo _tokenInfo) {
		String meth = "getAccountBalanceForERC721Token()";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = false;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				// Readonly ERC721
				TransactionManager transactionManager = new ReadonlyTransactionManager(_connector.getProvider_instance(), _account_address);
				ERC721 customERC721Contract = ERC721.load(_tokenInfo.getContractAddress(), _connector.getProvider_instance(), transactionManager, new DefaultGasProvider());

				BigInteger balance = customERC721Contract.balanceOf(_account_address).send();
				boolean isEmpty = true;
				if ((null != balance) && balance.compareTo(BigInteger.ZERO) > 0) isEmpty = false;
				return new EVMNftAccountBalance(balance.toString(), isEmpty);
			} catch (Exception ex) {
				// RPC call exceptions (readonly)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain, out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
		//return new EVMNftAccountBalance(new BigInteger("0").toString(), true);
	}

	public static String transferERC721Token(EVMBlockChainConnector _connector, Credentials _creds, String _target_address, String _tokenName, Long _tokenID) {
		EVMERC721TokenInfo tokenInfo = _connector.getChaininfo().getNftindex().getErc721tokens().get(_tokenName);
		return transferERC721Token(_connector, _creds, _target_address, tokenInfo, _tokenID, true);
	}

	public static String transferERC721Token(EVMBlockChainConnector _connector, Credentials _creds, String _target_address, String _tokenName, Long _tokenID, boolean _haltOnUnconfirmedTX) {
		EVMERC721TokenInfo tokenInfo = _connector.getChaininfo().getNftindex().getErc721tokens().get(_tokenName);
		return transferERC721Token(_connector, _creds, _target_address, tokenInfo, _tokenID, _haltOnUnconfirmedTX);
	}

	public static String transferERC721Token(EVMBlockChainConnector _connector, Credentials _creds, String _target_address, EVMERC721TokenInfo _tokenInfo, Long _tokenID, boolean _haltOnUnconfirmedTX) {
		String meth = "transferERC721Token()";
		String strGasLimit = null;
		boolean confirmedTransaction = false;
		Boolean timeoutNoted = false;
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = false;
		BigInteger increaseGasPriceInWEI = BigInteger.valueOf(0);

		while (!confirmedTransaction && (nodeCallAttemptCount<10) && (requestCount<15)) {
			requestCount++;
			try {

				/**
				 * stuck/pending transactions
				 */
				NonceCheckStatus nc_state = handleNonceState(_connector, _creds, increaseGasPriceInWEI, nodeCallAttemptCount, timeoutNoted);
				if (nc_state.isEarlyexit()) return "0xearlyexit";

				/**
				 * gasPrice
				 */
				BigInteger gasPrice = determine_gasprice(_connector, increaseGasPriceInWEI, null);

				/**
				 * gasLimit
				 */
				LOGGER.info("------------------------- gasLimit -------------------------");
				DefaultGasProvider gp = new DefaultGasProvider();
				BigInteger gasLimit = gp.getGasLimit();
				LOGGER.info(StringsUtils.cutAndPadStringToN("web3j DefaultGasProvider gasLimit", 39) + ": " + gasLimit + " units");
				if (null != strGasLimit) {
					LOGGER.info(StringsUtils.cutAndPadStringToN("chain gasLimit", 39) + ": " + strGasLimit + " units");
					gasLimit = new BigInteger(strGasLimit);
				}

				/**
				 * actual tx
				 */
				TransactionManager transactionManager = new RawTransactionManager(_connector.getProvider_instance(), _creds, _connector.getChaininfo().getChainId());
				StaticGasProvider gasProvider = new StaticGasProvider(gasPrice, gasLimit);

				// RW ERC721
				BigInteger zero = BigInteger.valueOf(0);
				byte[] data = new byte[0];
				ERC721 customERC721Contract = ERC721.load(_tokenInfo.getContractAddress(), _connector.getProvider_instance(), transactionManager, gasProvider);

				TransactionReceipt transactionReceipt = customERC721Contract.safeTransferFrom(_creds.getAddress(), _target_address, new BigInteger(_tokenID.toString()), data, zero).send();
				String hash = transactionReceipt.getTransactionHash();
				return hash;

			} catch (Exception ex) {
				// RPC tx exceptions (readwrite)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmEAS = actAndGetStateEVMProviderException(evmE, _connector, _haltOnUnconfirmedTX, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmE.isTimeout()) timeoutNoted = true;
				if (evmEAS.isIncreaseGasPrice()) increaseGasPriceInWEI = increaseGasPriceInWEI.add(evmEAS.getSuggestedGasPriceIncreaseInWEI());
				if (evmEAS.isNewEVMBlockChainConnector()) _connector = evmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain, out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	private static NonceCheckStatus handleNonceState(EVMBlockChainConnector _connector, Credentials _creds, BigInteger increaseGasPriceInWEI, int txAttemptCount, boolean timeoutNoted) {
		LOGGER.info("------------------------- stuck/pending tx check -------------------------");
		// Lets first just check that our account doesnt have stuck/pending transactions

		String address = _creds.getAddress();
		PendingTxStatus pendingTX = checkForPendingTransactions(_connector, address);
		if (pendingTX.isPending()) {
			if (timeoutNoted) {
				LOGGER.warn("We have pending (possibly stuck) transaction, but we already submitted a tx and got a timeout .. ");
				LOGGER.warn("I think we are good but lost track of our tx .. the timeout probably needs to be increased for this chain ..");
				return new NonceCheckStatus(pendingTX, true);
			} else if (pendingTX.getNonce_diff() >= 2L) {
				LOGGER.warn("The account  " + _creds.getAddress() + " has a nonce diff of " + pendingTX.getNonce_diff());
				LOGGER.warn("We might have to try to reset this account. timeoutNoted=" + timeoutNoted + " txAttemptCount=" + txAttemptCount);
				if (txAttemptCount>1) {
					System.out.println("transactionAttemptCount is " + txAttemptCount + " so lets do it...");

					String txhash_reset = EVMUtils.resetPendingTransactionsForAccount(_connector, _creds);
					if (null == txhash_reset) {
						LOGGER.error(" - Giving up on reset account transaction..");
						SystemUtils.halt();
					} else {
						LOGGER.info(" - Reset account TX completed with hash: " + txhash_reset);
						LOGGER.error("OK now we should be able to proceed with the actual tx");
						SystemUtils.sleepInSeconds(3);
					}
				} else {
					System.out.println("transactionAttemptCount is " + txAttemptCount + ", is this account running txs in paralell? Lets do an early exit ..");
					return new NonceCheckStatus(pendingTX, true);
				}
			} else {
				LOGGER.error("We have pending (possibly stuck) transaction, need clear that up before proceeding.");

				LOGGER.info("First lets just try to wait it in");
				boolean pendingResolved = brieflyWaitForPendingTransactionsToClear(_connector, address);
				if (pendingResolved) {
					LOGGER.info("Nice, we solved a problem by only waiting .. winning .. waiting just a few more to make sure all nodes are synced");
					SystemUtils.sleepInSeconds(20);
				} else {
					LOGGER.warn("The account " + _creds.getAddress() + " might be stuck in pending state due to this one ..");
					System.out.println("do a nonce reset automatically? ... send 0 value from/to my address?");

					if (txAttemptCount>1) {
						System.out.println("transactionAttemptCount is " + txAttemptCount + " so lets do it...");

						String txhash_reset = EVMUtils.resetPendingTransactionsForAccount(_connector, _creds);
						if (null == txhash_reset) {
							LOGGER.error(" - Giving up on reset account transaction..");
							SystemUtils.halt();
						} else {
							LOGGER.info(" - Reset account TX completed with hash: " + txhash_reset);
							LOGGER.error("OK now we should be able to proceed with the actual tx");
							SystemUtils.sleepInSeconds(3);
						}
					} else {
						LOGGER.info("give up .. txAttempCount is " + txAttemptCount);
						return new NonceCheckStatus(pendingTX, true);
					}
				}
			}
		}
		return new NonceCheckStatus(pendingTX, false);
	}

	public static Boolean isOwnerOfERC721Token(EVMBlockChainConnector _connector, String _address, String _tokenName, Long _tokenID) {
		EVMERC721TokenInfo tokenInfo = _connector.getChaininfo().getNftindex().getErc721tokens().get(_tokenName);
		return isOwnerOfERC721Token(_connector, _address, tokenInfo, _tokenID);
	}

	public static Boolean isOwnerOfERC721Token(EVMBlockChainConnector _connector, String _address, EVMERC721TokenInfo _tokenInfo, Long _tokenID) {
		String meth = "isOwnerOfERC721Token()";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = false;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {

				// Readonly ERC721
				TransactionManager transactionManager = new ReadonlyTransactionManager(_connector.getProvider_instance(), _address);
				ERC721 customERC721Contract = ERC721.load(_tokenInfo.getContractAddress(), _connector.getProvider_instance(), transactionManager, new DefaultGasProvider());

				BigInteger balance = customERC721Contract.balanceOf(_address).send();
				if (balance.longValue() > 0L) {
					System.out.println(_address + " does own some of these NFTs, lets check if the tokenID matches ..");

					String owner = customERC721Contract.ownerOf(new BigInteger(_tokenID.toString())).send();
					if (owner.toLowerCase().equals(_address.toLowerCase())) {
						return true;
					} else {
						return false;
					}

				} else {
					// No need to check for specific tokenID match, the address does not own any
					return false;
				}

			} catch (Exception ex) {
				// RPC call exceptions (readonly)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain, out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static void printWalletBalanceForERC20Token(EVMBlockChainConnector _connector, String _address, EVMERC20TokenInfo _tokenInfo) {
		EVMAccountBalance bal = getAccountBalanceForERC20Token(_connector, _address, _tokenInfo);
		if (null != bal) {
			System.out.println(" * account address " + _address + " balance " +  bal.getBalanceInETH() + " " + _tokenInfo.getSymbol() + " [" + bal.getBalanceInWEI() + " wei]");
		}
	}

	public static BigDecimal convertBalanceInWeiToDecimals(BigInteger _balance, Integer _decimals) { 
		try {
			BigDecimal ethBalanceDEC = Convert.fromWei(_balance.toString(), Unit.WEI);
			long po = (long) Math.pow(10L, _decimals);
			ethBalanceDEC = ethBalanceDEC.divide(new BigDecimal(po), 2, RoundingMode.HALF_UP);
			return ethBalanceDEC;
		} catch (Exception ex) {
			LOGGER.warn("convertBalanceInWeiToDecimals() ex: " + ex.getMessage());
		}
		return null;
	}

	public static BigDecimal convertBalanceInWeiToEth(BigInteger _balance) { 
		try {
			BigDecimal ethBalanceFULL = Convert.fromWei(_balance.toString(), Unit.ETHER);
			return ethBalanceFULL;
		} catch (Exception ex) {
			LOGGER.warn("convertBalanceInWeiToEth() ex: " + ex.getMessage());
		}
		return null;
	}

	public static BigDecimal convertBalanceInWeiToGwei(BigInteger _balance) { 
		try {
			BigDecimal ethBalanceGWEI = Convert.fromWei(_balance.toString(), Unit.GWEI);
			return ethBalanceGWEI;
		} catch (Exception ex) {
			LOGGER.warn("convertBalanceInWeiToEth() ex: " + ex.getMessage());
		}
		return null;
	}

	public static BigInteger convertBalanceInGweiToWei(BigInteger _valueInGWEI) { 
		try {
			BigInteger ethValueInWEI = _valueInGWEI.multiply(new BigInteger("1000000000"));
			return ethValueInWEI;
		} catch (Exception ex) {
			LOGGER.warn("convertBalanceInWeiToEth() ex: " + ex.getMessage());
		}
		return null;
	}

	public static BigInteger getLatestBlockNumber(EVMBlockChainConnector _connector) {
		String meth = "getLatestBlockNumber()";
		if (null == _connector) return null;
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = false;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				EthBlockNumber result = _connector.getProvider_instance().ethBlockNumber().sendAsync().get(); 
				return result.getBlockNumber();
			} catch (Exception ex) {
				// RPC call exceptions (readonly)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain, out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static BigInteger getLatestBlockNumberOpportunistic(EVMBlockChainConnector _connector) {
		String meth = "getLatestBlockNumberOpportunistic()";
		if (null == _connector) return null;
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = false;
		while ((nodeCallAttemptCount<3) && (requestCount<5)) {
			requestCount++;
			try {
				EthBlockNumber result = _connector.getProvider_instance().ethBlockNumber().sendAsync().get(); 
				return result.getBlockNumber();
			} catch (Exception ex) {
				// RPC call exceptions (readonly)
				System.out.println("exception .. nodeCallAttemptCount=" + nodeCallAttemptCount + " requestCount=" + requestCount);
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
		}
		return null;
	}

	public static BigInteger getTransactionCountForAddress(EVMBlockChainConnector _connector, String _account_address) {
		String meth = "getTransactionCountForAddress()";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = false;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				EthGetTransactionCount result = new EthGetTransactionCount();
				result = _connector.getProvider_instance().ethGetTransactionCount(
						_account_address, 
						DefaultBlockParameter.valueOf("latest"))
						.sendAsync() 
						.get();
				return result.getTransactionCount();
			} catch (Exception ex) {
				// RPC call exceptions (readonly)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain, out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static BigInteger getChainId(EVMBlockChainConnector _connector) {
		String meth = "getChainId()";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = false;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				EthChainId chainId = _connector.getProvider_instance().ethChainId().send();
				return chainId.getChainId();
			} catch (Exception ex) {
				// RPC call exceptions (readonly)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain, out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static void printLatestBlockNumber(EVMBlockChainConnector _connector) {
		LOGGER.info(_connector.getChaininfo().getShortName() + " (chainid: " + _connector.getChaininfo().getChainId() + ") latest block number: " + getLatestBlockNumber(_connector));
	}

	public static void printCurrentStandardGasPriceInGWEI(EVMBlockChainConnector _connector) {
		LOGGER.info(_connector.getChaininfo().getShortName() + " (chainid: " + _connector.getChaininfo().getChainId() + ") current STANDARD gas price : " + getCurrentNetworkGasPriceInGWEI(_connector) + " GWEI");
	}

	public static BigDecimal getCurrentNetworkGasPriceInGWEI(EVMBlockChainConnector _connector) {
		String meth = "getCurrentNetworkGasPriceInGWEI()";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = false;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				EthGasPrice gasPrice = _connector.getProvider_instance().ethGasPrice().send();
				BigDecimal gaspriceInGWEI = Convert.fromWei(gasPrice.getGasPrice().toString(), Unit.GWEI);
				return gaspriceInGWEI;
			} catch (Exception ex) {
				// RPC call exceptions (readonly)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain, out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static BigInteger getCurrentNetworkGasPriceInWEI(EVMBlockChainConnector _connector) {
		String meth = "getCurrentNetworkGasPriceInWEI()";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = false;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				EthGasPrice gasPrice = _connector.getProvider_instance().ethGasPrice().send();
				return gasPrice.getGasPrice();
			} catch (Exception ex) {
				// RPC call exceptions (readonly)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain, out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static String sendSignedRawTX(EVMBlockChainConnector _connector, Credentials _creds, String _contractAddress, String _rawData, int _initialConfirmTimeInSeconds, String _strGasLimit, boolean _haltOnUnconfirmedTX) {
		String meth = "sendSignedRawTX()";
		String hash = null;
		boolean bumpNoonce = false; // to force a new transaction

		boolean tx_attempt = true;
		boolean confirmedTransaction = false;
		boolean timeoutNoted = false;
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		BigInteger increaseGasPriceInWEI = BigInteger.valueOf(0);

		while (!confirmedTransaction && (nodeCallAttemptCount<10) && (requestCount<15)) {
			requestCount++;
			try {

				/**
				 * stuck/pending transactions
				 */
				NonceCheckStatus nc_state = handleNonceState(_connector, _creds, increaseGasPriceInWEI, nodeCallAttemptCount, timeoutNoted);
				if (nc_state.isEarlyexit()) return "0xearlyexit";

				/**
				 * nonce
				 */
				EthGetTransactionCount ethGetTransactionCount = _connector.getProvider_instance().ethGetTransactionCount(_creds.getAddress(), DefaultBlockParameterName.PENDING).send();
				BigInteger nonce =  ethGetTransactionCount.getTransactionCount();
				if (bumpNoonce) nonce = nonce.add(new BigInteger("1"));

				/**
				 * gasPrice
				 */
				BigInteger gasPrice = determine_gasprice(_connector, increaseGasPriceInWEI, null);

				/**
				 * gasLimit
				 */
				LOGGER.info("------------------------- gasLimit -------------------------");
				DefaultGasProvider gp = new DefaultGasProvider();
				BigInteger gasLimit = gp.getGasLimit();
				LOGGER.info(StringsUtils.cutAndPadStringToN("web3j DefaultGasProvider gasLimit", 39) + ": " + gasLimit + " units");
				if (null != _strGasLimit) {
					LOGGER.info(StringsUtils.cutAndPadStringToN("chain gasLimit", 39) + ": " + _strGasLimit + " units");
					gasLimit = new BigInteger(_strGasLimit);
				}

				LOGGER.info("------------------------------------------------------------");
				LOGGER.info("sendSignedRawTX(): Proceeding with tx using gasPrice: " + Convert.fromWei(gasPrice.toString(), Unit.GWEI).setScale(0, RoundingMode.HALF_UP) + " gwei, gasLimit: " + gasLimit + " units, nodeCallAttemptCount=" + nodeCallAttemptCount); 

				RawTransaction rawTransaction = RawTransaction.createTransaction(nonce, gasPrice, gasLimit, _contractAddress, _rawData);
				byte[] signedMessage = TransactionEncoder.signMessage(rawTransaction, Long.parseLong(_connector.getChaininfo().getChainId() + ""), _creds);
				String hexSignedMessage = Numeric.toHexString(signedMessage);

				EthSendTransaction response = _connector.getProvider_instance().ethSendRawTransaction(hexSignedMessage).send();
				hash = response.getTransactionHash();
				if (null == hash) {

					// DEBUG (STILL IN DEV)
					//-----------------------------------------------------------------------------
					LOGGER.error("response ERROR data: " + response.getError().getData());
					LOGGER.error("response ERROR message: " + response.getError().getMessage());
					LOGGER.error("response ERROR code: " + response.getError().getCode());
					LOGGER.error("response ID: " + response.getId());
					LOGGER.error("response rawresponse: " + response.getRawResponse());

					EVMTransactionExceptionEvent txE = handleTransactionException(_connector.getChain(), _connector.getCurrent_nodeURL(), response.getError().getMessage(), response.getError().getData(), tx_attempt);
					System.out.println("txE.getExceptionType(): " + txE.getExceptionType());
					System.out.println("txE.getSleepTimeInSecondsRecommended(): " + txE.getSleepTimeInSecondsRecommended());
					System.out.println("txE.isNodeInteraction(): " + txE.isNodeInteraction());
					System.out.println("txE.isDoubleGasPrice(): " + txE.isDoubleGasPrice());
					System.out.println("txE.isDoubleGasLimit(): " + txE.isDoubleGasLimit());
					System.out.println("txE.isSleepBeforeRetry(): " + txE.isSleepBeforeRetry());
					System.out.println("txE.isSwitchNode(): " + txE.isSwitchNode());
					System.out.println("txE.getExceptionType(): " + txE.getExceptionType());
					System.out.println("exception message: " + response.getError().getMessage());

					if (txE.isNodeInteraction()) nodeCallAttemptCount++; 
					if (txE.isSleepBeforeRetry()) SystemUtils.sleepInSeconds(txE.getSleepTimeInSecondsRecommended());
					if (txE.getExceptionType() == ExceptionType.FATAL) SystemUtils.halt();
					if (txE.isSwitchNode()) _connector.selectRandomNodeURL(_connector.getCurrent_nodeURL());
					if (txE.isDoubleGasPrice()) {
						//https://docs.klaytn.foundation/klaytn/design/transaction-fees, will result in 'invalid unit price' on KLAYTN
						if (_connector.getChain() != EVMChain.KLAYTN) {
							increaseGasPriceInWEI = increaseGasPriceInWEI.multiply(BigInteger.valueOf(2)); // x2
						}
					}
					if ( true && 
							((txE.getExceptionType() != ExceptionType.NODE_RECOVERABLE) || (txE.getExceptionType() != ExceptionType.NODE_UNSTABLE)) && 
							_haltOnUnconfirmedTX &&
							true) {
						LOGGER.info(meth + " haltOnUnconfirmedTX is set to true, and we have an unrecoverable exception");
						SystemUtils.halt();
					}
					//-----------------------------------------------------------------------------

					if (false ||
							(txE.getExceptionType() == ExceptionType.TX_MIGHT_BE_PENDING) ||
							(txE.getExceptionType() == ExceptionType.TX_RESENT) ||
							false) {
						LOGGER.info("We have an unconfirmed transaction state and no tx hash");
						if (_haltOnUnconfirmedTX) {
							LOGGER.info("haltOnUnconfirmedTX is true so will halt");
							SystemUtils.halt();
						} else {
							LOGGER.info("Instructed to move on .. dont like it but will");
							return null;
						}
					} else {
						SystemUtils.halt();
					}

				} else {

					LOGGER.info("txhash: " + hash);
					LOGGER.info("response ID: " + response.getId());
					LOGGER.info("response error: " + response.getError());
					if (null != response.getError()) {
						LOGGER.info("response error.code: " + response.getError().getCode());
						LOGGER.info("response error.data: " + response.getError().getData());		
						LOGGER.info("response error.message: " + response.getError().getMessage());
					}
					LOGGER.info("response reseult: " + response.getResult());
				}

				// At least give it a few seconds
				LOGGER.info("Giving transaction an initial " + _initialConfirmTimeInSeconds + " seconds to get a confirmation ..");
				SystemUtils.sleepInSeconds(_initialConfirmTimeInSeconds);

				// Wait for a successful transaction
				if (null != response.getTransactionHash()) {
					LOGGER.info("tx submitted with hash " + response.getTransactionHash());

					int receiptPollCounter = 0;
					while (!confirmedTransaction && receiptPollCounter<100) {
						EthGetTransactionReceipt ethGetTransactionReceipt = _connector.getProvider_instance().ethGetTransactionReceipt(response.getTransactionHash()).send();
						LOGGER.info("ethGetTransactionReceipt: " + ethGetTransactionReceipt.getTransactionReceipt().isPresent() + " for txhash " + response.getTransactionHash());
						SystemUtils.sleepInSeconds(10);
						if (ethGetTransactionReceipt.getTransactionReceipt().isPresent()) confirmedTransaction = true;

						if (null != ethGetTransactionReceipt.getError()) {
							LOGGER.warn("error code: " + ethGetTransactionReceipt.getError().getCode());
							LOGGER.warn("error message: " + ethGetTransactionReceipt.getError().getMessage());
						}

						receiptPollCounter++;

						if (receiptPollCounter>20) {
							LOGGER.warn("nodeCallAttemptCount: " + nodeCallAttemptCount + ", unable to grab tx receipt for " + response.getTransactionHash());
							LOGGER.info("lets make sure we increase the gas price for the next attempt");
							increaseGasPriceInWEI = increaseGasPriceInWEI.add(BigInteger.valueOf(2000000000)); // bump by 2 gwei
						}
					}
				}

			} catch (Exception ex) {
				// RPC tx exceptions (readwrite)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmEAS = actAndGetStateEVMProviderException(evmE, _connector, _haltOnUnconfirmedTX, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmE.isTimeout()) timeoutNoted = true;
				if (evmEAS.isIncreaseGasPrice()) increaseGasPriceInWEI = increaseGasPriceInWEI.add(evmEAS.getSuggestedGasPriceIncreaseInWEI());
				if (evmEAS.isNewEVMBlockChainConnector()) _connector = evmEAS.getConnector();
			}
		}

		if (confirmedTransaction) {
			return hash;
		} else {
			if (_haltOnUnconfirmedTX) {
				LOGGER.info("haltOnUnconfirmedTX is set to true, and we are out of retry attempts");
				SystemUtils.halt();
			}
			return null;
		}

	}


	public static String sendUnsignedRawCALL(String _rawData, String _contractAddress, EVMBlockChainConnector _connector, boolean _haltOnFailedCall) {
		String meth = "sendUnsignedRawCALL()";
		String hash = null;
		boolean confirmedCall = false;
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = false;
		while (!confirmedCall && (nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				TransactionManager transactionManager = new ReadonlyTransactionManager(_connector.getProvider_instance(), _contractAddress); // why need fromAddress when RO?
				org.web3j.protocol.core.methods.response.EthCall ethCall = _connector.getProvider_instance().ethCall(
						Transaction.createEthCallTransaction(
								transactionManager.getFromAddress(), _contractAddress, _rawData),
						DefaultBlockParameter.valueOf("latest"))
						.send();
				String value = ethCall.getValue();
				if (null == value) {
					LOGGER.warn("Response from unsigned call failed (null response)");
				}
				return value;
			} catch (Exception ex) {
				LOGGER.info("ex: " + ex.getMessage());
				// RPC call exceptions (readonly)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
		}

		if (confirmedCall) {
			return hash;
		} else {
			if (_haltOnFailedCall) {
				LOGGER.info("haltOnUnconfirmedTX is set to true, and we are out of retry attempts");
				SystemUtils.halt();
			}
			return null;
		}

	}

	public static Boolean isContract(String _contractAddress, EVMBlockChainConnector _connector) {
		String meth = "isContract()";
		boolean confirmedCall = false;
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = false;
		while (!confirmedCall && (nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				EthGetCode ethCall = _connector.getProvider_instance().ethGetCode(_contractAddress, DefaultBlockParameter.valueOf("latest")).send();
				String code = ethCall.getCode();
				if ("0x".equals(code)) {
					return false;
				} else {
					return true;
				}
			} catch (Exception ex) {
				// RPC call exceptions (readonly)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
		}
		return null;
	}

	public static String sendTXWithNativeCurrency(EVMBlockChainConnector _connector, Credentials _from_wallet_credentials, String _target_address, String _strGasLimit, EVMNativeValue _evmNativeValue, boolean _haltOnUnconfirmedTX) {
		String meth = "sendTXWithNativeCurrency()";
		if (EVMPriceMechanism.valueOf(_connector.getChaininfo().getPriceMechanism()) == EVMPriceMechanism.EIP1559) {
			return sendTXWithNativeCurrency_EIP1559PricingMechanism(_connector, _from_wallet_credentials, _target_address, _evmNativeValue, _haltOnUnconfirmedTX);
		} else if (EVMPriceMechanism.valueOf(_connector.getChaininfo().getPriceMechanism()) == EVMPriceMechanism.LEGACY) {
			return sendTXWithNativeCurrency_LegacyPricingMechanism(_connector, _from_wallet_credentials, _target_address, _evmNativeValue, _haltOnUnconfirmedTX);
		} else {
			LOGGER.error("Unable to comply with price mechanism named: " + _connector.getChaininfo().getPriceMechanism());
			SystemUtils.halt();
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain, out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	private static String sendTXWithNativeCurrency_LegacyPricingMechanism(EVMBlockChainConnector _connector, Credentials _from_wallet_credentials, String _target_address, EVMNativeValue _evmNativeValue, boolean _haltOnUnconfirmedTX) {
		return sendTXWithNativeCurrency_LegacyPricingMechanism_WithCustomNonce(_connector, _from_wallet_credentials, _target_address, _evmNativeValue, _haltOnUnconfirmedTX, null, false);
	}

	private static String sendTXWithNativeCurrency_LegacyPricingMechanism_WithCustomNonce(EVMBlockChainConnector _connector, Credentials _creds, String _target_address, EVMNativeValue _evmNativeValue, boolean _haltOnUnconfirmedTX, BigInteger _customNonce, boolean _forceIncreaseGas) {
		String meth = "sendTXWithNativeCurrency_LegacyPricingMechanism_CustomNonce()";
		String hash = null;
		Boolean timeoutNoted = false;

		boolean tx_attempt = true;
		boolean confirmedTransaction = false;
		int nodeCallAttemptCount = 0;
		BigInteger increaseGasPriceInWEI = BigInteger.valueOf(0);
		if (_forceIncreaseGas) {
			increaseGasPriceInWEI = increaseGasPriceInWEI.add(BigInteger.valueOf(9000000000L)); // bump by 9 gwei
		}
		int requestCount = 0;

		while (!confirmedTransaction && (nodeCallAttemptCount<10) && (requestCount<15)) {
			requestCount++;

			/**
			 * customNonce
			 */
			if (null == _customNonce) {

				/**
				 * stuck/pending transactions
				 */
				NonceCheckStatus nc_state = handleNonceState(_connector, _creds, increaseGasPriceInWEI, nodeCallAttemptCount, timeoutNoted);
				if (nc_state.isEarlyexit()) return "0xearlyexit";

			}

			// enforce the latest nonce?
			/*
				EthGetTransactionCount ethGetTransactionCount_latest = null;
				try {
					ethGetTransactionCount_latest = _connector.getProvider_instance().ethGetTransactionCount(_creds.getAddress(), DefaultBlockParameterName.LATEST).send();
				} catch (IOException e1) {
					SystemUtils.halt();
				}
				_customNonce =  ethGetTransactionCount_latest.getTransactionCount();
			 */

			try {

				/**
				 * gasPrice
				 */
				BigInteger gasPrice = determine_gasprice(_connector, increaseGasPriceInWEI, _customNonce);

				/**
				 * gasLimit
				 */
				LOGGER.info("------------------------- gasLimit -------------------------");
				DefaultGasProvider gp = new DefaultGasProvider();
				BigInteger gasLimit = gp.getGasLimit();
				LOGGER.info(StringsUtils.cutAndPadStringToN("web3j DefaultGasProvider gasLimit", 39) + ": " + gasLimit + " units");
				if (null != _connector.getChaininfo().getFallbackGasLimitInUnits()) {
					LOGGER.info(StringsUtils.cutAndPadStringToN("Specified gasLimit", 39) + ": " + _connector.getChaininfo().getFallbackGasLimitInUnits() + " units");
					gasLimit = new BigInteger(_connector.getChaininfo().getFallbackGasLimitInUnits());
				}

				LOGGER.info("------------------------------------------------------------");
				LOGGER.info("sendTXWithNativeCurrency_LegacyPricingMechanism(): Proceeding with tx using gasPrice: " + Convert.fromWei(gasPrice.toString(), Unit.GWEI).setScale(0, RoundingMode.HALF_UP) + " gwei (" + gasPrice.toString() + " wei), gasLimit: " + gasLimit + " units, nodeCallAttemptCount=" + nodeCallAttemptCount); 
				LOGGER.info("TX value: " + _evmNativeValue.getVal().setScale(6, RoundingMode.HALF_UP) + " " + _connector.getChaininfo().getNativeCurrency().getSymbol());

				try {

					if (null != _customNonce) {
						LOGGER.info("We have a custom nonce .. creating raw transaction with nonce " + _customNonce);

						RawTransaction rawTransaction  = RawTransaction.createEtherTransaction(
								_customNonce, gasPrice, gasLimit, _target_address, new BigInteger("0"));

						byte[] signedMessage = TransactionEncoder.signMessage(rawTransaction, Long.parseLong(_connector.getChaininfo().getChainId() + ""), _creds);
						String hexSignedMessage = Numeric.toHexString(signedMessage);

						EthSendTransaction response = _connector.getProvider_instance().ethSendRawTransaction(hexSignedMessage).send();
						hash = response.getTransactionHash();
						if (null == hash) {

							// DEBUG (STILL IN DEV)
							//-----------------------------------------------------------------------------
							LOGGER.error("response ERROR data: " + response.getError().getData());
							LOGGER.error("response ERROR message: " + response.getError().getMessage());
							LOGGER.error("response ERROR code: " + response.getError().getCode());
							LOGGER.error("response ID: " + response.getId());
							LOGGER.error("response rawresponse: " + response.getRawResponse());

							EVMTransactionExceptionEvent txE = handleTransactionException(_connector.getChain(), _connector.getCurrent_nodeURL(), response.getError().getMessage(), response.getError().getData(), tx_attempt);
							System.out.println("txE.getExceptionType(): " + txE.getExceptionType());
							System.out.println("txE.getSleepTimeInSecondsRecommended(): " + txE.getSleepTimeInSecondsRecommended());
							System.out.println("txE.isNodeInteraction(): " + txE.isNodeInteraction());
							System.out.println("txE.isDoubleGasPrice(): " + txE.isDoubleGasPrice());
							System.out.println("txE.isDoubleGasLimit(): " + txE.isDoubleGasLimit());
							System.out.println("txE.isSleepBeforeRetry(): " + txE.isSleepBeforeRetry());
							System.out.println("txE.isSwitchNode(): " + txE.isSwitchNode());
							System.out.println("txE.getExceptionType(): " + txE.getExceptionType());
							System.out.println("exception message: " + response.getError().getMessage());

							if (txE.isNodeInteraction()) nodeCallAttemptCount++; 
							if (txE.isSleepBeforeRetry()) SystemUtils.sleepInSeconds(txE.getSleepTimeInSecondsRecommended());
							if (txE.getExceptionType() == ExceptionType.FATAL) SystemUtils.halt();
							if (txE.isSwitchNode()) _connector.selectRandomNodeURL(_connector.getCurrent_nodeURL());
							if (txE.isDoubleGasPrice()) {
								//https://docs.klaytn.foundation/klaytn/design/transaction-fees, will result in 'invalid unit price' on KLAYTN
								if (_connector.getChain() != EVMChain.KLAYTN) {
									increaseGasPriceInWEI = increaseGasPriceInWEI.multiply(BigInteger.valueOf(2)); // x2
								}
							}
							if ( true && 
									((txE.getExceptionType() != ExceptionType.NODE_RECOVERABLE) || (txE.getExceptionType() != ExceptionType.NODE_UNSTABLE)) && 
									_haltOnUnconfirmedTX &&
									true) {
								LOGGER.info(meth + " haltOnUnconfirmedTX is set to true, and we have an unrecoverable exception");
								SystemUtils.halt();
							}
							//-----------------------------------------------------------------------------

							if (false ||
									(txE.getExceptionType() == ExceptionType.TX_MIGHT_BE_PENDING) ||
									(txE.getExceptionType() == ExceptionType.TX_RESENT) ||
									false) {
								LOGGER.info("Instructed to move on");
								if (_haltOnUnconfirmedTX) {
									LOGGER.info("But haltOnUnconfirmedTX is true so will halt");
									SystemUtils.halt();
								} else {
									LOGGER.info("Instructed to move on .. dont like it but will");
									return null;
								}
							} else {
								SystemUtils.halt();
							}

						} else {
							LOGGER.info("txhash: " + hash);
							LOGGER.info("response ID: " + response.getId());
						}

						// At least give it a few seconds
						LOGGER.info("Giving transaction an initial " + _connector.getChaininfo().getConfirmationTimeinSeconds() + " seconds to get a confirmation ..");
						SystemUtils.sleepInSeconds(_connector.getChaininfo().getConfirmationTimeinSeconds());

						// Wait for a successful transaction
						if (null != response.getTransactionHash()) {
							LOGGER.info("lets go with " + response.getTransactionHash());

							int receiptPollCounter = 0;
							while (!confirmedTransaction && receiptPollCounter<100) {
								EthGetTransactionReceipt ethGetTransactionReceipt = _connector.getProvider_instance().ethGetTransactionReceipt(response.getTransactionHash()).send();
								LOGGER.info("ethGetTransactionReceipt: " + ethGetTransactionReceipt.getTransactionReceipt().isPresent() + " for txhash " + response.getTransactionHash());
								SystemUtils.sleepInSeconds(10);
								if (ethGetTransactionReceipt.getTransactionReceipt().isPresent()) confirmedTransaction = true;
								receiptPollCounter++;

								if (receiptPollCounter>20) {
									LOGGER.warn("Unable to grab tx receipt for " + response.getTransactionHash());
								}
							}
						}


					} else {
						// default 40*15=600 secs
						int attempts = 40; // 40 default (DEFAULT_POLLING_ATTEMPTS_PER_TX_HASH, TransactionManager)
						long sleepDuration = 15000L; // 15 default (DEFAULT_BLOCK_TIME, TransactionManager/JsonRpc2_0Web3j)

						// timeout seems to be 600 seconds, not configurable
						TransactionManager transactionManager = new RawTransactionManager(_connector.getProvider_instance(), _creds, _connector.getChaininfo().getChainId(), attempts, sleepDuration);
						TransactionReceipt transactionReceipt = new Transfer(_connector.getProvider_instance(), transactionManager).sendFunds(
								_target_address, 
								_evmNativeValue.getVal(),
								_evmNativeValue.getUnit(),
								gasPrice, 
								gasLimit
								).send();

						hash = transactionReceipt.getTransactionHash();
						LOGGER.info("Transaction complete with txhash: " + hash + " at blocknr " + transactionReceipt.getBlockNumber() + " spent gas: " + transactionReceipt.getGasUsed().toString() + " units");
						confirmedTransaction = true;
					}

				} catch (TransactionException te) {
					System.out.println("TransactionException hash: " + te.getTransactionHash().get()); // for tx finalized this Optional wasnt reflected on blockchain? 
					System.out.println("TransactionException message: " + te.getMessage());

					// Reset the account
					LOGGER.warn("Do we now start polling for status of tx " +  te.getTransactionHash().get() + "??");
					LOGGER.warn("The account " + _creds.getAddress() + " might be stuck in pending state due to this one. We checked prior to submitting this tx though.");
					System.out.println("nodeCallAttemptCount=" + nodeCallAttemptCount);

					if (nodeCallAttemptCount>1) {
						System.out.println("nodeCallAttemptCount is " + nodeCallAttemptCount + ", nonce reset on the account ...");

						String txhash_reset = EVMUtils.resetPendingTransactionsForAccount(_connector, _creds);
						if (null == txhash_reset) {
							LOGGER.info(" - Giving up on reset account transaction");
						} else {
							LOGGER.info(" - Reset account TX completed with hash: " + txhash_reset);
							SystemUtils.sleepInSeconds(3);
						}
					} else {

						LOGGER.info("nah lets not nonce reset .. nodeCallAttemptCount is " + nodeCallAttemptCount);

						// Wait for a successful transaction
						if (null !=  te.getTransactionHash().get()) {
							LOGGER.info("Lets do 100x poll for status of " + te.getTransactionHash().get() + " for chain " + _connector.getChain() + " ..");

							int receiptPollCounter = 0;
							while (!confirmedTransaction && receiptPollCounter<100) {
								EthGetTransactionReceipt ethGetTransactionReceipt = _connector.getProvider_instance().ethGetTransactionReceipt(te.getTransactionHash().get()).send();
								LOGGER.info("ethGetTransactionReceipt: " + ethGetTransactionReceipt.getTransactionReceipt().isPresent() + " for txhash " + te.getTransactionHash().get());
								SystemUtils.sleepInSeconds(10);
								if (ethGetTransactionReceipt.getTransactionReceipt().isPresent()) confirmedTransaction = true;
								receiptPollCounter++;

								if (receiptPollCounter>20) {
									LOGGER.warn("Unable to grab tx receipt for " + te.getTransactionHash().get());
								}
							}

							if (!confirmedTransaction && _haltOnUnconfirmedTX) {
								LOGGER.error("We cant just continue with the tx here, instructed to halt on unconfirmed tx.");
								SystemUtils.halt();
							} else {
								return null;
							}
						} else {
							if (_haltOnUnconfirmedTX) {
								LOGGER.error("We dont even have a txhash to poll status from, instructed to halt on unconfirmed tx. ABORT!");
								SystemUtils.halt();
							} else {
								return null;
							}
						}
					}

					// DEBUG
					try {
						TransactionReceipt transactionReceiptEX = te.getTransactionReceipt().get();
						System.out.println("transactionReceiptEX isStatusOK: " + transactionReceiptEX.isStatusOK());
						if (transactionReceiptEX.isStatusOK()) {
							LOGGER.info("We good now at blocknr " + transactionReceiptEX.getBlockNumber() + "??");
							SystemUtils.halt();
						} else {
							LOGGER.error("content: " + transactionReceiptEX.toString());
							SystemUtils.halt();
						}
					} catch (Exception e) {
						// Unable to get the transaction receipt
						EVMTransactionExceptionEvent txE = handleTransactionException(_connector.getChain(), _connector.getCurrent_nodeURL(), te.getMessage(), "missing", tx_attempt);
						System.out.println("txE.getExceptionType(): " + txE.getExceptionType());
						System.out.println("txE.getSleepTimeInSecondsRecommended(): " + txE.getSleepTimeInSecondsRecommended());
						System.out.println("txE.isNodeInteraction(): " + txE.isNodeInteraction());
						System.out.println("txE.isDoubleGasPrice(): " + txE.isDoubleGasPrice());
						System.out.println("txE.isDoubleGasLimit(): " + txE.isDoubleGasLimit());
						System.out.println("txE.isSleepBeforeRetry(): " + txE.isSleepBeforeRetry());
						System.out.println("txE.isSwitchNode(): " + txE.isSwitchNode());
						System.out.println("txE.getExceptionType(): " + txE.getExceptionType());
						System.out.println("exception message: " + e.getMessage());

						if (false ||
								(txE.getExceptionType() == ExceptionType.TX_MIGHT_BE_PENDING) ||
								(txE.getExceptionType() == ExceptionType.TX_RESENT) ||
								false) {
							LOGGER.info("We have an unconfirmed transaction state and no tx hash");
							if (_haltOnUnconfirmedTX) {
								LOGGER.info("haltOnUnconfirmedTX is true so will halt");
								SystemUtils.halt();
							} else {
								LOGGER.info("Instructed to move on .. dont like it but will");
								return null;
							}
						} else {
							SystemUtils.halt();
						}
					}

				} catch (Exception ex) {
					// RPC tx exceptions (readwrite)
					EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
					if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
					EVMProviderExceptionActionState evmEAS = actAndGetStateEVMProviderException(evmE, _connector, _haltOnUnconfirmedTX, nodeCallAttemptCount);
					if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
					if (evmE.isTimeout()) timeoutNoted = true;
					if (evmEAS.isIncreaseGasPrice()) increaseGasPriceInWEI = increaseGasPriceInWEI.add(evmEAS.getSuggestedGasPriceIncreaseInWEI());
					if (evmEAS.isNewEVMBlockChainConnector()) _connector = evmEAS.getConnector();
				}
			} catch (Exception ex) {
				// RPC tx exceptions (readwrite)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmEAS = actAndGetStateEVMProviderException(evmE, _connector, _haltOnUnconfirmedTX, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmE.isTimeout()) timeoutNoted = true;
				if (evmEAS.isIncreaseGasPrice()) increaseGasPriceInWEI = increaseGasPriceInWEI.add(evmEAS.getSuggestedGasPriceIncreaseInWEI());
				if (evmEAS.isNewEVMBlockChainConnector()) _connector = evmEAS.getConnector();
			}
		}


		if (confirmedTransaction) {
			return hash;
		} else {
			return null;
		}

	}

	public static BigInteger determine_gasprice(EVMBlockChainConnector _connector, BigInteger _increaseGasPriceInWEI, BigInteger _customNonce) {
		return determine_gaspriceInWEI(_connector, _increaseGasPriceInWEI, _customNonce, true);
	}

	public static BigInteger determine_gaspriceInWEI(EVMBlockChainConnector _connector, BigInteger _increaseGasPriceInWEI, BigInteger _customNonce, boolean withLogOutput) {

		BigInteger gasPriceInWEI = new BigInteger("1000000000"); // start with 1 gwei

		if (withLogOutput) LOGGER.info("------------------------- gasPrice -------------------------");
		DefaultGasProvider gp0 = new DefaultGasProvider();
		gasPriceInWEI = gp0.getGasPrice();
		if (withLogOutput) LOGGER.info(StringsUtils.cutAndPadStringToN("web3j DefaultGasProvider gasPrice", 39) + ": " + Convert.fromWei(gp0.getGasPrice().toString(), Unit.GWEI).setScale(0, RoundingMode.HALF_UP) + " gwei");
		if (withLogOutput) LOGGER.info(StringsUtils.cutAndPadStringToN("forestfish fallback gasprice", 39) + ": " + Convert.fromWei(_connector.getChaininfo().getFallbackGasPriceInWEI().toString(), Unit.GWEI).setScale(0, RoundingMode.HALF_UP) + " gwei");
		try {
			if (_increaseGasPriceInWEI.compareTo(BigInteger.ZERO) > 0) {
				LOGGER.info("We are coming in with a bump of " + _increaseGasPriceInWEI + " wei");
				gasPriceInWEI = getCurrentNetworkGasPriceInWEI(_connector);
				if (withLogOutput) LOGGER.info(StringsUtils.cutAndPadStringToN("Network recommended gasprico", 39) + ": " + Convert.fromWei(gasPriceInWEI.toString(), Unit.GWEI).setScale(0, RoundingMode.HALF_UP) + " gwei (" + gasPriceInWEI.toString() + " wei)");
				gasPriceInWEI = bumpGasInWeiAccordingly(_connector, gasPriceInWEI);
				gasPriceInWEI = gasPriceInWEI.add(_increaseGasPriceInWEI); // finally add any bump
				if (withLogOutput) LOGGER.info(StringsUtils.cutAndPadStringToN("ADJ network recommended gasprice", 39) + ": " + Convert.fromWei(gasPriceInWEI.toString(), Unit.GWEI).setScale(0, RoundingMode.HALF_UP) + " gwei (" + gasPriceInWEI.toString() + " wei)");
			} else {
				BigInteger networkGasPriceInWEI = getCurrentNetworkGasPriceInWEI(_connector);
				if (withLogOutput) LOGGER.info(StringsUtils.cutAndPadStringToN("Network recommended gasprice", 39) + ": " + Convert.fromWei(networkGasPriceInWEI.toString(), Unit.GWEI).setScale(0, RoundingMode.HALF_UP) + " gwei (" + networkGasPriceInWEI.toString() + " wei)");
				// By default, 1.2x the recommended network price for testnets
				if (_connector.getChain().toString().contains("TEST")) {
					BigInteger gasPriceInWEI20PERC = networkGasPriceInWEI.divide(new BigInteger("5"));
					gasPriceInWEI = networkGasPriceInWEI.add(gasPriceInWEI20PERC); // increase by x1.2
					if (withLogOutput) LOGGER.info(StringsUtils.cutAndPadStringToN("1.2x testnet recbumped gasprice", 39) + ": " + Convert.fromWei(gasPriceInWEI.toString(), Unit.GWEI).setScale(0, RoundingMode.HALF_UP) + " gwei (" + gasPriceInWEI.toString() + " wei)");
				} else {
					gasPriceInWEI = networkGasPriceInWEI;
				}
				gasPriceInWEI = bumpGasInWeiAccordingly(_connector, gasPriceInWEI);
			}

			// always do the enforced minimum as final check
			if (null != _connector.getChaininfo().getEnforcedMinGasPriceInWEI()) {
				BigInteger gaspriceInWEI_min = new BigInteger(_connector.getChaininfo().getEnforcedMinGasPriceInWEI());
				if (gaspriceInWEI_min.compareTo(gasPriceInWEI) > 0) {
					if (withLogOutput) LOGGER.info("We were about to move forward with gasprice " + EVMUtils.convertBalanceInWeiToGwei(gasPriceInWEI) + " gwei but network minimum setting rules so setting to " + EVMUtils.convertBalanceInWeiToGwei(gaspriceInWEI_min));
					gasPriceInWEI = gaspriceInWEI_min;
				}
			}

		} catch (Exception e) {
			if (withLogOutput) LOGGER.warn("Caught exception while getting gasprice: " + e.getMessage() + ", moving forward with fallback gasPrice " + Convert.fromWei(_connector.getChaininfo().getFallbackGasPriceInWEI().toString(), Unit.GWEI).setScale(0, RoundingMode.HALF_UP) + " gwei");
			gasPriceInWEI = new BigInteger(_connector.getChaininfo().getFallbackGasPriceInWEI().toString());
		}
		if (null != _customNonce) {
			LOGGER.info("We are doing custom nonce, so doubling gas price used");
			gasPriceInWEI.multiply(new BigInteger("2"));
		}
		if (withLogOutput) LOGGER.info(StringsUtils.cutAndPadStringToN("Moving forward with gasprice", 39) + ": " + Convert.fromWei(gasPriceInWEI.toString(), Unit.GWEI).setScale(0, RoundingMode.HALF_UP) + " gwei (" + gasPriceInWEI.toString() + " wei)");

		return gasPriceInWEI;

	}

	public static PendingTxStatus checkForPendingTransactions(EVMBlockChainConnector _connector, String _address) {
		String meth = "checkForPendingTransactions()";
		boolean allInfoOK = false;
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = false;
		while (!allInfoOK && (nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				EthGetTransactionCount ethGetTransactionCount_pending = _connector.getProvider_instance().ethGetTransactionCount(_address, DefaultBlockParameterName.PENDING).send();
				BigInteger nonce_pending =  ethGetTransactionCount_pending.getTransactionCount();

				EthGetTransactionCount ethGetTransactionCount_latest = _connector.getProvider_instance().ethGetTransactionCount(_address, DefaultBlockParameterName.LATEST).send();
				BigInteger nonce_latest =  ethGetTransactionCount_latest.getTransactionCount();
				
				EthGetTransactionCount ethGetTransactionCount_finalized = _connector.getProvider_instance().ethGetTransactionCount(_address, DefaultBlockParameterName.FINALIZED).send();
				BigInteger nonce_finalized =  ethGetTransactionCount_finalized.getTransactionCount();

				if (nonce_pending.compareTo(nonce_latest) == 0) {
					
					if (nonce_pending.compareTo(nonce_finalized) == 0) {
						LOGGER.info("checkForPendingTransactions() - No pending tx for " + _address + ", all good to proceed (nonce=" + nonce_pending.longValue() + ", nonce_finalized=" + nonce_finalized.longValue() + ", requestCount=" + requestCount + ")");
						return new PendingTxStatus(false, nonce_latest, nonce_pending, nonce_finalized, 0L);
					} else {
						LOGGER.warn("We have pending (possibly stuck) transaction:");
						LOGGER.warn(" - nonce_pending: " + nonce_pending.longValue());
						LOGGER.warn(" - nonce_latest: " + nonce_latest.longValue());
						LOGGER.warn(" - nonce_finalized: " + nonce_finalized.longValue());
						Long nonce_diff = nonce_pending.subtract(nonce_finalized).longValue();
						return new PendingTxStatus(true, nonce_latest, nonce_pending, nonce_finalized, nonce_diff);
					}
				} else {
					LOGGER.warn("We have pending (possibly stuck) transaction:");
					LOGGER.warn(" - nonce_pending: " + nonce_pending.longValue());
					LOGGER.warn(" - nonce_latest: " + nonce_latest.longValue());
					LOGGER.warn(" - nonce_finalized: " + nonce_finalized.longValue());
					Long nonce_diff = nonce_pending.subtract(nonce_latest).longValue();
					return new PendingTxStatus(true, nonce_latest, nonce_pending, nonce_finalized, nonce_diff);
				}

			} catch (Exception ex) {
				LOGGER.warn("Unable to grab pending/latest nonce for " + _address + ", requestCount=" + requestCount);
				SystemUtils.sleepInSeconds(1);

				// RPC call exceptions (readonly)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
		}

		LOGGER.error("Unable to get nonce state for " + _address + ", exiting ..");
		SystemUtils.halt();
		return null;
	}

	public static boolean brieflyWaitForPendingTransactionsToClear(EVMBlockChainConnector _connector, String _address) {
		String meth = "brieflyWaitForPendingTransactionsToClear()";
		boolean allInfoOK = false;

		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = false;
		while (!allInfoOK && (nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {

				LOGGER.info("Brief sleep of 5 seconds before checking pending/latest nonce");
				SystemUtils.sleepInSeconds(5);

				EthGetTransactionCount ethGetTransactionCount_pending = _connector.getProvider_instance().ethGetTransactionCount(_address, DefaultBlockParameterName.PENDING).send();
				BigInteger nonce_pending =  ethGetTransactionCount_pending.getTransactionCount();

				EthGetTransactionCount ethGetTransactionCount_latest = _connector.getProvider_instance().ethGetTransactionCount(_address, DefaultBlockParameterName.LATEST).send();
				BigInteger nonce_latest =  ethGetTransactionCount_latest.getTransactionCount();

				EthGetTransactionCount ethGetTransactionCount_finalized = _connector.getProvider_instance().ethGetTransactionCount(_address, DefaultBlockParameterName.FINALIZED).send();
				BigInteger nonce_finalized =  ethGetTransactionCount_finalized.getTransactionCount();

				if (nonce_pending.compareTo(nonce_latest) == 0) {
					LOGGER.info("brieflyWaitForPendingTransactionsToClear() - No pending tx for " + _address + ", all good to proceed (nonce=" + nonce_pending.longValue() + ", nonce_finalized=" + nonce_finalized.longValue() + ", requestCount=" + requestCount + ")");
					return true;
				} else {
					LOGGER.info("We are waiting for pending (possibly stuck) transaction:");
					LOGGER.info(" - nonce_pending: " + nonce_pending.longValue());
					LOGGER.info(" - nonce_latest: " + nonce_latest.longValue());
				}

			} catch (Exception ex) {
				LOGGER.warn("Unable to grab pending/latest nonce for " + _address + ", nodeCallAttemptCount=" + nodeCallAttemptCount);
				SystemUtils.sleepInSeconds(1);

				// RPC call exceptions (readonly)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
			nodeCallAttemptCount++;
		}

		return false;
	}

	public static BigInteger bumpGasInWeiAccordingly(EVMBlockChainConnector _connector, BigInteger _gasPrice) {

		// leave untouched
		if (false ||
				(_connector.getChain() == EVMChain.MANTLE) ||
				false) {
			return _gasPrice;
		}

		// Additional topups
		if (_gasPrice.compareTo(BigInteger.valueOf(50L*1000000000L)) > 0) {
			_gasPrice = _gasPrice.add(new BigInteger("12000000000")); // +12 gwei
		} else if (_gasPrice.compareTo(BigInteger.valueOf(40L*1000000000L)) > 0) {
			_gasPrice = _gasPrice.add(new BigInteger("10000000000")); // +10 gwei
		} else if (_gasPrice.compareTo(BigInteger.valueOf(30L*1000000000L)) > 0) {
			_gasPrice = _gasPrice.add(new BigInteger("8000000000"));  // +8 gwei
		} else if (_gasPrice.compareTo(BigInteger.valueOf(20L*1000000000L)) > 0) {
			_gasPrice = _gasPrice.add(new BigInteger("5000000000"));  // +5 gwei
		} else if (_gasPrice.compareTo(BigInteger.valueOf(10L*1000000000L)) > 0) {
			_gasPrice = _gasPrice.add(new BigInteger("3000000000"));  // +3 gwei
		} else if (_gasPrice.compareTo(BigInteger.valueOf(5L*1000000000L)) > 0) {
			_gasPrice = _gasPrice.add(new BigInteger("1000000000"));  // +1 gwei
		} else if (_gasPrice.compareTo(BigInteger.valueOf(1L*1000000000L)) > 0) {
			_gasPrice = _gasPrice.add(new BigInteger("500000000"));  // +0.5 gwei
		} else {
			_gasPrice = _gasPrice.add(new BigInteger("10000000"));  // +0.01 gwei
		}

		// min 1 gwei fixed for selected testnets
		if (false ||
				(_connector.getChain() == EVMChain.SCROLLALPHATEST) ||
				(_connector.getChain() == EVMChain.ZETAATHENSTEST) ||
				false) {
			// intrinsic gas too low with double so lets go
			_gasPrice = _gasPrice.add(new BigInteger("1000000000")); // add 1 gwei
		}

		// min 9 gwei fixed for selected testnets
		if (false ||
				(_connector.getChain() == EVMChain.BOBABNBTEST) ||
				(_connector.getChain() == EVMChain.SHARDEUMLIBERTY1xTEST) ||
				(_connector.getChain() == EVMChain.SHARDEUMLIBERTY2xTEST) ||
				false) {
			// intrinsic gas too low with double so lets go
			_gasPrice = _gasPrice.add(new BigInteger("9000000000")); // add 9 gwei
		}
		
		// debug for selected testnets
		/*
		if (false ||
				(_connector.getChain() == EVMChain.MANTLETEST) ||
				false) {
			// intrinsic gas too low with double so lets go
			_gasPrice = _gasPrice.add(new BigInteger("2000000000000")); // add 2000 gwei
		}
		*/

		return _gasPrice;
	}

	public static String encodeEVMTransferData(String toAddress, BigInteger sum) {
		Function function = new Function(
				"transfer",  
				Arrays.asList(new Address(toAddress), new Uint256(sum)),  // Parameters to pass as Solidity Types
				Arrays.asList(new org.web3j.abi.TypeReference<Bool>() {}));
		return FunctionEncoder.encode(function);
	}

	public static String sendTXWithERC20_LegacyPricingMechanism(EVMBlockChainConnector _connector, Credentials _creds, String _target_address, String _erc20ContractAddress, BigInteger _amountERC20InWEI, boolean _haltOnUnconfirmedTX) {
		String meth = "sendTXWithERC20_LegacyPricingMechanism()";
		String hash = null;

		boolean tx_attempt = true;
		boolean confirmedTransaction = false;
		int nodeCallAttemptCount = 0;
		boolean timeoutNoted = false;
		int requestCount = 0;
		BigInteger increaseGasPriceInWEI = BigInteger.valueOf(0);

		while (!confirmedTransaction && (nodeCallAttemptCount<10) && (requestCount<15)) {
			requestCount++;
			try {

				/**
				 * stuck/pending transactions
				 */
				NonceCheckStatus nc_state = handleNonceState(_connector, _creds, increaseGasPriceInWEI, nodeCallAttemptCount, timeoutNoted);
				if (nc_state.isEarlyexit()) return "0xearlyexit";

				/**
				 * gasPrice
				 */
				BigInteger gasPrice = determine_gasprice(_connector, increaseGasPriceInWEI, null);

				/**
				 * gasLimit
				 */
				LOGGER.info("------------------------- gasLimit -------------------------");
				DefaultGasProvider gp = new DefaultGasProvider();
				BigInteger gasLimit = gp.getGasLimit();
				LOGGER.info(StringsUtils.cutAndPadStringToN("web3j DefaultGasProvider gasLimit", 39) + ": " + gasLimit + " units");
				if (null != _connector.getChaininfo().getFallbackGasLimitInUnits()) {
					LOGGER.info(StringsUtils.cutAndPadStringToN("Specified gasLimit", 39) + ": " + _connector.getChaininfo().getFallbackGasLimitInUnits() + " units");
					gasLimit = new BigInteger(_connector.getChaininfo().getFallbackGasLimitInUnits());
				}
				if (gasPrice.longValue() < 1000000000L) gasPrice = new BigInteger("1000000000"); // 1 gwei
				gasPrice = bumpGasInWeiAccordingly(_connector, gasPrice);

				LOGGER.info("------------------------------------------------------------");
				LOGGER.info("sendTXWithERC20_LegacyPricingMechanism(): Proceeding with tx attempt #" + nodeCallAttemptCount + " using gasPrice: " + Convert.fromWei(gasPrice.toString(), Unit.GWEI).setScale(0, RoundingMode.HALF_UP) + " gwei, gasLimit: " + gasLimit + " units, nodeCallAttemptCount=" + nodeCallAttemptCount); 

				try {

					TransactionManager transactionManager = new RawTransactionManager(_connector.getProvider_instance(), _creds, _connector.getChaininfo().getChainId());
					String data = encodeEVMTransferData(_target_address, _amountERC20InWEI);
					EthSendTransaction transactionReceipt = transactionManager.sendTransaction(gasPrice, gasLimit, _erc20ContractAddress, data, null);

					hash = transactionReceipt.getTransactionHash();
					if (null != hash) {
						LOGGER.info("ERC20 Transaction complete with txhash: " + hash);
						confirmedTransaction = true;
					} else {
						if (null != transactionReceipt.getError()) {
							EVMTransactionExceptionEvent txE = handleTransactionException(_connector.getChain(), _connector.getCurrent_nodeURL(), transactionReceipt.getError().getMessage(), transactionReceipt.getError().getData(), tx_attempt);

							//-------------------------------------------------------------------------
							boolean debug_tx = true;
							if (debug_tx) System.out.println("transactionReceipt ID: " + transactionReceipt.getId()); // 802
							if (debug_tx) System.out.println("transactionReceipt error code: " + transactionReceipt.getError().getCode());
							if (debug_tx) System.out.println("transactionReceipt error message: " + transactionReceipt.getError().getMessage());
							if (debug_tx) System.out.println("txE.getExceptionType(): " + txE.getExceptionType());
							if (debug_tx) System.out.println("txE.getSleepTimeInSecondsRecommended(): " + txE.getSleepTimeInSecondsRecommended());
							if (debug_tx) System.out.println("txE.isNodeInteraction(): " + txE.isNodeInteraction());
							if (debug_tx) System.out.println("txE.isDoubleGasPrice(): " + txE.isDoubleGasPrice());
							if (debug_tx) System.out.println("txE.isDoubleGasLimit(): " + txE.isDoubleGasLimit());
							if (debug_tx) System.out.println("txE.isSleepBeforeRetry(): " + txE.isSleepBeforeRetry());
							if (debug_tx) System.out.println("txE.isSwitchNode(): " + txE.isSwitchNode());
							if (debug_tx) System.out.println("txE.getExceptionType(): " + txE.getExceptionType());

							if (txE.isNodeInteraction()) nodeCallAttemptCount++; 
							if (txE.isSleepBeforeRetry()) SystemUtils.sleepInSeconds(txE.getSleepTimeInSecondsRecommended());
							if (txE.getExceptionType() == ExceptionType.FATAL) SystemUtils.halt();
							if (txE.isSwitchNode()) _connector.selectRandomNodeURL(_connector.getCurrent_nodeURL());
							if (txE.isDoubleGasPrice()) {
								//https://docs.klaytn.foundation/klaytn/design/transaction-fees, will result in 'invalid unit price' on KLAYTN
								if (_connector.getChain() != EVMChain.KLAYTN) {
									increaseGasPriceInWEI = increaseGasPriceInWEI.multiply(BigInteger.valueOf(2)); // x2
								}
							}
							//--------------------------------------------------------

							if (false ||
									(txE.getExceptionType() == ExceptionType.TX_MIGHT_BE_PENDING) ||
									(txE.getExceptionType() == ExceptionType.TX_RESENT) ||
									false) {
								LOGGER.info("We have an unconfirmed transaction state and no tx hash");
								if (_haltOnUnconfirmedTX) {
									LOGGER.info("haltOnUnconfirmedTX is true so will halt");
									SystemUtils.halt();
								} else {
									LOGGER.info("Instructed to move on .. dont like it but will");
									return null;
								}
							} else {
								SystemUtils.halt();
							}
						} else {
							LOGGER.error("Got a blank transaction receipt and no error message");
							SystemUtils.halt();
						}
						LOGGER.error("gettin out");
						SystemUtils.halt();
					}

				} catch (Exception e) {
					EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), e, meth, tx_attempt);
					if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node

					//----------------------------------------------------------------
					if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
					if (evmE.isTimeout()) timeoutNoted = true;
					if (evmE.isSleepBeforeRetry()) {
						SystemUtils.sleepInSeconds(evmE.getSleepTimeInSecondsRecommended());
					} else {
						SystemUtils.sleepInSeconds(1); // Always sleep for 1 sec
					}
					if (evmE.getExceptionType() == ExceptionType.FATAL) SystemUtils.halt();
					if (evmE.isSwitchNode()) _connector.selectRandomNodeURL(_connector.getCurrent_nodeURL());
					if (evmE.isIncreaseGasPrice()) {
						//https://docs.klaytn.foundation/klaytn/design/transaction-fees, will result in 'invalid unit price' on KLAYTN
						if (_connector.getChain() != EVMChain.KLAYTN) {
							increaseGasPriceInWEI = increaseGasPriceInWEI.add(BigInteger.valueOf(2000000000L)); // bump by 2 gwei
						}
					}
					if ( true && 
							((evmE.getExceptionType() != ExceptionType.NODE_RECOVERABLE) || (evmE.getExceptionType() != ExceptionType.NODE_UNSTABLE)) && 
							_haltOnUnconfirmedTX &&
							true) {
						LOGGER.info(meth + " haltOnUnconfirmedTX is set to true, and we have an unrecoverable exception");
						SystemUtils.halt();
					}
					//----------------------------------------------------------------

				}

			} catch (Exception ex) {
				// RPC tx exceptions (readwrite)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmEAS = actAndGetStateEVMProviderException(evmE, _connector, _haltOnUnconfirmedTX, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmE.isTimeout()) timeoutNoted = true;
				if (evmEAS.isIncreaseGasPrice()) increaseGasPriceInWEI = increaseGasPriceInWEI.add(evmEAS.getSuggestedGasPriceIncreaseInWEI());
				if (evmEAS.isNewEVMBlockChainConnector()) _connector = evmEAS.getConnector();
			}
		}

		if (confirmedTransaction) {
			return hash;
		} else {
			return null;
		}
	}

	private static String sendTXWithNativeCurrency_EIP1559PricingMechanism(EVMBlockChainConnector _connector, Credentials _from_wallet_credentials, String _target_address, EVMNativeValue _evmNativeValue, boolean _haltOnUnconfirmedTX) {
		return sendTXWithNativeCurrency_EIP1559PricingMechanism_WithCustomNonce(_connector, _from_wallet_credentials, _target_address, _connector.getChaininfo().getConfirmationTimeinSeconds(), _connector.getChaininfo().getFallbackGasLimitInUnits(), _evmNativeValue, _haltOnUnconfirmedTX, null, false);
	}
	
	private static String sendTXWithNativeCurrency_EIP1559PricingMechanism_WithCustomNonce(EVMBlockChainConnector _connector, Credentials _from_wallet_credentials, String _target_address, EVMNativeValue _evmNativeValue, boolean _haltOnUnconfirmedTX, BigInteger _customNonce, boolean _forceIncreaseGas) {
		return sendTXWithNativeCurrency_EIP1559PricingMechanism_WithCustomNonce(_connector, _from_wallet_credentials, _target_address, _connector.getChaininfo().getConfirmationTimeinSeconds(), _connector.getChaininfo().getFallbackGasLimitInUnits(), _evmNativeValue, _haltOnUnconfirmedTX, _customNonce, _forceIncreaseGas);
	}

	private static String sendTXWithNativeCurrency_EIP1559PricingMechanism_WithCustomNonce(EVMBlockChainConnector _connector, Credentials _creds, String _target_address, int _initialConfirmTimeInSeconds, String _strGasLimit, EVMNativeValue _evmNativeValue, boolean _haltOnUnconfirmedTX, BigInteger _customNonce, boolean _forceIncreaseGas) {
		String meth = "sendTXWithNativeCurrency_EIP1559PricingMechanism_WithCustomNonce()";
		String hash = null;
		boolean confirmedTransaction = false;
		boolean timeoutNoted = false;
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		boolean tx_attempt = true;
		BigInteger increaseGasPriceInWEI = BigInteger.valueOf(0);

		while (!confirmedTransaction && (nodeCallAttemptCount<10) && (requestCount<15)) {
			requestCount++;
			try {

				/**
				 * stuck/pending transactions
				 */
				NonceCheckStatus nc_state = handleNonceState(_connector, _creds, increaseGasPriceInWEI, nodeCallAttemptCount, timeoutNoted);
				if (nc_state.isEarlyexit()) return "0xearlyexit";

				/**
				 * gasPrice
				 */
				BigInteger gasPrice = determine_gasprice(_connector, increaseGasPriceInWEI, null);

				/**
				 * gasLimit
				 */
				LOGGER.info("------------------------- gasLimit -------------------------");
				DefaultGasProvider gp = new DefaultGasProvider();
				BigInteger gasLimit = gp.getGasLimit();
				LOGGER.info(StringsUtils.cutAndPadStringToN("web3j DefaultGasProvider gasLimit", 39) + ": " + gasLimit + " units");
				if (null != _strGasLimit) {
					LOGGER.info(StringsUtils.cutAndPadStringToN("Specified gasLimit", 39) + ": " + _strGasLimit + " units");
					gasLimit = new BigInteger(_strGasLimit);
				}

				LOGGER.info("------------------------------------------------------------");
				LOGGER.info("sendTXWithNativeCurrency_EIP1559PricingMechanism(): Proceeding with tx using gasPrice: " + Convert.fromWei(gasPrice.toString(), Unit.GWEI).setScale(0, RoundingMode.HALF_UP) + " gwei (" + gasPrice.toString() + " wei), gasLimit: " + gasLimit + " units, nodeCallAttemptCount=" + nodeCallAttemptCount + "nonce: " + nc_state.getStatus().getNonce_latest()); 

				try {

					BigInteger maxPriorityFeePerGas = gasLimit;
					BigInteger maxFeePerGas = BigInteger.valueOf(3_100_000_000L);

					TransactionReceipt transactionReceipt = Transfer.sendFundsEIP1559(
							_connector.getProvider_instance(), 
							_creds,
							_target_address, 
							_evmNativeValue.getVal(),
							_evmNativeValue.getUnit(),
							gasLimit,
							maxPriorityFeePerGas,
							maxFeePerGas
							).send();

					hash = transactionReceipt.getTransactionHash();
					LOGGER.info("Transaction complete with txhash: " + hash + " at blocknr " + transactionReceipt.getBlockNumber() + " spent gas: " + transactionReceipt.getGasUsed().toString() + " units");
					confirmedTransaction = true;
					
				} catch (Exception ex) {
					// RPC tx exceptions (readwrite)
					EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
					if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
					EVMProviderExceptionActionState evmEAS = actAndGetStateEVMProviderException(evmE, _connector, _haltOnUnconfirmedTX, nodeCallAttemptCount);
					if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
					if (evmE.isTimeout()) timeoutNoted = true;
					if (evmEAS.isIncreaseGasPrice()) increaseGasPriceInWEI = increaseGasPriceInWEI.add(evmEAS.getSuggestedGasPriceIncreaseInWEI());
					if (evmEAS.isNewEVMBlockChainConnector()) _connector = evmEAS.getConnector();
				}
			} catch (Exception ex) {
				// RPC tx exceptions (readwrite)
				EVMProviderException evmE = analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmEAS = actAndGetStateEVMProviderException(evmE, _connector, _haltOnUnconfirmedTX, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmE.isTimeout()) timeoutNoted = true;
				if (evmEAS.isIncreaseGasPrice()) increaseGasPriceInWEI = increaseGasPriceInWEI.add(evmEAS.getSuggestedGasPriceIncreaseInWEI());
				if (evmEAS.isNewEVMBlockChainConnector()) _connector = evmEAS.getConnector();
			}
		}

		if (confirmedTransaction) {
			return hash;
		} else {
			return null;
		}
	}

	static EVMProviderExceptionActionState actAndGetStateEVMProviderException(EVMProviderException _evmE, EVMBlockChainConnector _connector, boolean _haltOnUnconfirmedTX, int _nodeCallAttemptCount) {
		String meth = "actAndGetStateEVMProviderException()";
		boolean increaseGasPrice = false;
		BigInteger suggestedGasPriceIncreaseInWEI = BigInteger.valueOf(0);

		boolean newEVMBlockChainConnector = false;
		EVMBlockChainConnector connector = _connector;

		if (_evmE.isSleepBeforeRetry()) {
			SystemUtils.sleepInSeconds(_evmE.getSleepTimeInSecondsRecommended());
		} else {
			SystemUtils.sleepInSeconds(1); // Always sleep for 1 sec
		}
		if (_evmE.getExceptionType() == ExceptionType.FATAL) {
			LOGGER.info("ExceptionType is FATAL, exiting ..");
			SystemUtils.halt();
		}

		boolean forceswitchNode = false;
		if (_nodeCallAttemptCount >= 5) {
			forceswitchNode = true;
			LOGGER.info("We have tried to recover using this node but unsuccessful so far, lets switch node");
		}
		if (_evmE.isSwitchNode() || forceswitchNode) {
			newEVMBlockChainConnector = true;
			connector.selectRandomNodeURL(_connector.getCurrent_nodeURL());
		}
		if (_evmE.isIncreaseGasPrice()) {
			//https://docs.klaytn.foundation/klaytn/design/transaction-fees, will result in 'invalid unit price' on KLAYTN
			if (_connector.getChain() != EVMChain.KLAYTN) {
				increaseGasPrice = true;
				suggestedGasPriceIncreaseInWEI = suggestedGasPriceIncreaseInWEI.add(BigInteger.valueOf(4000000000L)); // bump by 4 gwei
			}
		}
		if (_nodeCallAttemptCount >= 5) {
			if ( true && 
					((_evmE.getExceptionType() != ExceptionType.NODE_RECOVERABLE) || (_evmE.getExceptionType() != ExceptionType.NODE_UNSTABLE)) && 
					_haltOnUnconfirmedTX &&
					true) {
				LOGGER.info(meth + " haltOnUnconfirmedTX is set to true, and we have an unrecoverable exception and nodeCallAttemptCount is " + _nodeCallAttemptCount);
				SystemUtils.halt();
			}
		}

		return new EVMProviderExceptionActionState(increaseGasPrice, suggestedGasPriceIncreaseInWEI, newEVMBlockChainConnector, connector);
	}

	static EVMProviderException analyzeProviderException(EVMChain _chain, String _nodeURL, Exception _ex, String _func, boolean tx_attempt) {	
		String meth = "analyzeProviderException()";
		boolean nodeInteraction = false;
		boolean sleepBeforeRetry = false;
		boolean increaseGasPrice = false;
		int sleepTimeInSecondsRecommended = 5;
		ExceptionType exceptionType = ExceptionType.UNKNOWN;
		boolean switchNode = false;
		boolean timeout = false;

		if (false ||
				_ex.getMessage().contains("timeout") ||
				_ex.getMessage().contains("timed out") ||
				false) {
			// java.net.SocketTimeoutException: connect timed out
			// java.net.SocketTimeoutException: Read timed out
			LOGGER.info("Got a timeout for nodeURL " + _nodeURL + ".. will retry .. ex: " + _ex.getMessage());
			nodeInteraction = false;
			sleepBeforeRetry = true;
			sleepTimeInSecondsRecommended = 5;
			if (tx_attempt) {
				exceptionType = ExceptionType.TX_MIGHT_BE_PENDING;
			} else {
				exceptionType = ExceptionType.NODE_RECOVERABLE;
			}
			timeout = true;
		} else if (false ||
				(_ex.getMessage().contains("Failed to connect")) ||
				(_ex.getMessage().contains("Connection reset")) ||
				(_ex.getMessage().contains("No route to host")) ||
				(_ex.getMessage().contains("no such host")) ||
				(_ex.getMessage().contains("closed")) ||
				(_ex.getMessage().contains("connection refused")) ||
				(_ex.getMessage().contains("Remote host terminated the handshake")) ||
				false) {
			// java.net.ConnectException: Failed to connect to
			// java.net.SocketException: Connection reset
			// javax.net.ssl.SSLHandshakeException: Remote host terminated the handshake
			// https://rpc.startale.com/zkatana: "rpc error: code = Unavailable desc = connection error: desc = "transport: Error while dialing: dial tcp 10.65.132.186:50071: connect: connection refused"
			// https://endpoints.omniatech.io/v1/op/goerli/public: "Post "https://goerli-sequencer.optimism.io": dial tcp: lookup goerli-sequencer.optimism.io on 127.0.0.53:53: no such host"
			LOGGER.warn("Got a connection reset from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (false ||
				_ex.getMessage().contains("UnknownHostException") ||
				_ex.getMessage().contains("No such host is known") ||
				false) {
			LOGGER.info("Unable to resolve host using nodeURL " + _nodeURL + ".. will not retry and switch provider, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			sleepBeforeRetry = true;
			sleepTimeInSecondsRecommended = 1;
			switchNode = true;
		} else if (false ||
				_ex.getMessage().contains("must be in format") ||
				_ex.getMessage().contains("method to deserialize") ||
				false) {
			// https://github.com/web3j/web3j/issues/1643
			// https://endpoints.omniatech.io/v1/op/goerli/public: "Cannot construct instance of `org.web3j.protocol.core.methods.response.EthSendTransaction` (although at least one Creator exists): no String-argument constructor/factory method to deserialize from String value ('^....
			LOGGER.info("Response decode error from nodeURL " + _nodeURL + ", did you use PENDING+.getBalance() on BERACHAIN? ill not retry, move on to next node. Error message: " + _ex.getMessage());
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("No value present")) {
			// No value present
			LOGGER.info("Got a no value present error from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("404;")) {
			LOGGER.warn("Got a 404 non JSON response from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (false ||
				(_ex.getMessage().contains("500") && _ex.getMessage().toLowerCase().contains("internal")) ||
				(_ex.getMessage().toLowerCase().contains("internal error")) ||
				(_ex.getMessage().toLowerCase().contains("internal_error")) ||
				false) {
			// <center><h1>500 Internal Server Error</h1></center>
			// 500; internal error
			// Internal error
			// 500; Internal Server Error
			// https://rpc.velaverse.io: Received fatal alert: internal_error
			LOGGER.warn("Got a 500 internal server error response from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (false ||
				_ex.getMessage().contains("Unexpected character") ||
				_ex.getMessage().contains("Invalid response received") ||
				_ex.getMessage().contains("out of range") ||
				false) {
			// org.web3j.protocol.exceptions.ClientConnectionException: Invalid response received: 403; {"message":"Forbidden"}
			// org.web3j.protocol.exceptions.ClientConnectionException: Invalid response received: 521; 
			// https://zksync.drpc.org: Numeric value (4294935296) out of range of int (-2147483648 - 2147483647) at [Source: (ByteArrayInputStream); line: 1, column: 79] (through reference chain: org.web3j.protocol.core.methods.response.EthGasPrice["error"]->org.web3j.protocol.core.Response$Error["code"])"
			LOGGER.info("Got an unknown/invalid RPC reply from nodeURL " + _nodeURL + ".. will not retry, move on to next node. ex: " + _ex.getMessage());
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("502 Bad Gateway")) {
			// 502; <html><head><title>502 Bad Gateway</title></head><body><center><h1>502 Bad Gateway</h1></center></body></html>
			LOGGER.warn("Got a 502 non JSON response from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("503")) {
			// 503; <html><body><h1>503 Service Unavailable</h1>
			// <center><h1>503 Service Temporarily Unavailable</h1></center>
			LOGGER.warn("Got a 503 non JSON response from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("unexpected")) {
			// java.io.IOException: unexpected end of stream on
			LOGGER.warn("Got a 503 non JSON response from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("protocol_version")) {
			// https://smart.zeniq.network:9545: "javax.net.ssl.SSLHandshakeException: Received fatal alert: protocol_version"
			LOGGER.warn("Got a SSL Protocol vereion issue from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("mempool is full")) {
			LOGGER.warn("Got a mempool full response from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().toLowerCase().contains("maximum load")) {
			// Maximum load exceeded.
			LOGGER.warn("Got a 503 non JSON response from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			sleepBeforeRetry = true;
			sleepTimeInSecondsRecommended = 10;
			switchNode = true;
		} else if (_ex.getMessage().contains("Unsupported")) {
			// https://taycan-rpc.hupayx.io:8545: javax.net.ssl.SSLException: Unsupported or unrecognized SSL message
			LOGGER.warn("Got an invalid SSL cert from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("PKIX path")) {
			// javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException
			// javax.net.ssl.SSLHandshakeException: PKIX path validation failed: java.security.cert.CertPathValidatorException: validity check failed
			LOGGER.warn("Got an invalid SSL cert from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("javax.net.ssl.SSLPeerUnverifiedException")) {
			// javax.net.ssl.SSLPeerUnverifiedException: Hostname json-rpc.evmos.blockhunters.org not verified:
			//certificate: sha256/U95EtMx8zsqjbErAr71y57SwDgA2rZnTLlTIvQqMRzE=
			//	    DN: CN=raa.namecheap.com
			//	    subjectAltNames: [raa.namecheap.com, www.raa.namecheap.com]
			LOGGER.warn("Got an invalid SSL cert from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("405 Not Allowed")) {
			// <center><h1>405 Not Allowed</h1></center>
			LOGGER.warn("Got a 405 response from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("Contract Call has been reverted by the EVM with the reason")) {
			// Contract Call has been reverted by the EVM with the reason: 'Cannot fulfill request'
			LOGGER.warn("Got a contract call reverted from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().toLowerCase().contains("invalid numeric")) {
			// Invalid numeric value: Leading zeroes not allowed
			LOGGER.warn("Got invalid numeric value from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("access_denied")) {
			// javax.net.ssl.SSLHandshakeException: Received fatal alert: access_denied (caused by cloudflare-eth.com, AV?)
			LOGGER.warn("Got accessed denied from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("exceeds the configured cap")) {
			// https://testnet.liquidlayer.network: tx fee (19.58 ether) exceeds the configured cap (1.00 ether)
			LOGGER.warn("Tx fee issue response from nodeURL " + _nodeURL + ".. will not retry, fix your code");
			exceptionType = ExceptionType.FATAL;	
		} else if (_ex.getMessage().contains("Transaction receipt was not generated after 600 seconds for transaction")) {
			// Transaction receipt was not generated after 600 seconds for transaction
			LOGGER.warn("Missing tx receipt from nodeURL " + _nodeURL + ".. will not retry, we dont know how to poll for the tx id");
			exceptionType = ExceptionType.FATAL;	
		} else if (false ||
				_ex.getMessage().toLowerCase().contains("transaction nonce") ||
				_ex.getMessage().toLowerCase().contains("invalid nonce") ||
				false) {
			// ZETACHAINTEST: invalid nonce; got 276, expected 277: invalid sequence: invalid sequence
			// Transaction nonce != 1  txNonce:0
			LOGGER.warn(_func + " - Nonce mismatch, you need to make sure you have no pending txs (or clear them first): " + _ex.getMessage());
			nodeInteraction = true;
			exceptionType = ExceptionType.FATAL;	
		} else if (_ex.getMessage().contains("replacement transaction underpriced")) {
			// replacement transaction underpriced
			LOGGER.warn("Got replacement transaction underpriced from nodeURL " + _nodeURL + ".. will increase gasprice and try again");
			exceptionType = ExceptionType.NODE_RECOVERABLE;
			increaseGasPrice = true;
		} else if (_ex.getMessage().contains("already known")) {
			// already known
			LOGGER.warn("Got replacement transaction underpriced from nodeURL " + _nodeURL + ".. will increase gasprice and try again");
			exceptionType = ExceptionType.NODE_RECOVERABLE;
			increaseGasPrice = true;
		} else if (_ex.getMessage().contains("transaction underpriced")) {
			// JsonRpcError thrown with code -32000. Message: transaction underpriced
			LOGGER.warn("Got transaction underpriced from nodeURL " + _nodeURL + ".. will increase gasprice and try again");
			exceptionType = ExceptionType.NODE_RECOVERABLE;
			increaseGasPrice = true;
		} else if (_ex.getMessage().contains("invalid unit price")) {
			// invalid unit price, https://pkg.go.dev/github.com/klaytn/klaytn/blockchain
			LOGGER.warn("Got invalid unit price from " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;	
		} else if (_ex.getMessage().contains("invalid sender")) {
			LOGGER.warn("Got invalid sender from nodeURL " + _nodeURL + ".. will not retry since this usually means your specified chain/network id is misformed");
			exceptionType = ExceptionType.FATAL;
		} else if (_ex.getMessage().contains("Unable to determine sync status of node")) {
			// org.web3j.ens.EnsResolutionException: Unable to determine sync status of node
			LOGGER.warn("Got a sync status unknown from nodeURL " + _nodeURL + ".. will not retry since this usually means your specified address is misformed");
			exceptionType = ExceptionType.FATAL;	
		} else if (_ex.getMessage().contains("only replay-protected (EIP-155) transactions allowed over RPC")) {
			// only replay-protected (EIP-155) transactions allowed over RPC
			LOGGER.warn("Got a replay-protection error from nodeURL " + _nodeURL + ".. will not retry since this usually means you didnt ship the chain id with your tx, fix your code");
			exceptionType = ExceptionType.FATAL;	
		} else if (_ex.getMessage().contains("insufficient funds for gas")) {
			// insufficient funds for gas * price + value
			LOGGER.warn("Got insufficient funds for gas from nodeURL " + _nodeURL + ".. will not retry since this usually means you need to top up the account or attempted to transfer amount which left nothing for gas");
			exceptionType = ExceptionType.FATAL;	
		} else if (_ex.getMessage().toLowerCase().contains("invalid chain id")) {
			// Invalid chain id.
			LOGGER.warn("Got invalid chain id from nodeURL " + _nodeURL + ".. will not retry since this usually means you need to top up the account");
			exceptionType = ExceptionType.FATAL;	
		} else if (_ex.getMessage().toLowerCase().contains("exceeds block gas limit")) {
			// https://rpc.test.siberium.net: exceeds block gas limit
			LOGGER.warn("Got \"exceeds block gas limit\" from nodeURL " + _nodeURL + ".. will not retry since this usually means you need to adjust your gas limit");
			exceptionType = ExceptionType.FATAL;
		} else if (false ||
				_ex.getMessage().toLowerCase().contains("insufficient funds") ||
				_ex.getMessage().toLowerCase().contains("insufficient balance") ||
				false) {
			// INTERNAL_ERROR: insufficient funds
			LOGGER.warn("Got insufficient funds from nodeURL " + _nodeURL + ".. will not retry since this usually means you need to top up the account");
			exceptionType = ExceptionType.FATAL;	
		} else if (_ex.getMessage().toLowerCase().contains("nonce too low")) {
			// INTERNAL_ERROR: nonce too low
			LOGGER.warn("Got nonce too low from nodeURL " + _nodeURL + ".. this usually means you screwed up when passing a custom nonce");
			if (_chain == EVMChain.BASEGOERLITEST) {
				LOGGER.info("This does happen from time to time on the BASE test network though, lets retry");
				exceptionType = ExceptionType.NODE_UNSTABLE;	
				switchNode = true;
			} else {
				LOGGER.info("This should not happen for " + _chain + ", exiting");
				exceptionType = ExceptionType.FATAL;
			}
		} else if (_ex.getMessage().toLowerCase().contains("revert")) {
			// Failed to submit transaction: Failed to validate the transaction. Reason: Validation revert: Account validation error: Error function_selector = 0x, data = 0x
			// Transaction 0x4926dad... has failed with status: 0x0. Gas used: 29603. Revert reason: 'execution reverted'.
			LOGGER.warn("Got revert from nodeURL " + _nodeURL + ".. will not retry since likely major issue: " + _ex.getMessage());
			exceptionType = ExceptionType.FATAL;	
		} else if (_ex.getMessage().contains("Invalid response received: 403")) {
			// Invalid response received: 403; Request Blocked. Contact Flux Team.
			LOGGER.warn("Got a 403 response from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("Invalid response received: 410")) {
			// Network decommissioned, please use Goerli or Sepolia instead
			LOGGER.warn("Got a 410 resource GONE response from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("Invalid response received: 525")) {
			// Invalid response received: 525
			LOGGER.warn("Got an SSL handshake failed response from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains(_nodeURL.replace("https://",""))) {
			// eth.plexnode.wtf (node just echoes its fqdn back)
			// polygon-bor.publicnode.com (node just echoes its fqdn back)
			LOGGER.warn("Got the FQDN echoed back as response while communicating with " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (false ||
				_ex.getMessage().contains("No content to map due to end-of-input") ||
				_ex.getMessage().contains("Cannot deserialize value of type") ||
				_ex.getMessage().contains("Invalid") ||
				false) {
			// https://rpc.sepolia.ethpandaops.io: "Invalid"
			// com.fasterxml.jackson.databind.exc.MismatchedInputException: No content to map due to end-of-input
			// Cannot deserialize value of type `java.lang.String` from Object value (token `JsonToken.START_OBJECT`)
			LOGGER.warn("Got a bad response from nodeURL " + _nodeURL + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().equals("Empty value (0x) returned from contract")) {
			LOGGER.warn(_func + " - Contract address does not seem to exist, received the following error: " + _ex.getMessage() + ", may be transitory (rare)");
			nodeInteraction = true;
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;	
		} else if (false ||
				_ex.getMessage().contains("transaction underpriced") ||
				_ex.getMessage().contains("intrinsic gas too low") ||
				false) {
			LOGGER.warn("Gas price likely too low, update your min gas calculations for " + _chain + ", exception: " + _ex.getMessage());
			nodeInteraction = true;
			exceptionType = ExceptionType.FATAL;
		} else if (false ||
				_ex.getMessage().contains("legacy transaction is not supported") ||
				false) {
			// https://rpc.ankr.com/filecoin_testnet: legacy transaction is not supported
			LOGGER.warn("Legacy transaction not supported, need to switch to EIP1559 for chain " + _chain + ", exception: " + _ex.getMessage());
			nodeInteraction = true;
			exceptionType = ExceptionType.FATAL;
		} else if (_ex.getMessage().contains("Invalid response received: 429")) {
			if (false ||
					_ex.getMessage().contains("daily request count exceeded") ||
					_ex.getMessage().contains("You have sent too many requests in a given amount of time") ||
					false) {
				LOGGER.info("RPC Node limit reached for nodeURL " + _nodeURL + ", we should probably cool down: " + _ex.getMessage());
				exceptionType = ExceptionType.NODE_UNSTABLE;	
				switchNode = true;		
			} else if (_ex.getMessage().contains("ran out of cu")) {
				// org.web3j.protocol.exceptions.ClientConnectionException: Invalid response received: 429; {"jsonrpc":"2.0","id":null,"error":{"code":-32005,"message":"ran out of cu"}}
				LOGGER.info("429 error noted for nodeURL " + _nodeURL + ": " + _ex.getMessage() + ", lets try again");
				exceptionType = ExceptionType.NODE_UNSTABLE;	
				switchNode = true;
			} else {
				LOGGER.error("Generic 429 error from nodeURL " + _nodeURL + ": " + _ex.getMessage() + ", update analyzeProviderException() .. ");
				LOGGER.info("429 error noted for nodeURL " + _nodeURL + ": " + _ex.getMessage() + ", lets try again");
				exceptionType = ExceptionType.NODE_UNSTABLE;	
				switchNode = true;
			}
		} else {
			exceptionType = ExceptionType.UNKNOWN;
			LOGGER.error(meth + ": Unknown error from nodeURL " + _nodeURL + ", response: \"" + _ex.getMessage() + "\", update " + meth, tx_attempt);
			LOGGER.error(meth + ": Unknown response noted while communicating with " + _nodeURL);
			SystemUtils.halt();
		}

		return new EVMProviderException(exceptionType, nodeInteraction, sleepBeforeRetry, increaseGasPrice, sleepTimeInSecondsRecommended, switchNode, timeout);
	}

	private static EVMTransactionExceptionEvent handleTransactionException(EVMChain _chain, String _nodeURL, String _errorMessage, String _data, boolean _tx_attempt) {	
		String meth = "handleTransactionException()";
		boolean nodeInteraction = false;
		boolean sleepBeforeRetry = false;
		boolean doubleGasPrice = false;
		boolean doubleGasLimit = false;
		int sleepTimeInSecondsRecommended = 5;
		ExceptionType exceptionType = ExceptionType.UNKNOWN;
		boolean switchNode = false;
		boolean dupTransaction = false;

		if (false ||
				_errorMessage.contains("insufficient funds") ||
				false) {
			// INTERNAL_ERROR: insufficient funds
			LOGGER.warn("Got insufficient funds for gas from nodeURL " + _nodeURL + ".. will not retry since this usually means you need to top up the account");
			exceptionType = ExceptionType.FATAL;	
		} else if (false ||
				_errorMessage.contains("receipt was not generated after") ||
				false) {
			// Transaction receipt was not generated after 600 seconds for transaction
			LOGGER.info("Got a transaction receipt timeout for nodeURL " + _nodeURL + ".. ex: " + _errorMessage);
			nodeInteraction = true;
			if (_tx_attempt) {
				exceptionType = ExceptionType.TX_MIGHT_BE_PENDING;
			} else {
				exceptionType = ExceptionType.NODE_RECOVERABLE;
			}
		} else if (false ||
				_errorMessage.toLowerCase().contains("internal error") ||
				_errorMessage.toLowerCase().contains("internal_error") ||
				_errorMessage.toLowerCase().contains("server_error") ||
				false) {
			// Internal error
			LOGGER.info("Got a 500 internal error for nodeURL " + _nodeURL + ".. ex: " + _errorMessage);
			nodeInteraction = true;
			exceptionType = ExceptionType.NODE_UNSTABLE;
		} else if (false ||
				_errorMessage.toLowerCase().contains("invalid parameters: tx") ||
				false) {
			// Invalid parameters: tx (https://developer.confluxnetwork.org/sending-tx/en/transaction_send_common_error/)
			LOGGER.info("Got invalid parameters from nodeURL " + _nodeURL + ".. ex: " + _errorMessage + " data: " + _data);
			nodeInteraction = true;
			exceptionType = ExceptionType.NODE_UNSTABLE;
		} else if (_errorMessage.contains("already known")) {
			LOGGER.warn("Transaction gave an \"already known\" response, which means you may have submitted the same transaction twice");
			dupTransaction = true;
			nodeInteraction = true;
			exceptionType = ExceptionType.TX_RESENT;
		} else if (_errorMessage.contains("replacement transaction underpriced")) {
			// https://ethereum.stackexchange.com/questions/27256/error-replacement-transaction-underpriced/44875
			LOGGER.warn("Transaction gave an \"replacement transaction\" response, which means you may have submitted the same transaction twice");
			dupTransaction = true;
			nodeInteraction = true;
			exceptionType = ExceptionType.TX_RESENT;
		} else if (false ||
				_errorMessage.contains("transaction underpriced") ||
				_errorMessage.contains("intrinsic gas too low") ||
				false) {
			doubleGasPrice = true;
			nodeInteraction = true;
			exceptionType = ExceptionType.NODE_RECOVERABLE;
		} else if (_errorMessage.contains("nonce too low")) {
			nodeInteraction = true;
			exceptionType = ExceptionType.FATAL;
		} else if (_errorMessage.contains("insufficient funds for gas")) {
			nodeInteraction = true;
			exceptionType = ExceptionType.FATAL;
		} else if (_errorMessage.contains("gas limit too low")) {
			// gas limit too low: 21000 (gas limit) < 21596 (intrinsic gas): out of gas: out of gas (https://evm.testnet.kava.io)
			nodeInteraction = true;
			doubleGasLimit = true;
			exceptionType = ExceptionType.NODE_RECOVERABLE;
		} else {
			exceptionType = ExceptionType.UNKNOWN;
			LOGGER.error(meth + ": Unknown tx error from nodeURL " + _nodeURL + ": " + _errorMessage + ", update " + meth);
			LOGGER.error(meth + ": Unknown response noted while communicating with " + _nodeURL);
			SystemUtils.halt();
		}

		return new EVMTransactionExceptionEvent(exceptionType, nodeInteraction, sleepBeforeRetry, doubleGasPrice, doubleGasLimit, sleepTimeInSecondsRecommended, switchNode, dupTransaction);
	}

	public static boolean isValidEthereumAddress(final String _ethereumAddress) {
		if (_ethereumAddress == null || !_ethereumAddress.startsWith("0x") || _ethereumAddress.length() != 42) return false;
		if (!_ethereumAddress.matches("^0x[0-9a-fA-F]{40}$")) {
			return false;
		}
		if (containsUppercase(_ethereumAddress)) {
			return isValidEthereumAddressWithChecksum(_ethereumAddress);
		}
		return true;
	}

	public static boolean containsUppercase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	public static boolean isValidEthereumAddressWithChecksum(String _ethereumAddress) {
		if (_ethereumAddress == null || !_ethereumAddress.startsWith("0x") || _ethereumAddress.length() != 42) return false;
		String addressLC = _ethereumAddress.substring(2).toLowerCase();
		String addressCHECKSUM = Keys.toChecksumAddress(addressLC);
		if (_ethereumAddress.equals(addressCHECKSUM)) return true;
		return false;
	}

	public static EVMChainInfo getEVMChainInfo(EVMChain _shortname) {
		EVMChainIndex idx = BlockchainDetailsEVM.generateEVMChainIndex();
		return idx.getNetworks().get(_shortname);
	}

	public static EVMBlockChainConnector getEVMChainConnector(EVMChain _shortname, boolean _haltOnRPCNodeSelectionFail) {
		return new EVMBlockChainConnector(_shortname, _haltOnRPCNodeSelectionFail);
	}

	public static EVMBlockChainConnector getEVMChainConnector(EVMChain _shortname, boolean nodeOptimized, boolean _haltOnRPCNodeSelectionFail) {
		return new EVMBlockChainConnector(_shortname, nodeOptimized, _haltOnRPCNodeSelectionFail);
	}

	public static EVMBlockChainConnector getEVMChainConnector(EVMChain _shortname, String _forced_nodeURL, boolean _haltOnRPCNodeSelectionFail) {
		return new EVMBlockChainConnector(_shortname, _forced_nodeURL, _haltOnRPCNodeSelectionFail);
	}

	public static String makeSignedRequest(String _hexData, int _txRetryThreshold, int _confirmTimeInSecondsBeforeRetry, EVMBlockChainConnector _connector, Credentials _creds, String _contractAddress, boolean _haltOnUnconfirmedTX) {
		return makeSignedRequest(_hexData, _txRetryThreshold, _confirmTimeInSecondsBeforeRetry, _connector, _creds, _contractAddress, _connector.getChaininfo().getFallbackGasLimitInUnits(), _haltOnUnconfirmedTX);
	}

	public static String makeSignedRequest(String _hexData, int _txRetryThreshold, int _confirmTimeInSecondsBeforeRetry, EVMBlockChainConnector _connector, Credentials _creds, String _contractAddress, String _gaslimitInUnits, boolean _haltOnUnconfirmedTX) {
		String txHASH = null;
		int txCounter = 0;
		boolean txAttemptsCompleted = false;
		while (!txAttemptsCompleted && txCounter <= _txRetryThreshold) {
			LOGGER.info("Sending request: " + _hexData);

			txHASH = EVMUtils.sendSignedRawTX(_connector, _creds, _contractAddress, _hexData, _confirmTimeInSecondsBeforeRetry, _gaslimitInUnits, _haltOnUnconfirmedTX);
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
		return txHASH;
	}

	public static String makeUnsignedRequest(String _hexData, String _contractAddress, EVMBlockChainConnector _connector) {
		int txCounter = 0;
		boolean txCallCompleted = false;
		while (!txCallCompleted && txCounter <= _connector.getTxRetryThreshold()) {
			//LOGGER.info("Sending request: " + _hexData);
			String reply = EVMUtils.sendUnsignedRawCALL(_hexData, _contractAddress, _connector, _connector.isHaltOnFailedCall());
			return reply;
		}
		return null;
	}

	public static String makeUnsignedRequest(String _hexData, String _contractAddress, EVMBlockChainConnector _connector, int _txRetryThreshold, int _confirmTimeInSecondsBeforeRetry, boolean _haltOnFailedCall) {
		int txCounter = 0;
		boolean txCallCompleted = false;
		while (!txCallCompleted && txCounter <= _txRetryThreshold) {
			LOGGER.debug("Sending request: " + _hexData);
			String reply = EVMUtils.sendUnsignedRawCALL(_hexData, _contractAddress, _connector, _haltOnFailedCall);
			return reply;
		}
		return null;
	}

	public static boolean verify(String _signature, String _message, String _address) {
		byte[] msgHash = _message.getBytes();

		String r_string = "0x" + _signature.replace("0x","").substring(0, 64);
		String s_string = "0x" + _signature.replace("0x","").substring(64, 128);
		String v_string = "0x" + _signature.replace("0x","").substring(128, 130);

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
				if (addressRecovered.equals(_address)) match = true;
			}

		} catch (SignatureException e) {
			e.printStackTrace();
		} 

		return match;
	}

	public static EVMPortfolio getEVMPortfolioForAccount(EVMBlockChainUltraConnector _ultra_connector, String _account_addr) {
		return getEVMPortfolioForAccount(_ultra_connector, _account_addr, true, null, null, false);
	}

	public static EVMPortfolio getEVMPortfolioForAccount(EVMBlockChainUltraConnector _ultra_connector, String _account_addr, boolean debug) {
		return getEVMPortfolioForAccount(_ultra_connector, _account_addr, true, null, null, debug);
	}

	public static EVMPortfolio getEVMPortfolioForAccount(EVMBlockChainUltraConnector _ultra_connector, String _account_addr, boolean _checkForNFTs, HashMap<String, Boolean> _erc20_restriction, HashMap<String, Boolean> _nft_restriction, boolean _debug) {
		HashMap<EVMChain, EVMChainPortfolio> chainportfolio = new HashMap<>();

		for (EVMChain chain: EVMChain.values()) {
			if (_debug) System.out.println("chain: " + chain);

			EVMChainInfo chainInfo = EVMUtils.getEVMChainInfo(chain);
			if (BlockchainType.valueOf(chainInfo.getType()) == _ultra_connector.getChainType()) {

				/**
				 * Verify RPC node connectivity
				 */
				EVMBlockChainConnector connector_temp = _ultra_connector.getConnectors().get(chain);
				if (null == connector_temp) {
					LOGGER.debug("We dont have a valid connector for chain " + chain);
					LOGGER.debug("Skipping and will move on ..");
				} else {
					BigInteger latestBlockNr = EVMUtils.getLatestBlockNumberOpportunistic(connector_temp);
					if (null == latestBlockNr) {
						LOGGER.warn("Seems we cant get a good connection to the chain " + chain);
						LOGGER.info("Skipping and will move on ..");
					} else {

						if (_debug) LOGGER.info("We have a valid connector for chain " + chain +", latestBlockNr=" + latestBlockNr);

						HashMap<String, EVMAccountBalance> erc20tokens = new HashMap<>();
						HashMap<String, EVMNftAccountBalance> erc721tokens = new HashMap<>();
						HashMap<String, EVMNftAccountBalance> erc1155tokens = new HashMap<>();
						EVMAccountBalance native_balance = null;

						EVMBlockChainConnector connector = _ultra_connector.getConnectors().get(chain);

						if (null != connector) {
							BigInteger txCount = EVMUtils.getTransactionCountForAddress(connector, _account_addr);

							/**
							 * Check native balance
							 */
							native_balance = EVMUtils.getAccountNativeBalance(connector, _account_addr);
							if ((null != native_balance) && (!native_balance.isEmpty())) {

								/**
								 * Check presence of known ERC-20 tokens on chain
								 */
								ERC20TokenIndex idx = chainInfo.getTokenIndex();
								for (String tokenName: idx.getTokens().keySet()) {
									if (_debug) System.out.println(" ... " + tokenName);
									if (false ||
											(null == _erc20_restriction) || // no restriction
											((null != _erc20_restriction) && (null != _erc20_restriction.get(tokenName))) || // restriction but match
											false) {
										EVMERC20TokenInfo tokenInfo = idx.getTokens().get(tokenName);
										if (isEVMNoiseToken(tokenInfo.getCategory())) {
											// skip
										} else {
											EVMAccountBalance token_balance = EVMUtils.getAccountBalanceForERC20Token(connector, _account_addr, tokenInfo);

											// Decimals debug
											if (_debug && (chain == EVMChain.POLYGON) && ("WETH".equals(tokenName))) {
												System.out.println(tokenName + " token_balance: " + token_balance.toString());
											}

											if (!token_balance.isEmpty()) {
												erc20tokens.put(tokenName, token_balance);
											}
										}
									}
								}

								/**
								 * Check presence of known ERC-721 tokens on chain
								 */
								if (_checkForNFTs) {
									EVMNFTIndex idx_nft = chainInfo.getNftindex();
									for (String nftName: idx_nft.getErc721tokens().keySet()) {
										if (false ||
												(null == _nft_restriction) || // no restriction
												((null != _nft_restriction) && (null != _nft_restriction.get(nftName))) || // restriction but match
												false) {
											EVMERC721TokenInfo nftInfo = idx_nft.getErc721tokens().get(nftName);
											if (isEVMNoiseToken(nftInfo.getCategory())) {
												// skip
											} else {
												EVMNftAccountBalance nft_balance = EVMUtils.getAccountBalanceForERC721Token(connector, _account_addr, nftInfo);
												if (!nft_balance.isEmpty()) {
													erc721tokens.put(nftName, nft_balance);
												}
											}
										}
									}
								}

								/**
								 * Check presence of known ERC-1155 tokens on chain
								 */
								/*
								NFTIndex idx_nft_1155 = chainInfo.getNftindex();
								for (String nftName: idx_nft_1155.getErc1155tokens().keySet()) {
									EVMERC1155TokenInfo nftInfo = idx_nft_1155.getErc1155tokens().get(nftName);
									if (false ||
											(TokenCategory.valueOf(nftInfo.getCategory()) == TokenCategory.UNKNOWN) ||
											(TokenCategory.valueOf(nftInfo.getCategory()) == TokenCategory.SCAM) ||
											false) {
										// skip
									} else {
										EVMNftAccountBalance nft_balance = EVMUtils.getAccountBalanceForERC1155Token(connector, account_addr, nftInfo);
										if (!nft_balance.isEmpty()) {
											erc1155tokens.put(nftName, nft_balance);
										}
									}
								}
								 */

								EVMChainPortfolio portfolio = new EVMChainPortfolio(_account_addr, chain.toString(), native_balance, txCount.toString(), erc20tokens, erc721tokens, erc1155tokens);
								chainportfolio.put(chain, portfolio);
							}
						}
					}
				}
			}
		}

		return new EVMPortfolio(_account_addr, chainportfolio, System.currentTimeMillis()/1000L);
	}

	private static boolean isEVMNoiseToken(String _category) {
		if (false ||
				(TokenCategory.valueOf(_category) == TokenCategory.UNKNOWN) ||
				(TokenCategory.valueOf(_category) == TokenCategory.SCAM) ||
				(TokenCategory.valueOf(_category) == TokenCategory.WRECKED) ||
				false) {
			return true;
		}
		return false;
	}

	public static EVMPortfolioDiffResult getEVMPortfolioAsString(EVMPortfolioSimple _portfolio) {
		return getEVMPortfolioDiff(_portfolio, null);
	}


	public static ArrayList<Credentials> getFirst10AccountsFromMnemonic(String _mnemonic, String _passphrase) {
		ArrayList<Credentials> creds = new ArrayList<Credentials>();

		LOGGER.debug("Recovering wallet from mnemonic \" " + _mnemonic + " \" and passphrase \"" + _passphrase + "\"");

		// derivationPathETH0
		byte[] seed0 = MnemonicUtils.generateSeed(_mnemonic, _passphrase);
		Bip32ECKeyPair masterKeypair0 = Bip32ECKeyPair.generateKeyPair(seed0);
		Bip32ECKeyPair childKeypair0 = Bip32ECKeyPair.deriveKeyPair(masterKeypair0, BlockchainDetailsGeneric.derivationPathETH0);
		Credentials cred0 = Credentials.create(childKeypair0);

		creds.add(cred0);

		// derivationPathETH1
		byte[] seed1 = MnemonicUtils.generateSeed(_mnemonic, _passphrase);
		Bip32ECKeyPair masterKeypair1 = Bip32ECKeyPair.generateKeyPair(seed1);
		Bip32ECKeyPair childKeypair1 = Bip32ECKeyPair.deriveKeyPair(masterKeypair1, BlockchainDetailsGeneric.derivationPathETH1);
		Credentials cred1 = Credentials.create(childKeypair1);
		creds.add(cred1);

		// derivationPathETH2
		byte[] seed2 = MnemonicUtils.generateSeed(_mnemonic, _passphrase);
		Bip32ECKeyPair masterKeypair2 = Bip32ECKeyPair.generateKeyPair(seed2);
		Bip32ECKeyPair childKeypair2 = Bip32ECKeyPair.deriveKeyPair(masterKeypair2, BlockchainDetailsGeneric.derivationPathETH2);
		Credentials cred2 = Credentials.create(childKeypair2);
		creds.add(cred2);

		// derivationPathETH3
		byte[] seed3 = MnemonicUtils.generateSeed(_mnemonic, _passphrase);
		Bip32ECKeyPair masterKeypair3 = Bip32ECKeyPair.generateKeyPair(seed3);
		Bip32ECKeyPair childKeypair3 = Bip32ECKeyPair.deriveKeyPair(masterKeypair3, BlockchainDetailsGeneric.derivationPathETH3);
		Credentials cred3 = Credentials.create(childKeypair3);
		creds.add(cred3);

		// derivationPathETH4
		byte[] seed4 = MnemonicUtils.generateSeed(_mnemonic, _passphrase);
		Bip32ECKeyPair masterKeypair4 = Bip32ECKeyPair.generateKeyPair(seed4);
		Bip32ECKeyPair childKeypair4 = Bip32ECKeyPair.deriveKeyPair(masterKeypair4, BlockchainDetailsGeneric.derivationPathETH4);
		Credentials cred4 = Credentials.create(childKeypair4);
		creds.add(cred4);

		// derivationPathETH5
		byte[] seed5 = MnemonicUtils.generateSeed(_mnemonic, _passphrase);
		Bip32ECKeyPair masterKeypair5 = Bip32ECKeyPair.generateKeyPair(seed5);
		Bip32ECKeyPair childKeypair5 = Bip32ECKeyPair.deriveKeyPair(masterKeypair5, BlockchainDetailsGeneric.derivationPathETH5);
		Credentials cred5 = Credentials.create(childKeypair5);
		creds.add(cred5);

		// derivationPathETH6
		byte[] seed6 = MnemonicUtils.generateSeed(_mnemonic, _passphrase);
		Bip32ECKeyPair masterKeypair6 = Bip32ECKeyPair.generateKeyPair(seed6);
		Bip32ECKeyPair childKeypair6 = Bip32ECKeyPair.deriveKeyPair(masterKeypair6, BlockchainDetailsGeneric.derivationPathETH6);
		Credentials cred6 = Credentials.create(childKeypair6);
		creds.add(cred6);

		// derivationPathETH7
		byte[] seed7 = MnemonicUtils.generateSeed(_mnemonic, _passphrase);
		Bip32ECKeyPair masterKeypair7 = Bip32ECKeyPair.generateKeyPair(seed7);
		Bip32ECKeyPair childKeypair7 = Bip32ECKeyPair.deriveKeyPair(masterKeypair7, BlockchainDetailsGeneric.derivationPathETH7);
		Credentials cred7 = Credentials.create(childKeypair7);
		creds.add(cred7);

		// derivationPathETH8
		byte[] seed8 = MnemonicUtils.generateSeed(_mnemonic, _passphrase);
		Bip32ECKeyPair masterKeypair8 = Bip32ECKeyPair.generateKeyPair(seed8);
		Bip32ECKeyPair childKeypair8 = Bip32ECKeyPair.deriveKeyPair(masterKeypair8, BlockchainDetailsGeneric.derivationPathETH8);
		Credentials cred8 = Credentials.create(childKeypair8);
		creds.add(cred8);

		// derivationPathETH9
		byte[] seed9 = MnemonicUtils.generateSeed(_mnemonic, _passphrase);
		Bip32ECKeyPair masterKeypair9 = Bip32ECKeyPair.generateKeyPair(seed9);
		Bip32ECKeyPair childKeypair9 = Bip32ECKeyPair.deriveKeyPair(masterKeypair9, BlockchainDetailsGeneric.derivationPathETH9);
		Credentials cred9 = Credentials.create(childKeypair9);
		creds.add(cred9);

		return creds;
	}


	public static ArrayList<Credentials> getFirst10AccountsFromMnemonic(String _mnemonic) {
		return getFirst10AccountsFromMnemonic(_mnemonic, "");
	}

	public static void printFirst10AccountsFromMnemonic(String _mnemonic) {
		ArrayList<Credentials> creds = EVMUtils.getFirst10AccountsFromMnemonic(_mnemonic);
		int counter = 0;
		for (Credentials cred: creds) {
			String hex = cred.getEcKeyPair().getPrivateKey().toString(16);
			System.out.println("Account #" + counter + " public=" + cred.getAddress() + " private=0x" + hex);
			counter++;
		}
	}

	public static EVMPortfolioDiffResult getEVMPortfolioDiff(EVMPortfolioSimple _portfolio, EVMPortfolioSimple _portfolio_ref) {
		StringBuffer sb = new StringBuffer();
		sb.append("---------------------------------------------------------------------------------------\n");
		sb.append("Portfolio summary for account: " + _portfolio.getAccount_address() + "\n\n");
		EVMPortfolioDiff portfolio_diff = null;
		double minValueToTrack = 0.0001d;
		int symbol_char_offset = 45;

		boolean ref_portfolio_exists = false;
		String breakline = "---------------------------------------------------------------------------------------";
		String breaklinemini = "----------------------------------------------";

		if (null != _portfolio_ref) ref_portfolio_exists = true;

		for (EVMChain chain: _portfolio.getChainportfolio().keySet()) {
			EVMChainInfo chainInfo = EVMUtils.getEVMChainInfo(chain);
			EVMChainPortfolio chain_portfolio = _portfolio.getChainportfolio().get(chain);
			EVMChainPortfolio chain_portfolio_ref = null;
			EVMChainPortfolioDiff chain_portfolio_diff = null;

			if (ref_portfolio_exists) chain_portfolio_ref = _portfolio_ref.getChainportfolio().get(chain);
			/**
			 * Check native balance
			 */
			int native_name_offset = 73;
			EVMAccountBalance native_balance = chain_portfolio.getNativeBalance();
			if (!native_balance.isEmpty()) {
				if (ref_portfolio_exists) {
					BigDecimal native_balance_refBD = null;
					if (null == chain_portfolio_ref) {
						native_balance_refBD = new BigDecimal(0);
					} else {
						EVMAccountBalance native_balance_ref = chain_portfolio_ref.getNativeBalance();
						if (native_balance_ref == null) {
							native_balance_refBD = new BigDecimal(0);
						} else {
							native_balance_refBD = new BigDecimal(native_balance_ref.getBalanceInETH());
						}
					}
					BigDecimal native_balance_BD = new BigDecimal(native_balance.getBalanceInETH());
					BigDecimal native_balance_diff = native_balance_BD.subtract(native_balance_refBD).setScale(2, RoundingMode.HALF_UP);
					if (native_balance_diff.compareTo(BigDecimal.valueOf(minValueToTrack)) > 0) {
						sb.append(StringsUtils.cutAndPadStringToN(chain + " balance: ", native_name_offset) + StringsUtils.cutAndPadStringToN(" (" + native_balance.getBalanceInETH() + " " + chainInfo.getNativeCurrency().getSymbol() + ")", symbol_char_offset) + " diff: +" + native_balance_diff + "\n");

						// Handle cases where new chain activity is noted
						if (null == chain_portfolio_ref) chain_portfolio_ref = new EVMChainPortfolio();
						if (null == chain_portfolio_diff) chain_portfolio_diff = new EVMChainPortfolioDiff();

						// Store our diff
						chain_portfolio_diff.setAccount_address(chain_portfolio.getAccount_address());
						chain_portfolio_diff.setChain(chain.toString());

						EVMAccountBalance native_balance_ref = null;
						if (null == chain_portfolio_ref.getNativeBalance()) {
							native_balance_ref = new EVMAccountBalance("0", "0", "0", chainInfo.getNativeCurrency(), true);
						} else {
							native_balance_ref = chain_portfolio_ref.getNativeBalance();
						}

						BigInteger native_balance_diff_wei = new BigInteger(native_balance.getBalanceInWEI()).subtract(new BigInteger(native_balance_ref.getBalanceInWEI()));
						BigDecimal native_balance_diff_in_gwei = Convert.fromWei(native_balance_diff_wei.toString(), Unit.GWEI);		
						chain_portfolio_diff.setNativeBalance(new EVMAccountBalance(native_balance_diff_wei.toString(), native_balance_diff_in_gwei.toString(), native_balance_diff.toString(), chainInfo.getNativeCurrency(), false));

					} else if (native_balance_diff.compareTo(BigDecimal.valueOf(-minValueToTrack)) < 0) {
						if (native_balance_diff.toString().startsWith("-")) {
							sb.append(StringsUtils.cutAndPadStringToN(chain + " balance", native_name_offset) + StringsUtils.cutAndPadStringToN(" (" + native_balance.getBalanceInETH() + " " + chainInfo.getNativeCurrency().getSymbol() + ")", symbol_char_offset) + " diff: " + native_balance_diff + "\n");
						} else {
							sb.append(StringsUtils.cutAndPadStringToN(chain + " balance", native_name_offset) + StringsUtils.cutAndPadStringToN(" (" + native_balance.getBalanceInETH() + " " + chainInfo.getNativeCurrency().getSymbol() + ")", symbol_char_offset) + "\n");
						}

						// Handle cases where new chain activity is noted
						if (null == chain_portfolio_ref) chain_portfolio_ref = new EVMChainPortfolio();
						if (null == chain_portfolio_diff) chain_portfolio_diff = new EVMChainPortfolioDiff();

						// Store our diff
						chain_portfolio_diff.setAccount_address(chain_portfolio.getAccount_address());
						chain_portfolio_diff.setChain(chain.toString());

						EVMAccountBalance native_balance_ref = null;
						if (null == chain_portfolio_ref.getNativeBalance()) {
							native_balance_ref = new EVMAccountBalance("0", "0", "0", chainInfo.getNativeCurrency(), true);
						} else {
							native_balance_ref = chain_portfolio_ref.getNativeBalance();
						}

						BigInteger native_balance_diff_wei = new BigInteger(native_balance.getBalanceInWEI()).subtract(new BigInteger(native_balance_ref.getBalanceInWEI()));
						BigDecimal native_balance_diff_in_gwei = Convert.fromWei(native_balance_diff_wei.toString(), Unit.GWEI);		
						chain_portfolio_diff.setNativeBalance(new EVMAccountBalance(native_balance_diff_wei.toString(), native_balance_diff_in_gwei.toString(), native_balance_diff.toString(), chainInfo.getNativeCurrency(), false));

					} else {
						sb.append(StringsUtils.cutAndPadStringToN(chain + " balance", native_name_offset) + StringsUtils.cutAndPadStringToN(" (" + native_balance.getBalanceInETH() + " " + chainInfo.getNativeCurrency().getSymbol() + ")", symbol_char_offset) + "\n");
					}
				} else {
					sb.append(StringsUtils.cutAndPadStringToN(chain + " balance", native_name_offset) + StringsUtils.cutAndPadStringToN(" (" + native_balance.getBalanceInETH() + " " + chainInfo.getNativeCurrency().getSymbol() + ")", symbol_char_offset) + "\n");
				}
				sb.append(StringsUtils.cutAndPadStringToN(" - txCount: " + chain_portfolio.getTxCount(), 20) + "\n");
				sb.append(breakline + "\n");

				/**
				 * ERC-20 tokens
				 */
				StringBuffer sb_20 = new StringBuffer();
				int erc20_name_offset = 24; // LP names need this ..
				int erc20_val_offset = 36; // for them meme tokens ..

				// when ERC20 tokens disappear we need to catch
				HashMap<String, EVMCurrency> token_currency = new HashMap<>();
				HashMap<String, EVMAccountBalance> erc20_tokens = new HashMap<>();

				if ((null != chain_portfolio_ref) && (null != chain_portfolio_ref.getErc20tokens())) {
					for (String tokenName: chain_portfolio_ref.getErc20tokens().keySet()) {
						EVMAccountBalance token_balance_ref = chain_portfolio_ref.getErc20tokens().get(tokenName);
						token_currency.put(tokenName, token_balance_ref.getCurrency());
						erc20_tokens.put(tokenName, token_balance_ref);
					}
				}
				for (String tokenName: chain_portfolio.getErc20tokens().keySet()) {
					EVMAccountBalance token_balance = chain_portfolio.getErc20tokens().get(tokenName);
					token_currency.put(tokenName, token_balance.getCurrency());
					erc20_tokens.put(tokenName, token_balance);
				}

				for (String tokenName: erc20_tokens.keySet()) {

					EVMERC20TokenInfo tokenInfo = chainInfo.getTokenIndex().getTokens().get(tokenName);
					if (null == tokenInfo) {
						LOGGER.warn("No tokenInfo available for token " + tokenName + ", chain " + chain + ", removed?");
					} else {

						EVMAccountBalance token_balance = chain_portfolio.getErc20tokens().get(tokenName);
						if (ref_portfolio_exists) {

							// ref portfolio
							BigDecimal token_balance_refBD = null;
							if (null == chain_portfolio_ref) {
								token_balance_refBD = new BigDecimal(0);
							} else {
								EVMAccountBalance token_balance_ref = chain_portfolio_ref.getErc20tokens().get(tokenName);
								if (token_balance_ref == null) {
									token_balance_refBD = new BigDecimal(0);
								} else {
									token_balance_refBD = new BigDecimal(token_balance_ref.getBalanceInETH());
								}
							}

							// new portfolio (not null)
							BigDecimal token_balance_BD = null;
							if (token_balance == null) {
								token_balance = new EVMAccountBalance("0", "0", "0", token_currency.get(tokenName), true);
								token_balance_BD = new BigDecimal(0);
							} else {
								token_balance_BD = new BigDecimal(token_balance.getBalanceInETH());
							}

							BigDecimal token_balance_diff = token_balance_BD.subtract(token_balance_refBD).setScale(2, RoundingMode.HALF_UP);
							if (token_balance_diff.compareTo(BigDecimal.valueOf(minValueToTrack)) > 0) {
								sb_20.append(" * [ERC20] " + StringsUtils.cutAndPadStringToN(tokenName,erc20_name_offset) + ": " + StringsUtils.cutAndPadStringToN(token_balance.getBalanceInGWEIPrettyPrint() + " gwei", erc20_val_offset) + StringsUtils.cutAndPadStringToN(" (" + token_balance.getBalanceInETHPrettyPrint() + " " + tokenName + ")", symbol_char_offset) + " diff: +" + token_balance_diff + "\n");

								// Handle cases where new chain activity is noted
								if (null == chain_portfolio_ref) chain_portfolio_ref = new EVMChainPortfolio();
								if (null == chain_portfolio_diff) chain_portfolio_diff = new EVMChainPortfolioDiff();

								// Store our diff
								chain_portfolio_diff.setAccount_address(chain_portfolio.getAccount_address());
								chain_portfolio_diff.setChain(chain.toString());

								EVMAccountBalance token_balance_ref = null;
								if (null == chain_portfolio_ref.getErc20tokens().get(tokenName)) {
									token_balance_ref = new EVMAccountBalance("0", "0", "0", chainInfo.getNativeCurrency(), true);
								} else {
									token_balance_ref = chain_portfolio_ref.getErc20tokens().get(tokenName);
								}

								BigInteger token_balance_diff_wei = new BigInteger(token_balance.getBalanceInWEI()).subtract(new BigInteger(token_balance_ref.getBalanceInWEI()));
								BigDecimal token_balance_diff_in_gwei = Convert.fromWei(token_balance_diff_wei.toString(), Unit.GWEI);		

								HashMap<String, EVMAccountBalance> erc20tokens_diff = chain_portfolio_diff.getErc20tokens();
								erc20tokens_diff.put(tokenName, new EVMAccountBalance(token_balance_diff_wei.toString(), token_balance_diff_in_gwei.toString(), token_balance_diff.toString(), new EVMCurrency(tokenInfo.getName(), tokenInfo.getSymbol(), tokenInfo.getDecimals()), false));
								chain_portfolio_diff.setErc20tokens(erc20tokens_diff);   

							} else if (token_balance_diff.compareTo(BigDecimal.valueOf(minValueToTrack)) < 0) {
								if (token_balance_diff.toString().startsWith("-")) {
									sb_20.append(" * [ERC20] " + StringsUtils.cutAndPadStringToN(tokenName,erc20_name_offset) + ": " + StringsUtils.cutAndPadStringToN(token_balance.getBalanceInGWEIPrettyPrint() + " gwei", erc20_val_offset) + StringsUtils.cutAndPadStringToN(" (" + token_balance.getBalanceInETHPrettyPrint() + " " + tokenName + ")", symbol_char_offset) + " diff: " + token_balance_diff + "\n");

									// Handle cases where new chain activity is noted
									if (null == chain_portfolio_ref) chain_portfolio_ref = new EVMChainPortfolio();
									if (null == chain_portfolio_diff) chain_portfolio_diff = new EVMChainPortfolioDiff();

									// Store our diff
									chain_portfolio_diff.setAccount_address(chain_portfolio.getAccount_address());
									chain_portfolio_diff.setChain(chain.toString());

									EVMAccountBalance token_balance_ref = null;
									if (null == chain_portfolio_ref.getErc20tokens().get(tokenName)) {
										token_balance_ref = new EVMAccountBalance("0", "0", "0", chainInfo.getNativeCurrency(), true);
									} else {
										token_balance_ref = chain_portfolio_ref.getErc20tokens().get(tokenName);
									}

									BigInteger token_balance_diff_wei = new BigInteger(token_balance.getBalanceInWEI()).subtract(new BigInteger(token_balance_ref.getBalanceInWEI()));
									BigDecimal token_balance_diff_in_gwei = Convert.fromWei(token_balance_diff_wei.toString(), Unit.GWEI);		

									HashMap<String, EVMAccountBalance> erc20tokens_diff = chain_portfolio_diff.getErc20tokens();
									erc20tokens_diff.put(tokenName, new EVMAccountBalance(token_balance_diff_wei.toString(), token_balance_diff_in_gwei.toString(), token_balance_diff.toString(), new EVMCurrency(tokenInfo.getName(), tokenInfo.getSymbol(), tokenInfo.getDecimals()), false));
									chain_portfolio_diff.setErc20tokens(erc20tokens_diff);  

								} else {
									sb_20.append(" * [ERC20] " + StringsUtils.cutAndPadStringToN(tokenName,erc20_name_offset) + ": " + StringsUtils.cutAndPadStringToN(token_balance.getBalanceInGWEIPrettyPrint() + " gwei", erc20_val_offset) + StringsUtils.cutAndPadStringToN(" (" + token_balance.getBalanceInETHPrettyPrint() + " " + tokenName + ")", symbol_char_offset) + "\n");
								}  

							} else {
								sb_20.append(" * [ERC20] " + StringsUtils.cutAndPadStringToN(tokenName,erc20_name_offset) + ": " + StringsUtils.cutAndPadStringToN(token_balance.getBalanceInGWEIPrettyPrint() + " gwei", erc20_val_offset) + StringsUtils.cutAndPadStringToN(" (" + token_balance.getBalanceInETHPrettyPrint() + " " + tokenName + ")", symbol_char_offset) + "\n");
							}
						} else {
							BigDecimal token_balance_BD = null;
							token_balance_BD = new BigDecimal(token_balance.getBalanceInETH());
							sb_20.append(" * [ERC20] " + StringsUtils.cutAndPadStringToN(tokenName,erc20_name_offset) + ": " + StringsUtils.cutAndPadStringToN(token_balance.getBalanceInGWEI() + " gwei", erc20_val_offset) + StringsUtils.cutAndPadStringToN(" (" + token_balance_BD.setScale(0, RoundingMode.HALF_UP) + " " + tokenName + ")", symbol_char_offset) + "\n");
						}
					}
				}
				if (chain_portfolio.getErc20tokens().keySet().size()>0) sb.append(sb_20.toString());

				/**
				 * ERC-721 tokens
				 */
				StringBuffer sb_721 = new StringBuffer();
				for (String nftName: chain_portfolio.getErc721tokens().keySet()) {
					EVMNftAccountBalance nft_balance = chain_portfolio.getErc721tokens().get(nftName);
					String unit = "nft";
					BigInteger nft_bal_BI = new BigInteger(nft_balance.getBalance());
					if (nft_bal_BI.compareTo(BigInteger.ONE) > 0) unit = "nfts";
					sb_721.append(" * [ERC721] " + StringsUtils.cutAndPadStringToN(nftName,23) + ": " + StringsUtils.cutAndPadStringToN(nft_bal_BI + " " + unit, 16) + "\n");
				}
				if (chain_portfolio.getErc721tokens().keySet().size()>0) {
					if (!chain_portfolio.getErc20tokens().keySet().isEmpty()) sb.append(breaklinemini + "\n");
					sb.append(sb_721.toString());
				}

				/**
				 * ERC-1155 tokens
				 */
				StringBuffer sb_1155 = new StringBuffer();
				for (String nftName: chain_portfolio.getErc1155tokens().keySet()) {
					if (sb_1155.isEmpty()) sb.append(sb_1155.toString() + "\n");
					EVMNftAccountBalance nft_balance = chain_portfolio.getErc1155tokens().get(nftName);
					sb_1155.append(" * [ERC1155] " + StringsUtils.cutAndPadStringToN(nftName,23) + ": " + StringsUtils.cutAndPadStringToN(nft_balance.getBalance() + " nft", 8));
				}
				if (chain_portfolio.getErc1155tokens().keySet().size()>0) {
					if (!chain_portfolio.getErc20tokens().keySet().isEmpty()) sb.append(breaklinemini + "\n");
					System.out.println(sb_1155.toString() + "\n");
				}

				// No ERC20, ERC721 or ERC1155 tokens
				if (chain_portfolio.getErc20tokens().keySet().isEmpty() && chain_portfolio.getErc721tokens().keySet().isEmpty() && chain_portfolio.getErc1155tokens().keySet().isEmpty()) {
					sb.append(" x [no ERC20/ERC721/ERC1155 tokens]\n");
				}
				sb.append("\n");
			}

			// Update our portfolio diff
			if (null != chain_portfolio_diff) {
				if (null == portfolio_diff) {
					portfolio_diff = new EVMPortfolioDiff();
					portfolio_diff.setAccount_address(chain_portfolio_diff.getAccount_address());
				}
				HashMap<EVMChain, EVMChainPortfolioDiff> chainportfolio_diff_existing = portfolio_diff.getChainportfolio_diff();
				chainportfolio_diff_existing.put(chain, chain_portfolio_diff);
				portfolio_diff.setChainportfolio_diff(chainportfolio_diff_existing);
			}

		}

		return new EVMPortfolioDiffResult(sb.toString(), portfolio_diff);
	}

	public static void updatePortfolioSnapshot(EVMPortfolio _chainPortfolio, String _snapshotfolder) {
		String json = JSONUtils.createJSONFromPOJO(_chainPortfolio);
		if ((null != json) && (json.length() > 10)) {
			try {
				FilesUtils.createFolderUnlessExists(_snapshotfolder);
				FilesUtils.writeToFileUNIX(json, _snapshotfolder + "/" + _chainPortfolio.getAccount_address() + ".json");
			} catch (Exception e) {
				LOGGER.error("Unable to write to " + _snapshotfolder);
				SystemUtils.halt();
			}
		} else {
			LOGGER.error("Malformed snapshot json?");
			SystemUtils.halt();
		}
	}

	public static EVMPortfolio readLatestPortfolioSnapshot(String _address, String _snapshotfolder) {
		String filePath = _snapshotfolder + "/" + _address + ".json";
		File f = new File(filePath);
		if (f.exists()) {
			String json = FilesUtils.readAllFromFileWithPath(filePath);
			EVMPortfolio chainPortfolioSnapshot = JSONUtils.createPOJOFromJSON(json, EVMPortfolio.class);
			return chainPortfolioSnapshot;
		} else {
			return null;
		}
	}

	public static String resetPendingTransactionsForAccount(EVMBlockChainConnector _connector, Credentials _cred) {
		EVMNativeValue val = new EVMNativeValue(new BigDecimal(0), Unit.ETHER);

		// Get the lowest existing "stuck" nonce transaction
		BigInteger nonce = null;
		boolean grabbed_nonce = false;
		int tryCounter = 0;
		while (!grabbed_nonce && (tryCounter<5)) {
			try {
				EthGetTransactionCount ethGetTransactionCount = _connector.getProvider_instance().ethGetTransactionCount(_cred.getAddress(), DefaultBlockParameterName.PENDING).send();
				nonce =  ethGetTransactionCount.getTransactionCount();
				grabbed_nonce = true;
			} catch (IOException e) {
				LOGGER.warn("Caught exception while grabbing nonce: " + e.getMessage());
				SystemUtils.sleepInSeconds(5);
			}
			tryCounter++;
		}

		if (null == nonce) {
			LOGGER.error("Unable to get the nonce for " + _cred.getAddress());
			SystemUtils.halt();
		}

		// perform the reset
		String txhash = EVMUtils.sendTXWithNativeCurrency_LegacyPricingMechanism_WithCustomNonce(_connector, _cred, _cred.getAddress(), val, false, nonce, true);
		return txhash;
	}

	public static String transferNativeCurrencyOnChain(EVMBlockChainConnector _connector, Credentials _from, String _to, double _amount) {
		String txhash = EVMUtils.sendTXWithNativeCurrency_LegacyPricingMechanism(_connector, _from, _to, new EVMNativeValue(new BigDecimal(_amount), Unit.ETHER), true);
		return txhash;
	}

	public static void sanityCheckWithEarlyExit(EVMBlockChainConnector _connector) {
		BigInteger latest_blocknr = getLatestBlockNumber(_connector);
		if (null == latest_blocknr) {
			LOGGER.info("Unable to get the latest blocknr from our RPC node, exiting..");
			SystemUtils.halt();
		} else {
			LOGGER.info("Initial sanitycheck passed, latest blocknr: " + latest_blocknr);
		}
	}

	@SuppressWarnings("serial")
	public static void checkEthPolyPortfolio(String _publicaddress, boolean _haltOnRPCNodeSelectionFail) {
		LOGGER.info("checkEthPolyPortfolio init()");
		LOGGER.info(" - account: " + _publicaddress);

		// Launch RPC node connectors for POLYGON/ETHEREUM
		EVMBlockChainUltraConnector ultra_connector = new EVMBlockChainUltraConnector(BlockchainType.PUBLIC,
				new HashMap<String, Boolean>() {{
					this.put(EVMChain.POLYGON.toString(), true);
					this.put(EVMChain.ETH.toString(), true);
				}}, _haltOnRPCNodeSelectionFail);
		System.out.println("EVMBlockChainUltraConnector ready ..");	

		// Print EVM portfolio
		EVMPortfolio evm_chainPortfolio = EVMUtils.getEVMPortfolioForAccount(ultra_connector, _publicaddress);
		EVMPortfolioSimple evm_chainPortfolio_simple = EVMUtils.createEVMPortfolioSimple(evm_chainPortfolio);
		EVMPortfolioDiffResult portfolio_diff = EVMUtils.getEVMPortfolioAsString(evm_chainPortfolio_simple);
		System.out.println(portfolio_diff.getPortfolio_full_str());
	}

	public static void checkFullPortfolio(String _publicaddress, boolean _haltOnRPCNodeSelectionFail) {
		LOGGER.info("checkFullPortfolio init()");
		LOGGER.info(" - account: " + _publicaddress);

		// Launch RPC node connectors for all known chains
		EVMBlockChainUltraConnector ultra_connector = new EVMBlockChainUltraConnector(BlockchainType.PUBLIC, _haltOnRPCNodeSelectionFail);
		System.out.println("EVMBlockChainUltraConnector ready ..");	

		// Print EVM portfolio
		EVMPortfolio evm_chainPortfolio = EVMUtils.getEVMPortfolioForAccount(ultra_connector, _publicaddress);
		EVMPortfolioSimple evm_chainPortfolio_simple = EVMUtils.createEVMPortfolioSimple(evm_chainPortfolio);
		EVMPortfolioDiffResult portfolio_diff = EVMUtils.getEVMPortfolioAsString(evm_chainPortfolio_simple);
		System.out.println(portfolio_diff.getPortfolio_full_str());
	}

	@SuppressWarnings("serial")
	public static void checkLocalPortfolio(String _publicaddress, EVMChain _chain, boolean _haltOnRPCNodeSelectionFail) {
		LOGGER.info("checkLocalPortfolio init()");
		LOGGER.info(" - account: " + _publicaddress);

		if (true &&
				!_chain.toString().contains("GANACHE") &&
				!_chain.toString().contains("HARDHAT") &&
				true) {
			LOGGER.error("You sure you are connecting to a local ganache/hardhat chain?");
			LOGGER.error("Selected chain: " + _chain);
			SystemUtils.halt();
		}

		// Launch RPC node connectors for LOCAL networks
		EVMBlockChainUltraConnector ultra_connector = new EVMBlockChainUltraConnector(BlockchainType.LOCAL,
				new HashMap<String, Boolean>() {{
					this.put(_chain.toString(), true);
				}}, _haltOnRPCNodeSelectionFail);
		System.out.println("EVMBlockChainUltraConnector ready ..");	

		// Print EVM portfolio
		EVMPortfolio evm_chainPortfolio = EVMUtils.getEVMPortfolioForAccount(ultra_connector, _publicaddress);
		EVMPortfolioSimple evm_chainPortfolio_simple = EVMUtils.createEVMPortfolioSimple(evm_chainPortfolio);
		EVMPortfolioDiffResult portfolio_diff = EVMUtils.getEVMPortfolioAsString(evm_chainPortfolio_simple);
		System.out.println(portfolio_diff.getPortfolio_full_str());
	}


	public static void evmpingpong(EVMChain _chain, String wallet001_name, String _wallet001_privatekey, String wallet002_name, String _wallet002_privatekey, double _nativeCurrencyToSendBackAndForth, final int _nrIterations, boolean _haltOnRPCNodeSelectionFail) {
		LOGGER.info("evmpingpong init()");
		LOGGER.info(" - chain: " + _chain.toString());

		boolean haltOnUnconfirmedTX = true;
		EVMBlockChainConnector connector = new EVMBlockChainConnector(_chain, _haltOnRPCNodeSelectionFail);

		BigInteger latestBlockNR = EVMUtils.getLatestBlockNumber(connector);
		LOGGER.info("latestBlockNR: " + latestBlockNR);

		BigInteger chainID = EVMUtils.getChainId(connector);
		LOGGER.info("- chainID: " + chainID);

		BigDecimal networkGasPriceInGwei = EVMUtils.getCurrentNetworkGasPriceInGWEI(connector);
		LOGGER.info("- networkGasPriceInGwei: " + networkGasPriceInGwei.setScale(0, RoundingMode.HALF_UP));

		// Sanity check
		if (EVMUtils.isValidPrivateKey(wallet001_name)) {
			LOGGER.info("Did you mix up wallet name and key?");
			SystemUtils.halt();
		}
		if (!EVMUtils.isValidPrivateKey(_wallet001_privatekey)) {
			LOGGER.info("Not a valid private key: " + _wallet001_privatekey);
			SystemUtils.halt();
		}
		if (EVMUtils.isValidPrivateKey(wallet002_name)) {
			LOGGER.info("Did you mix up wallet name and key?");
			SystemUtils.halt();
		}
		if (!EVMUtils.isValidPrivateKey(_wallet002_privatekey)) {
			LOGGER.info("Not a valid private key: " + _wallet002_privatekey);
			SystemUtils.halt();
		}

		EVMLocalWallet wallet001 = new EVMLocalWallet(wallet001_name, AccountOrigin.PRIVATEKEY, "nopassword", _wallet001_privatekey);
		EVMLocalWallet wallet002 = new EVMLocalWallet(wallet002_name, AccountOrigin.PRIVATEKEY, "nopassword", _wallet002_privatekey);

		BigInteger preTxCountForWallet001 = EVMUtils.getTransactionCountForAddress(connector, wallet001.getAddress());
		BigInteger preTxCountForWallet002 = EVMUtils.getTransactionCountForAddress(connector, wallet002.getAddress());

		String preBalanceWallet001 = EVMUtils.getAccountNativeBalance(connector, wallet001.getAddress()).getBalanceInETH();
		String preBalanceWallet002 = EVMUtils.getAccountNativeBalance(connector, wallet002.getAddress()).getBalanceInETH();

		// Wallet balance sanity check before we begin
		BigDecimal wallet001_balanceBD = new BigDecimal(preBalanceWallet001);
		if (wallet001_balanceBD.compareTo(BigDecimal.valueOf(_nativeCurrencyToSendBackAndForth*2d)) > 0) {
			LOGGER.info(wallet001.getAddress() + " wallet001 balance: " + wallet001_balanceBD.setScale(6, RoundingMode.HALF_UP) + " " + connector.getChaininfo().getNativeCurrency().getSymbol());
		} else {
			LOGGER.error(wallet001.getAddress() + " wallet001 balance: " + wallet001_balanceBD.setScale(6, RoundingMode.HALF_UP) + " " + connector.getChaininfo().getNativeCurrency().getSymbol());
			LOGGER.error("You need at least " + _nativeCurrencyToSendBackAndForth*2d + " " + connector.getChaininfo().getNativeCurrency().getSymbol());
			SystemUtils.halt();
		}
		BigDecimal wallet002_balanceBD = new BigDecimal(preBalanceWallet002);
		if (wallet002_balanceBD.compareTo(BigDecimal.valueOf(_nativeCurrencyToSendBackAndForth*2d)) > 0) {
			LOGGER.info(wallet002.getAddress() + " wallet002 balance: " + wallet002_balanceBD.setScale(6, RoundingMode.HALF_UP) + " " + connector.getChaininfo().getNativeCurrency().getSymbol());
		} else {
			LOGGER.error(wallet002.getAddress() + " wallet002 balance: " + wallet002_balanceBD.setScale(6, RoundingMode.HALF_UP) + " " + connector.getChaininfo().getNativeCurrency().getSymbol());
			LOGGER.error("You need at least " + _nativeCurrencyToSendBackAndForth*2d + " " + connector.getChaininfo().getNativeCurrency().getSymbol());
			SystemUtils.halt();
		}

		for (int i=1; i<=_nrIterations; i++) {

			int rand1 = NumUtils.randomNumWithinRangeAsInt(1, 8);
			int rand2 = NumUtils.randomNumWithinRangeAsInt(1, 8);
			LOGGER.info("--> iteration " + i + " rand1: " + rand1 + " rand2: " + rand2);
			System.out.println("");
			System.out.println("");

			/**
			 * ping()
			 * - Send funds from wallet001 --> wallet002
			 */
			String txhash1 = EVMUtils.sendTXWithNativeCurrency_LegacyPricingMechanism(connector, wallet001.getCredentials(), wallet002.getAddress(), new EVMNativeValue(BigDecimal.valueOf(_nativeCurrencyToSendBackAndForth*rand1), Unit.ETHER), haltOnUnconfirmedTX);
			LOGGER.info("PING TX completed with tx hash: " + txhash1);
			System.out.println("");

			SystemUtils.sleepInSeconds(rand1*100);

			/**
			 * pong()
			 * - Send funds from wallet002 --> wallet001
			 */
			String txhash2 = EVMUtils.sendTXWithNativeCurrency_LegacyPricingMechanism(connector, wallet002.getCredentials(), wallet001.getAddress(), new EVMNativeValue(BigDecimal.valueOf(_nativeCurrencyToSendBackAndForth*rand2), Unit.ETHER), haltOnUnconfirmedTX);
			LOGGER.info("PONG TX completed with tx hash: " + txhash2);
			System.out.println("");

			if (i !=_nrIterations) SystemUtils.sleepInSeconds(rand2*100);

		}

		System.out.println("--------------------------------");
		System.out.println("PRE  - " + wallet001_name + " pub: " + wallet001.getAddress() + " txCount: " + preTxCountForWallet001 + " native balance: " + preBalanceWallet001);
		System.out.println("POST - " + wallet001_name + " pub: " + wallet001.getAddress() + " txCount: " + EVMUtils.getTransactionCountForAddress(connector, wallet001.getAddress()) + " native balance: " + EVMUtils.getAccountNativeBalance(connector, wallet001.getAddress()).getBalanceInETH());
		System.out.println("--------------------------------");
		System.out.println("PRE  - " + wallet002_name + " pub: " + wallet002.getAddress() + " txCount: " + preTxCountForWallet002 + " native balance: " + preBalanceWallet002);
		System.out.println("POST - " + wallet002_name + " pub: " + wallet002.getAddress() + " txCount: " + EVMUtils.getTransactionCountForAddress(connector, wallet002.getAddress()) + " native balance: " + EVMUtils.getAccountNativeBalance(connector, wallet002.getAddress()).getBalanceInETH());

	}

	public static boolean isValidPrivateKey(String _privateKey) {

		if (_privateKey == null || _privateKey.isEmpty()) {
			LOGGER.warn("private key is empty or null");
			return false;
		}
		if (_privateKey.startsWith("0x")) {
			_privateKey = _privateKey.replace("0x", "");
		}

		if (_privateKey.contains(" ")) {
			LOGGER.warn("private key includes a space");
			return false;
		}

		if (!_privateKey.matches("^[0-9a-fA-F]{64}$")) {
			LOGGER.debug("private key is not hex of length 64, length: " + _privateKey);
			return false;
		}

		BigInteger privateKeyInt = new BigInteger(_privateKey, 16);
		BigInteger maxVal = new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141", 16);

		boolean criteria1 = privateKeyInt.compareTo(BigInteger.ZERO) > 0;
		boolean criteria2 = privateKeyInt.compareTo(maxVal) < 0;

		if (criteria1 && criteria2) {
			return true;
		} else {
			LOGGER.warn("Private key does not fulfill basic BigInt criteria");
			LOGGER.warn("criteria1: " + criteria1);
			LOGGER.warn("criteria2: " + criteria2);
			return false;
		}
	}

	public static boolean isValidMnemonic(String _mnemonic) {
		if (_mnemonic == null || _mnemonic.isEmpty()) {
			return false;
		}

		List<String> words = Arrays.asList(_mnemonic.split("\\s+"));
		if (words.size() % 3 != 0) {
			return false;
		}

		try {
			MnemonicUtils.generateSeed(_mnemonic, "");
			return true;
		} catch (InvalidParameterException e) {
			return false;
		}
	}

	public static EVMLocalWallet initializeWallet(String _walletname, String _mnemonic, String _privkey) {
		EVMLocalWallet wallet = null;
		if (EVMUtils.isValidMnemonic(_mnemonic)) {
			wallet = new EVMLocalWallet(_walletname, AccountOrigin.RECOVERY_MNEMONIC, "nopassword", _mnemonic);
		} else if (EVMUtils.isValidPrivateKey(_privkey)) {
			wallet = new EVMLocalWallet(_walletname, AccountOrigin.PRIVATEKEY, "nopassword", _privkey);
		}

		// fallback to local file
		if (null == wallet) wallet = new EVMLocalWallet(_walletname, AccountOrigin.EXISTING_LOCALWALLETFILE, "nopassword");

		// Sanity check
		if (!EVMUtils.isValidEthereumAddress(wallet.getCredentials().getAddress())) {
			LOGGER.error(" - wallet address is not valid: " + wallet.getCredentials().getAddress());
			SystemUtils.halt();
		}

		return wallet;
	}

	public static void ensureWalletHasFunds(EVMBlockChainConnector _connector, EVMLocalWallet _wallet, Double _threshold) {
		EVMAccountBalance walletBalance = EVMUtils.getWalletBalanceNativeCurrency(_connector, _wallet);
		if (null == walletBalance) {
			LOGGER.error("Unable to get wallet balance, halting");
			SystemUtils.halt();
		} else {
			// Make sure gas balance is above threshold
			if (new BigDecimal(walletBalance.getBalanceInETH()).compareTo(BigDecimal.valueOf(_threshold)) < 0) {
				LOGGER.error("wallet " + _wallet.getCredentials().getAddress() + " needs more funds. Halting.");
				SystemUtils.halt();
			}
			LOGGER.info("wallet " + _wallet.getCredentials().getAddress() + " has sufficient funds: " + walletBalance.getBalanceInETH());
		}
	}

	public static EVMPortfolioSimple createEVMPortfolioSimple(EVMPortfolio _evm_portfolio) {
		if (null == _evm_portfolio) return null;
		return new EVMPortfolioSimple(_evm_portfolio.getAccount_address(), _evm_portfolio.getChainportfolio());
	}

	public static String sendTX(EVMBlockChainConnector _connector, Credentials cred, String wolfwallet001_address, EVMNativeValue val_to_withdraw, boolean haltOnUnconfirmedTX) {
		String txhash = null;
				
		// force custom behavior for chain?
		if (_connector.getChain() == EVMChain.MANTLETEST) {
			PendingTxStatus pendingTX = checkForPendingTransactions(_connector, cred.getAddress());
			if (pendingTX.getNonce_diff() == 0L) {
				Long nonce_to_use = pendingTX.getNonce_finalized().longValue();
				LOGGER.info("Since we are dealing with " + _connector.getChain().toString() + " going to set nonce to " + nonce_to_use);
				if ("LEGACY".equals(_connector.getChaininfo().getPriceMechanism())) {
					txhash = EVMUtils.sendTXWithNativeCurrency_LegacyPricingMechanism_WithCustomNonce(_connector, cred, wolfwallet001_address, val_to_withdraw, haltOnUnconfirmedTX, BigInteger.valueOf(nonce_to_use), false);
				} else if ("EIP1559".equals(_connector.getChaininfo().getPriceMechanism())) {
					txhash = EVMUtils.sendTXWithNativeCurrency_EIP1559PricingMechanism_WithCustomNonce(_connector, cred, wolfwallet001_address, val_to_withdraw, haltOnUnconfirmedTX, BigInteger.valueOf(nonce_to_use), false);
				} else {
					LOGGER.error("Unable to handle pricing mechanism named: " + _connector.getChaininfo().getPriceMechanism());
					SystemUtils.halt();
				}
			}	
		}
		
		if ("LEGACY".equals(_connector.getChaininfo().getPriceMechanism())) {
			txhash = EVMUtils.sendTXWithNativeCurrency_LegacyPricingMechanism(_connector, cred, wolfwallet001_address, val_to_withdraw, haltOnUnconfirmedTX);
		} else if ("EIP1559".equals(_connector.getChaininfo().getPriceMechanism())) {
			txhash = EVMUtils.sendTXWithNativeCurrency_EIP1559PricingMechanism(_connector, cred, wolfwallet001_address, val_to_withdraw, haltOnUnconfirmedTX);
		} else {
			LOGGER.error("Unable to handle pricing mechanism named: " + _connector.getChaininfo().getPriceMechanism());
			SystemUtils.halt();
		}
		return txhash;
	}

	public static String getHexPrivateKeyFromCred(Credentials _cred) {
		String hex = _cred.getEcKeyPair().getPrivateKey().toString(16);
		while (hex.length() < 64) hex = "0" + hex;
		return hex;
	}

}
