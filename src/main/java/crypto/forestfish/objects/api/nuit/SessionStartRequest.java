package crypto.forestfish.objects.api.nuit;

public class SessionStartRequest {

	private boolean keep_alive = true;
	private int session_timeout = 3;
	private boolean screenshot = true;
	
	public SessionStartRequest() {
		super();
	}
	
	public SessionStartRequest(boolean keep_alive, int session_timeout, boolean screenshot) {
		super();
		this.keep_alive = keep_alive;
		this.session_timeout = session_timeout;
		this.screenshot = screenshot;
	}

	public boolean isKeep_alive() {
		return keep_alive;
	}

	public void setKeep_alive(boolean keep_alive) {
		this.keep_alive = keep_alive;
	}

	public int getSession_timeout() {
		return session_timeout;
	}

	public void setSession_timeout(int session_timeout) {
		this.session_timeout = session_timeout;
	}

	public boolean isScreenshot() {
		return screenshot;
	}

	public void setScreenshot(boolean screenshot) {
		this.screenshot = screenshot;
	}

}
