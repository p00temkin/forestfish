## FORESTFISH

Java wrapper library for EVM compatible blockchains and Algorand.

| ![alt text](https://github.com/p00temkin/forestfish/blob/master/img/forestfishto.png?raw=true) |
| :--: |

### Why use/contribute to forestFISH?

forestFISH attempts to make it easier to utilize JVM-based web3 SDKs. Typically helper libraries are much more mature for Javascript and are easier to use compared to its Java counterparts. It also provides useful features such as automatic node selection/failover and overall improved error handling.

A simple example of getting the latest block on the POLYGON blockchain is shown below. On launch the connector will automatically grab the RPC node with best performance (based on your connectivity) and print the latest block.

   ```
   EVMBlockChainConnector connector = new EVMBlockChainConnector(EVMChain.POLYGON);
   BigInteger latestBlockNR = EVMUtils.getLatestBlockNumber(connector);
   System.out.println("latestBlockNR: " + latestBlockNR);
   ```

Similarly for Algorand:

   ```
   AVMBlockChainConnector connector = new AVMBlockChainConnector(AVMChain.MAINNET);
   Long lastRound = AVMUtils.getLastRound(connector);
   System.out.println("lastRound: " + lastRound);
   ```
   
If you want to print out an account portfolio across all EVM chains (similar to debank), you can launch an ultraconnector and make a call to getEVMPortfolioForAccount():

   ```
  // Launch RPC node connectors for all known public chains
  EVMBlockChainUltraConnector ultra_connector = new EVMBlockChainUltraConnector(BlockchainType.PUBLIC);
  System.out.println("EVMBlockChainUltraConnector ready .."); 

  // Print EVM portfolio, include known NFTs
  EVMPortfolio evm_chainPortfolio = EVMUtils.getEVMPortfolioForAccount(ultra_connector, public_address);
  String output = EVMUtils.getEVMPortfolioAsString(evm_chainPortfolio);
  System.out.println(output);
   ```

### Building the library

   ```
   git clone https://github.com/p00temkin/forestfish.git
   mvn clean package install
   ```

### Using the library

Maven:

   ```
	<dependency>
	  <groupId>crypto.forestfish</groupId>
	  <artifactId>forestfish</artifactId>
	  <version>0.2.2</version>
	</dependency>
   ```
   
### Next steps
- Improved Ethereum and Algorand support
- Burst/Signum and more

### Credits
- Web3 Labs for creating web3j: https://www.web3labs.com/web3j-sdk
- Headlong project for all things ABI: https://github.com/esaulpaugh/headlong
- ChainList for keeping embedded public EVM nodes up-to-date: https://chainlist.org/
- Algorand for their epic dev docs: https://developer.algorand.org/docs/

### Support/Donate

To support this project directly:

   ```
   Ethereum/EVM: forestfish.x / 0x207d907768Df538F32f0F642a281416657692743
   Algorand: forestfish.x / 3LW6KZ5WZ22KAK4KV2G73H4HL2XBD3PD3Z5ZOSKFWGRWZDB5DTDCXE6NYU
   ```

Or please consider donating to EFF:
[Electronic Frontier Foundation](https://supporters.eff.org/donate)
