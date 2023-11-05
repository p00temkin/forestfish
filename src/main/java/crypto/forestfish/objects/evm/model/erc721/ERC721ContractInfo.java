package crypto.forestfish.objects.evm.model.erc721;

public class ERC721ContractInfo {

	private String name;
	private String symbol;
	private String contractAddress;
	private String totalSupply;
	private String baseuri;
	private String owner;
	
	public ERC721ContractInfo() {
		super();
	}

	public ERC721ContractInfo(String name, String symbol, String contractAddress, String totalSupply, String uri, String id, String metajson) {
		super();
		this.name = name;
		this.symbol = symbol;
		this.contractAddress = contractAddress;
		this.totalSupply = totalSupply;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTotalSupply() {
		return totalSupply;
	}

	public void setTotalSupply(String totalSupply) {
		this.totalSupply = totalSupply;
	}

	public String getBaseuri() {
		return baseuri;
	}

	public void setBaseuri(String baseuri) {
		this.baseuri = baseuri;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
