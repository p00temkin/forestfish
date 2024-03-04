package crypto.forestfish.objects.evm.farcaster;

public class FrameAPIKeyRequest {

	private Long chainId;
	private String email;
	
	public FrameAPIKeyRequest() {
		super();
	}

	public FrameAPIKeyRequest(Long chainId, String email) {
		super();
		this.chainId = chainId;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getChainId() {
		return chainId;
	}

	public void setChainId(Long chainId) {
		this.chainId = chainId;
	}
	
}
