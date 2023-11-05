package crypto.forestfish.objects.evm;

import crypto.forestfish.enums.ExceptionType;

public class EVMTransactionExceptionEvent {

	private boolean switchNode = false;
	private boolean nodeInteraction = false;
	private boolean sleepBeforeRetry = false;
	private boolean doubleGasPrice = false;
	private boolean doubleGasLimit = false;
	private int sleepTimeInSecondsRecommended = 5;
	private ExceptionType exceptionType = ExceptionType.UNKNOWN;
	private boolean dupTransaction = false;
	
	public EVMTransactionExceptionEvent() {
		super();
	}

	public EVMTransactionExceptionEvent(ExceptionType _exceptionType, boolean _nodeInteraction, boolean _sleepBeforeRetry, boolean _doubleGasPrice, boolean _doubleGasLimit, int _sleepTimeInSecondsRecommended, boolean _switchNode, boolean _dupTransaction) {
		super();
		this.exceptionType = _exceptionType;
		this.nodeInteraction = _nodeInteraction;
		this.sleepBeforeRetry = _sleepBeforeRetry;
		this.doubleGasPrice = _doubleGasPrice;
		this.doubleGasLimit = _doubleGasLimit;
		this.sleepTimeInSecondsRecommended = _sleepTimeInSecondsRecommended;
		this.switchNode = _switchNode;
		this.dupTransaction = _dupTransaction;
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

	public boolean isDoubleGasPrice() {
		return doubleGasPrice;
	}

	public void setDoubleGasPrice(boolean doubleGasPrice) {
		this.doubleGasPrice = doubleGasPrice;
	}

	public boolean isDupTransaction() {
		return dupTransaction;
	}

	public void setDupTransaction(boolean dupTransaction) {
		this.dupTransaction = dupTransaction;
	}

	public boolean isDoubleGasLimit() {
		return doubleGasLimit;
	}

	public void setDoubleGasLimit(boolean doubleGasLimit) {
		this.doubleGasLimit = doubleGasLimit;
	}
	
}
