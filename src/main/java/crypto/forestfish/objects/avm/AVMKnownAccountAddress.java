package crypto.forestfish.objects.avm;

import java.util.ArrayList;

import crypto.forestfish.enums.AddressCategory;

public class AVMKnownAccountAddress {

	private String name;
	private String address;
	private AddressCategory category;
    private ArrayList<String> origins = new ArrayList<String>();
    
	public AVMKnownAccountAddress(String name, String address, AddressCategory category, ArrayList<String> origins) {
		super();
		this.name = name;
		this.address = address;
		this.category = category;
		this.origins = origins;
	}

	public AVMKnownAccountAddress() {
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

	public AddressCategory getCategory() {
		return category;
	}

	public void setCategory(AddressCategory category) {
		this.category = category;
	}

}
