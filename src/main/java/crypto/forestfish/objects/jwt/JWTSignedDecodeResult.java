package crypto.forestfish.objects.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JWTSignedDecodeResult {

	private static final Logger LOGGER = LoggerFactory.getLogger(JWTSignedDecodeResult.class);

	private boolean invalid_jwt = false;
	private boolean signature_valid = false;
	private boolean expired = false;
	private RegisteredClaims registered_claims;
	private PublicClaims public_claims;
	private PrivateClaims private_claims;
	private TokenType token_type = TokenType.UNKNOWN;

	public JWTSignedDecodeResult() {
		super();
	}

	public JWTSignedDecodeResult(boolean _invalid_jwt, boolean _signature_valid, boolean _expired, RegisteredClaims _registered_claims, PublicClaims _public_claims, PrivateClaims _private_claims, String _token_type) {
		super();
		this.invalid_jwt = _invalid_jwt;
		this.signature_valid = _signature_valid;
		this.expired = _expired;
		this.registered_claims = _registered_claims;
		this.public_claims = _public_claims;
		this.private_claims = _private_claims;
		try {
			this.token_type = TokenType.valueOf(_token_type);
		} catch (Exception e) {
			LOGGER.warn("Unable to set JWT token type to " + _token_type);
		}
	}

	public boolean isSignature_valid() {
		return signature_valid;
	}

	public void setSignature_valid(boolean signature_valid) {
		this.signature_valid = signature_valid;
	}

	public RegisteredClaims getRegistered_claims() {
		return registered_claims;
	}

	public void setRegistered_claims(RegisteredClaims registered_claims) {
		this.registered_claims = registered_claims;
	}

	public PublicClaims getPublic_claims() {
		return public_claims;
	}

	public void setPublic_claims(PublicClaims public_claims) {
		this.public_claims = public_claims;
	}

	public PrivateClaims getPrivate_claims() {
		return private_claims;
	}

	public void setPrivate_claims(PrivateClaims private_claims) {
		this.private_claims = private_claims;
	}

	public boolean isInvalid_jwt() {
		return invalid_jwt;
	}

	public void setInvalid_jwt(boolean invalid_jwt) {
		this.invalid_jwt = invalid_jwt;
	}

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	public TokenType getToken_type() {
		return token_type;
	}

	public void setToken_type(TokenType token_type) {
		this.token_type = token_type;
	}

}
