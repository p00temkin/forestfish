package crypto.forestfish.objects.jwt;

public class JWTUnsignedDecodeResult {
	
	private boolean invalid_jwt = false;
	private String typ;
	private String alg;
	private String iss;
	private String payloadJSON;
	
	public JWTUnsignedDecodeResult() {
		super();
	}

	public JWTUnsignedDecodeResult(boolean invalid_jwt, String typ, String alg, String iss, String payloadJSON) {
		super();
		this.invalid_jwt = invalid_jwt;
		this.typ = typ;
		this.alg = alg;
		this.iss = iss;
		this.payloadJSON = payloadJSON;
	}
	
	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public String getAlg() {
		return alg;
	}

	public void setAlg(String alg) {
		this.alg = alg;
	}

	public String getPayloadJSON() {
		return payloadJSON;
	}

	public void setPayloadJSON(String payloadJSON) {
		this.payloadJSON = payloadJSON;
	}

	public boolean isInvalid_jwt() {
		return invalid_jwt;
	}

	public void setInvalid_jwt(boolean invalid_jwt) {
		this.invalid_jwt = invalid_jwt;
	}

	public String getIss() {
		return iss;
	}

	public void setIss(String iss) {
		this.iss = iss;
	}
	
}
