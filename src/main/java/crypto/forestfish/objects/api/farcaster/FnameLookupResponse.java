package crypto.forestfish.objects.api.farcaster;

import java.util.ArrayList;

import crypto.forestfish.objects.evm.farcaster.fnames.Transfer;

public class FnameLookupResponse {

	private ArrayList<Transfer> transfers;

	public FnameLookupResponse() {
		super();
	}

	public ArrayList<Transfer> getTransfers() {
		return transfers;
	}

	public void setTransfers(ArrayList<Transfer> transfers) {
		this.transfers = transfers;
	}

}
