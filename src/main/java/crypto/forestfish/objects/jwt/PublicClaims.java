package crypto.forestfish.objects.jwt;

public class PublicClaims {

	// https://www.iana.org/assignments/jwt/jwt.xhtml
	
	// OpenID
	private String name = null;
	private String given_name = null;
	private String family_name = null;
	private String middle_name = null;
	private String nickname = null;
	private String preferred_username = null;
	private String profile = null;
	private String picture = null;
	private String website = null;
	private String email = null;
	private Boolean email_verified = null;
	private String gender = null;
	private String birthdate = null;
	private String zoneinfo = null;
	private String locale = null;
	private String phone_number = null;
	private String phone_number_verified = null;
	private String address = null;
	private Integer updated_at = null;
	private String azp = null;
	private String nonce = null;
	private Integer auth_time = null;
	private String at_hash = null;
	private String c_hash = null;
	private String acr = null;
	private String amr = null;
	private String sub_jwk = null;
	
	// RFC7800
	private String jwk = null; // key used to issue/sign the token
	private String jku = null; // JSON Web Key URL, JSON file jwks (set of keys)
	
	public PublicClaims() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGiven_name() {
		return given_name;
	}
	public void setGiven_name(String given_name) {
		this.given_name = given_name;
	}
	public String getFamily_name() {
		return family_name;
	}
	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPreferred_username() {
		return preferred_username;
	}
	public void setPreferred_username(String preferred_username) {
		this.preferred_username = preferred_username;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getEmail_verified() {
		return email_verified;
	}
	public void setEmail_verified(Boolean email_verified) {
		this.email_verified = email_verified;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getZoneinfo() {
		return zoneinfo;
	}
	public void setZoneinfo(String zoneinfo) {
		this.zoneinfo = zoneinfo;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getPhone_number_verified() {
		return phone_number_verified;
	}
	public void setPhone_number_verified(String phone_number_verified) {
		this.phone_number_verified = phone_number_verified;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Integer updated_at) {
		this.updated_at = updated_at;
	}
	public String getAzp() {
		return azp;
	}
	public void setAzp(String azp) {
		this.azp = azp;
	}
	public String getNonce() {
		return nonce;
	}
	public void setNonce(String nonce) {
		this.nonce = nonce;
	}
	public Integer getAuth_time() {
		return auth_time;
	}
	public void setAuth_time(Integer auth_time) {
		this.auth_time = auth_time;
	}
	public String getAt_hash() {
		return at_hash;
	}
	public void setAt_hash(String at_hash) {
		this.at_hash = at_hash;
	}
	public String getC_hash() {
		return c_hash;
	}
	public void setC_hash(String c_hash) {
		this.c_hash = c_hash;
	}
	public String getAcr() {
		return acr;
	}
	public void setAcr(String acr) {
		this.acr = acr;
	}
	public String getAmr() {
		return amr;
	}
	public void setAmr(String amr) {
		this.amr = amr;
	}
	public String getSub_jwk() {
		return sub_jwk;
	}
	public void setSub_jwk(String sub_jwk) {
		this.sub_jwk = sub_jwk;
	}

	public String getJwk() {
		return jwk;
	}
	public void setJwk(String jwk) {
		this.jwk = jwk;
	}
	public String getJku() {
		return jku;
	}
	public void setJku(String jku) {
		this.jku = jku;
	}
	
	@Override
    public String toString() {
        return "name: " + this.name + " given_name: " + this.given_name + " family_name: " + this.family_name + " middle_name: " + this.middle_name;
    }
}
