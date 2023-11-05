package crypto.forestfish.objects.avm;

import crypto.forestfish.objects.avm.model.chain.AVMCurrency;

public class AVMAccountBalance {

	private boolean isEmpty = true;
    private Long balanceInMicroAlgo;
    private Double balanceInALGO; 
    private AVMCurrency currency;
    
    public AVMAccountBalance() {
		super();
	}

	public AVMAccountBalance(Long _balanceInMicroAlgo, Double _balanceInALGO, AVMCurrency _currency, boolean isEmpty) {
        super();
        this.balanceInMicroAlgo = _balanceInMicroAlgo;
        this.balanceInALGO = _balanceInALGO;
        this.currency = _currency;
        this.isEmpty = isEmpty; 
    }

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public Long getBalanceInMicroAlgo() {
		return balanceInMicroAlgo;
	}

	public void setBalanceInMicroAlgo(Long balanceInMicroAlgo) {
		this.balanceInMicroAlgo = balanceInMicroAlgo;
	}

	public Double getBalanceInALGO() {
		return balanceInALGO;
	}

	public void setBalanceInALGO(Double balanceInALGO) {
		this.balanceInALGO = balanceInALGO;
	}

	public AVMCurrency getCurrency() {
		return currency;
	}

	public void setCurrency(AVMCurrency currency) {
		this.currency = currency;
	}

	public String getBalanceInALGOPrettyPrint() {
		if (balanceInALGO < 0.001d) {
			return "..." + this.balanceInALGO;
		} else {
			return this.balanceInALGO + "";
		}
	}

	public String getBalanceInuAlgoPrettyPrint() {
		if (this.getCurrency().getDecimal() == 18) {
			return this.balanceInMicroAlgo + "";
		} else {
			return "-";
		}
	}
}
