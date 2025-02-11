package crypto.forestfish.objects.api.nuit;

public class ObserveRequest {

	private String session_id;
	private String url;
	private boolean keep_alive;
	
	public ObserveRequest() {
		super();
	}

	public ObserveRequest(String session_id, String url, boolean keep_alive) {
		super();
		this.session_id = session_id;
		this.url = url;
		this.keep_alive = keep_alive;
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isKeep_alive() {
		return keep_alive;
	}

	public void setKeep_alive(boolean keep_alive) {
		this.keep_alive = keep_alive;
	}
	
}
