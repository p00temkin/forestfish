package crypto.forestfish.objects.evm.farcaster.fnames;

public class Transfer {

	private Long id;
	private Long timestamp;
	private String username;
	private String owner;
	private Long from;
	private Long to;
	private String user_signature;
	private String server_signature;
	
	public Transfer() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public Long getFrom() {
		return from;
	}
	
	public void setFrom(Long from) {
		this.from = from;
	}
	
	public Long getTo() {
		return to;
	}
	
	public void setTo(Long to) {
		this.to = to;
	}
	
	public String getUser_signature() {
		return user_signature;
	}
	
	public void setUser_signature(String user_signature) {
		this.user_signature = user_signature;
	}
	
	public String getServer_signature() {
		return server_signature;
	}
	
	public void setServer_signature(String server_signature) {
		this.server_signature = server_signature;
	}

}
