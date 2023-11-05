package crypto.forestfish.forestfishd.api.v1;

public class ForestFishV1Request_authenticate {

	private String version = "v1";
	private String challenge = "";
	private String signature = "";
	private String address = "";
	
	public ForestFishV1Request_authenticate() {
		super();
	}

	public ForestFishV1Request_authenticate(String challenge, String signature, String address) {
		super();
		this.challenge = challenge;
		this.signature = signature;
		this.address = address;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getChallenge() {
		return challenge;
	}

	public void setChallenge(String challenge) {
		this.challenge = challenge;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
