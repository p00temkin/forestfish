package crypto.forestfish.objects.avm.model.chain;

import java.util.ArrayList;

import crypto.forestfish.objects.avm.AlgoIndexerNode;
import crypto.forestfish.objects.avm.AlgoRelayNode;
import crypto.forestfish.objects.avm.model.asa.ASAIndex;
import crypto.forestfish.objects.avm.model.nft.AVMNFTIndex;

public class AVMChainInfo {
    
	private String shortName;
	private String chainName;
    private String type;
    private String genesisID;
    private String genesisHash;
	private AVMCurrency nativeCurrency = null;
    private ArrayList<AlgoRelayNode> nodes = new ArrayList<AlgoRelayNode>();
    private ArrayList<AlgoIndexerNode> idxnodes = new ArrayList<AlgoIndexerNode>();
    private ArrayList<String> blockexplorerURLs = new ArrayList<String>();
    private ArrayList<String> faucets = new ArrayList<String>();
    private ArrayList<String> origins = new ArrayList<String>();
    private ASAIndex tokenIndex;
    private AVMNFTIndex nftindex;
    
	public AVMChainInfo() {
		super();
	}

	public AVMChainInfo(String _shortName, String _chainName, String _type, String _genesisID, String _genesisHash, AVMCurrency _nativeCurrency, ArrayList<AlgoRelayNode> _nodes, ArrayList<AlgoIndexerNode> _idxnodes, ArrayList<String> _blockexplorerURLs, ArrayList<String> _faucets, ArrayList<String> _origins, ASAIndex _tokenIndex, AVMNFTIndex _nftindex) {
		super();
		this.shortName = _shortName;
		this.chainName = _chainName;
		this.type = _type;
		this.genesisID = _genesisID;
		this.genesisHash = _genesisHash;
		this.nativeCurrency = _nativeCurrency;
		this.nodes = _nodes;
		this.idxnodes = _idxnodes;
		this.blockexplorerURLs = _blockexplorerURLs;
		this.faucets = _faucets;
		this.origins = _origins;
		this.tokenIndex = _tokenIndex;
		this.nftindex = _nftindex;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getChainName() {
		return chainName;
	}

	public void setChainName(String chainName) {
		this.chainName = chainName;
	}

	public AVMCurrency getNativeCurrency() {
		return nativeCurrency;
	}

	public void setNativeCurrency(AVMCurrency nativeCurrency) {
		this.nativeCurrency = nativeCurrency;
	}

	public ArrayList<String> getBlockexplorerURLs() {
		return blockexplorerURLs;
	}

	public void setBlockexplorerURLs(ArrayList<String> blockexplorerURLs) {
		this.blockexplorerURLs = blockexplorerURLs;
	}

	public ArrayList<String> getOrigins() {
		return origins;
	}

	public void setOrigins(ArrayList<String> origins) {
		this.origins = origins;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AVMNFTIndex getNftindex() {
		return nftindex;
	}

	public void setNftindex(AVMNFTIndex nftindex) {
		this.nftindex = nftindex;
	}

	public ArrayList<String> getFaucets() {
		return faucets;
	}

	public void setFaucets(ArrayList<String> faucets) {
		this.faucets = faucets;
	}

	public ASAIndex getTokenIndex() {
		return tokenIndex;
	}

	public void setTokenIndex(ASAIndex tokenIndex) {
		this.tokenIndex = tokenIndex;
	}

	public String getGenesisHash() {
		return genesisHash;
	}

	public void setGenesisHash(String genesisHash) {
		this.genesisHash = genesisHash;
	}

	public String getGenesisID() {
		return genesisID;
	}

	public void setGenesisID(String genesisID) {
		this.genesisID = genesisID;
	}

	public ArrayList<AlgoRelayNode> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<AlgoRelayNode> nodes) {
		this.nodes = nodes;
	}

	public ArrayList<AlgoIndexerNode> getIdxnodes() {
		return idxnodes;
	}

	public void setIdxnodes(ArrayList<AlgoIndexerNode> idxnodes) {
		this.idxnodes = idxnodes;
	}
	
}
