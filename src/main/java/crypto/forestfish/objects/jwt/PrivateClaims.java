package crypto.forestfish.objects.jwt;

import java.util.ArrayList;
import java.util.HashMap;

public class PrivateClaims {

	private String evm_wallet_address = null;
	private String token_type = null;
	private String role = null;
	
	// Azure
	private String oid = null;
	private String tfp = null;
	private String azp = null;
	private String ver = null;
	private ArrayList<String> emails = null; 
	private HashMap<String, String> erc20_ownership = null; 
	private HashMap<String, String> nft_ownership = null; 
	
	public PrivateClaims() {
		super();
	}

	public String getEvm_wallet_address() {
		return evm_wallet_address;
	}

	public void setEvm_wallet_address(String evm_wallet_address) {
		this.evm_wallet_address = evm_wallet_address;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getTfp() {
		return tfp;
	}

	public void setTfp(String tfp) {
		this.tfp = tfp;
	}

	public String getAzp() {
		return azp;
	}

	public void setAzp(String azp) {
		this.azp = azp;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public ArrayList<String> getEmails() {
		return emails;
	}

	public void setEmails(ArrayList<String> emails) {
		this.emails = emails;
	}
	
	@Override
    public String toString() {
        return "emails: " + this.emails + " evm_wallet_address: " + this.evm_wallet_address + " oid: " + this.oid + " tfp: " + this.tfp + " azp: " + this.azp + " erc20_ownership: " + this.erc20_ownership + " nft_ownership: " + this.nft_ownership;
    }

	public HashMap<String, String> getErc20_ownership() {
		return erc20_ownership;
	}

	public void setErc20_ownership(HashMap<String, String> erc20_ownership) {
		this.erc20_ownership = erc20_ownership;
	}

	public HashMap<String, String> getNft_ownership() {
		return nft_ownership;
	}

	public void setNft_ownership(HashMap<String, String> nft_ownership) {
		this.nft_ownership = nft_ownership;
	}

	public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
