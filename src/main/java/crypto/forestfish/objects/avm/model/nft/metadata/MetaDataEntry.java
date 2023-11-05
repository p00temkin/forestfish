package crypto.forestfish.objects.avm.model.nft.metadata;

public class MetaDataEntry {

	private String metajson;
	private Long tx_roundTime;
	private Long tx_confirmedRound;
	private String tx_id;

	public MetaDataEntry() {
		super();
	}
	
	public MetaDataEntry(String metajson) {
		super();
		this.metajson = metajson;
	}

	public String getMetajson() {
		return metajson;
	}

	public void setMetajson(String metajson) {
		this.metajson = metajson;
	}

	public Long getTx_roundTime() {
		return tx_roundTime;
	}

	public void setTx_roundTime(Long tx_roundTime) {
		this.tx_roundTime = tx_roundTime;
	}

	public Long getTx_confirmedRound() {
		return tx_confirmedRound;
	}

	public void setTx_confirmedRound(Long tx_confirmedRound) {
		this.tx_confirmedRound = tx_confirmedRound;
	}

	public String getTx_id() {
		return tx_id;
	}

	public void setTx_id(String tx_id) {
		this.tx_id = tx_id;
	}

}
