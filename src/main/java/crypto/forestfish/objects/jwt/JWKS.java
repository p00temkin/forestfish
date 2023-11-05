package crypto.forestfish.objects.jwt;

import java.util.ArrayList;

public class JWKS {

	private ArrayList<JWK> keys = new ArrayList<JWK>();

	public JWKS() {
		super();
	}

	public ArrayList<JWK> getKeys() {
		return keys;
	}

	public void setKeys(ArrayList<JWK> keys) {
		this.keys = keys;
	}

}
