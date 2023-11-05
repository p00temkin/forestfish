package crypto.forestfish.objects.evm;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

public class EVMWalletTxHistoryReply {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EVMWalletTxHistoryReply.class);

	private String status = null;
	private String message = null;
	private ArrayList<ERC20Transaction> result = new ArrayList<ERC20Transaction>();
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ArrayList<ERC20Transaction> getResult() {
		return result;
	}
	public void setResult(ArrayList<ERC20Transaction> result) {
		this.result = result;
	}
	
	public static EVMWalletTxHistoryReply parseReply(String jsonSTR) {
		EVMWalletTxHistoryReply ev = null;
		try {
			ev = JSON.parseObject(jsonSTR, EVMWalletTxHistoryReply.class);
		} catch (Exception e) {
			LOGGER.error("Exception during JSON parsing: " + e.getClass() + ": " + e.getMessage(), e);
			LOGGER.error("JSON string for above error: " + jsonSTR);
		}
		return ev;
	}
	
}
