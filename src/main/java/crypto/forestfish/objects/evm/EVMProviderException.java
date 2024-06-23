package crypto.forestfish.objects.evm;

import crypto.forestfish.enums.ExceptionType;

public class EVMProviderException {

	private boolean switchNode = false;
	private boolean nodeInteraction = false;
	private boolean sleepBeforeRetry = false;
	private boolean increaseGasPrice = false;
	private int sleepTimeInSecondsRecommended = 5;
	private ExceptionType exceptionType = ExceptionType.UNKNOWN;
	private boolean timeout = false;
	private boolean skiptx = false;
	
	public EVMProviderException() {
		super();
	}

	public EVMProviderException(ExceptionType _exceptionType, boolean _nodeInteraction, boolean _sleepBeforeRetry, boolean _increaseGasPrice, int _sleepTimeInSecondsRecommended, boolean _switchNode, boolean _timeout) {
		super();
		this.exceptionType = _exceptionType;
		this.nodeInteraction = _nodeInteraction;
		this.sleepBeforeRetry = _sleepBeforeRetry;
		this.increaseGasPrice = _increaseGasPrice;
		this.sleepTimeInSecondsRecommended = _sleepTimeInSecondsRecommended;
		this.switchNode = _switchNode;
		this.timeout = _timeout; 
		
		if (_exceptionType == ExceptionType.TX_SKIP) skiptx = true;
	}

	public boolean isNodeInteraction() {
		return nodeInteraction;
	}

	public void setNodeInteraction(boolean nodeInteraction) {
		this.nodeInteraction = nodeInteraction;
	}

	public boolean isSleepBeforeRetry() {
		return sleepBeforeRetry;
	}

	public void setSleepBeforeRetry(boolean sleepBeforeRetry) {
		this.sleepBeforeRetry = sleepBeforeRetry;
	}

	public int getSleepTimeInSecondsRecommended() {
		return sleepTimeInSecondsRecommended;
	}

	public void setSleepTimeInSecondsRecommended(int sleepTimeInSecondsRecommended) {
		this.sleepTimeInSecondsRecommended = sleepTimeInSecondsRecommended;
	}

	public ExceptionType getExceptionType() {
		return exceptionType;
	}

	public void setExceptionType(ExceptionType exceptionType) {
		this.exceptionType = exceptionType;
	}

	public boolean isSwitchNode() {
		return switchNode;
	}

	public void setSwitchNode(boolean switchNode) {
		this.switchNode = switchNode;
	}

	public boolean isIncreaseGasPrice() {
		return increaseGasPrice;
	}

	public void setIncreaseGasPrice(boolean increaseGasPrice) {
		this.increaseGasPrice = increaseGasPrice;
	}

	public boolean isTimeout() {
		return timeout;
	}

	public void setTimeout(boolean timeout) {
		this.timeout = timeout;
	}

	public boolean isSkiptx() {
		return skiptx;
	}

	public void setSkiptx(boolean skiptx) {
		this.skiptx = skiptx;
	}
	
}
