package crypto.forestfish.gen;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.objects.embedded.evm.BlockchainDetailsEVM;
import crypto.forestfish.objects.embedded.evm.BlockchainTokenDetailsEVM;
import crypto.forestfish.objects.evm.model.erc20.ERC20TokenIndex;
import crypto.forestfish.objects.evm.model.nft.EVMNFTIndex;
import crypto.forestfish.utils.FilesUtils;
import crypto.forestfish.utils.JSONUtils;

public class GenerateEVMIndexes {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(GenerateEVMIndexes.class);
	
	@Test
	public void generateEVMChainIndexJSON() {
		String json = BlockchainDetailsEVM.generateEVMChainIndexJSON();
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "evmchainindex.json");
	}
	
	@Test
	public void generateEthereumTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainTokenDetailsEVM.generateEthereumTokenIndex();
		String json = BlockchainTokenDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "ethereumtokenindex.json");
	}
	
	@Test
	public void generateEthereumNFTTokenIndexJSON() {
		EVMNFTIndex idx = BlockchainTokenDetailsEVM.generateEthereumNFTIndex();
		String json = BlockchainTokenDetailsEVM.generateNFTIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "ethereumnfttokenindex.json");
	}
	
	@Test
	public void generateBSCNFTTokenIndexJSON() {
		EVMNFTIndex idx = BlockchainTokenDetailsEVM.generateBSCNFTIndex();
		String json = BlockchainTokenDetailsEVM.generateNFTIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "bscnfttokenindex.json");
	}
	
	@Test
	public void generateBitkubNFTTokenIndexJSON() {
		EVMNFTIndex idx = BlockchainTokenDetailsEVM.generateBitkubNFTIndex();
		String json = BlockchainTokenDetailsEVM.generateNFTIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "bitkubnfttokenindex.json");
	}
	
	@Test
	public void generatePolygonNFTTokenIndexJSON() {
		EVMNFTIndex idx = BlockchainTokenDetailsEVM.generatePolygonNFTIndex();
		String json = BlockchainTokenDetailsEVM.generateNFTIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "polygonnfttokenindex.json");
	}
	
	@Test
	public void generatePolygonTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainTokenDetailsEVM.generatePolygonTokenIndex();
		String json = BlockchainTokenDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "polygontokenindex.json");
	}
	
	@Test
	public void generateMumbaiTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainTokenDetailsEVM.generateMumbaiTokenIndex();
		String json = BlockchainTokenDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "mumbaitokenindex.json");
	}
	
	@Test
	public void generateGoerliTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainTokenDetailsEVM.generateGoerliTokenIndex();
		String json = BlockchainTokenDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "goerlitokenindex.json");
	}
	
	@Test
	public void generateCeloTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainTokenDetailsEVM.generateCeloTokenIndex();
		String json = BlockchainTokenDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "celotokenindex.json");
	}
	
	@Test
	public void generateBSCTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainTokenDetailsEVM.generateBSCTokenIndex();
		String json = BlockchainTokenDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "bsctokenindex.json");
	}
	
	@Test
	public void generateBitkubTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainTokenDetailsEVM.generateBitkubTokenIndex();
		String json = BlockchainTokenDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "bitkubtokenindex.json");
	}
	
	@Test
	public void generateFantomTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainTokenDetailsEVM.generateFantomTokenIndex();
		String json = BlockchainTokenDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "fantomtokenindex.json");
	}
	
	@Test
	public void generateAvaxTokenIndexJSON() {
		ERC20TokenIndex idx = BlockchainTokenDetailsEVM.generateAvaxTokenIndex();
		String json = BlockchainTokenDetailsEVM.generateTokenIndexJSON(idx);
		assertTrue("Ensure welformed result JSON", json.length() > 100);
		FilesUtils.writeToFileUNIXNoException(JSONUtils.prettyPrint(json), "avaxtokenindex.json");
	}
}
