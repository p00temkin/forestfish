package crypto.forestfish.objects.evm.moralis;

public class MoralisERC20ContractMetaInfo {

	private String address;
	private String name;
	private String symbol;
	private String decimals;
	
	private String logo;
	private String logo_hash;
	private String thumbnail;
	private String block_number;
	private Integer validated;
	private String created_at;

	public MoralisERC20ContractMetaInfo() {
		super();
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getDecimals() {
		return decimals;
	}
	public void setDecimals(String decimals) {
		this.decimals = decimals;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getLogo_hash() {
		return logo_hash;
	}
	public void setLogo_hash(String logo_hash) {
		this.logo_hash = logo_hash;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getBlock_number() {
		return block_number;
	}
	public void setBlock_number(String block_number) {
		this.block_number = block_number;
	}
	public Integer getValidated() {
		return validated;
	}
	public void setValidated(Integer validated) {
		this.validated = validated;
	}

	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	
	@Override
	public String toString() {
		return "name: " + this.getName() + " symbol: " + this.getSymbol() + " address: " + this.getAddress() + " decimals: " + this.getDecimals() + " created_at: " + this.getCreated_at() + " validated: " + this.getValidated(); 
	}
}
