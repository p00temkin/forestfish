package crypto.forestfish.objects.evm.model.erc20;

import java.util.ArrayList;

public class EVMERC20TokenInfo {

	private String symbol;
	private String contractAddress;
	private String name;
	private Integer decimals;
	private String chain;
	private ArrayList<String> origins = new ArrayList<String>();
	private String category;

	public EVMERC20TokenInfo() {
		super();
	}

	public EVMERC20TokenInfo(String _symbol, String _contractAddress, String _name, Integer _decimals, String _category, String _chain, ArrayList<String> _origins) {
		super();
		this.symbol = _symbol;
		this.contractAddress = _contractAddress;
		this.name = _name;
		this.decimals = _decimals;
		this.category = _category;
		this.chain = _chain;
		this.origins = _origins;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDecimals() {
		return decimals;
	}

	public void setDecimals(Integer decimals) {
		this.decimals = decimals;
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
	
}
