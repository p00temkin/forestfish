package crypto.forestfish.objects.ipfs.model;

import java.util.ArrayList;

public class IPFSNetwork {

	private String name;
	private ArrayList<String> gatewayURLs = new ArrayList<String>();
	private String gateway_checker_cid;
	
	public IPFSNetwork() {
		super();
	}

	public IPFSNetwork(String _name, ArrayList<String> _gatewayURLs, String _gateway_checker_cid) {
		super();
		this.name = _name;
		this.gatewayURLs = _gatewayURLs;
		this.gateway_checker_cid = _gateway_checker_cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getGatewayURLs() {
		return gatewayURLs;
	}

	public void setGatewayURLs(ArrayList<String> gatewayURLs) {
		this.gatewayURLs = gatewayURLs;
	}

	public String getGateway_checker_cid() {
		return gateway_checker_cid;
	}

	public void setGateway_checker_cid(String gateway_checker_cid) {
		this.gateway_checker_cid = gateway_checker_cid;
	}


}
