package crypto.forestfish.objects.polygon;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

public class PolygonWalletTxHistoryReply {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PolygonWalletTxHistoryReply.class);

	private String status = null;
	private String message = null;
	private ArrayList<PolygonERC20Transaction> result = new ArrayList<PolygonERC20Transaction>();
	
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
	public ArrayList<PolygonERC20Transaction> getResult() {
		return result;
	}
	public void setResult(ArrayList<PolygonERC20Transaction> result) {
		this.result = result;
	}
	
	public static PolygonWalletTxHistoryReply parseReply(String jsonSTR) {
		PolygonWalletTxHistoryReply ev = null;
		try {
			ev = JSON.parseObject(jsonSTR, PolygonWalletTxHistoryReply.class);
		} catch (Exception e) {
			LOGGER.error("Exception during JSON parsing: " + e.getClass() + ": " + e.getMessage(), e);
			LOGGER.error("JSON string for above error: " + jsonSTR);
		}
		return ev;
	}
	
}
