package crypto.forestfish.forestfishd.api.v1;

public class ForestFishV1Response_knockknock {

	private String version = "v1";
	private String wallet = "";
	private String ip = "";
	private String cc = "";
	private String msg = "";
	private Boolean preregistered = false;
	private String role = "";

	public ForestFishV1Response_knockknock() {
		super();
	}

	public ForestFishV1Response_knockknock(String _wallet, String _ip, String _cc, String _msg, Boolean _preregistered, String _role) {
		super();
		this.wallet = _wallet;
		this.ip = _ip;
		this.cc = _cc;
		this.msg = _msg;
		this.preregistered = _preregistered;
		this.role = _role;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getWallet() {
		return wallet;
	}

	public void setWallet(String wallet) {
		this.wallet = wallet;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public Boolean getPreregistered() {
		return preregistered;
	}

	public void setPreregistered(Boolean preregistered) {
		this.preregistered = preregistered;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
