package crypto.forestfish.objects.polygon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

public class PolygonWalletBalanceReply {

	private static final Logger LOGGER = LoggerFactory.getLogger(PolygonWalletBalanceReply.class);

	private String status = null;
	private String message = null;
	private String result = null;
	private Double balance = null;

	public PolygonWalletBalanceReply() {
		super();
	}

	public void update() {
		if (null != this.result) {
			this.balance = Double.parseDouble("" + this.result)/1000000000000000000d;
		}
	}

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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "status=" + this.status + " message=" + this.message + " result=" + this.result + " balance=" + this.balance;
	}

	public static PolygonWalletBalanceReply parseReply(String jsonSTR) {
		PolygonWalletBalanceReply ev = null;
		try {
			ev = JSON.parseObject(jsonSTR, PolygonWalletBalanceReply.class);
		} catch (Exception e) {
			LOGGER.error("Exception during JSON parsing: " + e.getClass() + ": " + e.getMessage(), e);
			LOGGER.error("JSON string for above error: " + jsonSTR);
		}
		return ev;
	}

}
