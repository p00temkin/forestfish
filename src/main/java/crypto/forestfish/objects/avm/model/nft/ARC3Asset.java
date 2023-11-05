package crypto.forestfish.objects.avm.model.nft;

import java.math.BigInteger;

import com.algorand.algosdk.crypto.Address;

import crypto.forestfish.enums.avm.AVMNFTType;
import crypto.forestfish.utils.StringsUtils;

public class ARC3Asset {

	private Long assetID; // only set when minted
	
	// https://github.com/algorandfoundation/ARCs/blob/main/ARCs/arc-0003.md
	// https://developer.algorand.org/docs/get-details/transactions/transactions/#asset-parameters
	private String unitName; // Unit name (un)
	private String assetName; // Asset Name (an)
	private String assetURL; // Asset URL RFC-3986 (au)
	private byte[] assetMetadataHash; // Asset Metadata Hash (am)
	private String assetMetadataHashSTR; // Asset Metadata Hash (am)
	
	private BigInteger totalNrUnits; // Total Number of Units (t)
	private Integer decimals; // Number of Digits after the Decimal Points (dc)
	
	private boolean defaultFrozen = false; // (df)
	
	private Address manager = null; // (m)
	private Address reserve = null; // (r)
	private Address freeze = null; // (f)
	private Address clawback = null; // (c)
	
	// Calculated
	private AVMNFTType type = AVMNFTType.FRACTIONAL; // Calculated based on t+dc
	private String assetNameBase64 = null;
	private String unitNameBase64 = null;
	private String urlBase64 = null;

	public ARC3Asset() {
		super();
	}
	
	public ARC3Asset(Long _assetID, String _unitName, String _assetName, String _assetURL, BigInteger _totalNrUnits, Integer _decimals) {
		super();
		this.assetID = _assetID;
		this.unitName = _unitName;
		this.assetName = _assetName;
		this.assetURL = _assetURL;
		this.totalNrUnits = _totalNrUnits;
		this.decimals = _decimals;
		
		this.update();
	}
	
	public ARC3Asset(String _unitName, String _assetName, String _assetURL, BigInteger _totalNrUnits, Integer _decimals) {
		super();
		this.unitName = _unitName;
		this.assetName = _assetName;
		this.assetURL = _assetURL;
		this.totalNrUnits = _totalNrUnits;
		this.decimals = _decimals;
		
		this.update();
	}
	
	public ARC3Asset(Long _assetID, String _unitName, String _assetName, String _assetURL, BigInteger _totalNrUnits, Integer _decimals, boolean _defaultFrozen, String _assetMetadataHashSTR, Address _manager, Address _reserve, Address _freeze, Address _clawback) {
		super();
		this.assetID = _assetID;
		this.unitName = _unitName;
		this.assetName = _assetName;
		this.assetURL = _assetURL;
		this.totalNrUnits = _totalNrUnits;
		this.decimals = _decimals;
		this.defaultFrozen = _defaultFrozen;
		this.assetMetadataHashSTR = _assetMetadataHashSTR;
		this.manager = _manager;
		this.reserve = _reserve;
		this.freeze = _freeze;
		this.clawback = _clawback;
		
		this.update();
	}

	public ARC3Asset(String _unitName, String _assetName, String _assetURL, BigInteger _totalNrUnits, Integer _decimals, boolean _defaultFrozen, Address _manager, Address _reserve, Address _freeze, Address _clawback) {
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
		
		// base64
		this.assetNameBase64 = StringsUtils.encodeStringToBase64(this.assetName);
		this.unitNameBase64 = StringsUtils.encodeStringToBase64(this.unitName);
		this.urlBase64 = StringsUtils.encodeStringToBase64(this.assetURL);
		
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

	public String getAssetNameBase64() {
		return assetNameBase64;
	}

	public void setAssetNameBase64(String assetNameBase64) {
		this.assetNameBase64 = assetNameBase64;
	}

	public String getUnitNameBase64() {
		return unitNameBase64;
	}

	public void setUnitNameBase64(String unitNameBase64) {
		this.unitNameBase64 = unitNameBase64;
	}

	public String getUrlBase64() {
		return urlBase64;
	}

	public void setUrlBase64(String urlBase64) {
		this.urlBase64 = urlBase64;
	}

	public Long getAssetID() {
		return assetID;
	}

	public void setAssetID(Long assetID) {
		this.assetID = assetID;
	}

	public byte[] getAssetMetadataHash() {
		return assetMetadataHash;
	}

	public void setAssetMetadataHash(byte[] assetMetadataHash) {
		this.assetMetadataHash = assetMetadataHash;
	}

	public String getAssetMetadataHashSTR() {
		return assetMetadataHashSTR;
	}

	public void setAssetMetadataHashSTR(String assetMetadataHashSTR) {
		this.assetMetadataHashSTR = assetMetadataHashSTR;
	}

	@Override
	public String toString() {
		return "standard=ARC3 assetID=" + this.assetID + " unitName=" + this.unitName + " assetName=\"" + this.assetName + "\" assetURL=" + this.assetURL;
	}
}
