package crypto.forestfish.utils;

import java.math.BigInteger;
import java.security.Key;
import java.security.PublicKey;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.security.*;

import javax.crypto.spec.SecretKeySpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import crypto.forestfish.objects.jwt.JWK;
import crypto.forestfish.objects.jwt.JWKS;
import crypto.forestfish.objects.jwt.JWTSignedDecodeResult;
import crypto.forestfish.objects.jwt.JWTUnsignedDecodeResult;
import crypto.forestfish.objects.jwt.PrivateClaims;
import crypto.forestfish.objects.jwt.PublicClaims;
import crypto.forestfish.objects.jwt.RegisteredClaims;
import crypto.forestfish.objects.jwt.TokenType;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;

public class JWTUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(JWTUtils.class);

	public static JWTSignedDecodeResult decodeAndVerifyJWTUsingSecretKey(String jwtString, String jwt_secret, String jcaName) {

		boolean invalid_jwt = false;
		boolean signature_valid = false;
		boolean expired = true;
		String token_type_str = TokenType.AUTHN.toString();
		RegisteredClaims registered_claims = new RegisteredClaims();
		PublicClaims public_claims = new PublicClaims();
		PrivateClaims private_claims = new PrivateClaims();

		// Early exit for invalid JWT string
		int splitcount = jwtString.split("\\.").length;
		if (splitcount != 3) {
			invalid_jwt = true;
			return new JWTSignedDecodeResult(invalid_jwt, signature_valid, expired, registered_claims, public_claims, private_claims, token_type_str);
		}

		// Decode signed JWT
		try {
			Key hmacKey = new SecretKeySpec(Base64.getDecoder().decode(jwt_secret), jcaName);

			Jws<Claims> jwt = Jwts.parserBuilder()
					.setSigningKey(hmacKey)
					.build()
					.parseClaimsJws(jwtString);
			LOGGER.debug("claims: " + jwt.toString());

			HashMap<String, String> erc20_ownership = new HashMap<>();
			HashMap<String, String> nft_ownership = new HashMap<>();

			// header DEBUG
			for (String claim: jwt.getBody().keySet()) {
				Object val = jwt.getBody().get(claim);
				LOGGER.debug(" -> claim=" + claim + " val=" + val.toString() + " class=" + val.getClass());

				// Registered
				if ("iat".equals(claim) && val.getClass().equals(Integer.class)) registered_claims.setIat((Integer) val);
				if ("exp".equals(claim) && val.getClass().equals(Integer.class)) registered_claims.setExp((Integer) val);
				if ("nbf".equals(claim) && val.getClass().equals(Integer.class)) registered_claims.setNbf((Integer) val);
				if ("jti".equals(claim) && val.getClass().equals(String.class)) registered_claims.setJti((String) val);
				if ("sub".equals(claim) && val.getClass().equals(String.class)) registered_claims.setSub((String) val);
				if ("iss".equals(claim) && val.getClass().equals(String.class)) registered_claims.setIss((String) val);
				if ("aud".equals(claim) && val.getClass().equals(String.class)) registered_claims.setAud((String) val);

				// Public
				if ("family_name".equals(claim) && val.getClass().equals(String.class)) public_claims.setFamily_name((String) val);
				if ("given_name".equals(claim) && val.getClass().equals(String.class)) public_claims.setGiven_name((String) val);
				if ("nonce".equals(claim) && val.getClass().equals(String.class)) public_claims.setNonce((String) val);

				// Private
				if ("evm_wallet_address".equals(claim) && val.getClass().equals(String.class)) private_claims.setEvm_wallet_address((String) val); // forestfishd
				if ("token_type".equals(claim) && val.getClass().equals(String.class)) {
					private_claims.setToken_type((String) val); // AUTHN/AUTHZ
					token_type_str = (String) val;
				}
				if ("role".equals(claim) && val.getClass().equals(String.class)) private_claims.setRole((String) val); // ADMIN/CONSUMER/CONTRIBUTOR
				if ("oid".equals(claim) && val.getClass().equals(String.class)) private_claims.setOid((String) val); // azure
				if ("azp".equals(claim) && val.getClass().equals(String.class)) private_claims.setAzp((String) val); // azure
				if ("ver".equals(claim) && val.getClass().equals(String.class)) private_claims.setVer((String) val); // azure

				if (claim.startsWith("erc20_ownership:")) {
					erc20_ownership.put(claim.replace("erc20_ownership:", ""), (String) val);
				}

				if (claim.startsWith("nft_ownership:")) {
					nft_ownership.put(claim.replace("nft_ownership:", ""), (String) val);
				}
			}
			private_claims.setErc20_ownership(erc20_ownership);
			private_claims.setNft_ownership(nft_ownership);

			// Check expiration date
			Integer exp = (Integer) jwt.getBody().get("exp");
			Long currentTimeSeconds = System.currentTimeMillis()/1000L;
			if (currentTimeSeconds.intValue() < exp) expired = false;

			// we throw if signature is invalid
			signature_valid = true;

		} catch (Exception e) {
			if (false ||
					e.getMessage().contains("JWT signature does not match locally computed signature") ||
					e.getMessage().contains("Last unit does not have enough valid bits") ||
					false) {
				LOGGER.warn("Invalid JWT token signature, exception: " + e.getMessage());
			} else {
				LOGGER.warn("Unable to deconstruct JWT token, unknown exception: " + e.getMessage());
			}
		}

		return new JWTSignedDecodeResult(invalid_jwt, signature_valid, expired, registered_claims, public_claims, private_claims, token_type_str);

	}

	public static PublicKey getPublicKey(String modulus, String exponent)  {
		try {
			byte exponentB[] = Base64.getUrlDecoder().decode(exponent);
			byte modulusB[] = Base64.getUrlDecoder().decode(modulus);
			BigInteger bigExponent = new BigInteger(1,exponentB);
			BigInteger bigModulus = new BigInteger(1,modulusB);

			PublicKey publicKey;
			publicKey = KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(bigModulus, bigExponent));

			return publicKey;

		} catch (InvalidKeySpecException | NoSuchAlgorithmException  e) {
			LOGGER.warn("Caught exception: " + e.getMessage());
		}
		return null;
	}

	public static JWTSignedDecodeResult decodeAndVerifyJWTUsingJWKS(String jwtString, JWKS jwks) {
		boolean invalid_jwt = false;
		boolean signature_valid = false;
		boolean expired = true;
		String token_type_str = TokenType.AUTHN.toString();
		RegisteredClaims registered_claims = new RegisteredClaims();
		PublicClaims public_claims = new PublicClaims();
		PrivateClaims private_claims = new PrivateClaims();

		// Early exit for invalid JWT string
		int splitcount = jwtString.split("\\.").length;
		if (splitcount != 3) {
			invalid_jwt = true;
			return new JWTSignedDecodeResult(invalid_jwt, signature_valid, expired, registered_claims, public_claims, private_claims, token_type_str);
		}

		for (JWK jwk: jwks.getKeys()) {

			System.out.println("Checking public key " + jwk.getKid());
			String modulus = jwk.getN();
			String exponent = jwk.getE();

			try {
				PublicKey pubKey = getPublicKey(modulus, exponent);

				// Verify signature
				String signedData = jwtString.substring(0, jwtString.lastIndexOf("."));
				String signatureB64u = jwtString.substring(jwtString.lastIndexOf(".")+1,jwtString.length());
				byte signature[] = Base64.getUrlDecoder().decode(signatureB64u);

				boolean isVerify = false;
				if ("RSA".equals(jwk.getKty())) {
					Signature sig = Signature.getInstance("SHA256withRSA");
					sig.initVerify(pubKey);
					sig.update(signedData.getBytes());
					isVerify = sig.verify(signature);

					LOGGER.info("pub key " + jwk.getKid() + " verification: " + isVerify);

					if (isVerify) {

						// Lets populate the claims since this signature was good
						Jws<Claims> jwt = Jwts.parserBuilder()
								.setSigningKey(pubKey)
								.build()
								.parseClaimsJws(jwtString);
						System.out.println("claims: " + jwt.toString());

						// header DEBUG
						for (String claim: jwt.getBody().keySet()) {
							Object val = jwt.getBody().get(claim);
							System.out.println(" -> claim=" + claim + " val=" + val.toString() + " class=" + val.getClass());

							// Registered
							if ("iat".equals(claim) && val.getClass().equals(Integer.class)) registered_claims.setIat((Integer) val);
							if ("exp".equals(claim) && val.getClass().equals(Integer.class)) registered_claims.setExp((Integer) val);
							if ("nbf".equals(claim) && val.getClass().equals(Integer.class)) registered_claims.setNbf((Integer) val);
							if ("jti".equals(claim) && val.getClass().equals(String.class)) registered_claims.setJti((String) val);
							if ("sub".equals(claim) && val.getClass().equals(String.class)) registered_claims.setSub((String) val);
							if ("iss".equals(claim) && val.getClass().equals(String.class)) registered_claims.setIss((String) val);
							if ("aud".equals(claim) && val.getClass().equals(String.class)) registered_claims.setAud((String) val);

							// Public
							if ("family_name".equals(claim) && val.getClass().equals(String.class)) public_claims.setFamily_name((String) val);
							if ("given_name".equals(claim) && val.getClass().equals(String.class)) public_claims.setGiven_name((String) val);
							if ("nonce".equals(claim) && val.getClass().equals(String.class)) public_claims.setNonce((String) val);

							// Private
							if ("evm_wallet_address".equals(claim) && val.getClass().equals(String.class)) private_claims.setEvm_wallet_address((String) val); // forestfishd
							if ("token_type".equals(claim) && val.getClass().equals(String.class)) {
								private_claims.setToken_type((String) val); // AUTHN/AUTHZ
								token_type_str = (String) val;
							}
							if ("role".equals(claim) && val.getClass().equals(String.class)) private_claims.setRole((String) val); // ADMIN/CONSUMER/CONTRIBUTOR
							if ("oid".equals(claim) && val.getClass().equals(String.class)) private_claims.setOid((String) val); // azure
							if ("azp".equals(claim) && val.getClass().equals(String.class)) private_claims.setAzp((String) val); // azure
							if ("ver".equals(claim) && val.getClass().equals(String.class)) private_claims.setVer((String) val); // azure
							if ("emails".equals(claim)) {
								@SuppressWarnings("unchecked")
								ArrayList<String> valcasted = (ArrayList<String>) val;
								private_claims.setEmails(valcasted);
							}

						}

						// Check expiration date
						Integer exp = (Integer) jwt.getBody().get("exp");
						Long currentTimeSeconds = System.currentTimeMillis()/1000L;
						if (currentTimeSeconds.intValue() < exp) expired = false;

						// we throw if signature is invalid
						signature_valid = true;

						return new JWTSignedDecodeResult(invalid_jwt, signature_valid, expired, registered_claims, public_claims, private_claims, token_type_str);

					}

				} else {
					LOGGER.warn("Skipping public key " + jwk.getKid() + " since cannot handle kty " + jwk.getKty());
				}

			} catch (Exception e) {
				LOGGER.warn("Caught exceptiono: " + e.getMessage());
			}

		}

		return new JWTSignedDecodeResult(invalid_jwt, signature_valid, expired, registered_claims, public_claims, private_claims, token_type_str);
	}

	public static JWTUnsignedDecodeResult decodeJWT(String jwtString) {
		boolean invalid_jwt = false;

		// Early exit for invalid JWT string
		int splitcount = jwtString.split("\\.").length;
		if (splitcount != 3) {
			invalid_jwt = true;
			return new JWTUnsignedDecodeResult(true, "", "", "", "");
		}

		String[] chunks = jwtString.split("\\.");
		Base64.Decoder decoder = Base64.getUrlDecoder();
		String payload = new String(decoder.decode(chunks[1]));

		/**
		 * Header
		 */
		String alg = "";
		String typ = "";
		try {
			String header = new String(decoder.decode(chunks[0]));
			JsonObject jobject = JsonParser.parseString(header).getAsJsonObject();
			if (null != jobject.get("alg")) alg = jobject.get("alg").getAsString();
			if (null != jobject.get("typ")) typ = jobject.get("typ").getAsString();
		} catch (Exception e) {
			LOGGER.warn("Caught exception while parsing header: " + e.getMessage());
		}

		/**
		 * Payload
		 */
		String iss = "unknown";
		try {
			JsonObject jobject = JsonParser.parseString(payload).getAsJsonObject();
			if (null != jobject.get("iss")) iss = jobject.get("iss").getAsString();
		} catch (Exception e) {
			LOGGER.warn("Caught exception while parsing header: " + e.getMessage());
		}

		return new JWTUnsignedDecodeResult(invalid_jwt, typ, alg, iss, payload);
	}

	public static JWTSignedDecodeResult decodeAndVerifyJWTUsingAzureB2C(String jwtString, String b2ctenant, String b2cflow) {
		String jsonRESP = HttpRequestUtils.getBodyUsingGETUrlRequest("https://" + b2ctenant + ".b2clogin.com/" + b2ctenant + ".onmicrosoft.com/" + b2cflow + "/discovery/v2.0/keys");
		if (jsonRESP.length() > 10) {
			JWKS jwks = JSONUtils.createPOJOFromJSON(jsonRESP, JWKS.class);
			JWTSignedDecodeResult jwt_decoded_result = JWTUtils.decodeAndVerifyJWTUsingJWKS(jwtString, jwks);
			return jwt_decoded_result;
		}
		return null;
	}

}
