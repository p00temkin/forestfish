package crypto.forestfish.objects.avm;

import crypto.forestfish.enums.ExceptionType;

public class AVMProviderException {

	private boolean switchNode = false;
	private boolean nodeInteraction = false;
	private boolean sleepBeforeRetry = false;
	private int sleepTimeInSecondsRecommended = 5;
	private ExceptionType exceptionType = ExceptionType.UNKNOWN;
	private boolean timeout = false;
	
	public AVMProviderException() {
		super();
	}

	public AVMProviderException(ExceptionType _exceptionType, boolean _nodeInteraction, boolean _sleepBeforeRetry, int _sleepTimeInSecondsRecommended, boolean _switchNode, boolean _timeout) {
		super();
		this.exceptionType = _exceptionType;
		this.nodeInteraction = _nodeInteraction;
		this.sleepBeforeRetry = _sleepBeforeRetry;
		this.sleepTimeInSecondsRecommended = _sleepTimeInSecondsRecommended;
		this.switchNode = _switchNode;
		this.timeout = _timeout; 
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

	public boolean isTimeout() {
		return timeout;
	}

	public void setTimeout(boolean timeout) {
		this.timeout = timeout;
	}
	
}
