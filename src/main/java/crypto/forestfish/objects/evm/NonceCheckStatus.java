package crypto.forestfish.objects.evm;

public class NonceCheckStatus {

	private PendingTxStatus status;
	private boolean earlyexit = false;
	
	public NonceCheckStatus(PendingTxStatus status, boolean earlyexit) {
		super();
		this.status = status;
		this.earlyexit = earlyexit;
	}

	public PendingTxStatus getStatus() {
		return status;
	}

	public void setStatus(PendingTxStatus status) {
		this.status = status;
	}

	public boolean isEarlyexit() {
		return earlyexit;
	}

	public void setEarlyexit(boolean earlyexit) {
		this.earlyexit = earlyexit;
	}
	
}
