package crypto.forestfish.evm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.crypto.Credentials;

import com.esaulpaugh.headlong.abi.Function;
import com.esaulpaugh.headlong.abi.Tuple;

import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.enums.evm.PolygonERC20Token;
import crypto.forestfish.objects.evm.SimpleWallet;
import crypto.forestfish.objects.evm.connector.EVMBlockChainConnector;
import crypto.forestfish.utils.CryptUtils;
import crypto.forestfish.utils.EVMUtils;

public class EVMUtilsTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(EVMUtilsTest.class);

	@Test
	public void signAndVerify() {

		// https://hukenneth.medium.com/ethereum-using-web3-js-for-message-signing-7e2935b2958c
		// see clients/web3j/sign.js for web3j example
		String message = "Hello, I am Kenneth!";
		String privateKey1 = "0xb5b1870957d373ef0eeffecc6e4812c0fd08f554b37b233526acc331bf1544f7";
		Credentials credentials = Credentials.create(privateKey1);
		assertEquals("Ensure correct ETH address", "0x12890d2cce102216644c59dae5baed380d84830c", credentials.getAddress());
		System.out.println("address: " + credentials.getAddress());
		String signature = EVMUtils.sign(credentials, message);
		assertEquals("Ensure correct signature", "0xd1741c3b54e1c95f00f6c85e1922de23ce4bd61b5e48b990bd3d21f3492a9f1d0x04fa324d0a13787dff529ce9a58587ea965e18b08864a23025c39748cb8fb5911c", signature);
		System.out.println("signature: " + signature);
		boolean verified = EVMUtils.verify(signature, message, credentials.getAddress());
		System.out.println("verified: " + verified);
		assertEquals("Ensure we can verify the signed message", true, verified);
	}

	@Test
	public void testMnemonics() {

		SimpleWallet swallet0 = CryptUtils.generateLowEntropyMnemonic_16_0();
		assertEquals("Ensure generated mnemonic is correct", "abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon about", swallet0.getMnemonic());
		assertEquals("Ensure generated private key #0 is correct", "0x1ab42cc412b618bdea3a599e3c9bae199ebf030895b039e9db1e30dafb12b727", swallet0.getPrivkey0());
		assertEquals("Ensure generated address #0 is correct", "0x9858effd232b4033e47d90003d41ec34ecaeda94", swallet0.getCred0().getAddress());

		SimpleWallet swallet1 = CryptUtils.generateLowEntropyMnemonic_32_0();
		assertEquals("Ensure generated mnemonic is correct", "abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon art", swallet1.getMnemonic());
		assertEquals("Ensure generated private key #0 is correct", "0x1053fae1b3ac64f178bcc21026fd06a3f4544ec2f35338b001f02d1d8efa3d5f", swallet1.getPrivkey0());
		assertEquals("Ensure generated address #0 is correct", "0xf278cf59f82edcf871d630f28ecc8056f25c1cdb", swallet1.getCred0().getAddress());

		SimpleWallet swallet2 = CryptUtils.generateLowEntropyMnemonic_16_1();
		assertEquals("Ensure generated mnemonic is correct", "zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo wrong", swallet2.getMnemonic());
		assertEquals("Ensure generated private key #0 is correct", "0x7af65ba4dd53f23495dcb04995e96f47c243217fc279f10795871b725cd009ae", swallet2.getPrivkey0());
		assertEquals("Ensure generated address #0 is correct", "0xfc2077ca7f403cbeca41b1b0f62d91b5ea631b5e", swallet2.getCred0().getAddress());

		// https://bitcoin.stackexchange.com/questions/59904/does-bip39-mnemonic-construction-avoid-repeating-words
		SimpleWallet swallet3 = CryptUtils.generateLowEntropyMnemonic_32_1();
		assertEquals("Ensure generated mnemonic is correct", "zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo vote", swallet3.getMnemonic());
		assertEquals("Ensure generated private key #0 is correct", "0x105434ca932be16664cb5e44e5b006728577dd757440d068e6d15ef52c15a82f", swallet3.getPrivkey0());
		assertEquals("Ensure generated address #0 is correct", "0x1959f5f4979c5cd87d5cb75c678c770515cb5e0e", swallet3.getCred0().getAddress());

	}
	
	@Test
	public void testValidEthereumAddressWithChecksum() {
		assertFalse("Ensure invalid address returns false", EVMUtils.isValidEthereumAddressWithChecksum("0x9858effd232b"));
		assertFalse("Ensure invalid address returns false", EVMUtils.isValidEthereumAddressWithChecksum("42"));
		assertTrue("Ensure valid address returns true", EVMUtils.isValidEthereumAddressWithChecksum("0xb67dce2D6d0b76e2D46F5B5394180ae4E55a836B"));
	}
	
	@Test
	public void testValidEthereumPrivateKey() {
		assertFalse("Ensure invalid as privatekey", EVMUtils.isValidPrivateKey("pepe"));
		assertTrue("Ensure valid as private key (Hardhat account #0)", EVMUtils.isValidPrivateKey("0xac0974bec39a17e36ba4a6b4d238ff944bacb478cbed5efcae784d7bf4f2ff80"));
	}
	
	@Test
	public void testValidMnemonic() {
		assertFalse("Ensure invalid as mnemonic", EVMUtils.isValidMnemonic("pepe"));
		assertFalse("Ensure invalid as mnemonic", EVMUtils.isValidMnemonic("pepe zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo zoo"));
		assertTrue("Ensure valid as mnemonic (Hardhat node)", EVMUtils.isValidMnemonic("test test test test test test test test test test test junk"));
	}

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
	public void connectToPolygonBlockChain() {

		// Instantiate an node optimized connector to the Polygon network
		EVMBlockChainConnector polygonConnector = new EVMBlockChainConnector(EVMChain.POLYGON, true);

		// Latest block number should be larger than 1
		BigInteger blockNR = EVMUtils.getLatestBlockNumber(polygonConnector);
		assertTrue("Ensure we get a sane block nr response", 1 == blockNR.compareTo(new BigInteger("1")));
		LOGGER.info("Latest block number: " + blockNR);

		// Gas price
		BigDecimal gasprice = EVMUtils.getCurrentNetworkGasPriceInGWEI(polygonConnector);
		assertTrue("Ensure we get a sane gasprice back (more than 1 GWEI)", gasprice.compareTo(new BigDecimal("1")) > 0);
		LOGGER.info("Gas price in GWEI: " + gasprice);
	}
	
	@Test
	public void connectToPolygonBlockChainCheckIfAddressIsContract() {

		// Instantiate an node optimized connector to the Polygon network
		EVMBlockChainConnector polygonConnector = new EVMBlockChainConnector(EVMChain.POLYGON, true);

		Boolean hardhat_default_account_is_contract = EVMUtils.isContractAddress(polygonConnector, "0xf39Fd6e51aad88F6F4ce6aB8827279cffFb92266");
		assertFalse("Hardhat default account is not a contract but a EOA", hardhat_default_account_is_contract);
		
		Boolean ghst_contract_address_is_contract = EVMUtils.isContractAddress(polygonConnector, polygonConnector.getChaininfo().getTokenIndex().getTokens().get(PolygonERC20Token.GHST.toString()).getContractAddress());
		assertTrue("Aavegotchi GHST ERC20 contract is a contract", ghst_contract_address_is_contract);
		
	}

	@Test
	public void createCredentialsAndCheckPublicAddress() {
		String privateKey1 = "0xb5b1870957d373ef0eeffecc6e4812c0fd08f554b37b233526acc331bf1544f7";
		// https://hukenneth.medium.com/ethereum-using-web3-js-for-message-signing-7e2935b2958c

		Credentials credentials = Credentials.create(privateKey1);
		assertEquals("Ensure correct ETH address", "0x12890d2cce102216644c59dae5baed380d84830c", credentials.getAddress());
	}

}
