package crypto.forestfish.objects.avm.model.asa;

import java.util.HashMap;

public class ASAIndex {

	private HashMap<String, AVMASAInfo> tokens = new HashMap<>();

	public ASAIndex() {
		super();
	}
	
	public ASAIndex(HashMap<String, AVMASAInfo> tokens) {
		super();
		this.tokens = tokens;
	}

	public HashMap<String, AVMASAInfo> getTokens() {
		return tokens;
	}

	public void setTokens(HashMap<String, AVMASAInfo> tokens) {
		this.tokens = tokens;
	}

}
