package crypto.forestfish.objects.avm.model.asa;

public class ASAContentOnchainReply {

	private Long index;
	private ASAParamsOnchain params;
	
	public ASAContentOnchainReply() {
		super();
	}

	public Long getIndex() {
		return index;
	}
	
	public void setIndex(Long index) {
		this.index = index;
	}
	
	public ASAParamsOnchain getParams() {
		return params;
	}
	
	public void setParams(ASAParamsOnchain params) {
		this.params = params;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("index=" + this.getIndex());
		if (null != this.getParams().getUnit_name()) sb.append(" unit-name=" + this.getParams().getUnit_name());
		if (null != this.getParams().getName()) sb.append(" name=" + this.getParams().getName());
		sb.append(" total=" + this.getParams().getTotal());
		sb.append(" decimals=" + this.getParams().getDecimals());
		sb.append(" default_frozen=" + this.getParams().getDefault_frozen());
		sb.append(" creator=" + this.getParams().getCreator());
		if (null != this.getParams().getUrl()) sb.append(" url=" + this.getParams().getUrl());
		if (null != this.getParams().getMetadata_hash()) sb.append(" metadata_hash=" + this.getParams().getMetadata_hash());
		return sb.toString();
	}
	
}
