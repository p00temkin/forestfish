package crypto.forestfish.objects.avm.model.asa;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonAlias;

public class ASAParamsOnchain {

	private String clawback;
	private String creator;
	private Integer decimals;
	
	@JsonAlias("default-frozen")
	private Boolean default_frozen;
	
	private String freeze;
	private String manager;
	
	@JsonAlias("metadata-hash")
	private String metadata_hash;
	
	private String name;
	
	@JsonAlias("name-b64")
	private String name_b64;
	
	private String reserve;
	private BigInteger total;
	
	@JsonAlias("unit-name")
	private String unit_name;
	
	@JsonAlias("unit-name-b64")
	private String unit_name_b64;
	
	private String url;

	@JsonAlias("url-b64")
	private String url_b64;

	public ASAParamsOnchain() {
		super();
	}

	public String getClawback() {
		return clawback;
	}

	public void setClawback(String clawback) {
		this.clawback = clawback;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Integer getDecimals() {
		return decimals;
	}

	public void setDecimals(Integer decimals) {
		this.decimals = decimals;
	}

	public Boolean getDefault_frozen() {
		return default_frozen;
	}

	public void setDefault_frozen(Boolean default_frozen) {
		this.default_frozen = default_frozen;
	}

	public String getFreeze() {
		return freeze;
	}

	public void setFreeze(String freeze) {
		this.freeze = freeze;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getMetadata_hash() {
		return metadata_hash;
	}

	public void setMetadata_hash(String metadata_hash) {
		this.metadata_hash = metadata_hash;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName_b64() {
		return name_b64;
	}

	public void setName_b64(String name_b64) {
		this.name_b64 = name_b64;
	}

	public String getReserve() {
		return reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public String getUnit_name() {
		return unit_name;
	}

	public void setUnit_name(String unit_name) {
		this.unit_name = unit_name;
	}

	public String getUnit_name_b64() {
		return unit_name_b64;
	}

	public void setUnit_name_b64(String unit_name_b64) {
		this.unit_name_b64 = unit_name_b64;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl_b64() {
		return url_b64;
	}

	public void setUrl_b64(String url_b64) {
		this.url_b64 = url_b64;
	}

	public BigInteger getTotal() {
		return total;
	}

	public void setTotal(BigInteger total) {
		this.total = total;
	}
	
}
