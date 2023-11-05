package crypto.forestfish.forestfishd.api.v1;

public class ForestFishV1Response_status {

	private String version = "v1";
	private String status = "up";

	public ForestFishV1Response_status() {
		super();
	}
	
	public ForestFishV1Response_status(String status) {
		this.status = status;
	}

	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
