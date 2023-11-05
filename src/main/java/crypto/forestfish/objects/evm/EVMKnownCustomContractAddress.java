package crypto.forestfish.objects.evm;

import java.util.ArrayList;

import crypto.forestfish.enums.CustomContractCategory;
import crypto.forestfish.enums.evm.EVMChain;

public class EVMKnownCustomContractAddress {

	private String name;
	private String address;
	private EVMChain chain;
	private CustomContractCategory category;
    private ArrayList<String> origins = new ArrayList<String>();
    
	public EVMKnownCustomContractAddress(String name, String address, EVMChain chain, CustomContractCategory category, ArrayList<String> origins) {
		super();
		this.name = name;
		this.address = address;
		this.chain = chain;
		this.category = category;
		this.origins = origins;
	}

	public EVMKnownCustomContractAddress() {
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

	public EVMChain getChain() {
		return chain;
	}

	public void setChain(EVMChain chain) {
		this.chain = chain;
	}

}
