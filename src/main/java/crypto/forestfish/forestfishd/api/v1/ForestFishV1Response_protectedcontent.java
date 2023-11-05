package crypto.forestfish.forestfishd.api.v1;

public class ForestFishV1Response_protectedcontent {

	private String version = "v1";
	private String contentid = "";
	private String contenttype = "text/html";
	private String content = "";
	private boolean valid = false;

	public ForestFishV1Response_protectedcontent() {
		super();
	}

	public ForestFishV1Response_protectedcontent(String contentid, String contenttype, String content, boolean valid) {
		super();
		this.contentid = contentid;
		this.contenttype = contenttype;
		this.content = content;
		this.valid = valid;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getContentid() {
		return contentid;
	}

	public void setContentid(String contentid) {
		this.contentid = contentid;
	}

	public String getContenttype() {
		return contenttype;
	}

	public void setContenttype(String contenttype) {
		this.contenttype = contenttype;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

}
