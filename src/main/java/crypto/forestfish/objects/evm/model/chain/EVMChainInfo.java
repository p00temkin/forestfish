package crypto.forestfish.objects.evm.model.chain;

import java.util.ArrayList;

import crypto.forestfish.objects.evm.model.erc20.ERC20TokenIndex;
import crypto.forestfish.objects.evm.model.nft.EVMNFTIndex;

public class EVMChainInfo {
    
	private String shortName;
	private String chainName;
	private Long chainId;
    private String type;
	private EVMCurrency nativeCurrency = null;
	private String priceMechanism;
	private String fallbackGasPriceInWEI;
	private String enforcedMinGasPriceInWEI = null;
	private int confirmationTimeinSeconds = 30;
	private String fallbackGasLimitInUnits;
    private ArrayList<String> nodeURLs = new ArrayList<String>();
    private ArrayList<String> archivenodeURLs = new ArrayList<String>();
    private ArrayList<String> flashbotnodeURLs = new ArrayList<String>();
    private ArrayList<String> flashbotrelaynodeURLs = new ArrayList<String>();
    private ArrayList<String> blockexplorerURLs = new ArrayList<String>();
    private ArrayList<String> faucets = new ArrayList<String>();
    private ArrayList<String> origins = new ArrayList<String>();
    private ERC20TokenIndex tokenIndex;
    private EVMNFTIndex nftindex;
    
	public EVMChainInfo() {
		super();
	}

	public EVMChainInfo(String _shortName, String _chainName, Long _chainId, String _type, EVMCurrency _nativeCurrency, String _priceMechanism, int confirmationTimeinSeconds, String _fallbackGasPriceInWEI, String _enforcedMinGasPriceInWEI, String _fallbackGasLimitInUnits, ArrayList<String> _nodeURLs, ArrayList<String> _archivenodeURLs, ArrayList<String> _flashbotnodeURLs, ArrayList<String> _flashbotrelaynodeURLs, ArrayList<String> _blockexplorerURLs, ArrayList<String> _faucets, ArrayList<String> _origins, ERC20TokenIndex _tokenIndex, EVMNFTIndex _nftindex) {
		super();
		this.shortName = _shortName;
		this.chainName = _chainName;
		this.chainId = _chainId;
		this.type = _type;
		this.nativeCurrency = _nativeCurrency;
		this.priceMechanism = _priceMechanism;
		this.confirmationTimeinSeconds = confirmationTimeinSeconds;
		this.fallbackGasPriceInWEI = _fallbackGasPriceInWEI;
		this.enforcedMinGasPriceInWEI = _enforcedMinGasPriceInWEI;
		this.fallbackGasLimitInUnits = _fallbackGasLimitInUnits;
		this.nodeURLs = _nodeURLs;
		this.archivenodeURLs = _archivenodeURLs;
		this.flashbotnodeURLs = _flashbotnodeURLs;
		this.flashbotrelaynodeURLs = _flashbotrelaynodeURLs;
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

	public Long getChainId() {
		return chainId;
	}

	public void setChainId(Long chainId) {
		this.chainId = chainId;
	}

	public EVMCurrency getNativeCurrency() {
		return nativeCurrency;
	}

	public void setNativeCurrency(EVMCurrency nativeCurrency) {
		this.nativeCurrency = nativeCurrency;
	}

	public ArrayList<String> getNodeURLs() {
		return nodeURLs;
	}

	public void setNodeURLs(ArrayList<String> nodeURLs) {
		this.nodeURLs = nodeURLs;
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

	public ERC20TokenIndex getTokenIndex() {
		return tokenIndex;
	}

	public void setTokenIndex(ERC20TokenIndex tokenIndex) {
		this.tokenIndex = tokenIndex;
	}

	public EVMNFTIndex getNftindex() {
		return nftindex;
	}

	public void setNftindex(EVMNFTIndex nftindex) {
		this.nftindex = nftindex;
	}

	public String getPriceMechanism() {
		return priceMechanism;
	}

	public void setPriceMechanism(String priceMechanism) {
		this.priceMechanism = priceMechanism;
	}

	public String getFallbackGasPriceInWEI() {
		return fallbackGasPriceInWEI;
	}

	public void setFallbackGasPriceInWEI(String fallbackGasPriceInWEI) {
		this.fallbackGasPriceInWEI = fallbackGasPriceInWEI;
	}

	public String getFallbackGasLimitInUnits() {
		return fallbackGasLimitInUnits;
	}

	public void setFallbackGasLimitInUnits(String fallbackGasLimitInUnits) {
		this.fallbackGasLimitInUnits = fallbackGasLimitInUnits;
	}

	public ArrayList<String> getFaucets() {
		return faucets;
	}

	public void setFaucets(ArrayList<String> faucets) {
		this.faucets = faucets;
	}

	public ArrayList<String> getFlashbotnodeURLs() {
		return flashbotnodeURLs;
	}

	public void setFlashbotnodeURLs(ArrayList<String> flashbotnodeURLs) {
		this.flashbotnodeURLs = flashbotnodeURLs;
	}

	public ArrayList<String> getFlashbotrelaynodeURLs() {
		return flashbotrelaynodeURLs;
	}

	public void setFlashbotrelaynodeURLs(ArrayList<String> flashbotrelaynodeURLs) {
		this.flashbotrelaynodeURLs = flashbotrelaynodeURLs;
	}

	public String getEnforcedMinGasPriceInWEI() {
		return enforcedMinGasPriceInWEI;
	}

	public void setEnforcedMinGasPriceInWEI(String enforcedMinGasPriceInWEI) {
		this.enforcedMinGasPriceInWEI = enforcedMinGasPriceInWEI;
	}

	public ArrayList<String> getArchivenodeURLs() {
		return archivenodeURLs;
	}

	public void setArchivenodeURLs(ArrayList<String> archivenodeURLs) {
		this.archivenodeURLs = archivenodeURLs;
	}

	public int getConfirmationTimeinSeconds() {
		return confirmationTimeinSeconds;
	}

	public void setConfirmationTimeinSeconds(int confirmationTimeinSeconds) {
		this.confirmationTimeinSeconds = confirmationTimeinSeconds;
	}
	
}
