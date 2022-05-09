package crypto.forestfish.objects.evm;

public class EVMInteractionExceptionEvent {

	private boolean nodeInteraction = false;
	private boolean sleepBeforeRetry = false;
	private int sleepTimeInSecondsRecommended = 5;
	private boolean unknownError = false;
	
	public EVMInteractionExceptionEvent() {
		super();
	}

	public EVMInteractionExceptionEvent(boolean nodeInteraction, boolean sleepBeforeRetry, int sleepTimeInSecondsRecommended, boolean unknownError) {
		super();
		this.nodeInteraction = nodeInteraction;
		this.sleepBeforeRetry = sleepBeforeRetry;
		this.sleepTimeInSecondsRecommended = sleepTimeInSecondsRecommended;
		this.unknownError = unknownError;
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

	public boolean isUnknownError() {
		return unknownError;
	}

	public void setUnknownError(boolean unknownError) {
		this.unknownError = unknownError;
	}
	
}
