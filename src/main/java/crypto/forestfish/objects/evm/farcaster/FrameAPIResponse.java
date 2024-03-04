package crypto.forestfish.objects.evm.farcaster;

import java.util.HashMap;

public class FrameAPIResponse {

	private boolean success;
	private HashMap<String, Object> data;
	
	public FrameAPIResponse() {
		super();
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public HashMap<String, Object> getData() {
		return data;
	}

	public void setData(HashMap<String, Object> data) {
		this.data = data;
	}
	
	
}
