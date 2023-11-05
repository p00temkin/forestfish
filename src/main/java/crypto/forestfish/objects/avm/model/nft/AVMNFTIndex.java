package crypto.forestfish.objects.avm.model.nft;

import java.util.HashMap;

public class AVMNFTIndex {

	private HashMap<String, ARC3Info> arc3s = new HashMap<>();
	private HashMap<String, ARC69Info> arc69s = new HashMap<>();

	public AVMNFTIndex() {
		super();
	}
	
	public AVMNFTIndex(HashMap<String, ARC3Info> _arc3s, HashMap<String, ARC69Info> _arc69s) {
		super();
		this.arc3s = _arc3s;
		this.arc69s = _arc69s;
	}

	public HashMap<String, ARC3Info> getArc3s() {
		return arc3s;
	}

	public void setArc3s(HashMap<String, ARC3Info> arc3s) {
		this.arc3s = arc3s;
	}

	public HashMap<String, ARC69Info> getArc69s() {
		return arc69s;
	}

	public void setArc69s(HashMap<String, ARC69Info> arc69s) {
		this.arc69s = arc69s;
	}

}
