package crypto.forestfish.objects.ipfs;

import java.math.BigDecimal;
import java.math.BigInteger;

public class WalletBalance {

	private BigDecimal balance;
	private BigInteger balanceInWEI;

	public WalletBalance(BigDecimal balance, BigInteger balanceInWEI) {
		super();
		this.balance = balance;
		this.balanceInWEI = balanceInWEI;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigInteger getBalanceInWEI() {
		return balanceInWEI;
	}
	public void setBalanceInWEI(BigInteger balanceInWEI) {
		this.balanceInWEI = balanceInWEI;
	}
	
	@Override
	public String toString() {
		return "balance: " + balance + " balanceInWEI: " + balanceInWEI;
	}
	
	
}
