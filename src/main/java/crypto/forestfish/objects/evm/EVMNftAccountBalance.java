package crypto.forestfish.objects.evm;

public class EVMNftAccountBalance {

	private boolean isEmpty = true;
    private String balance;
   
    public EVMNftAccountBalance() {
		super();
	}

	public EVMNftAccountBalance(String balance, boolean isEmpty) {
        super();
        this.balance = balance;
        this.isEmpty = isEmpty; 
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


}
