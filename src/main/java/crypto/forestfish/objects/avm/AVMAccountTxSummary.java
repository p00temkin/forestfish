package crypto.forestfish.objects.avm;

import java.util.HashMap;

public class AVMAccountTxSummary {

	private HashMap<String, Long> txtype_counts = new HashMap<>();
	private long txcount = 0L;
	
	public AVMAccountTxSummary() {
		super();
	}

	public AVMAccountTxSummary(HashMap<String, Long> txtype_counts, long txcount) {
		super();
		this.txtype_counts = txtype_counts;
		this.txcount = txcount;
	}

	public HashMap<String, Long> getTxtype_counts() {
		return txtype_counts;
	}

	public void setTxtype_counts(HashMap<String, Long> txtype_counts) {
		this.txtype_counts = txtype_counts;
	}

	public long getTxcount() {
		return txcount;
	}

	public void setTxcount(long txcount) {
		this.txcount = txcount;
	}

}
