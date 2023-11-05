package crypto.forestfish.objects.evm.model.nft.metadata;

public class OpenSeaTrait {

	private String trait_type;
	private Object value;
	
	public OpenSeaTrait() {
		super();
	}
	
	public OpenSeaTrait(String trait_type, Object value) {
		super();
		this.trait_type = trait_type;
		this.value = value;
	}

	public String getTrait_type() {
		return trait_type;
	}

	public void setTrait_type(String trait_type) {
		this.trait_type = trait_type;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
}
