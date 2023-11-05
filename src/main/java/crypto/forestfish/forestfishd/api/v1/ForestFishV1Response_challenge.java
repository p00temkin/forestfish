package crypto.forestfish.forestfishd.api.v1;

public class ForestFishV1Response_challenge {

	private String version = "v1";
	private String challenge = "";
	private String address = "";
	private boolean valid = false;

	public ForestFishV1Response_challenge() {
		super();
	}

	public ForestFishV1Response_challenge(String address, String challenge, Boolean valid) {
		super();
		this.address = address;
		this.challenge = challenge;
		this.valid = valid;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
}
