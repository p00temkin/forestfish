package crypto.forestfish.objects.evm.moralis;

public class MoralisERC20ContractPriceInfo {

	private MoralisNativePrice nativePrice;
	private String usdPrice;
	private String exchangeAddress;
	private String exchangeName;
	
	public MoralisERC20ContractPriceInfo() {
		super();
	}
	
	public MoralisNativePrice getNativePrice() {
		return nativePrice;
	}
	
	public void setNativePrice(MoralisNativePrice nativePrice) {
		this.nativePrice = nativePrice;
	}

	public String getUsdPrice() {
		return usdPrice;
	}

	public void setUsdPrice(String usdPrice) {
		this.usdPrice = usdPrice;
	}

	public String getExchangeAddress() {
		return exchangeAddress;
	}

	public void setExchangeAddress(String exchangeAddress) {
		this.exchangeAddress = exchangeAddress;
	}

	public String getExchangeName() {
		return exchangeName;
	}

	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	@Override
	public String toString() {
		return "usdPrice: " + this.getUsdPrice() + " exchangeName: " + this.getExchangeName() + " exchangeName: " + this.getExchangeName() + " nativePrice: " + this.getNativePrice().toString(); 
	}
}
