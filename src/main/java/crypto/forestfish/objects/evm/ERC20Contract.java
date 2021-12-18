package crypto.forestfish.objects.evm;

import java.math.BigInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ERC20Contract {

    private static final Logger LOGGER = LoggerFactory.getLogger(ERC20Contract.class);

    private String tokenName;
    private String contractAdress;
    private BigInteger weiFraction = new BigInteger("1000000000000000000");
    private BigInteger weiMultiple = new BigInteger("1");
    
    public ERC20Contract(String tokenName, String contractAdress) {
        super();
        this.tokenName = tokenName;
        this.contractAdress = contractAdress;
        LOGGER.debug("ERC20 token " + tokenName);
    }

    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public String getContractAdress() {
        return contractAdress;
    }

    public void setContractAdress(String contractAdress) {
        this.contractAdress = contractAdress;
    }

    public BigInteger getWeiFraction() {
        return weiFraction;
    }

    public void setWeiFraction(BigInteger weiFraction) {
        this.weiFraction = weiFraction;
    }

    public BigInteger getWeiMultiple() {
        return weiMultiple;
    }

    public void setWeiMultiple(BigInteger weiMultiple) {
        this.weiMultiple = weiMultiple;
    }

}
