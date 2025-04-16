package crypto.forestfish.objects.api.notte;

public class SessionStatus {

	private String session_id;
	private String created_at;
	private String last_accessed_at;
	private String duration;
	private String status;
	private int timeout_minutes;
	private String error;
	
	public SessionStatus() {
		super();
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getLast_accessed_at() {
		return last_accessed_at;
	}

	public void setLast_accessed_at(String last_accessed_at) {
		this.last_accessed_at = last_accessed_at;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTimeout_minutes() {
		return timeout_minutes;
	}

	public void setTimeout_minutes(int timeout_minutes) {
		this.timeout_minutes = timeout_minutes;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
}
