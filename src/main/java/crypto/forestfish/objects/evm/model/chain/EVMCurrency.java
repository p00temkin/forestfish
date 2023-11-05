package crypto.forestfish.objects.evm.model.chain;

public class EVMCurrency {
	private String name = null;
    private String symbol = null;
    private Integer decimal = 18;
    
	public EVMCurrency() {
		super();
	}

	public EVMCurrency(String _name, String _symbol, Integer _decimal) {
		super();
		this.name = _name;
		this.symbol = _symbol;
		this.decimal = _decimal;
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

	public Integer getDecimal() {
		return decimal;
	}

	public void setDecimal(Integer decimal) {
		this.decimal = decimal;
	}
    
}
