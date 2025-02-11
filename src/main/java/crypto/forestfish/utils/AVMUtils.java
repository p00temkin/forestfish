package crypto.forestfish.utils;

import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HexFormat;
import java.util.List;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.algorand.algosdk.account.Account;
import com.algorand.algosdk.crypto.Address;
import com.algorand.algosdk.transaction.SignedTransaction;
import com.algorand.algosdk.transaction.Transaction;
import com.algorand.algosdk.util.Encoder;
import com.algorand.algosdk.v2.client.common.Response;
import com.algorand.algosdk.v2.client.model.ApplicationLocalState;
import com.algorand.algosdk.v2.client.model.Asset;
import com.algorand.algosdk.v2.client.model.AssetHolding;
import com.algorand.algosdk.v2.client.model.Enums.TxType;
import com.algorand.algosdk.v2.client.model.HealthCheck;
import com.algorand.algosdk.v2.client.model.NodeStatusResponse;
import com.algorand.algosdk.v2.client.model.PendingTransactionResponse;
import com.algorand.algosdk.v2.client.model.PostTransactionsResponse;
import com.algorand.algosdk.v2.client.model.TransactionParametersResponse;
import com.algorand.algosdk.v2.client.model.TransactionsResponse;
import com.algorand.algosdk.v2.client.Utils;

import crypto.forestfish.enums.BlockchainType;
import crypto.forestfish.enums.ExceptionType;
import crypto.forestfish.enums.avm.AVMChain;
import crypto.forestfish.enums.avm.AVMNFTStandard;
import crypto.forestfish.enums.avm.Unit;
import crypto.forestfish.objects.avm.AVMASAMutables;
import crypto.forestfish.objects.avm.AVMAccountASABalance;
import crypto.forestfish.objects.avm.AVMAccountBalance;
import crypto.forestfish.objects.avm.AVMAccountTxSummary;
import crypto.forestfish.objects.avm.AVMChainPortfolio;
import crypto.forestfish.objects.avm.AVMChainPortfolioDiff;
import crypto.forestfish.objects.avm.AVMCreateAssetResult;
import crypto.forestfish.objects.avm.AVMIndexerException;
import crypto.forestfish.objects.avm.AVMIndexerExceptionActionState;
import crypto.forestfish.objects.avm.AVMNativeValue;
import crypto.forestfish.objects.avm.AVMNftAccountBalance;
import crypto.forestfish.objects.avm.AVMPortfolio;
import crypto.forestfish.objects.avm.AVMPortfolioDiff;
import crypto.forestfish.objects.avm.AVMPortfolioDiffResult;
import crypto.forestfish.objects.avm.AVMPortfolioSimple;
import crypto.forestfish.objects.avm.AVMProviderException;
import crypto.forestfish.objects.avm.AVMProviderExceptionActionState;
import crypto.forestfish.objects.avm.AlgoIndexerNode;
import crypto.forestfish.objects.avm.AlgoLocalWallet;
import crypto.forestfish.objects.avm.AlgoRelayNode;
import crypto.forestfish.objects.avm.connector.AVMBlockChainConnector;
import crypto.forestfish.objects.avm.connector.AVMBlockChainUltraConnector;
import crypto.forestfish.objects.avm.model.asa.ASAContentOnchainReply;
import crypto.forestfish.objects.avm.model.asa.AVMASAInfo;
import crypto.forestfish.objects.avm.model.chain.AVMChainIndex;
import crypto.forestfish.objects.avm.model.chain.AVMChainInfo;
import crypto.forestfish.objects.avm.model.chain.AVMCurrency;
import crypto.forestfish.objects.avm.model.nft.ARC19Asset;
import crypto.forestfish.objects.avm.model.nft.ARC3Asset;
import crypto.forestfish.objects.avm.model.nft.ARC3Info;
import crypto.forestfish.objects.avm.model.nft.ARC69Asset;
import crypto.forestfish.objects.avm.model.nft.ARC69Info;
import crypto.forestfish.objects.avm.model.nft.ASAVerificationStatus;
import crypto.forestfish.objects.avm.model.nft.metadata.ARC3MetaData;
import crypto.forestfish.objects.avm.model.nft.metadata.ARC69ARC19MetaData;
import crypto.forestfish.objects.avm.model.nft.metadata.MetaDataEntry;
import crypto.forestfish.objects.embedded.avm.BlockchainDetailsAVM;
import crypto.forestfish.objects.ipfs.connector.IPFSConnector;
import io.ipfs.cid.Cid;
import io.ipfs.cid.Cid.Codec;
import io.ipfs.multihash.Multihash;

public class AVMUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(AVMUtils.class);

	private static final Pattern ALGO_ADDRESS_PATTERN = Pattern.compile("[A-Z0-9]{58}$");

	public static final Long txFee_microAlgo = 1000L;
	public static final Long accountMinBalanceBase_microAlgo = 100000L; // Account holding ALGO, no asas etc..

	public static AVMAccountBalance getAccountNativeBalance(AVMBlockChainConnector _connector, Address _address) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<com.algorand.algosdk.v2.client.model.Account> respAcct = _connector.getProvider_instance().AccountInformation(_address).execute();
				if (!respAcct.isSuccessful()) {
					LOGGER.error("respAcct.message(): " + respAcct.message());
					SystemUtils.halt();
				}
				com.algorand.algosdk.v2.client.model.Account accountInfo = respAcct.body();
				long balance_microAlgo = accountInfo.amount;
				Double balance_ALGO = Double.parseDouble("" + balance_microAlgo) / 1000000d;
				boolean isEmpty = false;
				if (balance_microAlgo == 0L) isEmpty = true;
				return new AVMAccountBalance(balance_microAlgo, balance_ALGO, _connector.getChaininfo().getNativeCurrency(), isEmpty);
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the chain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static boolean isAccountOptinForASA(AVMBlockChainConnector _connector, Address _address, long assetID) {
		boolean optedin = false;
		List<AssetHolding> asset_holdings = getASAOwnershipInfoForAccount(_connector, _address);
		for (AssetHolding assetHolding: asset_holdings) {
			if (assetHolding.assetId.equals(assetID)) optedin = true;
		}
		return optedin;
	}

	public static boolean isAccountOptinForASA(AVMBlockChainConnector _connector, Address _address, AVMASAInfo asaInfo) {
		return isAccountOptinForASA(_connector, _address, asaInfo.getId());
	}

	public static BigInteger getAccountBalanceForASA(AVMBlockChainConnector _connector, Address _address, Long _assetID) {
		List<AssetHolding> asset_holdings = getASAOwnershipInfoForAccount(_connector, _address);
		for (AssetHolding assetHolding: asset_holdings) {
			if (assetHolding.assetId.equals(_assetID)) {
				return assetHolding.amount;
			}
		}
		return new BigInteger("0");
	}

	public static AVMAccountASABalance getAccountBalanceForASA(AVMBlockChainConnector _connector, Address _address, AVMASAInfo asaInfo) {
		List<AssetHolding> asset_holdings = getASAOwnershipInfoForAccount(_connector, _address);
		for (AssetHolding assetHolding: asset_holdings) {
			if (assetHolding.assetId.equals(asaInfo.getId())) {
				return new AVMAccountASABalance(assetHolding.amount, asaInfo);
			}
		}
		return new AVMAccountASABalance(new BigInteger("0"), asaInfo);
	}

	public static String getASARawJSONResponse(AVMBlockChainConnector _connector, Long _assetID) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<Asset> respAss = _connector.getProvider_instance().GetAssetByID(_assetID).execute();
				if (!respAss.isSuccessful()) {
					if (respAss.message().contains("asset does not exist")) {
						LOGGER.error("respAss.message(): " + respAss.message());
						return null;
					} else {
						LOGGER.error("respAss.message(): " + respAss.message());
						SystemUtils.halt();
					}
				}
				Asset asset = respAss.body();
				return asset.toString();
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the chain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static Boolean checkIfASAExists(AVMBlockChainConnector _connector, Long _assetID) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<Asset> respAss = _connector.getProvider_instance().GetAssetByID(_assetID).execute();
				if (!respAss.isSuccessful()) {
					if (respAss.message().contains("asset does not exist")) {
						return false;
					} else {
						LOGGER.error("respAss.message(): " + respAss.message());
						SystemUtils.halt();
					}
				}
				return true;
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.warn(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		return null;
	}

	public static ArrayList<MetaDataEntry> getASAConfigTransactionNotes(AVMBlockChainConnector _connector, Long _assetID) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		ArrayList<MetaDataEntry> result = new ArrayList<MetaDataEntry>();
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				// Transactions are returned oldest to newest. Max 10000
				Response<TransactionsResponse> respCall = _connector.getIndexer_instance()
						.lookupAssetTransactions(_assetID)
						.txType(TxType.ACFG)
						.limit(Long.MAX_VALUE)
						.execute();
				if (!respCall.isSuccessful()) {
					LOGGER.error("getASAConfigTransactionNotes() respCall.message(): " + respCall.message());
					SystemUtils.halt();
				}

				TransactionsResponse txs = respCall.body();
				if (null != txs) {
					for (com.algorand.algosdk.v2.client.model.Transaction tx: txs.transactions) {
						boolean assetConfigTx = false;
						if (null != tx.assetConfigTransaction) {
							assetConfigTx = true;
						}
						if (null != tx.note()) {
							String txnote = new String(tx.note, StandardCharsets.UTF_8);
							LOGGER.debug(" * txid: " + tx.id + ",confirmedround=" + tx.confirmedRound + ": " + tx.sender + " txtype=" + tx.txType + " txnote: " + txnote + ", assetconfig:" + assetConfigTx);
							txnote = StringsUtils.decodeBase64String(tx.note());

							MetaDataEntry entry = new MetaDataEntry(txnote);
							entry.setTx_id(tx.id);
							entry.setTx_confirmedRound(tx.confirmedRound);
							entry.setTx_roundTime(tx.roundTime);
							result.add(entry);
						}
					}
				}

				return result;

			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchaino " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return result;
	}

	public static String getASALatestConfigTransactionNote(AVMBlockChainConnector _connector, Long _assetID) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				// Transactions are returned oldest to newest. Max 10000
				Response<TransactionsResponse> respCall = _connector.getIndexer_instance()
						.lookupAssetTransactions(_assetID)
						.txType(TxType.ACFG)
						.limit(Long.MAX_VALUE)
						.execute();
				if (!respCall.isSuccessful()) {
					LOGGER.error("getASALatestConfigTransactionNote() respCall.message(): " + respCall.message());
					SystemUtils.halt();
				}

				String latesttxnote = "";
				TransactionsResponse txs = respCall.body();
				if (null != txs) {
					for (com.algorand.algosdk.v2.client.model.Transaction tx: txs.transactions) {
						boolean assetConfigTx = false;
						if (null != tx.assetConfigTransaction) {
							assetConfigTx = true;
						}
						if (null != tx.note()) {
							String txnote = new String(tx.note, StandardCharsets.UTF_8);
							LOGGER.debug(" * txid: " + tx.id + ",confirmedround=" + tx.confirmedRound + ": " + tx.sender + " txtype=" + tx.txType + " txnote: " + txnote + ", assetconfig:" + assetConfigTx);
							latesttxnote = StringsUtils.decodeBase64String(tx.note());
						}
					}
				}

				return latesttxnote;

			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static AVMAccountTxSummary getTransactionSummaryForAccount(AVMBlockChainConnector _connector, String _address) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;

		HashMap<String, Long> txtype_counts = new HashMap<>();
		long txcount = 0L;

		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				// Transactions are returned oldest to newest. Max 10000
				Response<TransactionsResponse> respCall = _connector.getIndexer_instance()
						.lookupAccountTransactions(createAddressFromSTR(_address))
						//.limit(Long.MAX_VALUE) // setting this will lead to timeout for some indexers
						.execute();
				if (!respCall.isSuccessful()) {
					LOGGER.warn(_connector.getChain() + " getTransactionSummaryForAccount() respCall.message(): " + respCall.message());
					System.exit(1);

					// indexer exceptions (readonly)
					AVMIndexerException avmE = analyzeIndexerException(_connector.getChain(), _connector.getIndexerNode(), new Exception(respCall.message()));
					AVMIndexerExceptionActionState avmEAS = actAndGetStateAVMIndexerException(avmE, _connector, false);
					if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
				} else {

					TransactionsResponse txs = respCall.body();
					if (null != txs) {
						for (com.algorand.algosdk.v2.client.model.Transaction tx: txs.transactions) {
							Long currentCount = txtype_counts.get(tx.txType.toString());
							if (null == currentCount) currentCount = 0L;
							currentCount++;
							txcount++;
							txtype_counts.put(tx.txType.toString(), currentCount);
						}
					}

					return new AVMAccountTxSummary(txtype_counts, txcount);

				}

			} catch (Exception ex) {
				// index exceptions (readonly)
				AVMIndexerException avmE = analyzeIndexerException(_connector.getChain(), _connector.getIndexerNode(), ex);
				AVMIndexerExceptionActionState avmEAS = actAndGetStateAVMIndexerException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static AVMNFTStandard identifyARCStandard(AVMBlockChainConnector _connector, Long assetID) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<Asset> respAss = _connector.getProvider_instance().GetAssetByID(assetID).execute();
				if (!respAss.isSuccessful()) {
					LOGGER.error("respAss.message(): " + respAss.message());
					SystemUtils.halt();
				}
				Asset asset = respAss.body();
				ASAContentOnchainReply reply = JSONUtils.createPOJOFromJSON(asset.toString(), ASAContentOnchainReply.class);

				AVMNFTStandard standard = identifyARCStandardFromASAOnChainReply(_connector, reply);
				return standard;

			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static ASAContentOnchainReply getASAJSON(String assetJSON) {
		ASAContentOnchainReply reply = JSONUtils.createPOJOFromJSON(assetJSON, ASAContentOnchainReply.class);
		return reply;
	}

	public static AVMNFTStandard identifyARCStandardFromASAAssetID(AVMBlockChainConnector _connector, Long _assetID) {
		String assetJSON = AVMUtils.getASARawJSONResponse(_connector, _assetID);
		ASAContentOnchainReply reply = JSONUtils.createPOJOFromJSON(assetJSON, ASAContentOnchainReply.class);
		return identifyARCStandardFromASAOnChainReply(_connector, reply);
	}

	public static AVMNFTStandard identifyARCStandardFromASAJSON(AVMBlockChainConnector _connector, String _assetJSON) {
		ASAContentOnchainReply reply = JSONUtils.createPOJOFromJSON(_assetJSON, ASAContentOnchainReply.class);
		return identifyARCStandardFromASAOnChainReply(_connector, reply);
	}

	public static AVMNFTStandard identifyARCStandardFromASAOnChainReply(AVMBlockChainConnector _connector, ASAContentOnchainReply _reply) {

		/**
		 * ARC3
		 */
		if (_reply.getParams().getName().equals("arc3")) return AVMNFTStandard.ARC3;
		if (_reply.getParams().getName().endsWith("@arc3")) return AVMNFTStandard.ARC3;
		if ((null != _reply.getParams().getUrl()) && (_reply.getParams().getUrl().endsWith("#arc3"))) return AVMNFTStandard.ARC3;

		/**
		 * ARC69
		 */
		if (true &&
				(null != _reply.getParams().getUnit_name()) &&
				(null != _reply.getParams().getName()) &&
				(null != _reply.getParams().getTotal()) &&
				(null != _reply.getParams().getDecimals()) &&
				(null != _reply.getParams().getUrl()) &&
				true) {

			// Grab the latest tx note and check if it qualifies as ARC69 metadata
			// we dont want to do this for non arcs (=timeouts) so require
			// - total supply below 100k or media type specifier (#p, #v ..)
			// - url must be possible mediadata link
			if (false ||
					(_reply.getParams().getTotal().compareTo(new BigInteger("100000")) < 0) ||
					_reply.getParams().getUrl().contains("#i") || // image
					_reply.getParams().getUrl().contains("#a") || // audio
					_reply.getParams().getUrl().contains("#v") || // video
					_reply.getParams().getUrl().contains("#h") || // html
					false) {
				if (false ||
						_reply.getParams().getUrl().startsWith("http://") ||
						_reply.getParams().getUrl().startsWith("https://") ||
						_reply.getParams().getUrl().startsWith("ipfs://") ||
						false) {

					// We really need to check the URL JSON metadata "standard" key here to make sure it states "arc69"
					LOGGER.debug("Using indexer to fetch latest tx note for asa id " + _reply.getIndex() + ", ASA URL is " + _reply.getParams().getUrl() + " total: " + _reply.getParams().getTotal());

					String latesttxnote = AVMUtils.getASALatestConfigTransactionNote(_connector, _reply.getIndex());
					latesttxnote = StringsUtils.cleanJSON(latesttxnote);
					if (null == latesttxnote) return AVMNFTStandard.UNKNOWN;
					if (true &&
							latesttxnote.contains("{") &&
							latesttxnote.contains("}") &&
							true) {
						latesttxnote = StringsUtils.cleanJSON(latesttxnote);
						ARC69ARC19MetaData arcmetadata = JSONUtils.createPOJOFromJSON(latesttxnote, ARC69ARC19MetaData.class);
						if (null == arcmetadata) return AVMNFTStandard.UNKNOWN;
						if (true &&
								(null != arcmetadata.getStandard()) &&
								"arc69".equals(arcmetadata.getStandard()) &&
								true) {
							return AVMNFTStandard.ARC69;
						}
					}
				}
			}
		}

		/*
		 * ARC19
		 */
		if ((null != _reply.getParams().getUrl()) && (_reply.getParams().getUrl().contains("template-ipfs"))) return AVMNFTStandard.ARC19;

		return AVMNFTStandard.UNKNOWN;
	}

	public static ARC3Asset getARC3Info(AVMBlockChainConnector _connector, Long _assetID) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<Asset> respAss = _connector.getProvider_instance().GetAssetByID(_assetID).execute();
				if (!respAss.isSuccessful()) {
					LOGGER.error("respAss.message(): " + respAss.message());
					SystemUtils.halt();
				}
				Asset asset = respAss.body();
				return createARC3Asset(asset.toString());
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static ARC3Asset createARC3Asset(String assetString) {
		try {
			ASAContentOnchainReply reply = JSONUtils.createPOJOFromJSON(assetString.toString(), ASAContentOnchainReply.class);
			if (null != reply) {
				Address manager_addr = null;
				if (null != reply.getParams().getManager()) manager_addr = new Address(reply.getParams().getManager());

				Address reserve_addr = null;
				if (null != reply.getParams().getReserve()) reserve_addr = new Address(reply.getParams().getReserve());

				Address freeze_addr = null;
				if (null != reply.getParams().getFreeze()) freeze_addr = new Address(reply.getParams().getFreeze());

				Address clawback_addr = null;
				if (null != reply.getParams().getClawback()) clawback_addr = new Address(reply.getParams().getClawback());

				ARC3Asset asset3 = new ARC3Asset(reply.getIndex(), reply.getParams().getUnit_name(), reply.getParams().getName(), reply.getParams().getUrl(),
						reply.getParams().getTotal(), reply.getParams().getDecimals(), reply.getParams().getDefault_frozen(),reply.getParams().getMetadata_hash(),
						manager_addr,
						reserve_addr,
						freeze_addr,
						clawback_addr);
				return asset3;
			} else {
				LOGGER.error("Not a valid ARC3 reply .. ABORT!");
				SystemUtils.halt();
			}
		} catch (Exception e) {
			LOGGER.warn("Exception: " + e.getMessage());
			return null;
		}
		return null;
	}

	public static ARC69Asset getARC69Info(AVMBlockChainConnector _connector, Long _assetID) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<Asset> respAss = _connector.getProvider_instance().GetAssetByID(_assetID).execute();
				if (!respAss.isSuccessful()) {
					LOGGER.error("respAss.message(): " + respAss.message());
					SystemUtils.halt();
				}
				Asset asset = respAss.body();
				return createARC69Asset(asset.toString());
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static ARC69Asset createARC69Asset(String assetString) {
		try {
			ASAContentOnchainReply reply = JSONUtils.createPOJOFromJSON(assetString, ASAContentOnchainReply.class);
			if (null != reply) {

				Address manager_addr = null;
				if (null != reply.getParams().getManager()) manager_addr = new Address(reply.getParams().getManager());

				Address reserve_addr = null;
				if (null != reply.getParams().getReserve()) reserve_addr = new Address(reply.getParams().getReserve());

				Address freeze_addr = null;
				if (null != reply.getParams().getFreeze()) freeze_addr = new Address(reply.getParams().getFreeze());

				Address clawback_addr = null;
				if (null != reply.getParams().getClawback()) clawback_addr = new Address(reply.getParams().getClawback());

				ARC69Asset asset69 = new ARC69Asset(reply.getIndex(), reply.getParams().getUnit_name(), reply.getParams().getName(), reply.getParams().getUrl(),
						reply.getParams().getTotal(), reply.getParams().getDecimals(), reply.getParams().getDefault_frozen(),
						manager_addr,
						reserve_addr,
						freeze_addr,
						clawback_addr);
				return asset69;
			} else {
				LOGGER.error("Not a valid ARC69 reply .. ABORT!");
				SystemUtils.halt();
			}
		} catch (Exception e) {
			LOGGER.warn("Exception: " + e.getMessage());
			return null;
		}
		return null;
	}

	public static ARC19Asset getARC19Info(AVMBlockChainConnector _connector, Long _assetID) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<Asset> respAss = _connector.getProvider_instance().GetAssetByID(_assetID).execute();
				if (!respAss.isSuccessful()) {
					LOGGER.error("respAss.message(): " + respAss.message());
					SystemUtils.halt();
				}
				Asset asset = respAss.body();
				return createARC19Asset(asset.toString());
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static ARC19Asset createARC19Asset(String assetString) {
		try {
			ASAContentOnchainReply reply = JSONUtils.createPOJOFromJSON(assetString, ASAContentOnchainReply.class);
			if (null != reply) {

				Address manager_addr = null;
				if (null != reply.getParams().getManager()) manager_addr = new Address(reply.getParams().getManager());

				Address reserve_addr = null;
				if (null != reply.getParams().getReserve()) reserve_addr = new Address(reply.getParams().getReserve());

				Address freeze_addr = null;
				if (null != reply.getParams().getFreeze()) freeze_addr = new Address(reply.getParams().getFreeze());

				Address clawback_addr = null;
				if (null != reply.getParams().getClawback()) clawback_addr = new Address(reply.getParams().getClawback());

				ARC19Asset asset69 = new ARC19Asset(reply.getIndex(), reply.getParams().getUnit_name(), reply.getParams().getName(), reply.getParams().getUrl(),
						reply.getParams().getTotal(), reply.getParams().getDecimals(), reply.getParams().getDefault_frozen(),
						manager_addr,
						reserve_addr,
						freeze_addr,
						clawback_addr);
				return asset69;
			} else {
				LOGGER.error("Not a valid ARC19 reply .. ABORT!");
				SystemUtils.halt();
			}
		} catch (Exception e) {
			LOGGER.warn("Exception: " + e.getMessage());
			return null;
		}
		return null;
	}

	public static String getChainGenesis(AVMBlockChainConnector _connector) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<String> resp = _connector.getProvider_instance().GetGenesis().execute();
				if (!resp.isSuccessful()) {
					LOGGER.error("resp.message(): " + resp.message());
					SystemUtils.halt();
				}
				String genesis = resp.body();
				return genesis;
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static Long getLastRound(AVMBlockChainConnector _connector) {
		String meth = "getLastRound()";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<NodeStatusResponse> resp = _connector.getProvider_instance().GetStatus().execute();
				if (!resp.isSuccessful()) {
					LOGGER.debug(_connector.getRelayNode().getUrl() + " resp.message(): " + resp.message().replace("\n", ""));

					// tx exceptions (readonly)
					AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), new Exception(resp.message()));
					AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
					if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
				} else {
					NodeStatusResponse status = resp.body();
					return status.lastRound;
				}
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.warn(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		return null; // intentional null response on fail here
	}

	public static Long getIndexerHealthCheck(AVMBlockChainConnector _connector) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<HealthCheck> resp = _connector.getIndexer_instance().makeHealthCheck().execute();
				if (!resp.isSuccessful()) {
					LOGGER.error("resp.message(): " + resp.message());
					SystemUtils.halt();
				}
				HealthCheck status = resp.body();
				return status.round;
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMIndexerException avmE = analyzeIndexerException(_connector.getChain(), _connector.getIndexerNode(), ex);
				AVMIndexerExceptionActionState avmEAS = actAndGetStateAVMIndexerException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static List<AssetHolding> getASAOwnershipInfoForAccount(AVMBlockChainConnector _connector, Address _address) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<com.algorand.algosdk.v2.client.model.Account> respAcct = _connector.getProvider_instance().AccountInformation(_address).execute();
				if (!respAcct.isSuccessful()) {
					LOGGER.error("respAcct.message(): " + respAcct.message());
					SystemUtils.halt();
				}
				com.algorand.algosdk.v2.client.model.Account accountInfo = respAcct.body();
				return accountInfo.assets;
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static List<ApplicationLocalState> getLocalStateInfoForAccount(AVMBlockChainConnector _connector, Address _address) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<com.algorand.algosdk.v2.client.model.Account> respAcct = _connector.getProvider_instance().AccountInformation(_address).execute();
				if (!respAcct.isSuccessful()) {
					LOGGER.error("respAcct.message(): " + respAcct.message());
					SystemUtils.halt();
				}
				com.algorand.algosdk.v2.client.model.Account accountInfo = respAcct.body();
				return accountInfo.appsLocalState;
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static Long getTotalAppsOptedInForAccount(AVMBlockChainConnector _connector, Address _address) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<com.algorand.algosdk.v2.client.model.Account> respAcct = _connector.getProvider_instance().AccountInformation(_address).execute();
				if (!respAcct.isSuccessful()) {
					LOGGER.error("respAcct.message(): " + respAcct.message());
					SystemUtils.halt();
				}
				com.algorand.algosdk.v2.client.model.Account accountInfo = respAcct.body();
				return accountInfo.totalAppsOptedIn;
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static Long getTotalAssetsOptedInForAccount(AVMBlockChainConnector _connector, Address _address) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<com.algorand.algosdk.v2.client.model.Account> respAcct = _connector.getProvider_instance().AccountInformation(_address).execute();
				if (!respAcct.isSuccessful()) {
					LOGGER.error("respAcct.message(): " + respAcct.message());
					SystemUtils.halt();
				}
				com.algorand.algosdk.v2.client.model.Account accountInfo = respAcct.body();
				return accountInfo.totalAssetsOptedIn;
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static Boolean holdsAssets(AVMBlockChainConnector _connector, Address _address) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<com.algorand.algosdk.v2.client.model.Account> respAcct = _connector.getProvider_instance().AccountInformation(_address).execute();
				if (!respAcct.isSuccessful()) {
					LOGGER.error("respAcct.message(): " + respAcct.message());
					SystemUtils.halt();
				}
				com.algorand.algosdk.v2.client.model.Account accountInfo = respAcct.body();
				List<AssetHolding> asas_owned = accountInfo.assets;
				List<ApplicationLocalState> localstates_owned =  accountInfo.appsLocalState;
				Long total_apps_optedin = accountInfo.totalAppsOptedIn;
				Long total_assets_optedin = accountInfo.totalAssetsOptedIn;
				Long total_created_apps = accountInfo.totalCreatedApps;

				/*
				System.out.println("asas_owned.size()        : " + asas_owned.size());
				System.out.println("localstates_owned.size() : " + localstates_owned.size());
				System.out.println("total_apps_optedin       : " + total_apps_optedin);
				System.out.println("total_assets_optedin     : " + total_assets_optedin);
				System.out.println("total_created_apps       : " + total_created_apps);
				 */

				if (false ||
						(asas_owned.size()>0) ||
						(localstates_owned.size()>0) ||
						(total_apps_optedin > 0) ||
						(total_created_apps > 0) ||
						(total_assets_optedin > 0) ||
						false) {
					return true;
				} else {
					return false;
				}
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return true;
	}

	public static Long getTotalCreatedAppsForAccount(AVMBlockChainConnector _connector, Address _address) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<com.algorand.algosdk.v2.client.model.Account> respAcct = _connector.getProvider_instance().AccountInformation(_address).execute();
				if (!respAcct.isSuccessful()) {
					LOGGER.error("respAcct.message(): " + respAcct.message());
					SystemUtils.halt();
				}
				com.algorand.algosdk.v2.client.model.Account accountInfo = respAcct.body();
				return accountInfo.totalCreatedApps;
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static Boolean isAccountRekeyed(AVMBlockChainConnector _connector, Address _address) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<com.algorand.algosdk.v2.client.model.Account> respAcct = _connector.getProvider_instance().AccountInformation(_address).execute();
				if (!respAcct.isSuccessful()) {
					LOGGER.error("respAcct.message(): " + respAcct.message());
					SystemUtils.halt();
				}
				com.algorand.algosdk.v2.client.model.Account accountInfo = respAcct.body();
				if (null == accountInfo.authAddr) {
					return false;
				} else {
					return true;
				}
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.warn(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		return null;
	}

	public static Boolean getRekeyAddressForAccount(AVMBlockChainConnector _connector, Address _address) {
		String meth = "";
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {
				Response<com.algorand.algosdk.v2.client.model.Account> respAcct = _connector.getProvider_instance().AccountInformation(_address).execute();
				if (!respAcct.isSuccessful()) {
					LOGGER.error("respAcct.message(): " + respAcct.message());
					SystemUtils.halt();
				}
				com.algorand.algosdk.v2.client.model.Account accountInfo = respAcct.body();
				if (null == accountInfo.authAddr) {
					return false;
				} else {
					return true;
				}
			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.warn(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		return null;
	}

	public static Long calculateMinimumBalanceForASAOwnedByAccount(AVMBlockChainConnector _connector, Address _address) {
		String meth = "calculateMinimumBalanceForASAOwnedByAccount()";
		Long minBalance = 0L;

		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {

				// Get accountinfo
				Response<com.algorand.algosdk.v2.client.model.Account> respAcct = _connector.getProvider_instance().AccountInformation(_address).execute();
				if (!respAcct.isSuccessful()) {
					LOGGER.error("respAcct.message(): " + respAcct.message());
					SystemUtils.halt();
				}
				com.algorand.algosdk.v2.client.model.Account accountInfo = respAcct.body();

				// ALGO account base, 0.1 ALGO
				if (accountInfo.amount > 0L) {
					minBalance = minBalance + 100000L;
				}

				// Each ASA asset opt-in, 0.1 ALGO
				minBalance = minBalance + accountInfo.assets.size() * 100000L;

				// App opt-in
				/**
				 * https://developer.algorand.org/docs/get-details/dapps/smart-contracts/apps/
				 * - 100,000 microAlgo base fee of opt-in		
				 * - 25,000 + 3,500 = 28,500 for each Uint in the Local State schema
				 * - 25,000 + 25,000 = 50,000 for each byte-slice in the Local State schema
				 * 
				 * 100,000 + (25,000+3,500)*schema.NumUint + (25,000+25,000)*schema.NumByteSlice
				 */
				minBalance = minBalance + accountInfo.appsLocalState.size() * 100000L;

				// App creation
				/**
				 * https://developer.algorand.org/docs/get-details/dapps/smart-contracts/apps/
				 * - 100,000 microAlgo base fee for each page requested.
				 * - 25,000 + 3,500 = 28,500 for each Uint in the Global State schema
				 * - 25,000 + 25,000 = 50,000 for each byte-slice in the Global State schema
				 * 
				 * 100,000*(1+ExtraProgramPages) + (25,000+3,500)*schema.NumUint + (25,000+25,000)*schema.NumByteSlice
				 */

				// TODO
				/*
				List<ApplicationLocalState> localstateinfo = accountInfo.appsLocalState;
				for (ApplicationLocalState applocalstate: localstateinfo) {
				}
				 */

				return minBalance;

			} catch (Exception ex) {
				// tx exceptions (readonly)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, false);
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain " + _connector.getChain() + ", out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}

	public static AVMChainInfo getAVMChainInfo(AVMChain _chain) {
		AVMChainIndex idx = BlockchainDetailsAVM.generateAVMChainIndex();
		return idx.getNetworks().get(_chain);
	}

	public static String sendTXTransferASA(AVMBlockChainConnector _connector, AlgoLocalWallet _fromWallet, Address _target_address, AVMASAInfo _asaInfo, BigInteger _assetAmount, boolean _haltOnUnconfirmedTX) {
		return sendTXTransferASA(_connector, _fromWallet, _target_address, _asaInfo.getId(), _assetAmount, _haltOnUnconfirmedTX);
	}

	public static String sendTXTransferASA(AVMBlockChainConnector _connector, AlgoLocalWallet _fromWallet, Address _target_address, Long _assetid, BigInteger _assetAmount, boolean _haltOnUnconfirmedTX) {
		String hash = null;
		boolean debug = false;

		boolean confirmedTransaction = false;
		int txAttemptCount = 0;
		int requestCount = 0;

		while (!confirmedTransaction && (txAttemptCount<5) && (requestCount<15)) {
			requestCount++;

			try {

				// Construct the transaction
				Response < TransactionParametersResponse > resp =  _connector.getProvider_instance().TransactionParams().execute();
				if (!resp.isSuccessful()) {
					throw new Exception(resp.message());
				}
				TransactionParametersResponse params = resp.body();
				if (params == null) {
					throw new Exception("Params retrieval error");
				}
				JSONObject jsonObj = new JSONObject(params.toString());
				if (debug) System.out.println("Algorand suggested parameters: " + jsonObj.toString(2));

				Transaction txn = Transaction.AssetTransferTransactionBuilder()
						.sender(_fromWallet.fetchAccount().getAddress())
						.assetReceiver(_target_address)
						.assetAmount(_assetAmount)
						.assetIndex(_assetid)
						.suggestedParams(params)
						.build();

				// Sign the transaction
				SignedTransaction signedTxn = _fromWallet.fetchAccount().signTransaction(txn);
				if (debug) System.out.println("Signed transaction with txid: " + signedTxn.transactionID);

				// Submit the transaction to the network
				byte[] encodedTxBytes = Encoder.encodeToMsgPack(signedTxn);
				Response < PostTransactionsResponse > rawtxresponse = _connector.getProvider_instance().RawTransaction().rawtxn(encodedTxBytes).execute();
				if (!rawtxresponse.isSuccessful()) {
					throw new Exception(rawtxresponse.message());
				}
				String id = rawtxresponse.body().txId;

				// Wait for transaction confirmation
				PendingTransactionResponse pTrx = Utils.waitForConfirmation(_connector.getProvider_instance(), id, 4);
				if (debug) System.out.println("Transaction " + id + " confirmed in round " + pTrx.confirmedRound);
				hash = id;
				confirmedTransaction = true;

				// Read the transaction
				if (debug) {
					JSONObject jsonObj2 = new JSONObject(pTrx.toString());
					System.out.println("Transaction information (with notes): " + jsonObj2.toString(2));
					if (null != pTrx.txn.tx.note) System.out.println("Decoded note: " + new String(pTrx.txn.tx.note));
					System.out.println("Amount: " + new String(pTrx.txn.tx.amount.toString()));
					System.out.println("Fee: " + new String(pTrx.txn.tx.fee.toString()));
				}
			} catch (Exception ex) {
				// tx exceptions (readwrite)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, _haltOnUnconfirmedTX);
				if (avmE.isNodeInteraction()) txAttemptCount++; 
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}

		return hash;
	}

	public static String sendTXOptInToAsset(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, AVMASAInfo _asaInfo, boolean _haltOnUnconfirmedTX) {
		return sendTXOptInToAsset(_connector, _algoWallet, _asaInfo.getId(), _haltOnUnconfirmedTX);
	}

	public static String sendTXOptInToAsset(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, Long assetID, boolean _haltOnUnconfirmedTX) {
		String hash = null;
		boolean debug = false;

		boolean confirmedTransaction = false;
		int txAttemptCount = 0;
		int requestCount = 0;

		while (!confirmedTransaction && (txAttemptCount<5) && (requestCount<15)) {
			requestCount++;

			try {

				// Construct the transaction
				Response < TransactionParametersResponse > resp =  _connector.getProvider_instance().TransactionParams().execute();
				if (!resp.isSuccessful()) {
					throw new Exception(resp.message());
				}
				TransactionParametersResponse params = resp.body();
				if (params == null) {
					throw new Exception("Params retrieval error");
				}
				JSONObject jsonObj = new JSONObject(params.toString());
				if (debug) System.out.println("Algorand suggested parameters: " + jsonObj.toString(2));

				Transaction txn = Transaction.AssetAcceptTransactionBuilder()
						.acceptingAccount(_algoWallet.fetchAccount().getAddress())
						.assetIndex(assetID)
						.suggestedParams(params)
						.build();

				// Sign the transaction
				SignedTransaction signedTxn = _algoWallet.fetchAccount().signTransaction(txn);
				if (debug) System.out.println("Signed transaction with txid: " + signedTxn.transactionID);

				// Submit the transaction to the network
				byte[] encodedTxBytes = Encoder.encodeToMsgPack(signedTxn);
				Response < PostTransactionsResponse > rawtxresponse = _connector.getProvider_instance().RawTransaction().rawtxn(encodedTxBytes).execute();
				if (!rawtxresponse.isSuccessful()) {
					throw new Exception(rawtxresponse.message());
				}
				String id = rawtxresponse.body().txId;

				// Wait for transaction confirmation
				PendingTransactionResponse pTrx = Utils.waitForConfirmation(_connector.getProvider_instance(), id, 4);
				if (debug) System.out.println("Transaction " + id + " confirmed in round " + pTrx.confirmedRound);
				hash = id;
				confirmedTransaction = true;

				// Read the transaction
				if (debug) {
					JSONObject jsonObj2 = new JSONObject(pTrx.toString());
					System.out.println("Transaction information (with notes): " + jsonObj2.toString(2));
					if (null != pTrx.txn.tx.note) System.out.println("Decoded note: " + new String(pTrx.txn.tx.note));
					System.out.println("Amount: " + new String(pTrx.txn.tx.amount.toString()));
					System.out.println("Fee: " + new String(pTrx.txn.tx.fee.toString()));
				}
			} catch (Exception ex) {
				// tx exceptions (readwrite)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, _haltOnUnconfirmedTX);
				if (avmE.isNodeInteraction()) txAttemptCount++; 
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}

		return hash;
	}

	public static String sendTXOptOutToAsset(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, String _receiver_address, Long assetID, boolean _haltOnUnconfirmedTX, BigInteger _asaAmount) {
		String hash = null;
		boolean debug = false;

		boolean confirmedTransaction = false;
		int txAttemptCount = 0;
		int requestCount = 0;

		while (!confirmedTransaction && (txAttemptCount<5) && (requestCount<15)) {
			requestCount++;

			try {

				// Construct the transaction
				Response < TransactionParametersResponse > resp =  _connector.getProvider_instance().TransactionParams().execute();
				if (!resp.isSuccessful()) {
					throw new Exception(resp.message());
				}
				TransactionParametersResponse params = resp.body();
				if (params == null) {
					throw new Exception("Params retrieval error");
				}
				JSONObject jsonObj = new JSONObject(params.toString());
				if (debug) System.out.println("Algorand suggested parameters: " + jsonObj.toString(2));

				Transaction txn = Transaction.AssetTransferTransactionBuilder()
						.sender(_algoWallet.getAddress())
						.assetReceiver(_receiver_address)
						.assetCloseTo(_receiver_address)
						.assetIndex(assetID)
						.assetAmount(_asaAmount)
						.suggestedParams(params)
						.build();

				// Sign the transaction
				SignedTransaction signedTxn = _algoWallet.fetchAccount().signTransaction(txn);
				if (debug) System.out.println("Signed transaction with txid: " + signedTxn.transactionID);

				// Submit the transaction to the network
				byte[] encodedTxBytes = Encoder.encodeToMsgPack(signedTxn);
				Response < PostTransactionsResponse > rawtxresponse = _connector.getProvider_instance().RawTransaction().rawtxn(encodedTxBytes).execute();
				if (!rawtxresponse.isSuccessful()) {
					throw new Exception(rawtxresponse.message());
				}
				String id = rawtxresponse.body().txId;

				// Wait for transaction confirmation
				PendingTransactionResponse pTrx = Utils.waitForConfirmation(_connector.getProvider_instance(), id, 4);
				if (debug) System.out.println("Transaction " + id + " confirmed in round " + pTrx.confirmedRound);
				hash = id;
				confirmedTransaction = true;

				// Read the transaction
				if (debug) {
					JSONObject jsonObj2 = new JSONObject(pTrx.toString());
					System.out.println("Transaction information (with notes): " + jsonObj2.toString(2));
					if (null != pTrx.txn.tx.note) System.out.println("Decoded note: " + new String(pTrx.txn.tx.note));
					System.out.println("Amount: " + new String(pTrx.txn.tx.amount.toString()));
					System.out.println("Fee: " + new String(pTrx.txn.tx.fee.toString()));
				}
			} catch (Exception ex) {

				// Method specific error messages
				if (ex.getMessage().contains("cannot close asset ID in allocating account")) {
					LOGGER.error("You just attempted to opt-out of an asset you are the creator of. Not possible. Rethink your life choices.");
					SystemUtils.halt();
				}

				// tx exceptions (readwrite)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, _haltOnUnconfirmedTX);
				if (avmE.isNodeInteraction()) txAttemptCount++; 
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}

		return hash;
	}

	public static String sendTXWithNativeCurrency(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, Address _target_address, AVMNativeValue _nativevalue) {
		String txhash = sendTXWithNativeCurrency(_connector, _algoWallet, _target_address, _nativevalue, true);
		return txhash;
	}

	public static String sendTXWithNativeCurrency(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, Address _target_address, AVMNativeValue _nativevalue, boolean _haltOnUnconfirmedTX) {
		String hash = null;
		boolean debug = false;

		boolean tx_submitted = false;
		String txid = null;

		// Sanitycheck
		if (!AVMUtils.isValidAlgorandAddress(_target_address.toString())) {
			LOGGER.info("Target address is not valid: " + _target_address.toString());
			SystemUtils.halt();
		}

		long amountInMicroAlgo = 0L;
		if (_nativevalue.getUnit() == Unit.microAlgo) amountInMicroAlgo = _nativevalue.getVal().longValue();
		if (_nativevalue.getUnit() == Unit.ALGO) amountInMicroAlgo = _nativevalue.getVal().longValue()*1000000L;

		boolean confirmedTransaction = false;
		int txAttemptCount = 0;
		int requestCount = 0;

		while (!confirmedTransaction && (txAttemptCount<5) && (requestCount<15)) {
			requestCount++;

			try {

				// Make sure we dont resubmit tx if we get timeouts and txid confirmed
				if (!tx_submitted) {
					// Construct the transaction
					String note = "";
					Response < TransactionParametersResponse > resp =  _connector.getProvider_instance().TransactionParams().execute();
					if (!resp.isSuccessful()) {
						throw new Exception(resp.message());
					}
					TransactionParametersResponse params = resp.body();
					if (params == null) {
						throw new Exception("Params retrieval error");
					}
					JSONObject jsonObj = new JSONObject(params.toString());
					if (debug) System.out.println("Algorand suggested parameters: " + jsonObj.toString(2));
					Transaction txn = Transaction.PaymentTransactionBuilder()
							.sender(_algoWallet.fetchAccount().getAddress().toString())
							.note(note.getBytes())
							.amount(amountInMicroAlgo)
							.receiver(_target_address)
							.suggestedParams(params)
							.build();

					// Sign the transaction
					SignedTransaction signedTxn = _algoWallet.fetchAccount().signTransaction(txn);
					if (debug) System.out.println("Signed transaction with txid: " + signedTxn.transactionID);

					// Submit the transaction to the network
					byte[] encodedTxBytes = Encoder.encodeToMsgPack(signedTxn);
					Response < PostTransactionsResponse > rawtxresponse = _connector.getProvider_instance().RawTransaction().rawtxn(encodedTxBytes).execute();
					if (!rawtxresponse.isSuccessful()) {
						throw new Exception(rawtxresponse.message());
					}
					txid = rawtxresponse.body().txId;
					LOGGER.debug("Confirmed TX submit txid with " + txid);
					tx_submitted = true;
				}

				// Wait for transaction confirmation
				PendingTransactionResponse pTrx = Utils.waitForConfirmation(_connector.getProvider_instance(), txid, 4);
				if (debug) System.out.println("Transaction " + txid + " confirmed in round " + pTrx.confirmedRound);
				hash = txid;
				confirmedTransaction = true;

				// Read the transaction
				if (debug) {
					JSONObject jsonObj2 = new JSONObject(pTrx.toString());
					System.out.println("Transaction information (with notes): " + jsonObj2.toString(2));
					if (null != pTrx.txn.tx.note) System.out.println("Decoded note: " + new String(pTrx.txn.tx.note));
					System.out.println("Amount: " + new String(pTrx.txn.tx.amount.toString()));
					System.out.println("Fee: " + new String(pTrx.txn.tx.fee.toString()));
				}
			} catch (Exception ex) {
				// tx exceptions (readwrite)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, _haltOnUnconfirmedTX);
				if (avmE.isNodeInteraction()) txAttemptCount++; 
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}

		return hash;
	}

	public static AVMCreateAssetResult createARC69ASA(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, ARC69Asset _arc69params, String _metadatajson) {
		return createARC69ASA(_connector, _algoWallet, _arc69params, _metadatajson, false);
	}

	public static AVMCreateAssetResult createARC69ASA(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, ARC69Asset _arc69params, String _metadatajson, boolean _haltOnUnconfirmedTX) {
		boolean debug = false;

		String txhash = null;
		Long assetID = null;
		boolean confirmedTransaction = false;

		int txAttemptCount = 0;
		int requestCount = 0;

		while (!confirmedTransaction && (txAttemptCount<5) && (requestCount<15)) {
			requestCount++;

			try {

				// Construct the transaction
				Response < TransactionParametersResponse > resp =  _connector.getProvider_instance().TransactionParams().execute();
				if (!resp.isSuccessful()) {
					throw new Exception(resp.message());
				}
				TransactionParametersResponse params = resp.body();
				if (params == null) {
					throw new Exception("Params retrieval error");
				}
				JSONObject jsonObj = new JSONObject(params.toString());
				if (debug) System.out.println("Algorand suggested parameters: " + jsonObj.toString(2));

				Transaction txn = Transaction.AssetCreateTransactionBuilder()
						.sender(_algoWallet.getAddress().toString())
						.assetTotal(_arc69params.getTotalNrUnits())
						.assetDecimals(_arc69params.getDecimals())
						.assetUnitName(_arc69params.getUnitName())
						.assetName(_arc69params.getAssetName())
						.url(_arc69params.getAssetURL())
						.noteUTF8(_metadatajson)
						.manager(_arc69params.getManager())
						.reserve(_arc69params.getReserve())
						.freeze(_arc69params.getFreeze())
						.defaultFrozen(_arc69params.isDefaultFrozen())
						.clawback(_arc69params.getClawback())
						.suggestedParams(params)
						.build();   

				// Sign the transaction
				SignedTransaction signedTxn = _algoWallet.fetchAccount().signTransaction(txn);
				if (debug) System.out.println("Signed transaction with txid: " + signedTxn.transactionID);

				// Submit the transaction to the network
				byte[] encodedTxBytes = Encoder.encodeToMsgPack(signedTxn);
				Response < PostTransactionsResponse > rawtxresponse = _connector.getProvider_instance().RawTransaction().rawtxn(encodedTxBytes).execute();
				if (!rawtxresponse.isSuccessful()) {
					throw new Exception(rawtxresponse.message());
				}
				String id = rawtxresponse.body().txId;

				// Wait for transaction confirmation
				PendingTransactionResponse pTrx = Utils.waitForConfirmation(_connector.getProvider_instance(), id, 4);
				if (debug) System.out.println("Transaction " + id + " confirmed in round " + pTrx.confirmedRound);

				txhash = id;
				confirmedTransaction = true;
				assetID = pTrx.assetIndex;

				// Read the transaction
				if (debug) {
					JSONObject jsonObj2 = new JSONObject(pTrx.toString());
					System.out.println("Transaction information (with notes): " + jsonObj2.toString(2));
					if (null != pTrx.txn.tx.note) System.out.println("Decoded note: " + new String(pTrx.txn.tx.note));
					System.out.println("Amount: " + new String(pTrx.txn.tx.amount.toString()));
					System.out.println("Fee: " + new String(pTrx.txn.tx.fee.toString()));
				}
			} catch (Exception ex) {
				// tx exceptions (readwrite)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, _haltOnUnconfirmedTX);
				if (avmE.isNodeInteraction()) txAttemptCount++; 
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}

		return new AVMCreateAssetResult(txhash, assetID, confirmedTransaction);
	}

	public static AVMCreateAssetResult createARC3ASA(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, ARC3Asset _arc3params) {
		return createARC3ASA(_connector, _algoWallet, _arc3params, false);
	}

	public static AVMCreateAssetResult createARC3ASA(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, ARC3Asset _arc3params, boolean _haltOnUnconfirmedTX) {
		boolean debug = false;

		String txhash = null;
		Long assetID = null;
		boolean confirmedTransaction = false;

		int txAttemptCount = 0;
		int requestCount = 0;

		while (!confirmedTransaction && (txAttemptCount<5) && (requestCount<15)) {
			requestCount++;

			try {

				// Construct the transaction
				Response < TransactionParametersResponse > resp =  _connector.getProvider_instance().TransactionParams().execute();
				if (!resp.isSuccessful()) {
					throw new Exception(resp.message());
				}
				TransactionParametersResponse params = resp.body();
				if (params == null) {
					throw new Exception("Params retrieval error");
				}
				JSONObject jsonObj = new JSONObject(params.toString());
				if (debug) System.out.println("Algorand suggested parameters: " + jsonObj.toString(2));

				Transaction txn = Transaction.AssetCreateTransactionBuilder()
						.sender(_algoWallet.getAddress().toString())
						.assetTotal(_arc3params.getTotalNrUnits())
						.assetDecimals(_arc3params.getDecimals())
						.assetUnitName(_arc3params.getUnitName())
						.assetName(_arc3params.getAssetName())
						.url(_arc3params.getAssetURL())
						.metadataHash(_arc3params.getAssetMetadataHash())
						.manager(_arc3params.getManager())
						.reserve(_arc3params.getReserve())
						.freeze(_arc3params.getFreeze())
						.defaultFrozen(_arc3params.isDefaultFrozen())
						.clawback(_arc3params.getClawback())
						.suggestedParams(params)
						.build();   

				// Sign the transaction
				SignedTransaction signedTxn = _algoWallet.fetchAccount().signTransaction(txn);
				if (debug) System.out.println("Signed transaction with txid: " + signedTxn.transactionID);

				// Submit the transaction to the network
				byte[] encodedTxBytes = Encoder.encodeToMsgPack(signedTxn);
				Response < PostTransactionsResponse > rawtxresponse = _connector.getProvider_instance().RawTransaction().rawtxn(encodedTxBytes).execute();
				if (!rawtxresponse.isSuccessful()) {
					throw new Exception(rawtxresponse.message());
				}
				String id = rawtxresponse.body().txId;

				// Wait for transaction confirmation
				PendingTransactionResponse pTrx = Utils.waitForConfirmation(_connector.getProvider_instance(), id, 4);
				if (debug) System.out.println("Transaction " + id + " confirmed in round " + pTrx.confirmedRound);

				txhash = id;
				confirmedTransaction = true;
				assetID = pTrx.assetIndex;

				// Read the transaction
				if (debug) {
					JSONObject jsonObj2 = new JSONObject(pTrx.toString());
					System.out.println("Transaction information (with notes): " + jsonObj2.toString(2));
					if (null != pTrx.txn.tx.note) System.out.println("Decoded note: " + new String(pTrx.txn.tx.note));
					System.out.println("Amount: " + new String(pTrx.txn.tx.amount.toString()));
					System.out.println("Fee: " + new String(pTrx.txn.tx.fee.toString()));
				}
			} catch (Exception ex) {
				// tx exceptions (readwrite)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, _haltOnUnconfirmedTX);
				if (avmE.isNodeInteraction()) txAttemptCount++; 
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}

		return new AVMCreateAssetResult(txhash, assetID, confirmedTransaction);
	}

	public static String reconfigureARC69ASAWithNote(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, Long assetID, AVMASAMutables _mutables, boolean _haltOnUnconfirmedTX, String _note) {
		boolean debug = false;

		String txhash = null;
		boolean confirmedTransaction = false;
		int txAttemptCount = 0;
		int requestCount = 0;

		while (!confirmedTransaction && (txAttemptCount<5) && (requestCount<15)) {
			requestCount++;

			try {

				// Construct the transaction
				Response < TransactionParametersResponse > resp =  _connector.getProvider_instance().TransactionParams().execute();
				if (!resp.isSuccessful()) {
					throw new Exception(resp.message());
				}
				TransactionParametersResponse params = resp.body();
				if (params == null) {
					throw new Exception("Params retrieval error");
				}
				JSONObject jsonObj = new JSONObject(params.toString());
				if (debug) System.out.println("Algorand suggested parameters: " + jsonObj.toString(2));

				Transaction txn = Transaction.AssetConfigureTransactionBuilder()
						.strictEmptyAddressChecking(false)
						.assetIndex(assetID)
						.noteUTF8(_note)
						.sender(_algoWallet.getAddress().toString())
						.manager(_mutables.getManager())
						.reserve(_mutables.getReserve())
						.freeze(_mutables.getFreeze())
						.clawback(_mutables.getClawback())
						.suggestedParams(params)
						.build(); 

				// Sign the transaction
				SignedTransaction signedTxn = _algoWallet.fetchAccount().signTransaction(txn);
				if (debug) System.out.println("Signed transaction with txid: " + signedTxn.transactionID);

				// Submit the transaction to the network
				byte[] encodedTxBytes = Encoder.encodeToMsgPack(signedTxn);
				Response < PostTransactionsResponse > rawtxresponse = _connector.getProvider_instance().RawTransaction().rawtxn(encodedTxBytes).execute();
				if (!rawtxresponse.isSuccessful()) {
					throw new Exception(rawtxresponse.message());
				}
				String id = rawtxresponse.body().txId;

				// Wait for transaction confirmation
				PendingTransactionResponse pTrx = Utils.waitForConfirmation(_connector.getProvider_instance(), id, 4);
				if (debug) System.out.println("Transaction " + id + " confirmed in round " + pTrx.confirmedRound);
				txhash = id;
				confirmedTransaction = true;

				// Read the transaction
				if (debug) {
					JSONObject jsonObj2 = new JSONObject(pTrx.toString());
					System.out.println("Transaction information (with notes): " + jsonObj2.toString(2));
					if (null != pTrx.txn.tx.note) System.out.println("Decoded note: " + new String(pTrx.txn.tx.note));
					System.out.println("Amount: " + new String(pTrx.txn.tx.amount.toString()));
					System.out.println("Fee: " + new String(pTrx.txn.tx.fee.toString()));
				}
			} catch (Exception ex) {
				// tx exceptions (readwrite)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, _haltOnUnconfirmedTX);
				if (avmE.isNodeInteraction()) txAttemptCount++; 
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}

		return txhash;
	}

	public static String reconfigureARCASA(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, Long assetID, AVMASAMutables _mutables, boolean _haltOnUnconfirmedTX) {
		boolean debug = false;

		String txhash = null;
		boolean confirmedTransaction = false;
		int txAttemptCount = 0;
		int requestCount = 0;

		while (!confirmedTransaction && (txAttemptCount<5) && (requestCount<15)) {
			requestCount++;

			try {

				// Construct the transaction
				Response < TransactionParametersResponse > resp =  _connector.getProvider_instance().TransactionParams().execute();
				if (!resp.isSuccessful()) {
					throw new Exception(resp.message());
				}
				TransactionParametersResponse params = resp.body();
				if (params == null) {
					throw new Exception("Params retrieval error");
				}
				JSONObject jsonObj = new JSONObject(params.toString());
				if (debug) System.out.println("Algorand suggested parameters: " + jsonObj.toString(2));

				Transaction txn = Transaction.AssetConfigureTransactionBuilder()
						.strictEmptyAddressChecking(false)
						.assetIndex(assetID)
						.sender(_algoWallet.getAddress().toString())
						.manager(_mutables.getManager())
						.reserve(_mutables.getReserve())
						.freeze(_mutables.getFreeze())
						.clawback(_mutables.getClawback())
						.suggestedParams(params)
						.build(); 

				// Sign the transaction
				SignedTransaction signedTxn = _algoWallet.fetchAccount().signTransaction(txn);
				if (debug) System.out.println("Signed transaction with txid: " + signedTxn.transactionID);

				// Submit the transaction to the network
				byte[] encodedTxBytes = Encoder.encodeToMsgPack(signedTxn);
				Response < PostTransactionsResponse > rawtxresponse = _connector.getProvider_instance().RawTransaction().rawtxn(encodedTxBytes).execute();
				if (!rawtxresponse.isSuccessful()) {
					throw new Exception(rawtxresponse.message());
				}
				String id = rawtxresponse.body().txId;

				// Wait for transaction confirmation
				PendingTransactionResponse pTrx = Utils.waitForConfirmation(_connector.getProvider_instance(), id, 4);
				if (debug) System.out.println("Transaction " + id + " confirmed in round " + pTrx.confirmedRound);
				txhash = id;
				confirmedTransaction = true;

				// Read the transaction
				if (debug) {
					JSONObject jsonObj2 = new JSONObject(pTrx.toString());
					System.out.println("Transaction information (with notes): " + jsonObj2.toString(2));
					if (null != pTrx.txn.tx.note) System.out.println("Decoded note: " + new String(pTrx.txn.tx.note));
					System.out.println("Amount: " + new String(pTrx.txn.tx.amount.toString()));
					System.out.println("Fee: " + new String(pTrx.txn.tx.fee.toString()));
				}
			} catch (Exception ex) {
				// tx exceptions (readwrite)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, _haltOnUnconfirmedTX);
				if (avmE.isNodeInteraction()) txAttemptCount++; 
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}

		return txhash;
	}

	public static boolean makeASAImmutable(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, Long _assetID, boolean _haltOnUnconfirmedTX) {
		boolean confirmed_step1 = clearallASAddressesExceptManager(_connector, _algoWallet, _assetID, _haltOnUnconfirmedTX);
		boolean confirmed_step2 = clearallASAddressesExceptReserve(_connector, _algoWallet, _assetID, _haltOnUnconfirmedTX);
		return (confirmed_step1 && confirmed_step2);
	}

	public static boolean makeASAImmutableLeavingReserve(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, Long _assetID, boolean _haltOnUnconfirmedTX, Address _reserve) {
		boolean confirmed_step1 = clearallASAddressesExceptManagerAndReserve(_connector, _algoWallet, _assetID, _haltOnUnconfirmedTX, _reserve);
		boolean confirmed_step2 = clearallASAddressesExceptReserve(_connector, _algoWallet, _assetID, _haltOnUnconfirmedTX);
		return (confirmed_step1 && confirmed_step2);
	}

	public static boolean clearallASAddressesExceptReserve(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, Long _assetID, boolean _haltOnUnconfirmedTX) {
		boolean debug = false;

		String txhash = null;
		boolean confirmedTransaction = false;
		int txAttemptCount = 0;
		int requestCount = 0;

		while (!confirmedTransaction && (txAttemptCount<5) && (requestCount<15)) {
			requestCount++;

			try {

				// Construct the transaction
				Response < TransactionParametersResponse > resp =  _connector.getProvider_instance().TransactionParams().execute();
				if (!resp.isSuccessful()) {
					throw new Exception(resp.message());
				}
				TransactionParametersResponse params = resp.body();
				if (params == null) {
					throw new Exception("Params retrieval error");
				}
				JSONObject jsonObj = new JSONObject(params.toString());
				if (debug) System.out.println("Algorand suggested parameters: " + jsonObj.toString(2));

				Transaction txn = Transaction.AssetConfigureTransactionBuilder()
						.strictEmptyAddressChecking(false)
						.assetIndex(_assetID)
						.sender(_algoWallet.getAddress().toString())
						.reserve(new Address(_algoWallet.getAddress().toString()))
						.suggestedParams(params)
						.build(); 

				// Sign the transaction
				SignedTransaction signedTxn = _algoWallet.fetchAccount().signTransaction(txn);
				if (debug) System.out.println("Signed transaction with txid: " + signedTxn.transactionID);

				// Submit the transaction to the network
				byte[] encodedTxBytes = Encoder.encodeToMsgPack(signedTxn);
				Response < PostTransactionsResponse > rawtxresponse = _connector.getProvider_instance().RawTransaction().rawtxn(encodedTxBytes).execute();
				if (!rawtxresponse.isSuccessful()) {
					throw new Exception(rawtxresponse.message());
				}
				String id = rawtxresponse.body().txId;

				// Wait for transaction confirmation
				PendingTransactionResponse pTrx = Utils.waitForConfirmation(_connector.getProvider_instance(), id, 4);
				txhash = id;
				if (debug) System.out.println("Transaction " + txhash + " confirmed in round " + pTrx.confirmedRound);
				confirmedTransaction = true;

				// Read the transaction
				if (debug) {
					JSONObject jsonObj2 = new JSONObject(pTrx.toString());
					System.out.println("Transaction information (with notes): " + jsonObj2.toString(2));
					if (null != pTrx.txn.tx.note) System.out.println("Decoded note: " + new String(pTrx.txn.tx.note));
					System.out.println("Amount: " + new String(pTrx.txn.tx.amount.toString()));
					System.out.println("Fee: " + new String(pTrx.txn.tx.fee.toString()));
				}
			} catch (Exception ex) {
				// tx exceptions (readwrite)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, _haltOnUnconfirmedTX);
				if (avmE.isNodeInteraction()) txAttemptCount++; 
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}

		return confirmedTransaction;
	}

	public static Boolean setLocalAVMNetworkSettings() {
		boolean success = false;

		return success;
	}


	public static Boolean clearallASAddressesExceptManager(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, Long _assetID, boolean _haltOnUnconfirmedTX) {
		boolean debug = false;

		String txhash = null;
		boolean confirmedTransaction = false;
		int txAttemptCount = 0;
		int requestCount = 0;

		while (!confirmedTransaction && (txAttemptCount<5) && (requestCount<15)) {
			requestCount++;

			try {

				// Construct the transaction
				Response < TransactionParametersResponse > resp =  _connector.getProvider_instance().TransactionParams().execute();
				if (!resp.isSuccessful()) {
					throw new Exception(resp.message());
				}
				TransactionParametersResponse params = resp.body();
				if (params == null) {
					throw new Exception("Params retrieval error");
				}
				JSONObject jsonObj = new JSONObject(params.toString());
				if (debug) System.out.println("Algorand suggested parameters: " + jsonObj.toString(2));

				Transaction txn = Transaction.AssetConfigureTransactionBuilder()
						.strictEmptyAddressChecking(false)
						.assetIndex(_assetID)
						.sender(_algoWallet.getAddress().toString())
						.manager(new Address(_algoWallet.getAddress().toString()))
						.suggestedParams(params)
						.build(); 

				// Sign the transaction
				SignedTransaction signedTxn = _algoWallet.fetchAccount().signTransaction(txn);
				if (debug) System.out.println("Signed transaction with txid: " + signedTxn.transactionID);

				// Submit the transaction to the network
				byte[] encodedTxBytes = Encoder.encodeToMsgPack(signedTxn);
				Response < PostTransactionsResponse > rawtxresponse = _connector.getProvider_instance().RawTransaction().rawtxn(encodedTxBytes).execute();
				if (!rawtxresponse.isSuccessful()) {
					throw new Exception(rawtxresponse.message());
				}
				String id = rawtxresponse.body().txId;

				// Wait for transaction confirmation
				PendingTransactionResponse pTrx = Utils.waitForConfirmation(_connector.getProvider_instance(), id, 4);
				txhash = id;
				if (debug) System.out.println("Transaction " + txhash + " confirmed in round " + pTrx.confirmedRound);
				confirmedTransaction = true;

				// Read the transaction
				if (debug) {
					JSONObject jsonObj2 = new JSONObject(pTrx.toString());
					System.out.println("Transaction information (with notes): " + jsonObj2.toString(2));
					if (null != pTrx.txn.tx.note) System.out.println("Decoded note: " + new String(pTrx.txn.tx.note));
					System.out.println("Amount: " + new String(pTrx.txn.tx.amount.toString()));
					System.out.println("Fee: " + new String(pTrx.txn.tx.fee.toString()));
				}
			} catch (Exception ex) {
				// tx exceptions (readwrite)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, _haltOnUnconfirmedTX);
				if (avmE.isNodeInteraction()) txAttemptCount++; 
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}

		return confirmedTransaction;
	}


	public static Boolean clearallASAddressesExceptManagerAndReserve(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, Long _assetID, boolean _haltOnUnconfirmedTX, Address _reserve) {
		boolean debug = false;

		String txhash = null;
		boolean confirmedTransaction = false;
		int txAttemptCount = 0;
		int requestCount = 0;

		while (!confirmedTransaction && (txAttemptCount<5) && (requestCount<15)) {
			requestCount++;

			try {

				// Construct the transaction
				Response < TransactionParametersResponse > resp =  _connector.getProvider_instance().TransactionParams().execute();
				if (!resp.isSuccessful()) {
					throw new Exception(resp.message());
				}
				TransactionParametersResponse params = resp.body();
				if (params == null) {
					throw new Exception("Params retrieval error");
				}
				JSONObject jsonObj = new JSONObject(params.toString());
				if (debug) System.out.println("Algorand suggested parameters: " + jsonObj.toString(2));

				Transaction txn = Transaction.AssetConfigureTransactionBuilder()
						.strictEmptyAddressChecking(false)
						.assetIndex(_assetID)
						.sender(_algoWallet.getAddress().toString())
						.manager(new Address(_algoWallet.getAddress().toString()))
						.reserve(_reserve)
						.suggestedParams(params)
						.build(); 

				// Sign the transaction
				SignedTransaction signedTxn = _algoWallet.fetchAccount().signTransaction(txn);
				if (debug) System.out.println("Signed transaction with txid: " + signedTxn.transactionID);

				// Submit the transaction to the network
				byte[] encodedTxBytes = Encoder.encodeToMsgPack(signedTxn);
				Response < PostTransactionsResponse > rawtxresponse = _connector.getProvider_instance().RawTransaction().rawtxn(encodedTxBytes).execute();
				if (!rawtxresponse.isSuccessful()) {
					throw new Exception(rawtxresponse.message());
				}
				String id = rawtxresponse.body().txId;

				// Wait for transaction confirmation
				PendingTransactionResponse pTrx = Utils.waitForConfirmation(_connector.getProvider_instance(), id, 4);
				txhash = id;
				if (debug) System.out.println("Transaction " + txhash + " confirmed in round " + pTrx.confirmedRound);
				confirmedTransaction = true;

				// Read the transaction
				if (debug) {
					JSONObject jsonObj2 = new JSONObject(pTrx.toString());
					System.out.println("Transaction information (with notes): " + jsonObj2.toString(2));
					if (null != pTrx.txn.tx.note) System.out.println("Decoded note: " + new String(pTrx.txn.tx.note));
					System.out.println("Amount: " + new String(pTrx.txn.tx.amount.toString()));
					System.out.println("Fee: " + new String(pTrx.txn.tx.fee.toString()));
				}
			} catch (Exception ex) {
				// tx exceptions (readwrite)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, _haltOnUnconfirmedTX);
				if (avmE.isNodeInteraction()) txAttemptCount++; 
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}

		return confirmedTransaction;
	}


	public static String destroyASA(AVMBlockChainConnector _connector, AlgoLocalWallet _algoWallet, Long assetID, boolean _haltOnUnconfirmedTX) {
		boolean debug = false;

		String txhash = null;
		boolean confirmedTransaction = false;
		int txAttemptCount = 0;
		int requestCount = 0;

		while (!confirmedTransaction && (txAttemptCount<5) && (requestCount<15)) {
			requestCount++;

			try {

				// Construct the transaction
				Response < TransactionParametersResponse > resp =  _connector.getProvider_instance().TransactionParams().execute();
				if (!resp.isSuccessful()) {
					throw new Exception(resp.message());
				}
				TransactionParametersResponse params = resp.body();
				if (params == null) {
					throw new Exception("Params retrieval error");
				}
				JSONObject jsonObj = new JSONObject(params.toString());
				if (debug) System.out.println("Algorand suggested parameters: " + jsonObj.toString(2));

				Transaction txn = Transaction.AssetConfigureTransactionBuilder()
						.strictEmptyAddressChecking(false)
						.assetIndex(assetID)
						.sender(_algoWallet.getAddress().toString())
						// no manager/reserve/freeze/clawback = destroy
						.suggestedParams(params)
						.build(); 

				// Sign the transaction
				SignedTransaction signedTxn = _algoWallet.fetchAccount().signTransaction(txn);
				if (debug) System.out.println("Signed transaction with txid: " + signedTxn.transactionID);

				// Submit the transaction to the network
				byte[] encodedTxBytes = Encoder.encodeToMsgPack(signedTxn);
				Response < PostTransactionsResponse > rawtxresponse = _connector.getProvider_instance().RawTransaction().rawtxn(encodedTxBytes).execute();
				if (!rawtxresponse.isSuccessful()) {
					throw new Exception(rawtxresponse.message());
				}
				String id = rawtxresponse.body().txId;

				// Wait for transaction confirmation
				PendingTransactionResponse pTrx = Utils.waitForConfirmation(_connector.getProvider_instance(), id, 4);
				if (debug) System.out.println("Transaction " + id + " confirmed in round " + pTrx.confirmedRound);
				txhash = id;
				confirmedTransaction = true;

				// Read the transaction
				if (debug) {
					JSONObject jsonObj2 = new JSONObject(pTrx.toString());
					System.out.println("Transaction information (with notes): " + jsonObj2.toString(2));
					if (null != pTrx.txn.tx.note) System.out.println("Decoded note: " + new String(pTrx.txn.tx.note));
					System.out.println("Amount: " + new String(pTrx.txn.tx.amount.toString()));
					System.out.println("Fee: " + new String(pTrx.txn.tx.fee.toString()));
				}
			} catch (Exception ex) {
				// tx exceptions (readwrite)
				AVMProviderException avmE = analyzeProviderException(_connector.getChain(), _connector.getRelayNode(), ex);
				AVMProviderExceptionActionState avmEAS = actAndGetStateAVMProviderException(avmE, _connector, _haltOnUnconfirmedTX);
				if (avmE.isNodeInteraction()) txAttemptCount++; 
				if (avmEAS.isNewAVMBlockChainConnector()) _connector = avmEAS.getConnector();
			}
		}

		return txhash;
	}

	public static void avmpingpong(AVMChain _chain, AlgoLocalWallet _algoWallet1, AlgoLocalWallet _algoWallet2, AVMNativeValue _avmNativeValue, int _nrIterations) {
		LOGGER.info("evmpingpong init()");
		LOGGER.info(" - chain: " + _chain.toString());

		boolean haltOnUnconfirmedTX = true;
		AVMBlockChainConnector connector = new AVMBlockChainConnector(_chain, false);

		AVMChainInfo chainInfo = AVMUtils.getAVMChainInfo(_chain);
		LOGGER.info("- genesis_id: " + chainInfo.getGenesisID());

		AVMAccountBalance algoWalletBalance1PRE = AVMUtils.getAccountNativeBalance(connector, _algoWallet1.fetchAccount().getAddress());
		System.out.println(String.format("PRE %s balance: %f ALGO", _algoWallet1.fetchAccount().getAddress().toString(), algoWalletBalance1PRE.getBalanceInALGO()));
		AVMAccountBalance algoWalletBalance2PRE = AVMUtils.getAccountNativeBalance(connector, _algoWallet2.fetchAccount().getAddress());
		System.out.println(String.format("PRE %s balance: %f ALGO", _algoWallet2.fetchAccount().getAddress().toString(), algoWalletBalance2PRE.getBalanceInALGO()));

		/**
		 * Sanity checks
		 */
		if (_avmNativeValue.getUnit() != Unit.ALGO) {
			LOGGER.error("Please use ALGO as native currency");
			SystemUtils.halt();
		}
		if (true &&
				(algoWalletBalance1PRE.getBalanceInALGO()>(_avmNativeValue.getVal().doubleValue()*2.0d)) &&
				(algoWalletBalance2PRE.getBalanceInALGO()>(_avmNativeValue.getVal().doubleValue()*2.0d)) &&
				true) {
			// all good
		} else {
			LOGGER.error("Both accounts playing pingpong needs to have a balance above " + _avmNativeValue.getVal().doubleValue()*2.0d + " ALGO");
			SystemUtils.halt();
		}

		for (int i=1; i<=_nrIterations; i++) {

			/**
			 * ping()
			 * - Send funds from wallet001 --> wallet002
			 */
			String txhash1 = sendTXWithNativeCurrency(connector, _algoWallet1, _algoWallet2.fetchAccount().getAddress(), _avmNativeValue, haltOnUnconfirmedTX);
			LOGGER.info("PING TX completed with tx hash: " + txhash1);

			/**
			 * pong()
			 * - Send funds from wallet002 --> wallet001
			 */
			String txhash2 = sendTXWithNativeCurrency(connector, _algoWallet2, _algoWallet1.fetchAccount().getAddress(), _avmNativeValue, haltOnUnconfirmedTX);
			LOGGER.info("PONG TX completed with tx hash: " + txhash2);

		}

		AVMAccountBalance algoWalletBalance1POST = AVMUtils.getAccountNativeBalance(connector, _algoWallet1.fetchAccount().getAddress());
		System.out.println(String.format("POST %s balance: %f ALGO", _algoWallet1.fetchAccount().getAddress().toString(), algoWalletBalance1POST.getBalanceInALGO()));
		AVMAccountBalance algoWalletBalance2POST = AVMUtils.getAccountNativeBalance(connector, _algoWallet2.fetchAccount().getAddress());
		System.out.println(String.format("POST %s balance: %f ALGO", _algoWallet2.fetchAccount().getAddress().toString(), algoWalletBalance2POST.getBalanceInALGO()));

	}


	public static AVMProviderException analyzeProviderException(AVMChain _chain, AlgoRelayNode _relayNode, Exception _ex) {	
		boolean nodeInteraction = false;
		boolean sleepBeforeRetry = false;
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
			LOGGER.info("Got a timeout against relaynode " + _relayNode.getUrl() + " .. will retry .. ex: " + _ex.getMessage());
			nodeInteraction = false;
			sleepBeforeRetry = true;
			sleepTimeInSecondsRecommended = 5;
			exceptionType = ExceptionType.NODE_RECOVERABLE;
			timeout = true;
		} else if (false ||
				_ex.getMessage().contains(URLUtils.extractURLHostnameFromURL(_relayNode.getUrl())) ||
				false) {
			// hostname echoed back
			// mainnet-algorand.api.purestake.io
			LOGGER.info("Got hostname echoed back .. will retry .. ex: " + _ex.getMessage());
			nodeInteraction = false;
			sleepBeforeRetry = true;
			sleepTimeInSecondsRecommended = 5;
			exceptionType = ExceptionType.NODE_RECOVERABLE;
			timeout = true;
		} else if (false ||
				(_ex.getMessage().contains("Failed to connect")) ||
				(_ex.getMessage().contains("Connection reset")) ||
				(_ex.getMessage().contains("closed")) ||
				(_ex.getMessage().contains("Remote host terminated the handshake")) ||
				false) {
			// java.net.ConnectException: Failed to connect to
			// java.net.SocketException: Connection reset
			// javax.net.ssl.SSLHandshakeException: Remote host terminated the handshake
			LOGGER.warn("Got a connection reset from nodeURL " + _relayNode.getUrl() + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (false ||
				_ex.getMessage().contains("UnknownHostException") ||
				_ex.getMessage().contains("No such host is known") ||
				false) {
			LOGGER.info("Unable to resolve host using nodeURL " + _relayNode.getUrl() + ".. will not retry and switch provider, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			sleepBeforeRetry = true;
			sleepTimeInSecondsRecommended = 1;
			switchNode = true;
		} else if (_ex.getMessage().contains(" overspend ")) {
			LOGGER.warn("Got an overspend warning from nodeURL " + _relayNode.getUrl() + ".. did you account for the Account Minimum Balance?");
			exceptionType = ExceptionType.FATAL;	
		} else if (_ex.getMessage().contains("404;")) {
			LOGGER.warn("Got a 404 non JSON response from nodeURL " + _relayNode.getUrl() + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("503")) {
			LOGGER.warn("Got a 503 non JSON response from nodeURL " + _relayNode.getUrl() + ".. will not retry, move on to next node");
			// https://node.algoexplorerapi.io: <html><body><h1>503 Service  Service Unavailable</h1>No server is available to handle this request..
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("go offline on")) {
			LOGGER.warn("Got an offline notice from nodeURL " + _relayNode.getUrl() + ".. will not retry, move on to next node");
			// https://testnet-algorand.api.purestake.io/idx2: PureStakes Algorand API service and GoalSeeker Block Explorer will go offline on January 1, 2024. Please check the Algorand Foundation website for alternative solutions. For Algorand infrastructure and node hosting services, please consider OpsLayer.com
			exceptionType = ExceptionType.NODE_UNSTABLE;
			switchNode = true;
		} else if (_ex.getMessage().contains("Invalid API Token")) {
			LOGGER.warn("Got an invalid API key error from relay node " + _relayNode.getUrl() + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("Invalid response received: 429")) {
			if (false ||
					_ex.getMessage().contains("daily request count exceeded") ||
					_ex.getMessage().contains("You have sent too many requests in a given amount of time") ||
					false) {
				LOGGER.info("Node limit reached for nodeURL " + _relayNode.getUrl() + ", we should probably cool down: " + _ex.getMessage());
				exceptionType = ExceptionType.NODE_UNSTABLE;	
				switchNode = true;		
			} else {
				LOGGER.error("Generic 429 error from nodeURL " + _relayNode.getUrl() + ": " + _ex.getMessage() + ", update analyzeProviderException() .. ");
				LOGGER.info("429 error noted for nodeURL " + _relayNode.getUrl() + ": " + _ex.getMessage() + ", lets try again");
				exceptionType = ExceptionType.NODE_UNSTABLE;	
				switchNode = true;
			}
		} else {
			exceptionType = ExceptionType.UNKNOWN;
			LOGGER.error("Unknown error from relay node " + _relayNode.getUrl() + ": " + _ex.getMessage() + ", update analyzeProviderException()");
			LOGGER.error("Unknown response noted while communicating with relay node " + _relayNode.getUrl());
			SystemUtils.halt();
		}

		return new AVMProviderException(exceptionType, nodeInteraction, sleepBeforeRetry, sleepTimeInSecondsRecommended, switchNode, timeout);
	}


	public static AVMIndexerException analyzeIndexerException(AVMChain _chain, AlgoIndexerNode _indexerNode, Exception _ex) {	
		boolean nodeInteraction = false;
		boolean sleepBeforeRetry = false;
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
			LOGGER.info("Got a timeout against indexer " + _indexerNode.getUrl() + " .. will retry .. ex: " + _ex.getMessage());
			nodeInteraction = false;
			sleepBeforeRetry = true;
			sleepTimeInSecondsRecommended = 5;
			exceptionType = ExceptionType.NODE_RECOVERABLE;
			timeout = true;
		} else if (false ||
				_ex.getMessage().contains(URLUtils.extractURLHostnameFromURL(_indexerNode.getUrl())) ||
				false) {
			// hostname echoed back
			// mainnet-algorand.api.purestake.io
			LOGGER.info("Got hostname echoed back .. will retry .. ex: " + _ex.getMessage());
			nodeInteraction = false;
			sleepBeforeRetry = true;
			sleepTimeInSecondsRecommended = 5;
			exceptionType = ExceptionType.NODE_RECOVERABLE;
			timeout = true;
		} else if (false ||
				(_ex.getMessage().contains("Failed to connect")) ||
				(_ex.getMessage().contains("Connection reset")) ||
				(_ex.getMessage().contains("closed")) ||
				(_ex.getMessage().contains("Remote host terminated the handshake")) ||
				false) {
			// java.net.ConnectException: Failed to connect to
			// java.net.SocketException: Connection reset
			// javax.net.ssl.SSLHandshakeException: Remote host terminated the handshake
			LOGGER.warn("Got a connection reset from nodeURL " + _indexerNode.getUrl() + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (false ||
				_ex.getMessage().contains("UnknownHostException") ||
				_ex.getMessage().contains("No such host is known") ||
				false) {
			LOGGER.info("Unable to resolve host using nodeURL " + _indexerNode.getUrl() + ".. will not retry and switch provider, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			sleepBeforeRetry = true;
			sleepTimeInSecondsRecommended = 1;
			switchNode = true;
		} else if (_ex.getMessage().contains(" overspend ")) {
			LOGGER.warn("Got an overspend warning from nodeURL " + _indexerNode.getUrl() + ".. did you account for the Account Minimum Balance?");
			exceptionType = ExceptionType.FATAL;	
		} else if (_ex.getMessage().contains("404;")) {
			LOGGER.warn("Got a 404 non JSON response from nodeURL " + _indexerNode.getUrl() + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (false ||
				_ex.getMessage().contains("invalid value on parameter") ||
				_ex.getMessage().contains("Cannot read field") ||
				false) {
			// https://node.testnet.algoexplorerapi.io: {"message":"invalid value on parameter 'limit'"}
			LOGGER.warn("Got an invalid value on parameter response from indexer node " + _indexerNode.getUrl() + ".. will not retry, move on to next node");
			exceptionType = ExceptionType.NODE_UNSTABLE;	
			switchNode = true;
		} else if (_ex.getMessage().contains("Invalid response received: 429")) {
			if (false ||
					_ex.getMessage().contains("daily request count exceeded") ||
					_ex.getMessage().contains("You have sent too many requests in a given amount of time") ||
					false) {
				LOGGER.info("Node limit reached for nodeURL " + _indexerNode.getUrl() + ", we should probably cool down: " + _ex.getMessage());
				exceptionType = ExceptionType.NODE_UNSTABLE;	
				switchNode = true;		
			} else {
				LOGGER.error("Generic 429 error from nodeURL " + _indexerNode.getUrl() + ": " + _ex.getMessage() + ", update analyzeIndexerException() .. ");
				LOGGER.info("429 error noted for nodeURL " + _indexerNode.getUrl() + ": " + _ex.getMessage() + ", lets try again");
				exceptionType = ExceptionType.NODE_UNSTABLE;	
				switchNode = true;
			}
		} else {
			exceptionType = ExceptionType.UNKNOWN;
			LOGGER.error("Unknown error from indexer node " + _indexerNode.getUrl() + ": " + _ex.getMessage() + ", update analyzeIndexerException()");
			LOGGER.error("Unknown response noted while communicating with indexer node " + _indexerNode.getUrl());
			SystemUtils.halt();
		}

		return new AVMIndexerException(exceptionType, nodeInteraction, sleepBeforeRetry, sleepTimeInSecondsRecommended, switchNode, timeout);
	}


	public static AVMProviderExceptionActionState actAndGetStateAVMProviderException(AVMProviderException _avmE, AVMBlockChainConnector _connector, boolean _haltOnUnconfirmedTX) {

		boolean newEVMBlockChainConnector = false;
		AVMBlockChainConnector connector = _connector;

		if (_avmE.isSleepBeforeRetry()) {
			SystemUtils.sleepInSeconds(_avmE.getSleepTimeInSecondsRecommended());
		} else {
			SystemUtils.sleepInSeconds(1); // Always sleep for 1 sec
		}
		if (_avmE.getExceptionType() == ExceptionType.FATAL) {
			LOGGER.info("ExceptionType is FATAL, exiting ..");
			SystemUtils.halt();
		}
		if (_avmE.isSwitchNode()) {
			newEVMBlockChainConnector = true;
			//connector.selectRandomNodeURL(_connector.getNode_url());
		}
		if ( true && 
				(_avmE.getExceptionType() != ExceptionType.NODE_RECOVERABLE) && 
				_haltOnUnconfirmedTX &&
				true) {
			LOGGER.info("haltOnUnconfirmedTX is set to true, and we have an unrecoverable exception");
			SystemUtils.halt();
		}

		return new AVMProviderExceptionActionState(newEVMBlockChainConnector, connector);
	}


	public static AVMIndexerExceptionActionState actAndGetStateAVMIndexerException(AVMIndexerException _avmE, AVMBlockChainConnector _connector, boolean _haltOnUnconfirmedTX) {

		boolean newAVMIndexerConnector = false;
		AVMBlockChainConnector connector = _connector;

		if (_avmE.isSleepBeforeRetry()) {
			SystemUtils.sleepInSeconds(_avmE.getSleepTimeInSecondsRecommended());
		} else {
			SystemUtils.sleepInSeconds(1); // Always sleep for 1 sec
		}
		if (_avmE.getExceptionType() == ExceptionType.FATAL) {
			LOGGER.info("ExceptionType is FATAL, exiting ..");
			SystemUtils.halt();
		}
		if (_avmE.isSwitchNode()) {
			newAVMIndexerConnector = true;
			AlgoIndexerNode new_indexernode = connector.selectRandomIndexerNode(_connector.getIndexerNode().getUrl());
			connector.setIndexerNode(new_indexernode);
			connector.reinitializeConnector();
		}
		if ( true && 
				(_avmE.getExceptionType() != ExceptionType.NODE_RECOVERABLE) && 
				_haltOnUnconfirmedTX &&
				true) {
			LOGGER.info("haltOnUnconfirmedTX is set to true, and we have an unrecoverable exception");
			SystemUtils.halt();
		}

		return new AVMIndexerExceptionActionState(newAVMIndexerConnector, connector);
	}

	public static String extractCIDFromARC19URLAndReserveAddress(String assetURL, String reserve_address) {

		String derived_cid = "";

		if (assetURL.startsWith("template-ipfs://{") && assetURL.contains("}")) {

			assetURL = assetURL.replace("template-ipfs://{","");
			assetURL = assetURL.replace("}","");

			String[] parts = assetURL.split(":");
			if (parts.length == 5) {

				String template = parts[0];
				String version = parts[1];
				String multicodec = parts[2];
				String fieldname = parts[3];
				String hashtype = parts[4];

				if (template.equals("ipfscid")) {
					if (false ||
							"0".equals(version) ||
							"1".equals(version) ||
							false) {
						if (false ||
								"raw".equals(multicodec) ||
								"dag-pb".equals(multicodec) ||
								false) {
							if ("reserve".equals(fieldname)) {
								if ("sha2-256".equals(hashtype)) {
									// weeeee nesting is fun!
									if ("raw".equals(multicodec) && "1".equals(version)) {
										derived_cid = AVMUtils.arc19DecodeAlgorandAddressToCIDv1(reserve_address);
										return derived_cid;
									} else if ("dag-pb".equals(multicodec) && "0".equals(version)) {
										derived_cid = AVMUtils.arc19DecodeAlgorandAddressToCIDv0(reserve_address);
										return derived_cid;
									} else {
										LOGGER.error("Currently unsupported ARC19 version/multicode combo. version=" + version + " multicodec=" + multicodec);
										SystemUtils.halt();
									}
								} else {
									LOGGER.warn("Invalid ARC19 (unsupported fieldname) assetURL: " + assetURL);
								}
							} else {
								LOGGER.warn("Invalid ARC19 (unsupported fieldname) assetURL: " + assetURL);
							}
						} else {
							LOGGER.warn("Invalid ARC19 (unsupported multicode) assetURL: " + assetURL);
						}
					} else {
						LOGGER.warn("Invalid ARC19 (unsupported version) assetURL: " + assetURL);
					}
				} else {
					LOGGER.warn("Invalid ARC19 (content must start with ipfscid) assetURL: " + assetURL);
				}
			} else {
				LOGGER.warn("Invalid ARC19 (invalid content) assetURL: " + assetURL);
			}
		} else {
			LOGGER.warn("Invalid ARC19 (invalid prefix) assetURL: " + assetURL);
		}

		return derived_cid;
	}

	public static String arc19EncodeCIDv0ToAlgorandAddress(String cid_str) {
		System.out.println("CID: " + cid_str);

		String derived_reserve_addr = "";

		// Parse the CID
		Cid cid_version0 = Cid.decode(cid_str);	
		LOGGER.info("codec       : " + cid_version0.codec);
		LOGGER.info("version     : " + cid_version0.version);
		LOGGER.info("hashCode    : " + cid_version0.hashCode());
		LOGGER.info("hashlen     : " + cid_version0.getHash().length);
		LOGGER.info("");

		LOGGER.info("base58      : " + cid_version0.toBase58());
		LOGGER.info("hex         : " + cid_version0.toHex());
		LOGGER.info("string      : " + cid_version0.toString());
		LOGGER.info("");

		try {
			// parse the multihash, https://multiformats.io/multihash/
			Multihash mh_version0 = Multihash.decode(cid_version0.toString());
			LOGGER.debug("mh hex            : " + mh_version0.toHex());

			// Early exit
			if (mh_version0.toHex().length() != 68) return "";

			String hash_func_type = mh_version0.toHex().substring(0, 2);
			LOGGER.info("mh hash_func_type : " + hash_func_type); // 0x12 = sha2-256

			String digest_length = mh_version0.toHex().substring(2, 4);
			int digest_length_int = Integer.parseInt(digest_length, 16); // 0x20 = 32 bytes 
			LOGGER.info("mh digest_length  : " + digest_length + " [" + digest_length_int + "]"); 

			String digest_value = mh_version0.toHex().substring(4, 68);
			LOGGER.info("mh digest_value   : " + digest_value);

			// Convert digest value to byte array
			byte[] byteValue = HexFormat.of().parseHex(digest_value);
			LOGGER.debug("byteValue len     : " + byteValue.length);

			// Derive Algorand address
			derived_reserve_addr = new Address(byteValue).toString();

		} catch (Exception e1) {
			e1.printStackTrace();
		}

		return derived_reserve_addr;
	}

	public static String arc19DecodeAlgorandAddressToCIDv0(String reserve_addr) {
		try {
			byte[] addr_bytes = new Address(reserve_addr).getBytes();
			Multihash m2 = new Multihash(Multihash.Type.sha2_256, addr_bytes);
			return m2.toBase58();
		} catch (Exception e) {
			LOGGER.warn("Exception: " + e.getMessage());
		}
		return null;
	}

	public static String arc19DecodeAlgorandAddressToCIDv1(String reserve_addr) {
		try {
			byte[] addr_bytes = new Address(reserve_addr).getBytes();

			// Return base32 value
			Cid c2 = new Cid(1L, Codec.Raw, Multihash.Type.sha2_256, addr_bytes);
			return c2.toString();
		} catch (Exception e) {
			LOGGER.warn("Exception: " + e.getMessage());
		}
		return null;
	}

	public static String encodeCIDv1ToARC19AlgorandAddress(String cid_str) {
		String derived_reserve_addr = "";

		// Parse the CID
		Cid cid_version1 = Cid.decode(cid_str); 
		//Cid cid_version1 = new Cid(1L, Codec.Raw, Multihash.Type.sha2_256, cid_str.getBytes());
		LOGGER.info("codec       : " + cid_version1.codec);
		LOGGER.info("version     : " + cid_version1.version);
		LOGGER.info("hashCode    : " + cid_version1.hashCode());
		LOGGER.info("hashlen     : " + cid_version1.getHash().length);
		LOGGER.info("");

		LOGGER.info("base58      : " + cid_version1.toBase58());
		LOGGER.info("hex         : " + cid_version1.toHex());
		LOGGER.info("string      : " + cid_version1.toString());
		LOGGER.info("");

		try {
			// parse the multihash, https://multiformats.io/multihash/

			//Multihash mh_version0 = Multihash.decode(cid_version1.toString());
			//LOGGER.debug("mh hex            : " + mh_version0.toHex());

			// Early exit
			if (cid_version1.toHex().length() != 72) {
				System.out.println("cid_version1.toHex().length(): " + cid_version1.toHex().length());
				return "";
			}

			// https://github.com/multiformats/multicodec/blob/master/table.csv
			String hash_func_type = cid_version1.toHex().substring(0, 2);
			LOGGER.info("mh hash_func_type : " + hash_func_type); // 0x01 = cidv1

			String multi_codec = cid_version1.toHex().substring(2, 4); 
			LOGGER.info("mh multi_codec    : " + multi_codec); // 0x70 = dag-pb, 0x55 = raw

			String multihash = cid_version1.toHex().substring(4, 6);
			LOGGER.info("mh multihash      : " + multihash); // 0x12 = multihash sha2-256

			String digest_length = cid_version1.toHex().substring(6, 8);
			int digest_length_int = Integer.parseInt(digest_length, 16); // 0x20 = 32 bytes 
			LOGGER.info("mh digest_length  : " + digest_length + " [" + digest_length_int + "]"); 

			String digest_value = cid_version1.toHex().substring(8, 72);
			LOGGER.info("mh digest_value   : " + digest_value);

			// Convert digest value to byte array
			byte[] byteValue = HexFormat.of().parseHex(digest_value);
			LOGGER.info("byteValue len     : " + byteValue.length);

			// Derive Algorand address
			derived_reserve_addr = new Address(byteValue).toString();

		} catch (Exception e1) {
			e1.printStackTrace();
		}

		return derived_reserve_addr;
	}

	public static ASAVerificationStatus verifyARC3Asset(IPFSConnector ipfs_connector, ARC3Asset _arcasset, ARC3MetaData _arc3metadata, String _metajson) {
		boolean verified = true;
		ArrayList<String> verified_properties = new ArrayList<String>();
		ArrayList<String> major_issues = new ArrayList<String>();
		ArrayList<String> warnings = new ArrayList<String>();
		int score = 10;

		// NFT mutability
		if (false ||
				(null == _arcasset.getManager()) ||
				((null != _arcasset.getManager()) && ("".equals(_arcasset.getManager().toString()))) ||
				false) {
			verified_properties.add("ASA is immutable since manager address is blank or set to \"\"");
		} else {
			warnings.add("Manager address is set, NFT is mutable (not yours)");
			score = score - 1;
		}

		// NFT Clawback
		if (false ||
				(null == _arcasset.getClawback()) ||
				((null != _arcasset.getClawback()) && ("".equals(_arcasset.getClawback().toString()))) ||
				false) {
			verified_properties.add("ASA cannot currently be withdrawn since clawback address is blank or set to \"\"");
		} else {
			warnings.add("Clawback address is set, ASA can be withdrawn (not yours)");
		}

		// NFT Freeze
		if (false ||
				(null == _arcasset.getFreeze()) ||
				((null != _arcasset.getFreeze()) && ("".equals(_arcasset.getFreeze().toString()))) ||
				false) {
			verified_properties.add("ASA cannot currently be frozen since freeze address is blank or set to \"\"");
		} else {
			warnings.add("Freeze address is set, ASA can be frozen (restricted)");
		}

		// Asset name constraints
		if (true &&
				_arcasset.getAssetURL().endsWith("#arc3") &&
				!_arcasset.getAssetName().equals("arc3") &&
				!_arcasset.getAssetName().contains("@arc3") &&
				true) {
			verified_properties.add("asset URL endswith #arc3 and name is not fixed to arc3 or contains @arc3");
		}

		// URL constraints
		if (_arcasset.getAssetURL().startsWith("ipfs://")) {
			verified_properties.add("asset URL uses IPFS");
		} else if (_arcasset.getAssetURL().startsWith("https://")) {
			warnings.add("Asset URL uses https:// instead of IPFS");
		} else {
			verified = false;
			major_issues.add("ARC3 ASA does not use ipfs:// or https://");
		}

		/**
		 *  Metadata content
		 */
		if (_metajson.contains("{") && _metajson.contains("}")) {
			byte[] sha256 = CryptUtils.calculateSHA256(_metajson);
			String sha256_base64 = StringsUtils.encodeBytesToBase64(sha256);

			// asset metadata hash
			if (null != _arcasset.getAssetMetadataHashSTR()) {
				if (!_arcasset.getAssetMetadataHashSTR().equals(sha256_base64)) {
					warnings.add("Metadata hash (" + _arc3metadata.getName() + ") does not match the calculated value (" + sha256_base64 + ")");
				} else {
					verified_properties.add("Calculated metadata hash matches the ASA specified hash (" + _arcasset.getAssetMetadataHashSTR() + ")");
				}
			} else {
				verified = false;
				major_issues.add("No metadata hash value specified in the ASA");
			}

			// Metadata 'name' should be related to ASA unit-name
			if ((null != _arcasset.getUnitName() && (null != _arc3metadata.getName()))) {
				double similarity = StringsUtils.lcsSimilarity(_arcasset.getUnitName(),_arc3metadata.getName());
				LOGGER.debug("similarity: " + similarity);
				if (_arcasset.getUnitName().equals(_arc3metadata.getName())) {
					verified_properties.add("Metadata name identical to the ASA specified unit name (" + _arcasset.getUnitName() + ")");
				} else if (false ||
						((null != _arc3metadata.getName()) && _arcasset.getUnitName().contains(_arc3metadata.getName())) ||
						((null != _arc3metadata.getName()) &&_arc3metadata.getName().contains(_arcasset.getUnitName())) ||
						(similarity >= 0.2d) || // hey, be nice, unitName is restricted to 8 chars
						false) {
					verified_properties.add("Metadata name (" + _arc3metadata.getName() + ") related the ASA specified unit name (" + _arcasset.getUnitName() + ")");
				} else {
					if (null == _arc3metadata.getName()) {
						warnings.add("Missing metadata name does not match the ASA specified unitname (" + _arcasset.getUnitName() + ")");
					} else {
						warnings.add("Metadata name (" + _arc3metadata.getName() + ") does not look similar the ASA specified unitname (" + _arcasset.getUnitName() + ")");
					}
				}
			} else {
				if (null == _arc3metadata.getName()) {
					warnings.add("No unit name value specified in the ARC3 ASA metadata");
				} else {
					warnings.add("No unit name value specified in the ARC3 ASA");
				}
				score = score - 1;
			}

			// image (metadata)
			if ((null != _arc3metadata.getImage()) && (null != _arc3metadata.getImage_integrity())) {

				// download the image and calculate base64 of sha256
				byte[] image_bytes = ipfs_connector.getBinaryContent(_arc3metadata.getImage());
				byte[] image_sha256 = CryptUtils.calculateSHA256FromByteArray(image_bytes);
				String image_sha256_base64 = StringsUtils.encodeBytesToBase64(image_sha256);

				// verify image_integrity
				if (_arc3metadata.getImage_integrity().equals("sha256-" + image_sha256_base64)) {
					verified_properties.add("Calculated image_integrity hash matches the metadata specified hash (" + image_sha256_base64 + ")");
				} else {
					verified = false;
					major_issues.add("Calculated image_integrity hash (" + image_sha256_base64 + ") does not match the metadata specified hash (" + _arc3metadata.getImage_integrity().replace("sha256-", "") + ")");
				}
			}

			// animation_url (metadata)
			if ((null != _arc3metadata.getAnimation_url()) && (null != _arc3metadata.getAnimation_url_integrity())) {

				// download the animation media and calculate base64 of sha256
				byte[] animation_bytes = ipfs_connector.getBinaryContent(_arc3metadata.getAnimation_url());
				byte[] animation_sha256 = CryptUtils.calculateSHA256FromByteArray(animation_bytes);
				String animation_sha256_base64 = StringsUtils.encodeBytesToBase64(animation_sha256);

				// animation_url_integrity
				if (_arc3metadata.getAnimation_url_integrity().equals("sha256-" + animation_sha256_base64)) {
					verified_properties.add("Calculated animation_url_integrity hash matches the metadata specified hash (" + animation_sha256_base64 + ")");
				} else {
					verified = false;
					major_issues.add("Calculated animation_url_integrity hash (" + animation_sha256_base64 + ") does not match the metadata specified hash (" + _arc3metadata.getAnimation_url_integrity().replace("sha256-", "") + ")");
				}

			}

			// external_url (metadata)
			if ((null != _arc3metadata.getExternal_url()) && (null != _arc3metadata.getExternal_url_integrity())) {

				// download the external_url media and calculate base64 of sha256
				byte[] external_bytes = ipfs_connector.getBinaryContent(_arc3metadata.getExternal_url());
				byte[] external_sha256 = CryptUtils.calculateSHA256FromByteArray(external_bytes);
				String external_sha256_base64 = StringsUtils.encodeBytesToBase64(external_sha256);

				// animation_url_integrity
				if (_arc3metadata.getExternal_url_integrity().equals("sha256-" + external_sha256_base64)) {
					verified_properties.add("Calculated external_url_integrity hash matches the metadata specified hash (" + external_sha256_base64 + ")");
				} else {
					verified = false;
					major_issues.add("Calculated external_url_integrity hash (" + external_sha256_base64 + ") does not match the metadata specified hash (" + _arc3metadata.getExternal_url_integrity().replace("sha256-", "") + ")");
				}

			}

		} else {
			verified = false;
			major_issues.add("Metadata does not seem to be valid JSON");
		}

		if (!warnings.isEmpty()) score = score - warnings.size();
		if (!verified) score = 0;
		if (score < 0) score = 0;

		return new ASAVerificationStatus(verified, verified_properties, major_issues, warnings, score);
	}

	public static ASAVerificationStatus verifyARC19Asset(IPFSConnector ipfs_connector, ARC19Asset _arcasset, ARC69ARC19MetaData _arc19metadata, String _metajson) {
		boolean verified = true;
		ArrayList<String> verified_properties = new ArrayList<String>();
		ArrayList<String> major_issues = new ArrayList<String>();
		ArrayList<String> warnings = new ArrayList<String>();
		int score = 10;

		// NFT mutability
		if (false ||
				(null == _arcasset.getManager()) ||
				((null != _arcasset.getManager()) && ("".equals(_arcasset.getManager().toString()))) ||
				false) {
			verified_properties.add("ASA is immutable since manager address is blank or set to \"\"");
		} else {
			warnings.add("Manager address is set, NFT is mutable (not yours)");
			score = score - 1;
		}

		// NFT Clawback
		if (false ||
				(null == _arcasset.getClawback()) ||
				((null != _arcasset.getClawback()) && ("".equals(_arcasset.getClawback().toString()))) ||
				false) {
			verified_properties.add("ASA cannot currently be withdrawn since clawback address is blank or set to \"\"");
		} else {
			warnings.add("Clawback address is set, ASA can be withdrawn (not yours)");
		}

		// NFT Freeze
		if (false ||
				(null == _arcasset.getFreeze()) ||
				((null != _arcasset.getFreeze()) && ("".equals(_arcasset.getFreeze().toString()))) ||
				false) {
			verified_properties.add("ASA cannot currently be frozen since freeze address is blank or set to \"\"");
		} else {
			warnings.add("Freeze address is set, ASA can be frozen (restricted)");
		}

		// URL constraints
		if (_arcasset.getAssetURL().startsWith("template-ipfs://")) {

			String assetURL = _arcasset.getAssetURL();
			assetURL = assetURL.replace("template-ipfs://{","");
			assetURL = assetURL.replace("}","");

			String[] parts = assetURL.split(":");
			if (parts.length != 5) {
				verified = false;
				major_issues.add("ARC19 ASA url has an invalid nr of parameters in the ipfs template schema: " + parts.length);
				score = score - 5;
			} else {
				String template = parts[0];
				String version = parts[1];
				String multicodec = parts[2];
				String fieldname = parts[3];
				String hashtype = parts[4];

				// template
				if (template.equals("ipfscid")) {
					verified_properties.add("ARC19 ASA url template is 'ipfscid'");
				} else {
					verified = false;
					major_issues.add("ARC19 ASA url template needs to be 'ipfscid'");
				}

				// version
				if (false ||
						"0".equals(version) ||
						"1".equals(version) ||
						false) {
					verified_properties.add("ARC19 ASA url specifies IPFS CID version '0' or '1'");
				} else {
					verified = false;
					major_issues.add("ARC19 ASA url does not specify a valid IPFS CID version: " + version);
				}

				// multicodec
				if (false ||
						"raw".equals(multicodec) ||
						"dag-pb".equals(multicodec) ||
						false) {
					verified_properties.add("ARC19 ASA url specifies valid multicodec");
				} else {
					verified = false;
					major_issues.add("ARC19 ASA url does not specify a valid multicodec: " + multicodec);
				}

				// fieldname
				if ("reserve".equals(fieldname)) {
					verified_properties.add("ARC19 ASA url fieldname is 'reserve'");
				} else {
					verified = false;
					major_issues.add("ARC19 ASA url fieldname is not 'reserve', fieldname set to " + fieldname);
				}

				// hashtype
				if ("sha2-256".equals(hashtype)) {
					verified_properties.add("ARC19 ASA url hashtype is 'sha2-256'");
				} else {
					verified = false;
					major_issues.add("ARC19 ASA url hashtype is not 'sha2-256', fieldname set to " + fieldname);
				}

			}

		} else {
			verified = false;
			major_issues.add("ARC19 ASA url does not begin with template schema");
		}

		/**
		 *  Metadata content
		 */
		if (_metajson.contains("{") && _metajson.contains("}")) {

			// Metadata 'name' should be related to ASA unit-name
			if ((null != _arcasset.getUnitName() && (null != _arc19metadata.getName()))) {

				double similarity = StringsUtils.lcsSimilarity(_arcasset.getUnitName(),_arc19metadata.getName());
				if (_arcasset.getUnitName().equals(_arc19metadata.getName())) {
					verified_properties.add("Metadata name identical to the ASA specified unit name (" + _arcasset.getUnitName() + ")");
				} else if (false ||
						((null != _arc19metadata.getName()) && _arcasset.getUnitName().contains(_arc19metadata.getName())) ||
						((null != _arc19metadata.getName()) &&_arc19metadata.getName().contains(_arcasset.getUnitName())) ||
						(similarity >= 0.2d) || // hey, be nice, unitName is restricted to 8 chars
						false) {
					verified_properties.add("Metadata name (" + _arc19metadata.getName() + ") related the ASA specified unit name (" + _arcasset.getUnitName() + ")");
				} else {
					if (null == _arc19metadata.getName()) {
						warnings.add("Missing metadata name does not match the ASA specified unitname (" + _arcasset.getUnitName() + ")");
					} else {
						warnings.add("Metadata name (" + _arc19metadata.getName() + ") does not match the ASA specified unitname (" + _arcasset.getUnitName() + ")");
					}
				}
			} else {
				if (null == _arc19metadata.getName()) {
					warnings.add("No unit name value specified in the ARC19 ASA metadata");
				} else {
					warnings.add("No unit name value specified in the ARC19 ASA");
				}
				score = score - 1;
			}

		} else {
			verified = false;
			major_issues.add("Metadata does not seem to be valid JSON");
		}

		if (!warnings.isEmpty()) score = score - warnings.size();
		if (!verified) score = 0;
		if (score < 0) score = 0;

		return new ASAVerificationStatus(verified, verified_properties, major_issues, warnings, score);
	}

	public static ASAVerificationStatus verifyARC69Asset(ARC69Asset _arcasset, ARC69ARC19MetaData _arc69metadata, String _metajson) {
		boolean verified = true;
		ArrayList<String> verified_properties = new ArrayList<String>();
		ArrayList<String> major_issues = new ArrayList<String>();
		ArrayList<String> warnings = new ArrayList<String>();
		int score = 10;

		// NFT mutability
		if (false ||
				(null == _arcasset.getManager()) ||
				((null != _arcasset.getManager()) && ("".equals(_arcasset.getManager().toString()))) ||
				false) {
			verified_properties.add("ASA is immutable since manager address is blank or set to \"\"");
		} else {
			warnings.add("Manager address is set, NFT is mutable (not yours)");
			score = score - 1;
		}

		// NFT Clawback
		if (false ||
				(null == _arcasset.getClawback()) ||
				((null != _arcasset.getClawback()) && ("".equals(_arcasset.getClawback().toString()))) ||
				false) {
			verified_properties.add("ASA cannot currently be withdrawn since clawback address is blank or set to \"\"");
		} else {
			warnings.add("Clawback address is set, ASA can be withdrawn (not yours)");
		}

		// NFT Freeze
		if (false ||
				(null == _arcasset.getFreeze()) ||
				((null != _arcasset.getFreeze()) && ("".equals(_arcasset.getFreeze().toString()))) ||
				false) {
			verified_properties.add("ASA cannot currently be frozen since freeze address is blank or set to \"\"");
		} else {
			warnings.add("Freeze address is set, ASA can be frozen (restricted)");
		}

		// URL constraints on schema
		if (_arcasset.getAssetURL().startsWith("ipfs://")) {
			verified_properties.add("ARC69 ASA media URL uses IPFS");
		} else if (_arcasset.getAssetURL().startsWith("https://")) {
			warnings.add("ARC69 ASA media URL uses https:// instead of IPFS");
		} else if (_arcasset.getAssetURL().startsWith("template-ipfs:")) {
			warnings.add("ARC69 ASA media URL is using ARC19 style URL. Kinda neat but fails a SHOULD requirement.");
		} else {
			verified = false;
			major_issues.add("ARC69 ASA does not use ipfs:// or https:// for media URL");
		}

		// URL contstraints on media type
		if (false ||
				_arcasset.getAssetURL().endsWith("#v") ||
				_arcasset.getAssetURL().endsWith("#i") ||
				_arcasset.getAssetURL().endsWith("#a") ||
				_arcasset.getAssetURL().endsWith("#p") ||
				_arcasset.getAssetURL().endsWith("#h") ||
				false) {
			verified_properties.add("ARC69 ASA media URL specifies media type using # fragment identifier");
		} else {
			warnings.add("ARC69 ASA media URL does not specify media type using # fragment identifier");
		} 

		/**
		 *  Metadata content
		 */
		if (_metajson.contains("{") && _metajson.contains("}")) {

			// Metadata 'name' should be related to ASA unit-name
			if ((null != _arcasset.getUnitName() && (null != _arc69metadata.getName()))) {

				double similarity = StringsUtils.lcsSimilarity(_arcasset.getUnitName(),_arc69metadata.getName());
				if (_arcasset.getUnitName().equals(_arc69metadata.getName())) {
					verified_properties.add("Metadata name identical to the ASA specified unit name (" + _arcasset.getUnitName() + ")");
				} else if (false ||
						((null != _arc69metadata.getName()) && _arcasset.getUnitName().contains(_arc69metadata.getName())) ||
						((null != _arc69metadata.getName()) &&_arc69metadata.getName().contains(_arcasset.getUnitName())) ||
						(similarity >= 0.2d) || // hey, be nice, unitName is restricted to 8 chars
						false) {
					verified_properties.add("Metadata name (" + _arc69metadata.getName() + ") related the ASA specified unit name (" + _arcasset.getUnitName() + ")");
				} else {
					if (null == _arc69metadata.getName()) {
						warnings.add("Missing metadata name does not match the ASA specified unitname (" + _arcasset.getUnitName() + ")");
					} else {
						warnings.add("Metadata name (" + _arc69metadata.getName() + ") does not match the ASA specified unitname (" + _arcasset.getUnitName() + ")");
					}
				}
			} else {
				if (null == _arc69metadata.getName()) {
					warnings.add("No unit name value specified in the ARC69 ASA metadata");
				} else {
					warnings.add("No unit name value specified in the ARC69 ASA");
				}
				score = score - 1;
			}

		} else {
			verified = false;
			major_issues.add("Metadata does not seem to be valid JSON");
		}

		if (!warnings.isEmpty()) score = score - warnings.size();
		if (!verified) score = 0;
		if (score < 0) score = 0;

		return new ASAVerificationStatus(verified, verified_properties, major_issues, warnings, score);
	}

	public static AlgoLocalWallet getWalletWithName(final String _walletName) {
		File walletDirectory = new File(".avm/wallets/" + _walletName);
		if (!walletDirectory.exists()) return null;
		if (walletDirectory.listFiles().length == 0) return null;
		try {
			File f = walletDirectory.listFiles()[0];
			String json = FilesUtils.readAllFromFileWithPath(f.getAbsolutePath());
			AlgoLocalWallet wallet = JSONUtils.createPOJOFromJSON(json, AlgoLocalWallet.class);
			LOGGER.debug("Just restored ALGO wallet with name " + _walletName + " from " + f.getAbsolutePath());
			return wallet;
		} catch (Exception e) {
			LOGGER.warn("e: " + e.getMessage());
			SystemUtils.halt();
		}
		return null;
	}

	public static boolean createWalletWithName(final String _walletName, final String _mnemonic) {
		File walletDirectory = new File(".avm/wallets/" + _walletName);
		if (walletDirectory.exists()) {
			LOGGER.info("Wallet with name " + _walletName + " already exists");
			return true;
		}
		if ((null != walletDirectory.listFiles()) && walletDirectory.listFiles().length == 0) {
			LOGGER.error("Wallet folder with name " + _walletName + " already exists but is empty");
			return false;
		}

		try {
			Account generatedAccount = new Account(_mnemonic);
			AlgoLocalWallet wallet = new AlgoLocalWallet();
			wallet.setWalletName(_walletName);
			wallet.setMnemonic(_mnemonic);
			wallet.setAddress(generatedAccount.getAddress().toString());
			LOGGER.info("Generated wallet from mnemonic with name " + _walletName + " with address " + wallet.getAddress());
			String json = JSONUtils.createJSONFromPOJO(wallet);
			String outfilePath = ".avm/wallets/" + _walletName + "/algowallet.json";
			walletDirectory.mkdirs();
			FilesUtils.writeToFileUNIX(json, outfilePath);
			return true;
		} catch (Exception e) {
			LOGGER.warn("e: " + e.getMessage());
		}
		return false;
	}

	public static boolean createNewRandomWalletWithName(final String _walletName) {
		String mnemonic = createNewRandomAccount().toMnemonic();
		return createWalletWithName(_walletName, mnemonic);
	}

	public static Account createNewRandomAccount() {
		Account acc = null;
		try {
			acc = new Account();
		} catch (Exception e) {
			LOGGER.error("Account creation error " + e.getMessage());
			SystemUtils.halt();
		}
		return acc;
	}

	public static boolean isValidAlgorandAddressSimple(String _address) {
		return ALGO_ADDRESS_PATTERN.matcher(_address).matches();
	}


	private static final char[] ALGORAND_BASE32_MAP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray();
	private static final int[] DECODE_MAP = new int[128];

	static {
		for (int i = 0; i < DECODE_MAP.length; i++) {
			DECODE_MAP[i] = -1;
		}
		for (int i = 0; i < ALGORAND_BASE32_MAP.length; i++) {
			DECODE_MAP[ALGORAND_BASE32_MAP[i]] = i;
		}
	}

	public static boolean isValidAlgorandAddress(String _address) {
		try {
			new Address(_address);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static AVMNFTStandard identifyARCStandardFromMetadata(String metadata_json) {

		ArrayList<String> keys = JSONUtils.getKeyNamesOfJSON(metadata_json);
		for (String keyname: keys) {
			if (keyname.contains("integrity")) return AVMNFTStandard.ARC3;
			if (keyname.equals("standard")) {
				if (metadata_json.contains("arc69")) return AVMNFTStandard.ARC69;
			}
		}

		return AVMNFTStandard.UNKNOWN;
	}

	public static Address createAddressFromSTR(final String _addr) {
		try {
			Address algorand_address = new Address(_addr);
			return algorand_address;
		} catch (Exception e) {
			LOGGER.error("String is not a valid Algorand address: " + _addr);
			SystemUtils.halt();
		}
		return null;
	}

	public static String printASAAssetOwnership(BigInteger _amount, ASAContentOnchainReply _reply, AVMNFTStandard _arcstandard) {
		StringBuffer sb = new StringBuffer();
		sb.append(StringsUtils.cutAndPadStringToN("amount=" + _amount + "/" + NumUtils.prettyprintTotal(_reply.getParams().getTotal()), 30));
		if (null != _reply.getParams().getUnit_name()) {
			if (_arcstandard == AVMNFTStandard.UNKNOWN) {
				sb.append(StringsUtils.cutAndPadStringToN(" unit-name=" + _reply.getParams().getUnit_name(), 25) + StringsUtils.cutAndPadStringToN(" ", 19));
			} else {
				sb.append(StringsUtils.cutAndPadStringToN(" unit-name=" + _reply.getParams().getUnit_name(), 25) + StringsUtils.cutAndPadStringToN(" standard=" + _arcstandard, 19));
			}

		} else {
			if (_arcstandard == AVMNFTStandard.UNKNOWN) {
				sb.append(StringsUtils.cutAndPadStringToN(" unit-name=MISSING", 25) + StringsUtils.cutAndPadStringToN(" ", 19));
			} else {
				sb.append(StringsUtils.cutAndPadStringToN(" unit-name=MISSING", 25) + StringsUtils.cutAndPadStringToN(" standard=" + _arcstandard, 19));
			}
		}
		if (null != _reply.getParams().getUrl()) {
			if (_reply.getParams().getUrl().length() > 65) {
				sb.append(StringsUtils.cutAndPadStringToN(" url=" + StringsUtils.cutStringFromLeft(_reply.getParams().getUrl(),60) + "..", 70));
			} else {
				sb.append(StringsUtils.cutAndPadStringToN(" url=" + _reply.getParams().getUrl(), 70));
			}

		} else {
			sb.append(StringsUtils.cutAndPadStringToN(" url=MISSING", 70));
		}
		sb.append(" assetid=" + _reply.getIndex());
		return sb.toString();
	}

	public static String printASAAssetOptins(ASAContentOnchainReply _reply) {
		StringBuffer sb = new StringBuffer();
		if (null != _reply.getParams().getUnit_name()) {
			sb.append(StringsUtils.cutAndPadStringToN(" unit-name=" + _reply.getParams().getUnit_name(), 30));
		} else {
			sb.append(StringsUtils.cutAndPadStringToN(" unit-name=MISSING", 30));
		}
		if (null != _reply.getParams().getUrl()) {
			if (_reply.getParams().getUrl().length() > 65) {
				sb.append(StringsUtils.cutAndPadStringToN(" url=" + StringsUtils.cutStringFromLeft(_reply.getParams().getUrl(),60) + "..", 70));
			} else {
				sb.append(StringsUtils.cutAndPadStringToN(" url=" + _reply.getParams().getUrl(), 70));
			}

		} else {
			sb.append(StringsUtils.cutAndPadStringToN(" url=MISSING", 70));
		}
		sb.append(" index=" + _reply.getIndex());
		return sb.toString().replaceFirst(" ", "");
	}

	public static AVMPortfolio getAVMPortfolioForAccount(AVMBlockChainUltraConnector _ultra_connector, String _account_addr) {
		return getAVMPortfolioForAccount(_ultra_connector, _account_addr, true, null, null, false);
	}

	public static AVMPortfolio getAVMPortfolioForAccount(AVMBlockChainUltraConnector _ultra_connector, String _account_addr, boolean debug) {
		return getAVMPortfolioForAccount(_ultra_connector, _account_addr, true, null, null, debug);
	}

	public static AVMPortfolio getAVMPortfolioForAccount(AVMBlockChainUltraConnector _ultra_connector, String _account_addr, boolean _checkfornfts, HashMap<String, Boolean> _token_restriction, HashMap<String, Boolean> _nft_restriction, boolean _debug) {
		LOGGER.debug("getAVMPortfolioForAccount()");

		HashMap<AVMChain, AVMChainPortfolio> chainportfolio = new HashMap<>();

		for (AVMChain chain: AVMChain.values()) {
			//if (_debug) System.out.println("chain: " + chain);

			/**
			 * Verify RPC node connectivity
			 */
			AVMBlockChainConnector connector_temp = _ultra_connector.getConnectors().get(chain);
			if (null == connector_temp) {
				LOGGER.debug("We dont have a valid connector for chain " + chain);
			} else {
				Long latestBlockNr = AVMUtils.getLastRound(connector_temp);
				if (null == latestBlockNr) {
					LOGGER.warn("Seems we cant get a good connection to the chain " + chain);
					LOGGER.info("Skipping and will move on ..");
				} else {
					if (_debug) LOGGER.info("We have a valid connector for chain " + chain +", latestBlockNr=" + latestBlockNr);

					HashMap<String, AVMAccountBalance> tokens = new HashMap<>();
					HashMap<String, AVMNftAccountBalance> nfttokens = new HashMap<>();
					AVMAccountBalance native_balance = null;

					AVMChainInfo chainInfo = AVMUtils.getAVMChainInfo(chain);
					if (BlockchainType.valueOf(chainInfo.getType()) == _ultra_connector.getChainType()) {
						AVMBlockChainConnector connector = _ultra_connector.getConnectors().get(chain);

						if (null != connector) {

							/**
							 * Check native balance (required for ASAs)
							 */
							native_balance = AVMUtils.getAccountNativeBalance(connector, createAddressFromSTR(_account_addr));
							if ((null != native_balance) && (!native_balance.isEmpty())) {

								// DEBUG
								if (_debug) {
									System.out.println(" - algoWalletBalance (uAlgo)        : " + native_balance.getBalanceInMicroAlgo());
									System.out.println(" - algoWalletBalance (Algo)         : " + native_balance.getBalanceInALGO());
								}

								Long txCount = 0L;
								Long calculatedMinimumBalance = 0L;
								Long total_apps_optedin = 0L;
								Long total_created_apps = 0L;
								boolean accounts_holds_assets = false;

								if (null != connector.getIndexer_instance()) {

									if (_debug) System.out.println("Getting tx summary on network ");
									txCount = AVMUtils.getTransactionSummaryForAccount(connector, _account_addr).getTxcount();

									/**
									 * ASA balances, opt-ins, ..
									 */
									// Check if account holds assets
									accounts_holds_assets = AVMUtils.holdsAssets(connector, createAddressFromSTR(_account_addr));
									if (accounts_holds_assets) {
										LOGGER.debug("Account holds assets..");

										List<ApplicationLocalState> localstates_owned = AVMUtils.getLocalStateInfoForAccount(connector, AVMUtils.createAddressFromSTR(_account_addr));
										if (localstates_owned.size()>0) {
											LOGGER.debug("Found some localstates:");
											for (ApplicationLocalState localstate: localstates_owned) {
												LOGGER.debug(" - localstate for appid: " + localstate.id);
											}
										}

										calculatedMinimumBalance = AVMUtils.calculateMinimumBalanceForASAOwnedByAccount(connector, AVMUtils.createAddressFromSTR(_account_addr));
										total_apps_optedin = AVMUtils.getTotalAppsOptedInForAccount(connector, AVMUtils.createAddressFromSTR(_account_addr));
										total_created_apps = AVMUtils.getTotalCreatedAppsForAccount(connector, AVMUtils.createAddressFromSTR(_account_addr));

										// DEBUG
										if (_debug) {
											System.out.println(" - calculatedMinimumBalance (uAlgo) : " + calculatedMinimumBalance);
											System.out.println(" - total_apps_optedin               : " + total_apps_optedin);
											System.out.println(" - total_created_apps               : " + total_created_apps);
										}

										/**
										 * ASAs
										 */
										if (_debug) System.out.println("getTotalAssetsOptedInForAccount()");
										if (AVMUtils.getTotalAssetsOptedInForAccount(connector, AVMUtils.createAddressFromSTR(_account_addr)) > 0L) {
											if (_debug) System.out.println("Found some ASA opt-ins: ");
											List<AssetHolding> asas_optins = AVMUtils.getASAOwnershipInfoForAccount(connector, AVMUtils.createAddressFromSTR(_account_addr));
											for (AssetHolding asa: asas_optins) {
												if (_debug) System.out.println(" - " + asa.assetId + ": deleted=" + asa.deleted + " frozen:" + asa.isFrozen + " amount: " + asa.amount + " optedInAtRound: " + asa.optedInAtRound);
												if (_debug) System.out.println("checkIfASAExists()");
												if (AVMUtils.checkIfASAExists(connector, asa.assetId)) {
													if (_debug) System.out.println("getASARawJSONResponse()");
													String json = AVMUtils.getASARawJSONResponse(connector, asa.assetId);
													if (_debug) System.out.println("identifyARCStandardFromASAJSON()");
													AVMNFTStandard standard = AVMUtils.identifyARCStandardFromASAJSON(connector, json);
													if (_debug) System.out.println("standard: " + standard.name());
													ASAContentOnchainReply reply = AVMUtils.getASAJSON(json);
													if (_debug) System.out.println("ASA name: " + reply.getParams().getName());
													if ((!asa.amount.equals(BigInteger.ZERO)) && (standard != AVMNFTStandard.UNKNOWN)) {
														if (_debug) System.out.println(AVMUtils.printASAAssetOwnership(asa.amount, reply, standard));
													} else {
														if (_debug) System.out.println(AVMUtils.printASAAssetOwnership(asa.amount, reply, standard));
													}

													// We need at least non 0 ASA for this to be interesting (not listing empty opt-ins)
													if ((!asa.amount.equals(BigInteger.ZERO))) {
														if (null != reply.getParams().getUnit_name()) {
															if (standard == AVMNFTStandard.UNKNOWN) {
																Double amountAlgo = Double.parseDouble("" + asa.amount.longValue()) / 1000000.0d;
																tokens.put(reply.getIndex().toString(), new AVMAccountBalance(asa.amount.longValue(), amountAlgo, new AVMCurrency(reply.getParams().getName(), reply.getParams().getUnit_name(), reply.getParams().getDecimals()), false));
															} else {
																nfttokens.put(reply.getIndex().toString(), new AVMNftAccountBalance(asa.amount.toString(), false, reply.getParams().getName(), reply.getParams().getUnit_name()));
															}
															if (_debug) System.out.println("ASA DEBUG: " + reply.getParams().getUnit_name() + " standard: " + standard);
														}
													}
												}
											}
										}
									}
								} else {
									LOGGER.warn("txCount values etc wont be accurate since no indexer is present for chain " + chain);
								}

								AVMChainPortfolio portfolio = new AVMChainPortfolio(_account_addr, chain.toString(), native_balance, txCount, tokens, nfttokens, calculatedMinimumBalance, total_apps_optedin, total_created_apps, accounts_holds_assets);
								chainportfolio.put(chain, portfolio);

							}
						}

					}
				}
			}
		}

		return new AVMPortfolio(_account_addr, chainportfolio, System.currentTimeMillis()/1000L);
	}

	public static void printARCInfo(AVMBlockChainConnector _connector, AVMNFTStandard _standard, Long _assetID) {
		if (_standard == AVMNFTStandard.ARC3) {
			ARC3Asset arcasset = AVMUtils.getARC3Info(_connector, _assetID);
			System.out.println(arcasset.toString());
		}
		if (_standard == AVMNFTStandard.ARC19) {
			ARC19Asset arcasset = AVMUtils.getARC19Info(_connector, _assetID);
			System.out.println(arcasset.toString());
		}
		if (_standard == AVMNFTStandard.ARC69) {
			ARC69Asset arc69asset = AVMUtils.getARC69Info(_connector, _assetID);
			System.out.println(arc69asset.toString());
		}
	}

	public static String getARCImageURL(AVMBlockChainConnector _connector, Long _assetid) {
		String asa_json = AVMUtils.getASARawJSONResponse(_connector, _assetid);
		AVMNFTStandard standard = AVMUtils.identifyARCStandardFromASAJSON(_connector, asa_json);
		if (standard == AVMNFTStandard.ARC3) {
			ARC3Asset arcasset = AVMUtils.createARC3Asset(asa_json);

			System.out.println("assetURL: " + arcasset.getAssetURL());
			IPFSConnector ipfs_connector = new IPFSConnector();

			// Grab the metadata
			String metajson = ipfs_connector.getStringContent(arcasset.getAssetURL().replace("#arc3",""));
			ARC3MetaData arcmetadata = JSONUtils.createPOJOFromJSON(metajson, ARC3MetaData.class);
			return(arcmetadata.getImage());
		}
		if (standard == AVMNFTStandard.ARC19) {
			ARC19Asset arcasset = AVMUtils.createARC19Asset(asa_json);
			String cid = AVMUtils.extractCIDFromARC19URLAndReserveAddress(arcasset.getAssetURL(), arcasset.getReserve().toString());

			if (!"".equals(cid)) {
				LOGGER.info("Resolved cid from ARC19 template to: " + cid);
				IPFSConnector ipfs_connector = new IPFSConnector();

				// Grab the metadata and print the 'image' key content
				String metajson = ipfs_connector.getStringContent("ipfs://" + cid);
				ARC69ARC19MetaData arcmetadata = JSONUtils.createPOJOFromJSON(metajson, ARC69ARC19MetaData.class);
				return(arcmetadata.getImage());

			}
		}
		if (standard == AVMNFTStandard.ARC69) {
			ARC69Asset arcasset = AVMUtils.createARC69Asset(asa_json);

			// Special case, ARC69 asa with ARC19 encoded url
			if (arcasset.getAssetURL().contains("template-ipfs")) {
				String cid = AVMUtils.extractCIDFromARC19URLAndReserveAddress(arcasset.getAssetURL(), arcasset.getReserve().toString());
				return("ipfs://" + cid);
			} else {
				return(arcasset.getAssetURL());
			}
		}
		return "MISSING";
	}

	public static String getARCMetadataFromASAAssetID(AVMBlockChainConnector _connector, Long _assetid) {
		String asa_json = AVMUtils.getASARawJSONResponse(_connector, _assetid);

		AVMNFTStandard standard = AVMUtils.identifyARCStandardFromASAJSON(_connector, asa_json);
		if (standard == AVMNFTStandard.ARC3) {
			ARC3Asset arcasset = AVMUtils.createARC3Asset(asa_json);

			System.out.println("assetURL: " + arcasset.getAssetURL());
			IPFSConnector ipfs_connector = new IPFSConnector();

			// Grab the metadata
			String metajson = ipfs_connector.getStringContent(arcasset.getAssetURL());
			return(metajson);
		}
		if (standard == AVMNFTStandard.ARC19) {
			ARC19Asset arcasset = AVMUtils.createARC19Asset(asa_json);
			String cid = AVMUtils.extractCIDFromARC19URLAndReserveAddress(arcasset.getAssetURL(), arcasset.getReserve().toString());

			if (!"".equals(cid)) {
				LOGGER.info("Resolved cid from ARC19 template to: " + cid);
				IPFSConnector ipfs_connector = new IPFSConnector();

				// Grab the metadata
				String metajson = ipfs_connector.getStringContent("ipfs://" + cid);
				return(metajson);
			}
		}
		if (standard == AVMNFTStandard.ARC69) {
			ARC69Asset arcasset = AVMUtils.createARC69Asset(asa_json);
			LOGGER.debug("Using indexer to fetch latest tx note ..");
			String latesttxnote = AVMUtils.getASALatestConfigTransactionNote(_connector, arcasset.getAssetID());
			latesttxnote = StringsUtils.cleanJSON(latesttxnote);
			return(latesttxnote);
		}

		return "N/A";
	}

	public static ArrayList<MetaDataEntry> getARCMetadataHistoryFromASAAssetID(AVMBlockChainConnector _connector, Long _assetid) {
		String asa_json = AVMUtils.getASARawJSONResponse(_connector, _assetid);

		ArrayList<MetaDataEntry> result = new ArrayList<MetaDataEntry>();

		AVMNFTStandard standard = AVMUtils.identifyARCStandardFromASAJSON(_connector, asa_json);
		if (standard == AVMNFTStandard.ARC3) {
			ARC3Asset arcasset = AVMUtils.createARC3Asset(asa_json);

			System.out.println("assetURL: " + arcasset.getAssetURL());
			IPFSConnector ipfs_connector = new IPFSConnector();

			// Grab the metadata
			String metajson = ipfs_connector.getStringContent(arcasset.getAssetURL());
			result.add(new MetaDataEntry(metajson));
			return result;
		}
		if (standard == AVMNFTStandard.ARC19) {
			ARC19Asset arcasset = AVMUtils.createARC19Asset(asa_json);
			String cid = AVMUtils.extractCIDFromARC19URLAndReserveAddress(arcasset.getAssetURL(), arcasset.getReserve().toString());

			if (!"".equals(cid)) {
				LOGGER.info("Resolved cid from ARC19 template to: " + cid);
				IPFSConnector ipfs_connector = new IPFSConnector();

				// Grab the metadata
				String metajson = ipfs_connector.getStringContent("ipfs://" + cid);
				result.add(new MetaDataEntry(metajson));
				return result;
			}
		}
		if (standard == AVMNFTStandard.ARC69) {
			ARC69Asset arcasset = AVMUtils.createARC69Asset(asa_json);
			LOGGER.debug("Using indexer to fetch latest tx note ..");
			ArrayList<MetaDataEntry> txnotes = AVMUtils.getASAConfigTransactionNotes(_connector, arcasset.getAssetID());
			return txnotes;
		}

		return result;
	}

	public static ASAVerificationStatus verifyARCAsset(AVMBlockChainConnector _connector, Long _assetid) {
		String asa_json = AVMUtils.getASARawJSONResponse(_connector, _assetid);

		AVMNFTStandard standard = AVMUtils.identifyARCStandardFromASAJSON(_connector, asa_json);
		LOGGER.info("Standard determined to be: " + standard);
		if (standard == AVMNFTStandard.ARC3) {
			ARC3Asset arc3asset = AVMUtils.createARC3Asset(asa_json);
			IPFSConnector ipfs_connector = new IPFSConnector();

			// Grab the metadata
			LOGGER.info("Getting metadata from assetURL " + arc3asset.getAssetURL());
			String metajson = ipfs_connector.getStringContent(arc3asset.getAssetURL().replace("#arc3",""));
			ARC3MetaData arc3metadata = JSONUtils.createPOJOFromJSON(metajson, ARC3MetaData.class);

			ASAVerificationStatus vstatus = AVMUtils.verifyARC3Asset(ipfs_connector, arc3asset, arc3metadata, metajson);
			return vstatus;
		}
		if (standard == AVMNFTStandard.ARC19) {
			ARC19Asset arc19asset = AVMUtils.createARC19Asset(asa_json);
			String cid = AVMUtils.extractCIDFromARC19URLAndReserveAddress(arc19asset.getAssetURL(), arc19asset.getReserve().toString());

			if (!"".equals(cid)) {
				LOGGER.info("Resolved cid from ARC19 template to: " + cid);
				IPFSConnector ipfs_connector = new IPFSConnector();

				// Grab the metadata
				String metajson = ipfs_connector.getStringContent("ipfs://" + cid);
				ARC69ARC19MetaData arcmetadata = JSONUtils.createPOJOFromJSON(metajson, ARC69ARC19MetaData.class);

				ASAVerificationStatus vstatus = AVMUtils.verifyARC19Asset(ipfs_connector, arc19asset, arcmetadata, metajson);
				return vstatus;
			} 
		}
		if (standard == AVMNFTStandard.ARC69) {
			ARC69Asset arcasset = AVMUtils.createARC69Asset(asa_json);

			// Grab the metadata
			String metajson = AVMUtils.getASALatestConfigTransactionNote(_connector, arcasset.getAssetID());
			metajson = StringsUtils.cleanJSON(metajson);
			ARC69ARC19MetaData arcmetadata = JSONUtils.createPOJOFromJSON(metajson, ARC69ARC19MetaData.class);

			ASAVerificationStatus vstatus = AVMUtils.verifyARC69Asset(arcasset, arcmetadata, metajson);
			return vstatus;
		}
		return null;
	}

	public static AVMPortfolio readLatestPortfolioSnapshot(String _address, String _snapshotfolder) {
		String filePath = _snapshotfolder + "/" + _address + ".json";
		File f = new File(filePath);
		if (f.exists()) {
			String json = FilesUtils.readAllFromFileWithPath(filePath);
			AVMPortfolio chainPortfolioSnapshot = JSONUtils.createPOJOFromJSON(json, AVMPortfolio.class);
			return chainPortfolioSnapshot;
		} else {
			return null;
		}
	}

	public static void updatePortfolioSnapshot(AVMPortfolio _chainPortfolio, String _snapshotfolder) {
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

	public static AVMPortfolioSimple createAVMPortfolioSimple(AVMPortfolio _avm_portfolio) {
		if (null == _avm_portfolio) return null;
		return new AVMPortfolioSimple(_avm_portfolio.getAccount_address(), _avm_portfolio.getChainportfolio());
	}

	public static AVMPortfolioDiffResult getAVMPortfolioDiff(AVMPortfolioSimple _portfolio, AVMPortfolioSimple _portfolio_ref) {
		StringBuffer sb = new StringBuffer();
		sb.append("---------------------------------------------------------------------------------------\n");
		sb.append("Portfolio summary for account: " + _portfolio.getAccount_address() + "\n\n");
		AVMPortfolioDiff portfolio_diff = null;
		double minValueToTrack = 0.0001d;
		int symbol_char_offset = 25;

		boolean ref_portfolio_exists = false;
		String breakline = "---------------------------------------------------------------------------------------";
		String breaklinemini = "----------------------------------------------";

		if (null != _portfolio_ref) ref_portfolio_exists = true;

		for (AVMChain chain: _portfolio.getChainportfolio().keySet()) {
			AVMChainInfo chainInfo = AVMUtils.getAVMChainInfo(chain);
			AVMChainPortfolio chain_portfolio = _portfolio.getChainportfolio().get(chain);
			AVMChainPortfolio chain_portfolio_ref = null;
			AVMChainPortfolioDiff chain_portfolio_diff = null;

			if (ref_portfolio_exists) chain_portfolio_ref = _portfolio_ref.getChainportfolio().get(chain);
			/**
			 * Check native balance
			 */
			int native_name_offset = 73;
			AVMAccountBalance native_balance = chain_portfolio.getNativeBalance();
			if (!native_balance.isEmpty()) {
				if (ref_portfolio_exists) {
					BigDecimal native_balance_refBD = null;
					if (null == chain_portfolio_ref) {
						native_balance_refBD = new BigDecimal(0);
					} else {
						AVMAccountBalance native_balance_ref = chain_portfolio_ref.getNativeBalance();
						if (native_balance_ref == null) {
							native_balance_refBD = new BigDecimal(0);
						} else {
							native_balance_refBD = new BigDecimal(native_balance_ref.getBalanceInALGO());
						}
					}
					BigDecimal native_balance_BD = new BigDecimal(native_balance.getBalanceInALGO());
					BigDecimal native_balance_diff = native_balance_BD.subtract(native_balance_refBD).setScale(2, RoundingMode.HALF_UP);
					if (native_balance_diff.compareTo(BigDecimal.valueOf(minValueToTrack)) > 0) {
						sb.append(StringsUtils.cutAndPadStringToN(chain + " balance: ", native_name_offset) + StringsUtils.cutAndPadStringToN(" (" + native_balance.getBalanceInALGO() + " " + chainInfo.getNativeCurrency().getSymbol() + ")", symbol_char_offset) + " diff: +" + native_balance_diff + "\n");

						// Handle cases where new chain activity is noted
						if (null == chain_portfolio_ref) chain_portfolio_ref = new AVMChainPortfolio();
						if (null == chain_portfolio_diff) chain_portfolio_diff = new AVMChainPortfolioDiff();

						// Store our diff
						chain_portfolio_diff.setAccount_address(chain_portfolio.getAccount_address());
						chain_portfolio_diff.setChain(chain.toString());

						AVMAccountBalance native_balance_ref = null;
						if (null == chain_portfolio_ref.getNativeBalance()) {
							native_balance_ref = new AVMAccountBalance(0L, 0.0d, chainInfo.getNativeCurrency(), true);
						} else {
							native_balance_ref = chain_portfolio_ref.getNativeBalance();
						}

						Long native_balance_diff_uAlgo = native_balance.getBalanceInMicroAlgo() - native_balance_ref.getBalanceInMicroAlgo();
						Double native_balance_diff_in_ALGO = Double.parseDouble(native_balance_diff_uAlgo + "") / 100000d;
						chain_portfolio_diff.setNativeBalance(new AVMAccountBalance(native_balance_diff_uAlgo, native_balance_diff_in_ALGO, chainInfo.getNativeCurrency(), false));

					} else if (native_balance_diff.compareTo(BigDecimal.valueOf(-minValueToTrack)) < 0) {
						if (native_balance_diff.toString().startsWith("-")) {
							sb.append(StringsUtils.cutAndPadStringToN(chain + " balance", native_name_offset) + StringsUtils.cutAndPadStringToN(" (" + NumUtils.round(native_balance.getBalanceInALGO(),2) + " " + chainInfo.getNativeCurrency().getSymbol() + ")", symbol_char_offset) + " diff: " + native_balance_diff + "\n");
						} else {
							sb.append(StringsUtils.cutAndPadStringToN(chain + " balance", native_name_offset) + StringsUtils.cutAndPadStringToN(" (" + NumUtils.round(native_balance.getBalanceInALGO(),2) + " " + chainInfo.getNativeCurrency().getSymbol() + ")", symbol_char_offset) + "\n");
						}

						// Handle cases where new chain activity is noted
						if (null == chain_portfolio_ref) chain_portfolio_ref = new AVMChainPortfolio();
						if (null == chain_portfolio_diff) chain_portfolio_diff = new AVMChainPortfolioDiff();

						// Store our diff
						chain_portfolio_diff.setAccount_address(chain_portfolio.getAccount_address());
						chain_portfolio_diff.setChain(chain.toString());

						AVMAccountBalance native_balance_ref = null;
						if (null == chain_portfolio_ref.getNativeBalance()) {
							native_balance_ref = new AVMAccountBalance(0L, 0.0d, chainInfo.getNativeCurrency(), true);
						} else {
							native_balance_ref = chain_portfolio_ref.getNativeBalance();
						}

						Long native_balance_diff_uAlgo = native_balance.getBalanceInMicroAlgo() - native_balance_ref.getBalanceInMicroAlgo();
						Double native_balance_diff_in_ALGO = Double.parseDouble(native_balance_diff_uAlgo.toString())/1000000d;
						chain_portfolio_diff.setNativeBalance(new AVMAccountBalance(native_balance_diff_uAlgo, native_balance_diff_in_ALGO, chainInfo.getNativeCurrency(), false));

					} else {
						sb.append(StringsUtils.cutAndPadStringToN(chain + " balance", native_name_offset) + StringsUtils.cutAndPadStringToN(" (" + NumUtils.round(native_balance.getBalanceInALGO(),2) + " " + chainInfo.getNativeCurrency().getSymbol() + ")", symbol_char_offset) + "\n");
					}
				} else {
					sb.append(StringsUtils.cutAndPadStringToN(chain + " balance", native_name_offset) + StringsUtils.cutAndPadStringToN(" (" + NumUtils.round(native_balance.getBalanceInALGO(),2) + " " + chainInfo.getNativeCurrency().getSymbol() + ")", symbol_char_offset) + "\n");
				}
				if (chain_portfolio.getTxCount() == 1000L) {
					sb.append(StringsUtils.cutAndPadStringToN(" - txCount: " + chain_portfolio.getTxCount(), 20) + "++\n");
				} else {
					sb.append(StringsUtils.cutAndPadStringToN(" - txCount: " + chain_portfolio.getTxCount(), 20) + "\n");	
				}
				sb.append(breakline + "\n");

				/**
				 * ASA tokens
				 */
				StringBuffer sb_asa = new StringBuffer();
				int asa_name_offset = 14; // LP names need this ..
				int asa_fullname_offset = 31; // for them LP pools ..
				int asa_id_offset = 17;

				for (String asa_token_id_STR: chain_portfolio.getTokens().keySet()) {

					Long asa_token_id = null;
					try {
						asa_token_id = Long.parseLong(asa_token_id_STR);
					} catch (Exception e) {
						LOGGER.error("ASA id must be a numeric value. Current string: " + asa_token_id_STR);
						SystemUtils.halt();
					}

					AVMAccountBalance token_balance = chain_portfolio.getTokens().get(asa_token_id.toString());
					if (ref_portfolio_exists) {
						BigDecimal token_balance_refBD = null;
						if (null == chain_portfolio_ref) {
							token_balance_refBD = new BigDecimal(0);
						} else {
							AVMAccountBalance token_balance_ref = chain_portfolio_ref.getTokens().get(asa_token_id.toString());
							if (token_balance_ref == null) {
								token_balance_refBD = new BigDecimal(0);
							} else {
								token_balance_refBD = new BigDecimal(token_balance_ref.getBalanceInALGO());
							}
						}

						BigDecimal token_balance_BD = null;
						token_balance_BD = new BigDecimal(token_balance.getBalanceInALGO());

						BigDecimal token_balance_diff = token_balance_BD.subtract(token_balance_refBD).setScale(2, RoundingMode.HALF_UP);
						if (token_balance_diff.compareTo(BigDecimal.valueOf(minValueToTrack)) > 0) {
							sb_asa.append(" * [ASA] " + StringsUtils.cutAndPadStringToN(token_balance.getCurrency().getSymbol(), asa_name_offset) + StringsUtils.cutAndPadStringToN("ID: " + asa_token_id.toString(), asa_id_offset) + StringsUtils.cutAndPadStringToN(" [ " + token_balance.getCurrency().getName(), asa_fullname_offset) + "] " + StringsUtils.cutAndPadStringToN(" (" + NumUtils.round(token_balance.getBalanceInALGO(), 2) + ")", symbol_char_offset) + " diff: +" + token_balance_diff + "\n");

							// Handle cases where new chain activity is noted
							if (null == chain_portfolio_ref) chain_portfolio_ref = new AVMChainPortfolio();
							if (null == chain_portfolio_diff) chain_portfolio_diff = new AVMChainPortfolioDiff();

							// Store our diff
							chain_portfolio_diff.setAccount_address(chain_portfolio.getAccount_address());
							chain_portfolio_diff.setChain(chain.toString());

							AVMAccountBalance token_balance_ref = null;
							if (null == chain_portfolio_ref.getTokens().get(asa_token_id.toString())) {
								token_balance_ref = new AVMAccountBalance(0L, 0d, chainInfo.getNativeCurrency(), true);
							} else {
								token_balance_ref = chain_portfolio_ref.getTokens().get(asa_token_id.toString());
							}

							Long token_balance_diff_uAlgo = token_balance.getBalanceInMicroAlgo() - token_balance_ref.getBalanceInMicroAlgo();
							Double token_balance_diff_in_ALGO = Double.parseDouble(token_balance_diff_uAlgo + "") / 100000d;		

							HashMap<Long, AVMAccountBalance> asa_tokens_diff = chain_portfolio_diff.getAsatokens();

							asa_tokens_diff.put(asa_token_id, new AVMAccountBalance(token_balance_diff_uAlgo, token_balance_diff_in_ALGO, new AVMCurrency(token_balance.getCurrency().getName(), token_balance.getCurrency().getSymbol(), token_balance.getCurrency().getDecimal()), false));
							chain_portfolio_diff.setAsatokens(asa_tokens_diff); 

						} else if (token_balance_diff.compareTo(BigDecimal.valueOf(minValueToTrack)) < 0) {
							if (token_balance_diff.toString().startsWith("-")) {
								sb_asa.append(" * [ASA] " + StringsUtils.cutAndPadStringToN(token_balance.getCurrency().getSymbol(), asa_name_offset) + StringsUtils.cutAndPadStringToN("ID: " + asa_token_id.toString(), asa_id_offset) + StringsUtils.cutAndPadStringToN(" [ " + token_balance.getCurrency().getName(), asa_fullname_offset) + "] " + StringsUtils.cutAndPadStringToN(" (" + NumUtils.round(token_balance.getBalanceInALGO(), 2) + ")", symbol_char_offset) + " diff: " + token_balance_diff + "\n");

								// Handle cases where new chain activity is noted
								if (null == chain_portfolio_ref) chain_portfolio_ref = new AVMChainPortfolio();
								if (null == chain_portfolio_diff) chain_portfolio_diff = new AVMChainPortfolioDiff();

								// Store our diff
								chain_portfolio_diff.setAccount_address(chain_portfolio.getAccount_address());
								chain_portfolio_diff.setChain(chain.toString());

								AVMAccountBalance token_balance_ref = null;
								if (null == chain_portfolio_ref.getTokens().get(asa_token_id.toString())) {
									token_balance_ref = new AVMAccountBalance(0L, 0.0d, chainInfo.getNativeCurrency(), true);
								} else {
									token_balance_ref = chain_portfolio_ref.getTokens().get(asa_token_id.toString());
								}

								Long token_balance_diff_uAlgo = token_balance.getBalanceInMicroAlgo() - token_balance_ref.getBalanceInMicroAlgo();
								Double token_balance_diff_in_ALGO = Double.parseDouble(token_balance_diff_uAlgo + "") / 1000000d;

								HashMap<Long, AVMAccountBalance> asa_tokens_diff = chain_portfolio_diff.getAsatokens();

								asa_tokens_diff.put(asa_token_id, new AVMAccountBalance(token_balance_diff_uAlgo, token_balance_diff_in_ALGO, new AVMCurrency(token_balance.getCurrency().getName(), token_balance.getCurrency().getSymbol(), token_balance.getCurrency().getDecimal()), false));
								chain_portfolio_diff.setAsatokens(asa_tokens_diff); 

							} else {
								sb_asa.append(" * [ASA] " + StringsUtils.cutAndPadStringToN(token_balance.getCurrency().getSymbol(), asa_name_offset) + StringsUtils.cutAndPadStringToN("ID: " + asa_token_id.toString(), asa_id_offset) + StringsUtils.cutAndPadStringToN(" [ " + token_balance.getCurrency().getName(), asa_fullname_offset) + "] " + StringsUtils.cutAndPadStringToN(" (" + NumUtils.round(token_balance.getBalanceInALGO(), 2) + ")", symbol_char_offset) + "\n");
							}  

						} else {
							sb_asa.append(" * [ASA] " + StringsUtils.cutAndPadStringToN(token_balance.getCurrency().getSymbol(), asa_name_offset) + StringsUtils.cutAndPadStringToN("ID: " + asa_token_id.toString(), asa_id_offset) + StringsUtils.cutAndPadStringToN(" [ " + token_balance.getCurrency().getName(), asa_fullname_offset) + "] " + StringsUtils.cutAndPadStringToN(" (" + NumUtils.round(token_balance.getBalanceInALGO(), 2) + ")", symbol_char_offset) + "\n");
						}
					} else {
						sb_asa.append(" * [ASA] " + StringsUtils.cutAndPadStringToN(token_balance.getCurrency().getSymbol(), asa_name_offset) + StringsUtils.cutAndPadStringToN("ID: " + asa_token_id.toString(), asa_id_offset) + StringsUtils.cutAndPadStringToN(" [ " + token_balance.getCurrency().getName(), asa_fullname_offset) + "] " + StringsUtils.cutAndPadStringToN(" (" + NumUtils.round(token_balance.getBalanceInALGO(), 2) + ")", symbol_char_offset) + "\n");
					}
				}
				if (chain_portfolio.getTokens().keySet().size()>0) sb.append(sb_asa.toString());

				/**
				 * NFT (ARC) tokens
				 */
				StringBuffer sb_nft = new StringBuffer();
				for (String asa_token_id_STR: chain_portfolio.getNfttokens().keySet()) {
					Long asa_token_id = null;
					try {
						asa_token_id = Long.parseLong(asa_token_id_STR);
					} catch (Exception e) {
						LOGGER.error("ASA id must be a numeric value. Current string: " + asa_token_id_STR);
						SystemUtils.halt();
					}

					AVMNftAccountBalance token_balance = chain_portfolio.getNfttokens().get(asa_token_id.toString());
					if (ref_portfolio_exists) {
						BigInteger token_balance_refBI = null;
						if (null == chain_portfolio_ref) {
							token_balance_refBI = new BigInteger("0");
						} else {
							AVMNftAccountBalance token_balance_ref = chain_portfolio_ref.getNfttokens().get(asa_token_id.toString());
							if (token_balance_ref == null) {
								token_balance_refBI = new BigInteger("0");
							} else {
								token_balance_refBI = new BigInteger(token_balance_ref.getBalance());
							}
						}

						BigInteger token_balance_BI = new BigInteger(token_balance.getBalance());
						BigInteger token_balance_diff = token_balance_BI.subtract(token_balance_refBI);
						if (token_balance_diff.compareTo(BigInteger.ZERO) > 0) {
							sb_nft.append(" * [ARC] " + StringsUtils.cutAndPadStringToN(token_balance.getSymbol(), asa_name_offset) + StringsUtils.cutAndPadStringToN("ID: " + asa_token_id.toString(), asa_id_offset) + StringsUtils.cutAndPadStringToN(" [ " + token_balance.getName(), asa_fullname_offset) + "] " + StringsUtils.cutAndPadStringToN(" (" + token_balance.getBalance() + ")", symbol_char_offset) + " diff: +" + token_balance_diff + "\n");

							// Handle cases where new chain activity is noted
							if (null == chain_portfolio_ref) chain_portfolio_ref = new AVMChainPortfolio();
							if (null == chain_portfolio_diff) chain_portfolio_diff = new AVMChainPortfolioDiff();

							// Store our diff
							chain_portfolio_diff.setAccount_address(chain_portfolio.getAccount_address());
							chain_portfolio_diff.setChain(chain.toString());

							/*
							AVMNftAccountBalance token_balance_ref = null;
							if (null == chain_portfolio_ref.getTokens().get(asa_token_id.toString())) {
								token_balance_ref = new AVMNftAccountBalance(token_balance.getBalance(), false, token_balance.getName(), token_balance.getSymbol());
							} else {
								token_balance_ref = chain_portfolio_ref.getNfttokens().get(asa_token_id.toString());
							}
							 */

							HashMap<Long, AVMNftAccountBalance> asa_tokens_diff = chain_portfolio_diff.getArctokens();

							// Check for official ARC3 token info
							ARC3Info tokenInfoARC3 = chainInfo.getNftindex().getArc3s().get(asa_token_id.toString());
							ARC69Info tokenInfoARC69 = chainInfo.getNftindex().getArc69s().get(asa_token_id.toString());
							if (null != tokenInfoARC3) {
								asa_tokens_diff.put(asa_token_id, new AVMNftAccountBalance(token_balance_diff.toString(), false, token_balance.getName(), token_balance.getSymbol()));
								chain_portfolio_diff.setArctokens(asa_tokens_diff); 
							} else if (null != tokenInfoARC69) {
								asa_tokens_diff.put(asa_token_id, new AVMNftAccountBalance(token_balance_diff.toString(), false, token_balance.getName(), token_balance.getSymbol()));
								chain_portfolio_diff.setArctokens(asa_tokens_diff); 
							} else {
								LOGGER.warn("We have no official ARC ASA token info for " + asa_token_id.toString());
							}

						} else if (token_balance_diff.compareTo(BigInteger.ZERO) < 0) {
							if (token_balance_diff.toString().startsWith("-")) {
								sb_nft.append(" * [ARC] " + StringsUtils.cutAndPadStringToN(token_balance.getSymbol(), asa_name_offset) + StringsUtils.cutAndPadStringToN("ID: " + asa_token_id.toString(), asa_id_offset) + StringsUtils.cutAndPadStringToN(" [ " + token_balance.getName(), asa_fullname_offset) + "] " + StringsUtils.cutAndPadStringToN(" (" + token_balance.getBalance() + ")", symbol_char_offset) + " diff: " + token_balance_diff + "\n");

								// Handle cases where new chain activity is noted
								if (null == chain_portfolio_ref) chain_portfolio_ref = new AVMChainPortfolio();
								if (null == chain_portfolio_diff) chain_portfolio_diff = new AVMChainPortfolioDiff();

								// Store our diff
								chain_portfolio_diff.setAccount_address(chain_portfolio.getAccount_address());
								chain_portfolio_diff.setChain(chain.toString());

								/*
								AVMNftAccountBalance token_balance_ref = null;
								if (null == chain_portfolio_ref.getTokens().get(asa_token_id.toString())) {
									token_balance_ref = new AVMNftAccountBalance(token_balance.getBalance(), false, token_balance.getName(), token_balance.getSymbol());
								} else {
									token_balance_ref = chain_portfolio_ref.getNfttokens().get(asa_token_id.toString());
								}
								 */

								HashMap<Long, AVMNftAccountBalance> asa_tokens_diff = chain_portfolio_diff.getArctokens();

								// Check for official ARC3 token info
								ARC3Info tokenInfoARC3 = chainInfo.getNftindex().getArc3s().get(asa_token_id.toString());
								ARC69Info tokenInfoARC69 = chainInfo.getNftindex().getArc69s().get(asa_token_id.toString());
								if (null != tokenInfoARC3) {
									asa_tokens_diff.put(asa_token_id, new AVMNftAccountBalance(token_balance_diff.toString(), false, token_balance.getName(), token_balance.getSymbol()));
									chain_portfolio_diff.setArctokens(asa_tokens_diff); 
								} else if (null != tokenInfoARC69) {
									asa_tokens_diff.put(asa_token_id, new AVMNftAccountBalance(token_balance_diff.toString(), false, token_balance.getName(), token_balance.getSymbol()));
									chain_portfolio_diff.setArctokens(asa_tokens_diff); 
								} else {
									LOGGER.warn("We have no official ARC ASA token info for " + asa_token_id.toString());
								}

							} else {
								sb_nft.append(" * [ARC] " + StringsUtils.cutAndPadStringToN(token_balance.getSymbol(), asa_name_offset) + StringsUtils.cutAndPadStringToN("ID: " + asa_token_id.toString(), asa_id_offset) + StringsUtils.cutAndPadStringToN(" [ " + token_balance.getName(), asa_fullname_offset) + "] " + StringsUtils.cutAndPadStringToN(" (" + token_balance.getBalance() + ")", symbol_char_offset) + "\n");
							}  

						} else {
							sb_nft.append(" * [ARC] " + StringsUtils.cutAndPadStringToN(token_balance.getSymbol(), asa_name_offset) + StringsUtils.cutAndPadStringToN("ID: " + asa_token_id.toString(), asa_id_offset) + StringsUtils.cutAndPadStringToN(" [ " + token_balance.getName(), asa_fullname_offset) + "] " + StringsUtils.cutAndPadStringToN(" (" + token_balance.getBalance() + ")", symbol_char_offset) + "\n");
						}

					} else {
						sb_nft.append(" * [ARC] " + StringsUtils.cutAndPadStringToN(token_balance.getSymbol(), asa_name_offset) + StringsUtils.cutAndPadStringToN("ID: " + asa_token_id.toString(), asa_id_offset) + StringsUtils.cutAndPadStringToN(" [ " + token_balance.getName(), asa_fullname_offset) + "] " + StringsUtils.cutAndPadStringToN(" (" + token_balance.getBalance() + ")", symbol_char_offset) + "\n");
					}
				}
				if (chain_portfolio.getNfttokens().keySet().size()>0) {
					if (!chain_portfolio.getTokens().keySet().isEmpty()) sb.append(breaklinemini + "\n");
					sb.append(sb_nft.toString());
				}

				// No ASA
				if (chain_portfolio.getTokens().keySet().isEmpty() && chain_portfolio.getNfttokens().keySet().isEmpty()) {
					sb.append(" x [no ASA tokens]\n");
				}

				sb.append("\n");
			}


			// Update our portfolio diff
			if (null != chain_portfolio_diff) {
				if (null == portfolio_diff) {
					portfolio_diff = new AVMPortfolioDiff();
					portfolio_diff.setAccount_address(chain_portfolio_diff.getAccount_address());
				}
				HashMap<AVMChain, AVMChainPortfolioDiff> chainportfolio_diff_existing = portfolio_diff.getChainportfolio_diff();
				chainportfolio_diff_existing.put(chain, chain_portfolio_diff);
				portfolio_diff.setChainportfolio_diff(chainportfolio_diff_existing);
			}

		}

		return new AVMPortfolioDiffResult(sb.toString(), portfolio_diff);
	}

	public static String printAVMPortfolioForAddress(AVMBlockChainUltraConnector _ultra_connector, String _account_addr) {
		AVMPortfolioDiffResult portfolio_diff = getAVMPortfolioForAddress(_ultra_connector, _account_addr, true, new HashMap<String, Boolean>(), new HashMap<String, Boolean>(), false);
		return portfolio_diff.getPortfolio_full_str();
	}

	public static String printAVMPortfolioForAddress(AVMBlockChainUltraConnector _ultra_connector, String _account_addr, boolean _checkfornfts, HashMap<String, Boolean> _token_restriction, HashMap<String, Boolean> _nft_restriction, boolean _debug) {
		AVMPortfolioDiffResult portfolio_diff = getAVMPortfolioForAddress(_ultra_connector, _account_addr, _checkfornfts, _token_restriction, _nft_restriction, _debug);
		return portfolio_diff.getPortfolio_full_str();
	}

	public static AVMPortfolioDiffResult getAVMPortfolioForAddress(AVMBlockChainUltraConnector _ultra_connector, String _account_addr, boolean _checkfornfts, HashMap<String, Boolean> _token_restriction, HashMap<String, Boolean> _nft_restriction, boolean _debug) {

		/**
		 * Grab the stored portfolio as ref, create if non existant
		 */
		LOGGER.info("Will now grab the stored portfolio ..");
		AVMPortfolio chainPortfolio_init = AVMUtils.readLatestPortfolioSnapshot(_account_addr, "snapshots");
		if (null == chainPortfolio_init) {
			LOGGER.info("Portfolio for wallet did not exist, creating a first snapshot" );
			chainPortfolio_init = AVMUtils.getAVMPortfolioForAccount(_ultra_connector, _account_addr, _checkfornfts, _token_restriction, _nft_restriction, _debug);
			LOGGER.info("Flushing portfolio snapshot");
			AVMUtils.updatePortfolioSnapshot(chainPortfolio_init, "snapshots");
		}

		/**
		 * Retrieve AVM portfolio (including diffs)
		 */
		LOGGER.info("Getting AVM portfolio ..");	
		AVMPortfolio chainPortfolio_fin = AVMUtils.getAVMPortfolioForAccount(_ultra_connector, _account_addr, _checkfornfts, _token_restriction, _nft_restriction, _debug);
		AVMPortfolioSimple chainPortfolio_simple_init = AVMUtils.createAVMPortfolioSimple(chainPortfolio_init);
		AVMPortfolioSimple chainPortfolio_simple_fin = AVMUtils.createAVMPortfolioSimple(chainPortfolio_fin);
		AVMPortfolioDiffResult portfolio_diff = AVMUtils.getAVMPortfolioDiff(chainPortfolio_simple_fin, chainPortfolio_simple_init);
		AVMUtils.updatePortfolioSnapshot(chainPortfolio_fin, "snapshots");

		return portfolio_diff;
	}

}
