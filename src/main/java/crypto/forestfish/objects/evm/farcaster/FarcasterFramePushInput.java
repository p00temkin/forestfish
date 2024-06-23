package crypto.forestfish.objects.evm.farcaster;

import crypto.forestfish.objects.evm.farcaster.frame.TrustedData;
import crypto.forestfish.objects.evm.farcaster.frame.UntrustedData;

public class FarcasterFramePushInput {

	private UntrustedData untrustedData;
	private TrustedData trustedData;
	
	public FarcasterFramePushInput() {
		super();
	}

	public UntrustedData getUntrustedData() {
		return untrustedData;
	}
	
	public void setUntrustedData(UntrustedData untrustedData) {
		this.untrustedData = untrustedData;
	}
	
	public TrustedData getTrustedData() {
		return trustedData;
	}
	
	public void setTrustedData(TrustedData trustedData) {
		this.trustedData = trustedData;
	}
	
	
}
