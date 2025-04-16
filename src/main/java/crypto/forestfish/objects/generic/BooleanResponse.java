package crypto.forestfish.objects.generic;

public class BooleanResponse {

	private boolean status = false;
	private boolean callsuccess = false;
	
	public BooleanResponse() {
		super();
	}
	
	public BooleanResponse(boolean status, boolean callsuccess) {
		super();
		this.status = status;
		this.callsuccess = callsuccess;
	}

	public boolean isCallsuccess() {
		return callsuccess;
	}

	public void setCallsuccess(boolean callsuccess) {
		this.callsuccess = callsuccess;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public boolean isTrue() {
		return this.status && this.callsuccess;
	}
}
