package crypto.forestfish.evm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.HashMap;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.esaulpaugh.headlong.abi.Function;
import com.esaulpaugh.headlong.abi.Tuple;

import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.objects.embedded.evm.ABI;
import crypto.forestfish.objects.evm.connector.EVMBlockChainConnector;
import crypto.forestfish.objects.evm.model.erc721.ERC721ContractInfo;
import crypto.forestfish.objects.evm.model.solidity.ABIFunctionEntry;
import crypto.forestfish.utils.CryptUtils;
import crypto.forestfish.utils.EVMContractUtils;
import crypto.forestfish.utils.EVMUtils;
import crypto.forestfish.utils.FilesUtils;
import crypto.forestfish.utils.JSONUtils;
import crypto.forestfish.utils.StringsUtils;

public class EVMContractUtilsTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(EVMContractUtilsTest.class);

	@Test
	public void testEncodeABI() {
		// https://github.com/esaulpaugh/headlong/blob/master/README.md
		Function f = new Function("baz(uint32,bool)"); // canonicalizes and parses any signature
		Tuple args = Tuple.of(69L, true); // 0x45
		// Two equivalent styles:
		ByteBuffer one = f.encodeCall(args);
		ByteBuffer two = f.encodeCallWithArgs(69L, true);
		System.out.println(Function.formatCall(one.array())); // a multi-line hex representation
		System.out.println(f.decodeCall(two).equals(args));
		String hexStr = CryptUtils.encodeHexString(one.array());
		assertEquals("Ensure proper hexstr arguments to baz()", "cdcd77c000000000000000000000000000000000000000000000000000000000000000450000000000000000000000000000000000000000000000000000000000000001", hexStr);
	}

	@Test
	public void testEncodeABI2() {
		// https://github.com/esaulpaugh/headlong/blob/master/README.md
		Function f = new Function("baz(uint256,bool)"); // canonicalizes and parses any signature
		Tuple args = Tuple.of(new BigInteger("1"), true); // 0x45
		ByteBuffer one = f.encodeCall(args);
		System.out.println(Function.formatCall(one.array())); // a multi-line hex representation
		String hexStr = CryptUtils.encodeHexString(one.array());
		assertEquals("Ensure proper hexstr arguments to baz()", "72ed38b600000000000000000000000000000000000000000000000000000000000000010000000000000000000000000000000000000000000000000000000000000001", hexStr);
	}

	@Test
	public void testEncodeABI3() {
		Function func = new Function("baz(uint256[])");
		BigInteger[] bigints = new BigInteger[] { BigInteger.valueOf(7), BigInteger.valueOf(8), BigInteger.valueOf(9) };
		Tuple args = Tuple.singleton(bigints);
		ByteBuffer bb = func.encodeCall(args);
		System.out.println(Function.formatCall(bb.array())); 
		String hexStr = CryptUtils.encodeHexString(bb.array());
		assertEquals("Ensure proper hexstr arguments to baz()", "3838d31c00000000000000000000000000000000000000000000000000000000000000200000000000000000000000000000000000000000000000000000000000000003000000000000000000000000000000000000000000000000000000000000000700000000000000000000000000000000000000000000000000000000000000080000000000000000000000000000000000000000000000000000000000000009", hexStr);
	}

	@Test
	public void testEncodeAavegotchiDiamondABI() {
		String funcName = "interact";
		String abiJSON = FilesUtils.readAllFromFileWithPath("abi/abiAavegotchiDiamond.json");
		String funcJSON = JSONUtils.getFunctionJSONUsingABI(abiJSON, funcName);
		if ("".equals(funcJSON)) LOGGER.error("Unable to find function " + funcName + "in ABI JSON");
		System.out.println("ABI JSON for function " + funcName + "(): " + funcJSON);
		Function interact_func = Function.fromJson(funcJSON);
		BigInteger[] bigints = new BigInteger[] { BigInteger.valueOf(7), BigInteger.valueOf(8), BigInteger.valueOf(9) };
		Tuple args = Tuple.singleton(bigints);
		ByteBuffer bb = interact_func.encodeCall(args);
		System.out.println(Function.formatCall(bb.array())); 
		String hexStr = CryptUtils.encodeHexString(bb.array());
		assertEquals("Ensure proper hexstr arguments to interact()", "22c6751900000000000000000000000000000000000000000000000000000000000000200000000000000000000000000000000000000000000000000000000000000003000000000000000000000000000000000000000000000000000000000000000700000000000000000000000000000000000000000000000000000000000000080000000000000000000000000000000000000000000000000000000000000009", hexStr);
	}
	
	@Test
	public void testEncodeAavegotchiDiamondABIEmbedded() {
		String funcName = "interact";
		String abiJSON = ABI.abiAavegotchiDiamond;
		String funcJSON = JSONUtils.getFunctionJSONUsingABI(abiJSON, funcName);
		if ("".equals(funcJSON)) LOGGER.error("Unable to find function " + funcName + "in ABI JSON");
		System.out.println("ABI JSON for function " + funcName + "(): " + funcJSON);
		Function interact_func = Function.fromJson(funcJSON);
		BigInteger[] bigints = new BigInteger[] { BigInteger.valueOf(7), BigInteger.valueOf(8), BigInteger.valueOf(9) };
		Tuple args = Tuple.singleton(bigints);
		ByteBuffer bb = interact_func.encodeCall(args);
		System.out.println(Function.formatCall(bb.array())); 
		String hexStr = CryptUtils.encodeHexString(bb.array());
		assertEquals("Ensure proper hexstr arguments to interact()", "22c6751900000000000000000000000000000000000000000000000000000000000000200000000000000000000000000000000000000000000000000000000000000003000000000000000000000000000000000000000000000000000000000000000700000000000000000000000000000000000000000000000000000000000000080000000000000000000000000000000000000000000000000000000000000009", hexStr);
	}
	
	@Test
	public void testgetABIFunctionsAavegotchiDiamond() {
		String abiJSON = ABI.abiAavegotchiDiamond;
		int function_count = 0;
		HashMap<String, Boolean> abiFunctions = JSONUtils.getFunctionNamesOfABIJSON(abiJSON);
		for (String function: abiFunctions.keySet()) {
			System.out.println("function #" + function_count + ": " + function);
			function_count++;
		}
		assertEquals("Ensure AavegotchiDiamond exposes 141 functions", 141, function_count);
	}
	
	@Test
	public void testgetABIFunctionsERC721Enumerable() {
		String abiJSON = ABI.abiERC721Enumerable;
		int function_count = 0;
		HashMap<String, Boolean> abiFunctions = JSONUtils.getFunctionNamesOfABIJSON(abiJSON);
		for (String function: abiFunctions.keySet()) {
			System.out.println("function #" + function_count + ": " + function);
			function_count++;
		}
		assertEquals("Ensure ERC721Enumerable exposes 12 functions", 12, function_count);
	}
	
	@Test
	public void testgetABIFunctionsERC721Contract() {
		String abiJSON = ABI.abiERC721Metadata;
		int function_count = 0;
		HashMap<String, Boolean> abiFunctions = JSONUtils.getFunctionNamesOfABIJSON(abiJSON);
		for (String function: abiFunctions.keySet()) {
			System.out.println("function #" + function_count + ": " + function);
			function_count++;
		}
		assertEquals("Ensure ERC721Metadata exposes 12 functions", 12, function_count);
	}
	
	@Test
	public void testgetABIFunctionsERC721_GMI_Polygon() {
		
		EVMBlockChainConnector connector = new EVMBlockChainConnector(EVMChain.POLYGON, true);
		BigInteger latestBlockNR = EVMUtils.getLatestBlockNumber(connector);
		assertTrue("Ensure sane ETH blocknr", latestBlockNR.longValue() > 1L);
		LOGGER.info("latestBlockNR: " + latestBlockNR);
		
		String erc721_contract_address = "0x3F0E22B827e51Ff567D7388c2B598e2EAbfa74BE"; // GMI ERC721 on polygon
		ERC721ContractInfo erc721_contractinfo = EVMContractUtils.getERC721ContractInfo(connector, erc721_contract_address);
		
		// debug
		EVMContractUtils.printAllFunctionsOfABI(ABI.abiERC721Token);
		
		assertNotEquals("Ensure is valid smart contract contract", null, erc721_contractinfo);
		assertEquals("Ensure ERC721 contract symbol matches", "GMI420", erc721_contractinfo.getSymbol());
		assertEquals("Ensure ERC721 contract name matches", "GMI NFT Vol.1", erc721_contractinfo.getName());
		assertEquals("Ensure ERC721 contract totalSupply can be obtained", "844", erc721_contractinfo.getTotalSupply());
		assertEquals("Ensure ERC721 contract baseURI can be obtained", "https://arweave.net/PhszgqVxdwWryyA6Jl9kZPps41sHtmQzxaxG_GLqRyg", erc721_contractinfo.getBaseuri());
		assertEquals("Ensure ERC721 contract owner can be obtained", "0x7E0512CA22A1876f0Aa38aD451C7aB3924335a1b", erc721_contractinfo.getOwner());
	}
	
	@Test
	public void testgetABIFunctionsERC721Receiver() {
		String abiJSON = ABI.abiERC721Receiver;
		int function_count = 0;
		HashMap<String, Boolean> abiFunctions = JSONUtils.getFunctionNamesOfABIJSON(abiJSON);
		for (String function: abiFunctions.keySet()) {
			System.out.println("function #" + function_count + ": " + function);
			function_count++;
		}
		assertEquals("Ensure ERC721Metadata exposes 1 function", 1, function_count);
	}
	
	@Test
	public void testgetABIFunctionsERC721Token() {
		String abiJSON = ABI.abiERC721Token;
		int function_count = 0;
		HashMap<String, Boolean> abiFunctions = JSONUtils.getFunctionNamesOfABIJSON(abiJSON);
		for (String function: abiFunctions.keySet()) {
			System.out.println("function #" + function_count + ": " + function);
			function_count++;
		}
		assertEquals("Ensure ERC721Token exposes 15 functions", 15, function_count);
	}
	
	@Test
	public void testgetABIFunctionsERC1155() {
		String abiJSON = ABI.abiERC1155;
		int function_count = 0;
		HashMap<String, Boolean> abiFunctions = JSONUtils.getFunctionNamesOfABIJSON(abiJSON);
		for (String function: abiFunctions.keySet()) {
			System.out.println("function #" + function_count + ": " + function);
			function_count++;
		}
		assertEquals("Ensure ERC1155Token exposes 8 function", 8, function_count);
	}
	
	@Test
	public void testgetABIFunctionsERC1155Detailed() {
		String abiJSON = ABI.abiERC1155;
		int function_count = 0;
		HashMap<ABIFunctionEntry, Boolean> abiFunctions = JSONUtils.getFunctionsOfABIJSON(abiJSON);
		for (ABIFunctionEntry function: abiFunctions.keySet()) {
			System.out.println(StringsUtils.cutAndPadStringToN("function #" + function_count + ": " + function.getName(), 40)  + " " + function.getInputs());
			function_count++;
		}
		assertEquals("Ensure ERC1155Token exposes 8 function", 8, function_count);
	}
	
	@Test
	public void testgetABIFunctionsERC721Basic() {
		String abiJSON = ABI.abiERC721Basic;
		int function_count = 0;
		HashMap<String, Boolean> abiFunctions = JSONUtils.getFunctionNamesOfABIJSON(abiJSON);
		for (String function: abiFunctions.keySet()) {
			System.out.println("function #" + function_count + ": " + function);
			function_count++;
		}
		assertEquals("Ensure ERC721Basic exposes 9 functions", 9, function_count);
	}

}
