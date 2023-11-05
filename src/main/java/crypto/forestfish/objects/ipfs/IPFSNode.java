package crypto.forestfish.objects.ipfs;

public class IPFSNode {

    private String api_address = "";     // typically port 5001
    private String gateway_address = ""; // typically port 8080
    
    public IPFSNode(String api_address) {
        super();
        this.api_address = api_address;
    }
    
    public IPFSNode(String api_address, String gateway_address) {
        super();
        this.api_address = api_address;
        this.gateway_address = gateway_address;
    }
    
    public String getApi_address() {
        return api_address;
    }
    
    public void setApi_address(String api_address) {
        this.api_address = api_address;
    }
    
    public String getGateway_address() {
        return gateway_address;
    }
    
    public void setGateway_address(String gateway_address) {
        this.gateway_address = gateway_address;
    }

}
