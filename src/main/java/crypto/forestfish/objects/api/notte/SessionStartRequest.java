package crypto.forestfish.objects.api.notte;

public class SessionStartRequest {

	private int timeout_minutes = 3;
	private int max_steps = 20;
	private boolean proxies = false;
	private boolean screenshot = true;
	private String chrome_args = null;
	private String browser_type = "chromium";
	
	
	public SessionStartRequest() {
		super();
	}

	public int getTimeout_minutes() {
		return timeout_minutes;
	}

	public void setTimeout_minutes(int timeout_minutes) {
		this.timeout_minutes = timeout_minutes;
	}

	public boolean isScreenshot() {
		return screenshot;
	}

	public void setScreenshot(boolean screenshot) {
		this.screenshot = screenshot;
	}

	public int getMax_steps() {
		return max_steps;
	}

	public void setMax_steps(int max_steps) {
		this.max_steps = max_steps;
	}

	public boolean isProxies() {
		return proxies;
	}

	public void setProxies(boolean proxies) {
		this.proxies = proxies;
	}

	public String getChrome_args() {
		return chrome_args;
	}

	public void setChrome_args(String chrome_args) {
		this.chrome_args = chrome_args;
	}

	public String getBrowser_type() {
		return browser_type;
	}

	public void setBrowser_type(String browser_type) {
		this.browser_type = browser_type;
	}

}
