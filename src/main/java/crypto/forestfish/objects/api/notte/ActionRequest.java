package crypto.forestfish.objects.api.notte;

public class ActionRequest {

	private String session_id;
	private String action_id;
	private String value;
	private Boolean enter = true;
	private Boolean keep_alive = true;
	
	public ActionRequest() {
		super();
	}

	public ActionRequest(String _session_id, String _action_id, Boolean _keep_alive, Boolean _enter) {
		super();
		this.session_id = _session_id;
		this.action_id = _action_id;
		this.keep_alive = _keep_alive;
		this.enter = _enter;
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public String getAction_id() {
		return action_id;
	}

	public void setAction_id(String action_id) {
		this.action_id = action_id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Boolean getEnter() {
		return enter;
	}

	public void setEnter(Boolean enter) {
		this.enter = enter;
	}

	public Boolean getKeep_alive() {
		return keep_alive;
	}

	public void setKeep_alive(Boolean keep_alive) {
		this.keep_alive = keep_alive;
	}
	
}
