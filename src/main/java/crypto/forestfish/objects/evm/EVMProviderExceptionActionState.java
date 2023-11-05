package crypto.forestfish.objects.evm;

import java.math.BigInteger;

import crypto.forestfish.objects.evm.connector.EVMBlockChainConnector;

public class EVMProviderExceptionActionState {

	private boolean increaseGasPrice = false;
	private BigInteger suggestedGasPriceIncreaseInWEI = BigInteger.valueOf(0);
	
	private boolean newEVMBlockChainConnector = false;
	private EVMBlockChainConnector connector = null;
	
	public EVMProviderExceptionActionState() {
		super();
	}

	public EVMProviderExceptionActionState(boolean increaseGasPrice, BigInteger suggestedGasPriceIncreaseInWEI, boolean newEVMBlockChainConnector, EVMBlockChainConnector connector) {
		super();
		this.increaseGasPrice = increaseGasPrice;
		this.suggestedGasPriceIncreaseInWEI = suggestedGasPriceIncreaseInWEI;
		this.newEVMBlockChainConnector = newEVMBlockChainConnector;
		this.connector = connector;
	}

	public boolean isIncreaseGasPrice() {
		return increaseGasPrice;
	}

	public void setIncreaseGasPrice(boolean increaseGasPrice) {
		this.increaseGasPrice = increaseGasPrice;
	}

	public BigInteger getSuggestedGasPriceIncreaseInWEI() {
		return suggestedGasPriceIncreaseInWEI;
	}

	public void setSuggestedGasPriceIncreaseInWEI(BigInteger suggestedGasPriceIncreaseInWEI) {
		this.suggestedGasPriceIncreaseInWEI = suggestedGasPriceIncreaseInWEI;
	}

	public boolean isNewEVMBlockChainConnector() {
		return newEVMBlockChainConnector;
	}

	public void setNewEVMBlockChainConnector(boolean newEVMBlockChainConnector) {
		this.newEVMBlockChainConnector = newEVMBlockChainConnector;
	}

	public EVMBlockChainConnector getConnector() {
		return connector;
	}

	public void setConnector(EVMBlockChainConnector connector) {
		this.connector = connector;
	}

}
