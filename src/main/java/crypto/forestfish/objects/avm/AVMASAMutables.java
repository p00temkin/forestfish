package crypto.forestfish.objects.avm;

import com.algorand.algosdk.crypto.Address;

public class AVMASAMutables {

	private Address manager = null;
	private Address reserve = null;
	private Address freeze = null;
	private Address clawback = null;
	
	public AVMASAMutables(Address manager, Address reserve, Address freeze, Address clawback) {
		super();
		this.manager = manager;
		this.reserve = reserve;
		this.freeze = freeze;
		this.clawback = clawback;
	}

	public Address getManager() {
		return manager;
	}
	
	public void setManager(Address manager) {
		this.manager = manager;
	}
	
	public Address getReserve() {
		return reserve;
	}
	
	public void setReserve(Address reserve) {
		this.reserve = reserve;
	}
	
	public Address getFreeze() {
		return freeze;
	}
	
	public void setFreeze(Address freeze) {
		this.freeze = freeze;
	}
	
	public Address getClawback() {
		return clawback;
	}
	
	public void setClawback(Address clawback) {
		this.clawback = clawback;
	}

	public void printStatus() {
		
		if (null == this.manager) {
			System.out.println("manager : <not set>");
		} else {
			System.out.println("manager : " + this.manager);
		}
		
		if (null == this.reserve) {
			System.out.println("reserve : <not set>");
		} else {
			System.out.println("reserve : " + this.reserve);
		}
		
		if (null == this.freeze) {
			System.out.println("freeze  : <not set>");
		} else {
			System.out.println("freeze  : " + this.freeze);
		}
		
		if (null == this.clawback) {
			System.out.println("clawback: <not set>");
		} else {
			System.out.println("clawback: " + this.clawback);
		}
		
	}

	public boolean allImmutable() {
		if (true &&
				(null == this.manager) &&
				(null == this.reserve) &&
				(null == this.freeze) &&
				(null == this.clawback) &&
				true) {
			return true;
		}
		return false;
	}
	
}
