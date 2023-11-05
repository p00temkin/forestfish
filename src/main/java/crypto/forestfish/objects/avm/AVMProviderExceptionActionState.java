package crypto.forestfish.objects.avm;

import crypto.forestfish.objects.avm.connector.AVMBlockChainConnector;

public class AVMProviderExceptionActionState {

	private boolean newAVMBlockChainConnector = false;
	private AVMBlockChainConnector connector = null;
	
	public AVMProviderExceptionActionState() {
		super();
	}

	public AVMProviderExceptionActionState(boolean newAVMBlockChainConnector, AVMBlockChainConnector connector) {
		super();
		this.newAVMBlockChainConnector = newAVMBlockChainConnector;
		this.connector = connector;
	}

	public boolean isNewAVMBlockChainConnector() {
		return newAVMBlockChainConnector;
	}

	public void setNewEVMBlockChainConnector(boolean newAVMBlockChainConnector) {
		this.newAVMBlockChainConnector = newAVMBlockChainConnector;
	}

	public AVMBlockChainConnector getConnector() {
		return connector;
	}

	public void setConnector(AVMBlockChainConnector connector) {
		this.connector = connector;
	}

}
