package crypto.forestfish.objects.evm;

public class EVMPortfolioDiffResult {

	private String portfolio_full_str;
	private EVMPortfolioDiff portfolio_diff;
	
	public EVMPortfolioDiffResult() {
		super();
	}

	public EVMPortfolioDiffResult(String _portfolio_full_str, EVMPortfolioDiff _portfolio_diff) {
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

	public EVMPortfolioDiff getPortfolio_diff() {
		return portfolio_diff;
	}

	public void setPortfolio_diff(EVMPortfolioDiff portfolio_diff) {
		this.portfolio_diff = portfolio_diff;
	}
	
}
