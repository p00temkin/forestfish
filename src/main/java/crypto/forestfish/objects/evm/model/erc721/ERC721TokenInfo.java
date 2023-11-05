package crypto.forestfish.objects.evm.model.erc721;

public class ERC721TokenInfo {

	private String uri;
	private String id;
	private String metajson;
	private ERC721ContractInfo contractinfo;
	
	public ERC721TokenInfo() {
		super();
	}

	public ERC721TokenInfo(String uri, String id, String metajson) {
		super();
		this.uri = uri;
		this.id = id;
		this.metajson = metajson;
	}

	public String getMetajson() {
		return metajson;
	}

	public void setMetajson(String metajson) {
		this.metajson = metajson;
	}
	
	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ERC721ContractInfo getContractinfo() {
		return contractinfo;
	}

	public void setContractinfo(ERC721ContractInfo contractinfo) {
		this.contractinfo = contractinfo;
	}
	
}
