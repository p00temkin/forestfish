package crypto.forestfish.objects.avm.model.nft;

import java.util.ArrayList;

import crypto.forestfish.enums.avm.AVMNFTStandard;
import crypto.forestfish.enums.avm.AVMNFTState;
import crypto.forestfish.enums.avm.AVMNFTType;

public class ARC19Info {

	private String unitName;
	private String creatorAddress;
	private AVMNFTStandard standard;
	private AVMNFTType type;
	private AVMNFTState state;
	private String description;
	private String chain;
	private ArrayList<String> origins = new ArrayList<String>();
	private String category;
	private ArrayList<String> linked_asa = new ArrayList<String>();

	public ARC19Info() {
		super();
	}

	public ARC19Info(String _unitName, String _creatorAddress, AVMNFTStandard _standard, AVMNFTType _type, AVMNFTState _state, String _description, String _category, String _chain, ArrayList<String> _origins) {
		super();
		this.unitName = _unitName;
		this.creatorAddress = _creatorAddress;
		this.standard = _standard;
		this.type = _type;
		this.state = _state;
		this.description = _description;
		this.category = _category;
		this.chain = _chain;
		this.origins = _origins;
	}
	
	public ARC19Info(String _unitName, String _creatorAddress, AVMNFTStandard _standard, AVMNFTType _type, AVMNFTState _state, String _description, String _category, String _chain, ArrayList<String> _origins, ArrayList<String> _linked_asa) {
		super();
		this.unitName = _unitName;
		this.creatorAddress = _creatorAddress;
		this.standard = _standard;
		this.type = _type;
		this.state = _state;
		this.description = _description;
		this.category = _category;
		this.chain = _chain;
		this.origins = _origins;
		this.linked_asa = _linked_asa;
	}

	public ArrayList<String> getOrigins() {
		return origins;
	}

	public void setOrigins(ArrayList<String> origins) {
		this.origins = origins;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getChain() {
		return chain;
	}

	public void setChain(String chain) {
		this.chain = chain;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public ArrayList<String> getLinked_asa() {
		return linked_asa;
	}

	public void setLinked_asa(ArrayList<String> linked_asa) {
		this.linked_asa = linked_asa;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getCreatorAddress() {
		return creatorAddress;
	}

	public void setCreatorAddress(String creatorAddress) {
		this.creatorAddress = creatorAddress;
	}

	public AVMNFTStandard getStandard() {
		return standard;
	}

	public void setStandard(AVMNFTStandard standard) {
		this.standard = standard;
	}

	public AVMNFTType getType() {
		return type;
	}

	public void setType(AVMNFTType type) {
		this.type = type;
	}

	public AVMNFTState getState() {
		return state;
	}

	public void setState(AVMNFTState state) {
		this.state = state;
	}

}
