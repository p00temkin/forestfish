package crypto.forestfish.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.Formatter;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.crypto.Bip32ECKeyPair;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.MnemonicUtils;

import com.algorand.algosdk.util.CryptoProvider;

import crypto.forestfish.objects.embedded.BlockchainDetailsGeneric;
import crypto.forestfish.objects.evm.SimpleWallet;

public class CryptUtils {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(CryptUtils.class);

	private static SecureRandom RANDOM = new SecureRandom();
	private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	public static byte[] digest(byte[] data) throws NoSuchAlgorithmException {
		CryptoProvider.setupIfNeeded();
		MessageDigest digest = java.security.MessageDigest.getInstance("SHA256");
		digest.update(Arrays.copyOf(data, data.length));
		return digest.digest();
	}

	public static String calculateSHA512_STR(String str) {
		return byteToHex(calculateSHA512(str));
	}

	public static byte[] calculateSHA512(String str) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-512");
			digest.reset();
			digest.update(str.getBytes("UTF-8"));
			return digest.digest();
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Caught NoSuchAlgorithmException exception: " + Arrays.toString(e.getStackTrace()));
		} catch (UnsupportedEncodingException e) {
			System.out.println("Caught UnsupportedEncodingException exception: " + Arrays.toString(e.getStackTrace()));
		}
		return null;
	}

	public static String calculateSHA512_256_STR(String str) {
		return byteToHex(calculateSHA512_256(str));
	}

	public static byte[] calculateSHA512_256(String str) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-512/256");
			digest.reset();
			digest.update(str.getBytes("UTF-8"));
			return digest.digest();
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Caught NoSuchAlgorithmException exception: " + Arrays.toString(e.getStackTrace()));
		} catch (UnsupportedEncodingException e) {
			System.out.println("Caught UnsupportedEncodingException exception: " + Arrays.toString(e.getStackTrace()));
		}
		return null;
	}

	public static String calculateSHA256_STR(String str) {
		return byteToHex(calculateSHA256(str));
	}

	public static byte[] calculateSHA256(String str) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			digest.reset();
			digest.update(str.getBytes("UTF-8"));
			return digest.digest();
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Caught NoSuchAlgorithmException exception: " + Arrays.toString(e.getStackTrace()));
		} catch (UnsupportedEncodingException e) {
			System.out.println("Caught UnsupportedEncodingException exception: " + Arrays.toString(e.getStackTrace()));
		}
		return null;
	}
	
	public static String calculateSHA1_STR(String str) {
		return byteToHex(calculateSHA1(str));
	}

	public static byte[] calculateSHA1(String str) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
			digest.reset();
			digest.update(str.getBytes("UTF-8"));
			return digest.digest();
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Caught NoSuchAlgorithmException exception: " + Arrays.toString(e.getStackTrace()));
		} catch (UnsupportedEncodingException e) {
			System.out.println("Caught UnsupportedEncodingException exception: " + Arrays.toString(e.getStackTrace()));
		}
		return null;
	}

	public static byte[] calculateSHA256FromByteArray(byte[] bytes) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			digest.reset();
			digest.update(bytes);
			return digest.digest();
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Caught NoSuchAlgorithmException exception: " + Arrays.toString(e.getStackTrace()));
		}
		return null;
	}

	public static String byteToHex(final byte[] hash) {
		Formatter formatter = new Formatter();
		for (byte b : hash) {
			formatter.format("%02x", b);
		}
		String result = formatter.toString();
		formatter.close();
		return result;
	}

	public static String generateSafe288BITToken() {
		byte[] bytes = new byte[36]; // 36 bytes * 8 = 288 bits
		RANDOM.nextBytes(bytes);
		String token = Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
		return token;
	}

	public static String bytesToHex(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
		for (int j = 0; j < bytes.length; j++) {
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = HEX_ARRAY[v >>> 4];
			hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
		}
		return new String(hexChars);
	}

	public static String byteToHex(byte _num) {
		char[] hexDigits = new char[2];
		hexDigits[0] = Character.forDigit((_num >> 4) & 0xF, 16);
		hexDigits[1] = Character.forDigit((_num & 0xF), 16);
		return new String(hexDigits);
	}

	private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

	public static String encodeHexString(byte[] _byteArray) {
		StringBuffer hexStringBuffer = new StringBuffer();
		for (int i = 0; i < _byteArray.length; i++) {
			hexStringBuffer.append(CryptUtils.byteToHex(_byteArray[i]));
		}
		return hexStringBuffer.toString();
	}

	public static SimpleWallet generateLowEntropyMnemonic_16_0() {
		byte entropy[] = new byte[16];
		Arrays.fill(entropy, (byte) 0);
		String mnemonic = MnemonicUtils.generateMnemonic(entropy);

		// derivationPathETH0
		byte[] seed0 = MnemonicUtils.generateSeed(mnemonic, "");
		Bip32ECKeyPair masterKeypair0 = Bip32ECKeyPair.generateKeyPair(seed0);
		Bip32ECKeyPair childKeypair0 = Bip32ECKeyPair.deriveKeyPair(masterKeypair0, BlockchainDetailsGeneric.derivationPathETH0);
		Credentials cred0 = Credentials.create(childKeypair0);
		String privkey0 = "0x" + cred0.getEcKeyPair().getPrivateKey().toString(16);

		return new SimpleWallet(mnemonic, cred0, privkey0);
	}

	public static SimpleWallet generateLowEntropyMnemonic_16_1() {
		byte entropy[] = new byte[16];
		Arrays.fill(entropy, (byte) 255);

		String mnemonic = MnemonicUtils.generateMnemonic(entropy);

		// derivationPathETH0
		byte[] seed0 = MnemonicUtils.generateSeed(mnemonic, "");
		Bip32ECKeyPair masterKeypair0 = Bip32ECKeyPair.generateKeyPair(seed0);
		Bip32ECKeyPair childKeypair0 = Bip32ECKeyPair.deriveKeyPair(masterKeypair0, BlockchainDetailsGeneric.derivationPathETH0);
		Credentials cred0 = Credentials.create(childKeypair0);
		String privkey0 = "0x" + cred0.getEcKeyPair().getPrivateKey().toString(16);

		return new SimpleWallet(mnemonic, cred0, privkey0);
	}

	public static SimpleWallet generateLowEntropyMnemonic_32_0() {
		byte entropy[] = new byte[32];
		Arrays.fill(entropy, (byte) 0);
		String mnemonic = MnemonicUtils.generateMnemonic(entropy);

		// derivationPathETH0
		byte[] seed0 = MnemonicUtils.generateSeed(mnemonic, "");
		Bip32ECKeyPair masterKeypair0 = Bip32ECKeyPair.generateKeyPair(seed0);
		Bip32ECKeyPair childKeypair0 = Bip32ECKeyPair.deriveKeyPair(masterKeypair0, BlockchainDetailsGeneric.derivationPathETH0);
		Credentials cred0 = Credentials.create(childKeypair0);
		String privkey0 = "0x" + cred0.getEcKeyPair().getPrivateKey().toString(16);

		return new SimpleWallet(mnemonic, cred0, privkey0);
	}

	public static SimpleWallet generateLowEntropyMnemonic_32_1() {
		byte entropy[] = new byte[32];
		Arrays.fill(entropy, (byte) 255);

		String mnemonic = MnemonicUtils.generateMnemonic(entropy);

		// derivationPathETH0
		byte[] seed0 = MnemonicUtils.generateSeed(mnemonic, "");
		Bip32ECKeyPair masterKeypair0 = Bip32ECKeyPair.generateKeyPair(seed0);
		Bip32ECKeyPair childKeypair0 = Bip32ECKeyPair.deriveKeyPair(masterKeypair0, BlockchainDetailsGeneric.derivationPathETH0);
		Credentials cred0 = Credentials.create(childKeypair0);
		String privkey0 = "0x" + cred0.getEcKeyPair().getPrivateKey().toString(16);

		return new SimpleWallet(mnemonic, cred0, privkey0);
	}

	public static int getDecimalIntFromHex(String _hex){  
		String digits = "0123456789ABCDEF";  
		_hex = _hex.toUpperCase();  
		int val = 0;  
		for (int i = 0; i < _hex.length(); i++)  
		{  
			char c = _hex.charAt(i);  
			int d = digits.indexOf(c);  
			val = 16*val + d;  
		}  
		return val;  
	}

	public static String generateRandomString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 54; i++) {
			int index = RANDOM.nextInt(ALPHABET.length());
			char randomChar = ALPHABET.charAt(index);
			sb.append(randomChar);
		}
		return sb.toString();
	}

	public static String generateRandomStringUUID() {
		return UUID.randomUUID().toString();
	}

}
