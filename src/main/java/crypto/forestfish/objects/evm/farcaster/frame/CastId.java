package crypto.forestfish.objects.evm.farcaster.frame;

public class CastId {

	private Long fid;
	private String hash;
	
	public CastId() {
		super();
	}

	public Long getFid() {
		return fid;
	}

	public void setFid(Long fid) {
		this.fid = fid;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}
	
}
