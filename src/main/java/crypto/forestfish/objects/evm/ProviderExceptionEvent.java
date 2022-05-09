package crypto.forestfish.objects.evm;

import crypto.forestfish.enums.ProviderException;

public class ProviderExceptionEvent {

	private boolean nodeInteraction = false;
	private boolean sleepBeforeRetry = false;
	private int sleepTimeInSecondsRecommended = 5;
	private ProviderException exceptionType = ProviderException.UNKNOWN;
	
	public ProviderExceptionEvent() {
		super();
	}

	public ProviderExceptionEvent(ProviderException exceptionType, boolean nodeInteraction, boolean sleepBeforeRetry, int sleepTimeInSecondsRecommended) {
		super();
		this.exceptionType = exceptionType;
		this.nodeInteraction = nodeInteraction;
		this.sleepBeforeRetry = sleepBeforeRetry;
		this.sleepTimeInSecondsRecommended = sleepTimeInSecondsRecommended;
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

	public ProviderException getExceptionType() {
		return exceptionType;
	}

	public void setExceptionType(ProviderException exceptionType) {
		this.exceptionType = exceptionType;
	}
	
}
