package crypto.forestfish.objects.avm;

public class AlgoIndexerNode {

	private String url;
	private Integer port;
	private String authtoken; 
	private String authtoken_key;
	
	public AlgoIndexerNode() {
		super();
	}

	public AlgoIndexerNode(String _url, Integer _port, String _authtoken, String _authtoken_key) {
		super();
		this.url = _url;
		this.port = _port;
		this.authtoken = _authtoken;
		this.authtoken_key = _authtoken_key;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getAuthtoken() {
		return authtoken;
	}

	public void setAuthtoken(String authtoken) {
		this.authtoken = authtoken;
	}

	public String getAuthtoken_key() {
		return authtoken_key;
	}

	public void setAuthtoken_key(String authtoken_key) {
		this.authtoken_key = authtoken_key;
	}
	
	@Override
	public String toString() {
		return this.getUrl() + " token=" + this.getAuthtoken() + " token_key=" + this.getAuthtoken_key();
	}
	
}
