package crypto.forestfish.objects.evm;

public class EVMBlockChain {

    private String name = null;
    private String tokenName = null;
    private Integer chainID = null;
    private String nodeURL = null;
    private String blockexplorerURL = null;
    
    public EVMBlockChain(String name, String tokenName, Integer chainID, String nodeURL, String blockexplorerURL) {
        super();
        this.name = name;
        this.tokenName = tokenName;
        this.chainID = chainID;
        this.nodeURL = nodeURL;
        this.blockexplorerURL = blockexplorerURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public Integer getChainID() {
        return chainID;
    }

    public void setChainID(Integer chainID) {
        this.chainID = chainID;
    }

    public String getNodeURL() {
        return nodeURL;
    }

    public void setNodeURL(String nodeURL) {
        this.nodeURL = nodeURL;
    }

    public String getBlockexplorerURL() {
        return blockexplorerURL;
    }

    public void setBlockexplorerURL(String blockexplorerURL) {
        this.blockexplorerURL = blockexplorerURL;
    }
    
}
