package crypto.forestfish.objects.jwt;

public class RegisteredClaims {

	// RFC 7519
	private String iss = ""; // who issued the token
	private String sub = ""; // to whom the token was issued
	private String aud = ""; // audience of the token
	private String jti = ""; // unique identifier of the token
	
	private Integer iat = -1; // issued at
	private Integer exp = -1; // expiration
	private Integer nbf = -1; // not before
	
	public RegisteredClaims() {
		super();
	}
	
	public RegisteredClaims(String iss, String sub, String aud, Integer iat, Integer exp, Integer nbf, String jti) {
		super();
		this.iss = iss;
		this.sub = sub;
		this.aud = aud;
		this.iat = iat;
		this.exp = exp;
		this.nbf = nbf;
		this.jti = jti;
	}

	public Integer getNbf() {
		return nbf;
	}
	public void setNbf(Integer nbf) {
		this.nbf = nbf;
	}
	public String getIss() {
		return iss;
	}
	public void setIss(String iss) {
		this.iss = iss;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public Integer getIat() {
		return iat;
	}
	public void setIat(Integer iat) {
		this.iat = iat;
	}
	public Integer getExp() {
		return exp;
	}
	public void setExp(Integer exp) {
		this.exp = exp;
	}
	public String getJti() {
		return jti;
	}
	public void setJti(String jti) {
		this.jti = jti;
	}
	public String getAud() {
		return aud;
	}
	public void setAud(String aud) {
		this.aud = aud;
	}
	
	@Override
    public String toString() {
        return "iss: " + this.iss + " sub: " + this.sub + " aud: " + this.aud + " iat: " + this.iat + " exp: " + this.exp + " nbf: " + this.nbf + " jti: " + this.jti;
    }
	
}
