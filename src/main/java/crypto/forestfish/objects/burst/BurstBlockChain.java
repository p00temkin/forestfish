package crypto.forestfish.objects.burst;

public class BurstBlockChain {
    
    private String name = null;
    private String tokenName = null;
    private String nodeURL = null;
    private String blockexplorerURL = null;
    
    public BurstBlockChain(String name, String tokenName, String nodeURL, String blockexplorerURL) {
        super();
        this.name = name;
        this.tokenName = tokenName;
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
