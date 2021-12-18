package crypto.forestfish.objects.evm;

import java.math.BigDecimal;
import java.math.BigInteger;

public class EVMWalletBalance {

    BigDecimal balanceInETH = null;
    BigInteger balanceInWEI = null;
    
    public EVMWalletBalance(BigDecimal balanceInETH, BigInteger balanceInWEI) {
        super();
        this.balanceInETH = balanceInETH;
        this.balanceInWEI = balanceInWEI;
    }

    public BigDecimal getBalanceInETH() {
        return balanceInETH;
    }

    public void setBalanceInETH(BigDecimal balanceInETH) {
        this.balanceInETH = balanceInETH;
    }

    public BigInteger getBalanceInWEI() {
        return balanceInWEI;
    }

    public void setBalanceInWEI(BigInteger balanceInWEI) {
        this.balanceInWEI = balanceInWEI;
    }
    
}
