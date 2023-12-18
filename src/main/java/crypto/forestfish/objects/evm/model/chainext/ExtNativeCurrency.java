package crypto.forestfish.objects.evm.model.chainext;

public class ExtNativeCurrency {

	private String name;
	private String symbol;
	private Integer decimals;
	
	public ExtNativeCurrency() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Integer getDecimals() {
		return decimals;
	}

	public void setDecimals(Integer decimals) {
		this.decimals = decimals;
	}

}
