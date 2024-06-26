package crypto.forestfish.objects.evm;

import java.math.BigInteger;

public class PendingTxStatus {

	private boolean pending;
	private BigInteger nonce_latest;
	private BigInteger nonce_pending;
	private BigInteger nonce_finalized;
	private Long nonce_diff;

	public PendingTxStatus() {
		super();
	}

	public PendingTxStatus(boolean _pending, BigInteger _nonce_latest, BigInteger _nonce_pending, BigInteger _nonce_finalized, Long _nonce_diff) {
		super();
		this.pending = _pending;
		this.nonce_latest = _nonce_latest;
		this.nonce_pending = _nonce_pending;
		this.nonce_finalized = _nonce_finalized;
		this.nonce_diff = _nonce_diff;
	}
	
	public boolean isPending() {
		return pending;
	}
	
	public void setPending(boolean pending) {
		this.pending = pending;
	}
	
	public BigInteger getNonce_latest() {
		return nonce_latest;
	}
	
	public void setNonce_latest(BigInteger nonce_latest) {
		this.nonce_latest = nonce_latest;
	}
	
	public BigInteger getNonce_pending() {
		return nonce_pending;
	}
	
	public void setNonce_pending(BigInteger nonce_pending) {
		this.nonce_pending = nonce_pending;
	}

	public Long getNonce_diff() {
		return nonce_diff;
	}

	public void setNonce_diff(Long nonce_diff) {
		this.nonce_diff = nonce_diff;
	}

	public BigInteger getNonce_finalized() {
		return nonce_finalized;
	}

	public void setNonce_finalized(BigInteger nonce_finalized) {
		this.nonce_finalized = nonce_finalized;
	}

	@Override
	public String toString() {
		return "ispending: " + this.isPending() + " nonce_latest: " + this.getNonce_latest() + " nonce_pending: " + this.getNonce_pending();
	}
}

