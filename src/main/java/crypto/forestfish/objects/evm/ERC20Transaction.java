package crypto.forestfish.objects.evm;

public class ERC20Transaction {

    private String blockNumber = null;
    private String timeStamp = null;
    private String hash = null;
    private String nonce = null;
    private String blockHash = null;
    private String transactionIndex = null;
    private String from = null;
    private String to = null;
    private String value = null;
	private Double valueD = null;
    private String gas = null;
    private String gasPrice = null;
    private String isError = null;
    private String txreceipt_status = null;
    private String input = null;
    private String contractAddress = null;
    private String cumulativeGasUsed = null;
    private String gasUsed = null;
    private String confirmations = null;
    
	public ERC20Transaction() {
		super();
	}
	
	public void update() {
		if (null != this.value) {
			this.valueD = Double.parseDouble("" + this.value)/1000000000000000000d;
		}
	}

	public String getBlockNumber() {
		return blockNumber;
	}

	public void setBlockNumber(String blockNumber) {
		this.blockNumber = blockNumber;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getNonce() {
		return nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	public String getBlockHash() {
		return blockHash;
	}

	public void setBlockHash(String blockHash) {
		this.blockHash = blockHash;
	}

	public String getTransactionIndex() {
		return transactionIndex;
	}

	public void setTransactionIndex(String transactionIndex) {
		this.transactionIndex = transactionIndex;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getGas() {
		return gas;
	}

	public void setGas(String gas) {
		this.gas = gas;
	}

	public String getGasPrice() {
		return gasPrice;
	}

	public void setGasPrice(String gasPrice) {
		this.gasPrice = gasPrice;
	}

	public String getIsError() {
		return isError;
	}

	public void setIsError(String isError) {
		this.isError = isError;
	}

	public String getTxreceipt_status() {
		return txreceipt_status;
	}

	public void setTxreceipt_status(String txreceipt_status) {
		this.txreceipt_status = txreceipt_status;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getContractAddress() {
		return contractAddress;
	}

	public void setContractAddress(String contractAddress) {
		this.contractAddress = contractAddress;
	}

	public String getCumulativeGasUsed() {
		return cumulativeGasUsed;
	}

	public void setCumulativeGasUsed(String cumulativeGasUsed) {
		this.cumulativeGasUsed = cumulativeGasUsed;
	}

	public String getGasUsed() {
		return gasUsed;
	}

	public void setGasUsed(String gasUsed) {
		this.gasUsed = gasUsed;
	}

	public String getConfirmations() {
		return confirmations;
	}

	public void setConfirmations(String confirmations) {
		this.confirmations = confirmations;
	}

	public Double getValueD() {
		return valueD;
	}

	public void setValueD(Double valueD) {
		this.valueD = valueD;
	}
    
}
