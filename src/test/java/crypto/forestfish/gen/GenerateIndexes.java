package crypto.forestfish.gen;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.objects.embedded.evm.BlockchainDetailsEVM;
import crypto.forestfish.objects.evm.model.erc20.ERC20TokenIndex;
import crypto.forestfish.objects.evm.model.nft.EVMNFTIndex;
import crypto.forestfish.utils.FilesUtils;
import crypto.forestfish.utils.JSONUtils;

public class GenerateIndexes {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(GenerateIndexes.class);
	
	@Test
	public void generateEVMChainIndexJSON() {
		String json = BlockchainDetailsEVM.generateEVMChainIndexJSON();
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "evmchainindex.json");
	}
	
	@Test
	public void generateEthereumTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainDetailsEVM.generateEthereumTokenIndex();
		String json = BlockchainDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "ethereumtokenindex.json");
	}
	
	@Test
	public void generateEthereumNFTTokenIndexJSON() {
		EVMNFTIndex idx = BlockchainDetailsEVM.generateEthereumNFTIndex();
		String json = BlockchainDetailsEVM.generateNFTIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "ethereumnfttokenindex.json");
	}
	
	@Test
	public void generateBSCNFTTokenIndexJSON() {
		EVMNFTIndex idx = BlockchainDetailsEVM.generateBSCNFTIndex();
		String json = BlockchainDetailsEVM.generateNFTIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "bscnfttokenindex.json");
	}
	
	@Test
	public void generateBitkubNFTTokenIndexJSON() {
		EVMNFTIndex idx = BlockchainDetailsEVM.generateBitkubNFTIndex();
		String json = BlockchainDetailsEVM.generateNFTIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "bitkubnfttokenindex.json");
	}
	
	@Test
	public void generatePolygonNFTTokenIndexJSON() {
		EVMNFTIndex idx = BlockchainDetailsEVM.generatePolygonNFTIndex();
		String json = BlockchainDetailsEVM.generateNFTIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "polygonnfttokenindex.json");
	}
	
	@Test
	public void generatePolygonTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainDetailsEVM.generatePolygonTokenIndex();
		String json = BlockchainDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "polygontokenindex.json");
	}
	
	@Test
	public void generateMumbaiTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainDetailsEVM.generateMumbaiTokenIndex();
		String json = BlockchainDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "mumbaitokenindex.json");
	}
	
	@Test
	public void generateGoerliTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainDetailsEVM.generateGoerliTokenIndex();
		String json = BlockchainDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "goerlitokenindex.json");
	}
	
	@Test
	public void generateCeloTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainDetailsEVM.generateCeloTokenIndex();
		String json = BlockchainDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "celotokenindex.json");
	}
	
	@Test
	public void generateBSCTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainDetailsEVM.generateBSCTokenIndex();
		String json = BlockchainDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "bsctokenindex.json");
	}
	
	@Test
	public void generateBitkubTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainDetailsEVM.generateBitkubTokenIndex();
		String json = BlockchainDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "bitkubtokenindex.json");
	}
	
	@Test
	public void generateFantomTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainDetailsEVM.generateFantomTokenIndex();
		String json = BlockchainDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "fantomtokenindex.json");
	}
	
	@Test
	public void generateAvaxTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainDetailsEVM.generateAvaxTokenIndex();
		String json = BlockchainDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "avaxtokenindex.json");
	}
}
