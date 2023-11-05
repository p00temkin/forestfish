package crypto.forestfish.objects.avm;

import java.math.BigInteger;

import crypto.forestfish.objects.avm.model.asa.AVMASAInfo;

public class AVMAccountASABalance {

	private boolean isEmpty = true;
    private Double balanceWithDecimalNotation;
    private BigInteger balance;
    private AVMASAInfo asaInfo;
    
    public AVMAccountASABalance(BigInteger _balance, AVMASAInfo _asaInfo) {
        super();
        this.balance = _balance;
        this.asaInfo = _asaInfo;
        this.balanceWithDecimalNotation = _balance.longValue()/Math.pow(10L, asaInfo.getDecimals());
        if (_balance.longValue() != 0L) this.isEmpty = false; 
    }

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public Double getBalanceWithDecimalNotation() {
		return balanceWithDecimalNotation;
	}

	public void setBalanceWithDecimalNotation(Double balanceWithDecimalNotation) {
		this.balanceWithDecimalNotation = balanceWithDecimalNotation;
	}

	public AVMASAInfo getAsaInfo() {
		return asaInfo;
	}

	public void setAsaInfo(AVMASAInfo asaInfo) {
		this.asaInfo = asaInfo;
	}

	public BigInteger getBalance() {
		return balance;
	}

	public void setBalance(BigInteger balance) {
		this.balance = balance;
	}

}
