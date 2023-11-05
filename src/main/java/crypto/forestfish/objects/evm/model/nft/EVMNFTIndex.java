package crypto.forestfish.objects.evm.model.nft;

import java.util.HashMap;

public class EVMNFTIndex {

	private HashMap<String, EVMERC721TokenInfo> erc721tokens = new HashMap<>();
	private HashMap<String, EVMERC1155TokenInfo> erc1155tokens = new HashMap<>();

	public EVMNFTIndex() {
		super();
	}
	
	public EVMNFTIndex(HashMap<String, EVMERC721TokenInfo> erc721tokens, HashMap<String, EVMERC1155TokenInfo> erc1155tokens) {
		super();
		this.erc721tokens = erc721tokens;
		this.erc1155tokens = erc1155tokens;
	}

	public HashMap<String, EVMERC721TokenInfo> getErc721tokens() {
		return erc721tokens;
	}

	public void setErc721tokens(HashMap<String, EVMERC721TokenInfo> erc721tokens) {
		this.erc721tokens = erc721tokens;
	}

	public HashMap<String, EVMERC1155TokenInfo> getErc1155tokens() {
		return erc1155tokens;
	}

	public void setErc1155tokens(HashMap<String, EVMERC1155TokenInfo> erc1155tokens) {
		this.erc1155tokens = erc1155tokens;
	}

}
