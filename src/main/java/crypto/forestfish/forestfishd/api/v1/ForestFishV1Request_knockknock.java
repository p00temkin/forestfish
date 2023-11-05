package crypto.forestfish.forestfishd.api.v1;

public class ForestFishV1Request_knockknock {

	private String version = "v1";
	private String address = "";
	
	public ForestFishV1Request_knockknock() {
		super();
	}

	public ForestFishV1Request_knockknock(String _address) {
		super();
		this.address = _address;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
