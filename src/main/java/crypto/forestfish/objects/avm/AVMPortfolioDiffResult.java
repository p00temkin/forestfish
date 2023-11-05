package crypto.forestfish.objects.avm;

public class AVMPortfolioDiffResult {

	private String portfolio_full_str;
	private AVMPortfolioDiff portfolio_diff;
	
	public AVMPortfolioDiffResult() {
		super();
	}

	public AVMPortfolioDiffResult(String _portfolio_full_str, AVMPortfolioDiff _portfolio_diff) {
		super();
		this.portfolio_full_str = _portfolio_full_str;
		this.portfolio_diff = _portfolio_diff;
	}

	public String getPortfolio_full_str() {
		return portfolio_full_str;
	}

	public void setPortfolio_full_str(String portfolio_full_str) {
		this.portfolio_full_str = portfolio_full_str;
	}

	public AVMPortfolioDiff getPortfolio_diff() {
		return portfolio_diff;
	}

	public void setPortfolio_diff(AVMPortfolioDiff portfolio_diff) {
		this.portfolio_diff = portfolio_diff;
	}
	
}
