package crypto.forestfish.objects.evm;

import crypto.forestfish.objects.evm.model.chain.EVMCurrency;

public class EVMAccountBalance {

	private boolean isEmpty = true;
    private String balanceInWEI; // BigInteger
    private String balanceInGWEI; // BigDecimal
    private String balanceInETH; // BigDecimal
    private EVMCurrency currency;
    
    public EVMAccountBalance() {
		super();
	}

	public EVMAccountBalance(String balanceInWEI, String balanceInGWEI, String balanceInETH, EVMCurrency currency, boolean isEmpty) {
        super();
        this.balanceInWEI = balanceInWEI;
        this.balanceInGWEI = balanceInGWEI;
        this.balanceInETH = balanceInETH;
        this.currency = currency;
        this.isEmpty = isEmpty; 
    }

	public String getBalanceInWEI() {
		return balanceInWEI;
	}

	public void setBalanceInWEI(String balanceInWEI) {
		this.balanceInWEI = balanceInWEI;
	}
	
	public String getBalanceInETH() {
		return balanceInETH;
	}
	
	public String getBalanceInETHPrettyPrint() {
		if (balanceInETH.startsWith("0.00")) {
			return "..." + this.balanceInETH;
		} else {
			return this.balanceInETH;
		}
	}

	public void setBalanceInETH(String balanceInETH) {
		this.balanceInETH = balanceInETH;
	}

	public EVMCurrency getCurrency() {
		return currency;
	}

	public void setCurrency(EVMCurrency currency) {
		this.currency = currency;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public String getBalanceInGWEI() {
		return balanceInGWEI;
	}
	
	public String getBalanceInGWEIPrettyPrint() {
		if (this.getCurrency().getDecimal() == 18) {
			return this.balanceInGWEI;
		} else {
			return "-";
		}
	}

	public void setBalanceInGWEI(String balanceInGWEI) {
		this.balanceInGWEI = balanceInGWEI;
	}

	@Override
	public String toString() {
		return "balanceInWEI=" + this.balanceInWEI + " balanceInGWEI=" + this.balanceInGWEI + " balanceInETH=" + this.balanceInETH + " currency.decimal=" + this.currency.getDecimal() + " currency.symbol=" + this.currency.getSymbol() + " isEmpty= " + this.isEmpty;
	}
	
}
