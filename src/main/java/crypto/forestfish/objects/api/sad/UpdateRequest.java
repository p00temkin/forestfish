package crypto.forestfish.objects.api.sad;

public class UpdateRequest {

	private String name;
	private String chatmsg;
	private Integer duration_in_seconds;
	
	public UpdateRequest() {
		super();
	}

	public UpdateRequest(String name, String chatmsg) {
		super();
		this.chatmsg = chatmsg;
		this.name = name;
	}
	
	public UpdateRequest(String name, String chatmsg, Integer duration_in_seconds) {
		super();
		this.name = name;
		this.chatmsg = chatmsg;
		this.duration_in_seconds = duration_in_seconds;
	}

	public String getChatmsg() {
		return chatmsg;
	}
	
	public void setChatmsg(String chatmsg) {
		this.chatmsg = chatmsg;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Integer getDuration_in_seconds() {
		return duration_in_seconds;
	}

	public void setDuration_in_seconds(Integer duration_in_seconds) {
		this.duration_in_seconds = duration_in_seconds;
	}
	
}
