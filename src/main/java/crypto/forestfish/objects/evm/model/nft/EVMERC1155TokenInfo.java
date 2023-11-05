package crypto.forestfish.objects.evm.model.nft;

import java.util.ArrayList;

public class EVMERC1155TokenInfo {

	private String symbol;
	private String contractAddress;
	private Long mintBlock;
	private String description;
	private String chain;
	private ArrayList<String> origins = new ArrayList<String>();
	private String category;
	private ArrayList<String> linked_tokens = new ArrayList<String>();

	public EVMERC1155TokenInfo() {
		super();
	}

	public EVMERC1155TokenInfo(String _symbol, String _contractAddress, Long _mintBlock, String _description, String _category, String _chain, ArrayList<String> _origins) {
		super();
		this.symbol = _symbol;
		this.contractAddress = _contractAddress;
		this.mintBlock = _mintBlock;
		this.description = _description;
		this.category = _category;
		this.chain = _chain;
		this.origins = _origins;
	}
	
	public EVMERC1155TokenInfo(String _symbol, String _contractAddress, Long _mintBlock, String _description, String _category, String _chain, ArrayList<String> _origins, ArrayList<String> _linked_tokens) {
		super();
		this.symbol = _symbol;
		this.contractAddress = _contractAddress;
		this.mintBlock = _mintBlock;
		this.description = _description;
		this.category = _category;
		this.chain = _chain;
		this.origins = _origins;
		this.linked_tokens = _linked_tokens;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getContractAddress() {
		return contractAddress;
	}

	public void setContractAddress(String contractAddress) {
		this.contractAddress = contractAddress;
	}

	public ArrayList<String> getOrigins() {
		return origins;
	}

	public void setOrigins(ArrayList<String> origins) {
		this.origins = origins;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getChain() {
		return chain;
	}

	public void setChain(String chain) {
		this.chain = chain;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public ArrayList<String> getLinked_tokens() {
		return linked_tokens;
	}

	public void setLinked_tokens(ArrayList<String> linked_tokens) {
		this.linked_tokens = linked_tokens;
	}

	public Long getMintBlock() {
		return mintBlock;
	}

	public void setMintBlock(Long mintBlock) {
		this.mintBlock = mintBlock;
	}
	
}
