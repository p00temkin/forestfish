package crypto.forestfish.objects.avm.model.nft;

import java.math.BigInteger;

import com.algorand.algosdk.crypto.Address;

import crypto.forestfish.enums.avm.AVMNFTType;

public class ARC69Asset {

	private Long assetID; // only set when minted
	
	// https://github.com/algorandfoundation/ARCs/blob/main/ARCs/arc-0003.md
	// https://developer.algorand.org/docs/get-details/transactions/transactions/#asset-parameters
	private String unitName; // Unit name (un)
	private String assetName; // Asset Name (an)
	private String assetURL; // Asset URL RFC-3986 (au)
	private String assetMetadataHash; // Asset Metadata Hash (am)
	
	private BigInteger totalNrUnits; // Total Number of Units (t)
	private Integer decimals; // Number of Digits after the Decimal Points (dc)
	
	private boolean defaultFrozen = false;
	
	private Address manager = null;  // (m)
	private Address reserve = null;  // (r)
	private Address freeze = null;   // (f)
	private Address clawback = null; // (c)
	
	// Calculated
	private AVMNFTType type; // Calculated based on t+dc

	public ARC69Asset() {
		super();
	}
	
	public ARC69Asset(Long _assetID, String _unitName, String _assetName, String _assetURL, BigInteger _totalNrUnits, Integer _decimals) {
		super();
		this.assetID = _assetID;
		this.unitName = _unitName;
		this.assetName = _assetName;
		this.assetURL = _assetURL;
		this.totalNrUnits = _totalNrUnits;
		this.decimals = _decimals;
		
		this.update();
	}
	
	public ARC69Asset(String _unitName, String _assetName, String _assetURL, BigInteger _totalNrUnits, Integer _decimals) {
		super();
		this.unitName = _unitName;
		this.assetName = _assetName;
		this.assetURL = _assetURL;
		this.totalNrUnits = _totalNrUnits;
		this.decimals = _decimals;
		
		this.update();
	}

	public ARC69Asset(Long _assetID, String _unitName, String _assetName, String _assetURL, BigInteger _totalNrUnits, Integer _decimals, boolean _defaultFrozen, Address _manager, Address _reserve, Address _freeze, Address _clawback) {
		super();
		this.assetID = _assetID;
		this.unitName = _unitName;
		this.assetName = _assetName;
		this.assetURL = _assetURL;
		this.totalNrUnits = _totalNrUnits;
		this.decimals = _decimals;
		this.defaultFrozen = _defaultFrozen;
		this.manager = _manager;
		this.reserve = _reserve;
		this.freeze = _freeze;
		this.clawback = _clawback;
		
		this.update();
	}
	
	public ARC69Asset(String _unitName, String _assetName, String _assetURL, BigInteger _totalNrUnits, Integer _decimals, boolean _defaultFrozen, Address _manager, Address _reserve, Address _freeze, Address _clawback) {
		super();
		this.unitName = _unitName;
		this.assetName = _assetName;
		this.assetURL = _assetURL;
		this.totalNrUnits = _totalNrUnits;
		this.decimals = _decimals;
		this.defaultFrozen = _defaultFrozen;
		this.manager = _manager;
		this.reserve = _reserve;
		this.freeze = _freeze;
		this.clawback = _clawback;
		
		this.update();
	}
	
	public void update() {
		
		// type
		if ((this.totalNrUnits.compareTo(BigInteger.ONE) == 0) && (this.decimals.equals(0))) this.type = AVMNFTType.PURE;
		
	}
	
	public boolean sanityCheck() {
		return true;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetURL() {
		return assetURL;
	}

	public void setAssetURL(String assetURL) {
		this.assetURL = assetURL;
	}

	public String getAssetMetadataHash() {
		return assetMetadataHash;
	}

	public void setAssetMetadataHash(String assetMetadataHash) {
		this.assetMetadataHash = assetMetadataHash;
	}

	public BigInteger getTotalNrUnits() {
		return totalNrUnits;
	}

	public void setTotalNrUnits(BigInteger totalNrUnits) {
		this.totalNrUnits = totalNrUnits;
	}

	public Integer getDecimals() {
		return decimals;
	}

	public void setDecimals(Integer decimals) {
		this.decimals = decimals;
	}

	public boolean isDefaultFrozen() {
		return defaultFrozen;
	}

	public void setDefaultFrozen(boolean defaultFrozen) {
		this.defaultFrozen = defaultFrozen;
	}

	public Address getManager() {
		return manager;
	}

	public void setManager(Address manager) {
		this.manager = manager;
	}

	public Address getReserve() {
		return reserve;
	}

	public void setReserve(Address reserve) {
		this.reserve = reserve;
	}

	public Address getFreeze() {
		return freeze;
	}

	public void setFreeze(Address freeze) {
		this.freeze = freeze;
	}

	public Address getClawback() {
		return clawback;
	}

	public void setClawback(Address clawback) {
		this.clawback = clawback;
	}

	public AVMNFTType getType() {
		return type;
	}

	public void setType(AVMNFTType type) {
		this.type = type;
	}

	public Long getAssetID() {
		return assetID;
	}

	public void setAssetID(Long assetID) {
		this.assetID = assetID;
	}
	
	@Override
	public String toString() {
		return "standard=ARC69 assetID=" + this.assetID + " unitName=" + this.unitName + " assetName=\"" + this.assetName + "\" assetURL=" + this.assetURL;
	}

}
