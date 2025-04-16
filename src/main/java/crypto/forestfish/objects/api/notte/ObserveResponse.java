package crypto.forestfish.objects.api.notte;

public class ObserveResponse {

	private SessionStatus session;
	private Metadata metadata;
	
	private String screenshot;
	
	private Data data;
	private ObserveSpace space;
	
	public ObserveResponse() {
		super();
	}

	public SessionStatus getSession() {
		return session;
	}

	public void setSession(SessionStatus session) {
		this.session = session;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public ObserveSpace getSpace() {
		return space;
	}

	public void setSpace(ObserveSpace space) {
		this.space = space;
	}

	public String getScreenshot() {
		return screenshot;
	}

	public void setScreenshot(String screenshot) {
		this.screenshot = screenshot;
	}

}
