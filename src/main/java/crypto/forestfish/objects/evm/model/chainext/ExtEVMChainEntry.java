package crypto.forestfish.objects.evm.model.chainext;

import java.util.ArrayList;
import java.util.HashMap;

public class ExtEVMChainEntry {

	private String name;
	private String chain;
	private ArrayList<String> rpc;
	private ArrayList<HashMap<String,String>> features;
	private ArrayList<String> faucets;
	private ExtNativeCurrency nativeCurrency;
	private String infoURL;
	private String shortName;
	private Long chainId;
	private Long networkId;
	private Long slip44;
	private HashMap<String,String> ens;
	private ArrayList<HashMap<String,String>> explorers;
	
	public ExtEVMChainEntry() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChain() {
		return chain;
	}

	public void setChain(String chain) {
		this.chain = chain;
	}

	public ArrayList<String> getRpc() {
		return rpc;
	}

	public void setRpc(ArrayList<String> rpc) {
		this.rpc = rpc;
	}

	public ArrayList<HashMap<String, String>> getFeatures() {
		return features;
	}

	public void setFeatures(ArrayList<HashMap<String, String>> features) {
		this.features = features;
	}

	public ArrayList<String> getFaucets() {
		return faucets;
	}

	public void setFaucets(ArrayList<String> faucets) {
		this.faucets = faucets;
	}

	public ExtNativeCurrency getNativeCurrency() {
		return nativeCurrency;
	}

	public void setNativeCurrency(ExtNativeCurrency nativeCurrency) {
		this.nativeCurrency = nativeCurrency;
	}

	public String getInfoURL() {
		return infoURL;
	}

	public void setInfoURL(String infoURL) {
		this.infoURL = infoURL;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public HashMap<String, String> getEns() {
		return ens;
	}

	public void setEns(HashMap<String, String> ens) {
		this.ens = ens;
	}

	public ArrayList<HashMap<String, String>> getExplorers() {
		return explorers;
	}

	public void setExplorers(ArrayList<HashMap<String, String>> explorers) {
		this.explorers = explorers;
	}

	public Long getSlip44() {
		return slip44;
	}

	public void setSlip44(Long slip44) {
		this.slip44 = slip44;
	}

	public Long getChainId() {
		return chainId;
	}

	public void setChainId(Long chainId) {
		this.chainId = chainId;
	}

	public Long getNetworkId() {
		return networkId;
	}

	public void setNetworkId(Long networkId) {
		this.networkId = networkId;
	}
	
}
