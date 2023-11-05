package crypto.forestfish.objects.avm;

public class AVMCreateAssetResult {

	private String txhash;
	private Long assetID;
	private boolean confirmed = false;
	
	public AVMCreateAssetResult(String txhash, Long assetID, boolean confirmed) {
		super();
		this.txhash = txhash;
		this.assetID = assetID;
		this.confirmed = confirmed;
	}

	public String getTxhash() {
		return txhash;
	}
	
	public void setTxhash(String txhash) {
		this.txhash = txhash;
	}
	
	public Long getAssetID() {
		return assetID;
	}
	
	public void setAssetID(Long assetID) {
		this.assetID = assetID;
	}
	
	@Override
	public String toString() {
		return "txhash=" + this.txhash + " assetid=" + this.assetID + " confirmed=" + this.confirmed;
	}
}
