package crypto.forestfish.objects.http;


public class HttpCustomResponse {

	private Boolean connectionreset = false;
	private int statuscode;
	private String response_body;
	private String message;
	
	public HttpCustomResponse() {
		super();
	}

	public HttpCustomResponse(Boolean _connectionreset, int _statuscode, String _response_body, String _message) {
		super();
		this.connectionreset = _connectionreset;
		this.statuscode = _statuscode;
		this.response_body = _response_body;
		this.message = _message;
	}

	public Boolean getConnectionreset() {
		return connectionreset;
	}
	
	public void setConnectionreset(Boolean connectionreset) {
		this.connectionreset = connectionreset;
	}
	
	public int getStatuscode() {
		return statuscode;
	}
	
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResponse_body() {
		return response_body;
	}

	public void setResponse_body(String response_body) {
		this.response_body = response_body;
	}
	
}
