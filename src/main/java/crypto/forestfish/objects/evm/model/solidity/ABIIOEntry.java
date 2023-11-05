package crypto.forestfish.objects.evm.model.solidity;

import crypto.forestfish.utils.StringsUtils;

public class ABIIOEntry {

	private String internalType;
	private String name;
	private String type;
	
	public ABIIOEntry() {
		super();
	}

	public ABIIOEntry(String internalType, String name, String type) {
		super();
		this.internalType = internalType;
		this.name = name;
		this.type = type;
	}

	public String getInternalType() {
		return internalType;
	}

	public void setInternalType(String internalType) {
		this.internalType = internalType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return StringsUtils.cutAndPadStringToN("name=" + this.name, 20) + StringsUtils.cutAndPadStringToN(" type=" + this.type, 20) + StringsUtils.cutAndPadStringToN(" internalType=" + this.internalType, 20); 
	}
	
}
