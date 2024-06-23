package crypto.forestfish.objects.evm.farcaster.frame;

public class UntrustedData {

	private Long fid;
	private String url;
	private String messageHash;
	private Long timestamp;
	private Long network;
	private Long buttonIndex;
	private CastId castId;
	private UntrustedData untrustedData;
	private TrustedData trustedData;

	public UntrustedData() {
		super();
	}
	
	public Long getFid() {
		return fid;
	}
	
	public void setFid(Long fid) {
		this.fid = fid;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getMessageHash() {
		return messageHash;
	}
	
	public void setMessageHash(String messageHash) {
		this.messageHash = messageHash;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	public Long getNetwork() {
		return network;
	}
	
	public void setNetwork(Long network) {
		this.network = network;
	}
	
	public Long getButtonIndex() {
		return buttonIndex;
	}
	
	public void setButtonIndex(Long buttonIndex) {
		this.buttonIndex = buttonIndex;
	}
	
	public CastId getCastId() {
		return castId;
	}
	
	public void setCastId(CastId castId) {
		this.castId = castId;
	}
	
	public UntrustedData getUntrustedData() {
		return untrustedData;
	}
	
	public void setUntrustedData(UntrustedData untrustedData) {
		this.untrustedData = untrustedData;
	}
	
	public TrustedData getTrustedData() {
		return trustedData;
	}
	
	public void setTrustedData(TrustedData trustedData) {
		this.trustedData = trustedData;
	}
	
}
