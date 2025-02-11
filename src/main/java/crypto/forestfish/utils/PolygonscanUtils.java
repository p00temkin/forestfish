package crypto.forestfish.utils;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.enums.evm.PolygonERC20Token;
import crypto.forestfish.objects.evm.ERC20Transaction;
import crypto.forestfish.objects.evm.EVMWalletBalanceReply;
import crypto.forestfish.objects.evm.EVMWalletTxHistoryReply;

public class PolygonscanUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(PolygonscanUtils.class);

	public static Double getMATICBalance(String walletAddress, String apiKey) {
		EVMWalletBalanceReply reply = null;
		String jsonSTR = TCPIPUtils.httpGETContent("https://api.polygonscan.com/api?module=account&action=balance&address=" + walletAddress + "&tag=latest&apikey=" + apiKey, 10);
		if (null != jsonSTR) {
			reply = EVMWalletBalanceReply.parseReply(jsonSTR);
			LOGGER.debug("message: " + reply.getMessage());
			reply.update();
			LOGGER.debug("balance: " + NumUtils.round(reply.getBalance(), 2) + " MATIC");
			return reply.getBalance();
		}
		return 0.0d;
	}

	public static int getERC20TransactionCount10k(String walletAddress, String apiKey, PolygonERC20Token token) {
		String erc20contractaddress = ContractMapper.resolveContractAddressFor(token);
		int txCount = 0;
		int page = 0;
		int resultCount = 1000;
		while (resultCount >= 0) {
			resultCount = resultCount - 1;
			page++;
			EVMWalletTxHistoryReply reply = null;
			String jsonSTR = TCPIPUtils.httpGETContent("https://api.polygonscan.com/api?module=account&action=tokentx&address=" + walletAddress + "&contractaddress=" + erc20contractaddress + "&startblock=1&endblock=99999999&page=" + page + "&offset=10000&sort=asc&apikey=" + apiKey, 10);
			if (null != jsonSTR) {
				reply = EVMWalletTxHistoryReply.parseReply(jsonSTR);
				LOGGER.debug("message: " + reply.getMessage());
				LOGGER.debug("status: " + reply.getStatus());
				LOGGER.debug("result.size(): " + reply.getResult().size());
				txCount = txCount + reply.getResult().size();
			}
		}
		return txCount;
	}

	public static Double getERC20WalletBalance10kTx(String walletAddress, String apiKey, PolygonERC20Token token) {
		String erc20contractaddress = ContractMapper.resolveContractAddressFor(token);
		Double erc20Balance = 0.0d;
		ArrayList<ERC20Transaction> batch = new ArrayList<ERC20Transaction>();

		int page = 0;
		int resultCount = 1000;
		while (resultCount >= 1000) {
			page++;
			EVMWalletTxHistoryReply reply = null;
			String jsonSTR = TCPIPUtils.httpGETContent("https://api.polygonscan.com/api?module=account&action=tokentx&address=" + walletAddress + "&contractaddress=" + erc20contractaddress + "&startblock=1&endblock=99999999&page=" + page + "&offset=10000&sort=asc&apikey=" + apiKey, 10);
			if (null != jsonSTR) {
				reply = EVMWalletTxHistoryReply.parseReply(jsonSTR);
				LOGGER.debug("message: " + reply.getMessage());
				LOGGER.debug("status: " + reply.getStatus());
				LOGGER.debug("result.size(): " + reply.getResult().size());
				for (ERC20Transaction tx: reply.getResult()) {
					tx.update();
					batch.add(tx);
				}
				resultCount = reply.getResult().size();
			}
		}

		for (ERC20Transaction tx: batch) {
			if (!"0".equals(tx.getValue())) {
				if (walletAddress.equalsIgnoreCase(tx.getTo())) {
					LOGGER.debug(DateUtils.epochInSecondsToUTC(Long.parseLong(tx.getTimeStamp())) + " +" + NumUtils.round(tx.getValueD(), 4));
					erc20Balance = erc20Balance + tx.getValueD();
				} else if (walletAddress.equalsIgnoreCase(tx.getFrom())) {
					LOGGER.debug(DateUtils.epochInSecondsToUTC(Long.parseLong(tx.getTimeStamp())) + " -" + NumUtils.round(tx.getValueD(), 4));
					erc20Balance = erc20Balance - tx.getValueD();
				} else {
					LOGGER.error("Found tx which is neither to/from the specified wallet " + walletAddress);
					LOGGER.error("tx from: " + tx.getFrom());
					LOGGER.error("tx to: " + tx.getTo());
					SystemUtils.halt();
				}
			}
		}

		return erc20Balance;
	}


}
