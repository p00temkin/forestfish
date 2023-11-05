package crypto.forestfish.objects.avm.model.nft;

import java.util.ArrayList;

public class ASAVerificationStatus {

	private boolean verified;
	private ArrayList<String> verified_properties = new ArrayList<String>();
	private ArrayList<String> major_issues = new ArrayList<String>();
	private ArrayList<String> warnings = new ArrayList<String>();
	private int score_out_of_10 = 10;
	
	public ASAVerificationStatus(boolean _verified, ArrayList<String> _verified_properties, ArrayList<String> _major_issues, ArrayList<String> _warnings, int _score_out_of_10) {
		super();
		this.verified = _verified;
		this.verified_properties = _verified_properties;
		this.major_issues = _major_issues;
		this.warnings = _warnings;
		this.score_out_of_10 = _score_out_of_10;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public ArrayList<String> getVerified_properties() {
		return verified_properties;
	}

	public void setVerified_properties(ArrayList<String> verified_properties) {
		this.verified_properties = verified_properties;
	}

	public ArrayList<String> getMajor_issues() {
		return major_issues;
	}

	public void setMajor_issues(ArrayList<String> major_issues) {
		this.major_issues = major_issues;
	}

	public ArrayList<String> getWarnings() {
		return warnings;
	}

	public void setWarnings(ArrayList<String> warnings) {
		this.warnings = warnings;
	}

	public int getScore_out_of_10() {
		return score_out_of_10;
	}

	public void setScore_out_of_10(int score_out_of_10) {
		this.score_out_of_10 = score_out_of_10;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("Verified     : " + this.isVerified() + "\n");
		sb.append("Score [0-10] : " + this.getScore_out_of_10() + "\n");
		sb.append("-----------------------------------\n");
		
		int i = 1;
		if (!major_issues.isEmpty()) {
			sb.append("Major issues: \n");
			for (String issue: major_issues) {
				sb.append(" [#" + i + "] " + issue + "\n");
				i++;
			}
		}
		
		int x = 1;
		if (!warnings.isEmpty()) {
			sb.append("Warnings: \n");
			for (String warning: warnings) {
				sb.append(" [#" + x + "] " + warning + "\n");
				x++;
			}
		}
		
		if (!verified_properties.isEmpty()) {
			sb.append("Verified parameters: \n");
			for (String v: verified_properties) {
				sb.append(" [+] " + v + "\n");
			}
		}
		
		return sb.toString();
	}
}
