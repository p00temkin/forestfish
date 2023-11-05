package crypto.forestfish.objects.avm;

public class AVMNftAccountBalance {

	private boolean isEmpty = true;
    private String balance;
	private String name = null;
    private String symbol = null;
   
    public AVMNftAccountBalance() {
		super();
	}

	public AVMNftAccountBalance(String _balance, boolean _isEmpty, String _name, String _symbol) {
        super();
        this.balance = _balance;
        this.isEmpty = _isEmpty; 
        this.name = _name;
        this.symbol = _symbol;
    }

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
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

}
