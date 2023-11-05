package crypto.forestfish.objects.avm;

import java.util.ArrayList;

import crypto.forestfish.enums.CustomContractCategory;
import crypto.forestfish.enums.avm.AVMChain;

public class AVMKnownCustomContractAddress {

	private String name;
	private String address;
	private AVMChain chain;
	private CustomContractCategory category;
    private ArrayList<String> origins = new ArrayList<String>();
    
	public AVMKnownCustomContractAddress(String name, String address, AVMChain chain, CustomContractCategory category, ArrayList<String> origins) {
		super();
		this.name = name;
		this.address = address;
		this.chain = chain;
		this.category = category;
		this.origins = origins;
	}

	public AVMKnownCustomContractAddress() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<String> getOrigins() {
		return origins;
	}

	public void setOrigins(ArrayList<String> origins) {
		this.origins = origins;
	}

	public CustomContractCategory getCategory() {
		return category;
	}

	public void setCategory(CustomContractCategory category) {
		this.category = category;
	}

	public AVMChain getChain() {
		return chain;
	}

	public void setChain(AVMChain chain) {
		this.chain = chain;
	}

}
