package crypto.forestfish.objects.evm.moralis;

public class MoralisNativePrice {

	private String value;
	private Integer decimals;
	private String name;
	private String symbol;
	
	public MoralisNativePrice() {
		super();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getDecimals() {
		return decimals;
	}

	public void setDecimals(Integer decimals) {
		this.decimals = decimals;
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
	
	@Override
	public String toString() {
		return "nativeName: " + this.getName() + " nativeSymbol: " + this.getSymbol() + " nativeDecimals: " + this.getDecimals() + " nativeValue: " + this.getValue(); 
	}
}
