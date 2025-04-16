package crypto.forestfish.utils;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.crypto.Credentials;

import com.esaulpaugh.headlong.abi.Address;
import com.esaulpaugh.headlong.abi.Function;
import com.esaulpaugh.headlong.abi.Single;
import com.esaulpaugh.headlong.abi.Tuple;
import com.esaulpaugh.headlong.util.FastHex;

import crypto.forestfish.objects.embedded.evm.ABI;
import crypto.forestfish.objects.evm.EVMProviderException;
import crypto.forestfish.objects.evm.EVMProviderExceptionActionState;
import crypto.forestfish.objects.evm.connector.EVMBlockChainConnector;
import crypto.forestfish.objects.evm.model.erc721.ERC721ContractInfo;
import crypto.forestfish.objects.evm.model.nft.EVMERC721TokenInfo;
import crypto.forestfish.objects.generic.BooleanResponse;

public class EVMContractUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(EVMContractUtils.class);

	public static ERC721ContractInfo getERC721ContractInfo(EVMBlockChainConnector _connector, String _erc721_contract_address) {
		String meth = "getERC721ContractInfo()";
		boolean allInfoOK = false;
		ERC721ContractInfo result = new ERC721ContractInfo();

		boolean tx_attempt = false;
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while (!allInfoOK && (nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {

				// contract sanitycheck
				BooleanResponse contract_check = EVMUtils.isContract(_erc721_contract_address, _connector);
				if (!contract_check.isCallsuccess()) {
					LOGGER.error("Unable to determine what is on address " + _erc721_contract_address + " on " + _connector.getChain().name() + ", trying to check if its a smart contract");
					SystemUtils.halt();
				} else if (!contract_check.isTrue()) {
					LOGGER.info("Address " + _erc721_contract_address + " on " + _connector.getChain().name() + " does not appear to be a smart contract");
					return null;
				}

				// ERC721 symbol
				String symbol = EVMContractUtils.getStringFromFunctionWithABI("symbol", ABI.abiERC721Token, _erc721_contract_address, _connector);
				result.setSymbol(symbol);

				// ERC721 name
				String name = EVMContractUtils.getStringFromFunctionWithABI("name", ABI.abiERC721Token, _erc721_contract_address, _connector);
				result.setName(name);

				// ERC721 owner
				String owner = EVMContractUtils.getAddressFromFunctionWithoutABI("owner", _erc721_contract_address, _connector);
				result.setOwner(owner);

				// ERC721 totalSupply
				BigInteger totalSupply = EVMContractUtils.getBigIntegerFromFunctionWithABI("totalSupply", ABI.abiERC721Token, _erc721_contract_address, _connector);
				result.setTotalSupply(totalSupply.toString());

				// baseURI
				String baseURI = EVMContractUtils.getStringFromFunctionWithoutABI("baseURI", _erc721_contract_address, _connector);
				result.setBaseuri(baseURI);

				// contract address
				result.setContractAddress(_erc721_contract_address);

				return result;

			} catch (Exception ex) {
				LOGGER.warn("Unable to grab ERC721ContractInfo for " + _erc721_contract_address + ", nodeCallAttemptCount=" + nodeCallAttemptCount);

				// RPC call exceptions (readonly)
				EVMProviderException evmE = EVMUtils.analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
				if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
				EVMProviderExceptionActionState evmAS = EVMUtils.actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
				if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
				if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
			}
			nodeCallAttemptCount++;
		}

		return null;
	}


	private static String getStringFromFunctionWithABI(String funcName, String abiJSON, String _erc721_contract_address, EVMBlockChainConnector _connector) {
		// input
		String function_args_hex1 = EVMContractUtils.genFunctionArgsForEmptyArgsUsingABIJSON(funcName, abiJSON);

		// execute
		String reply_rawstr1 = EVMUtils.makeUnsignedRequest(function_args_hex1, _erc721_contract_address, _connector, _connector.getTxRetryThreshold(), _connector.getConfirmTimeInSecondsBeforeRetry(), _connector.isHaltOnFailedCall());
		reply_rawstr1 = reply_rawstr1.replaceFirst("0x", "");
		LOGGER.debug("reply_rawstr: " + reply_rawstr1);

		// output
		String output = EVMContractUtils.getStringFromFunctionRespWithABI(funcName, abiJSON, reply_rawstr1);
		return output;
	}

	public static String getStringFromFunctionWithoutABI(String _funcName, String _contract_address, EVMBlockChainConnector _connector) {

		String generic_string_funcJSON = "{\"constant\":true,\"inputs\":[],\"name\":\"" + _funcName + "\",\"outputs\":[{\"name\":\"\",\"type\":\"string\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"}";

		// input
		String function_args_hex1 = EVMContractUtils.genFunctionArgsForEmptyArgsUsingFunctionJSON(_funcName, generic_string_funcJSON);

		// sanity check
		// contract sanitycheck
		BooleanResponse contract_check = EVMUtils.isContract(_contract_address, _connector);
		if (!contract_check.isCallsuccess()) {
			LOGGER.error("Unable to determine what is on address " + _contract_address + " on " + _connector.getChain().name() + ", trying to check if its a smart contract");
			SystemUtils.halt();
		} else if (!contract_check.isTrue()) {
			LOGGER.info("Address " + _contract_address + " on " + _connector.getChain().name() + " does not appear to be a smart contract");
			return null;
		}
		
		// execute
		String reply_rawstr1 = EVMUtils.makeUnsignedRequest(function_args_hex1, _contract_address, _connector, _connector.getTxRetryThreshold(), _connector.getConfirmTimeInSecondsBeforeRetry(), _connector.isHaltOnFailedCall());
		if (null == reply_rawstr1) {
			LOGGER.error("Got a null reply (failed call) when making unsigned request to contract address " + _contract_address);
			SystemUtils.halt();
		}
		reply_rawstr1 = reply_rawstr1.replaceFirst("0x", "");
		if ("".equals(reply_rawstr1)) {
			LOGGER.error("Got a blank reply when making unsigned request to contract address " + _contract_address);
			SystemUtils.halt();
		}
		LOGGER.debug("function: " + _funcName + " reply_rawstr: " + reply_rawstr1);

		// output
		String output = EVMContractUtils.getStringFromFunctionResp(generic_string_funcJSON, reply_rawstr1);
		return output;
	}

	public static String setStringFromFunctionWithoutABI(String _arg1, String _funcName, String _contract_address, EVMBlockChainConnector _connector, Credentials _creds) {

		String generic_string_abiJSON = "[{\"inputs\":[{\"internalType\":\"string\",\"name\":\"\",\"type\":\"string\"}],\"name\":\"" + _funcName + "\",\"outputs\":[],\"stateMutability\":\"payable\",\"type\":\"function\"}]";

		// input
		String function_args_hex1 = EVMContractUtils.genFunctionArgsForSingleStringArg(_arg1, _funcName, generic_string_abiJSON);
		LOGGER.debug("function_args_hex1: " + function_args_hex1);
		
		// execute
		String txHASH = EVMUtils.makeSignedRequest(function_args_hex1, _connector.getTxRetryThreshold(), _connector.getConfirmTimeInSecondsBeforeRetry(), _connector, _creds, _contract_address, _connector.getChaininfo().getFallbackGasLimitInUnits(), _connector.isHaltOnFailedCall());
		LOGGER.info("txHASH: " + txHASH);

		return txHASH;
	}
	
	public static String setStringFromFunctionWithoutABI(String _arg1, String _funcName, String _contract_address, EVMBlockChainConnector _connector, Credentials _creds, String gasLimitInUnits) {

		String generic_string_abiJSON = "[{\"inputs\":[{\"internalType\":\"string\",\"name\":\"\",\"type\":\"string\"}],\"name\":\"" + _funcName + "\",\"outputs\":[],\"stateMutability\":\"payable\",\"type\":\"function\"}]";

		// input
		String function_args_hex1 = EVMContractUtils.genFunctionArgsForSingleStringArg(_arg1, _funcName, generic_string_abiJSON);
		LOGGER.debug("function_args_hex1: " + function_args_hex1);
		
		// execute
		String txHASH = EVMUtils.makeSignedRequest(function_args_hex1, _connector.getTxRetryThreshold(), _connector.getConfirmTimeInSecondsBeforeRetry(), _connector, _creds, _contract_address, gasLimitInUnits, _connector.isHaltOnFailedCall());
		LOGGER.info("txHASH: " + txHASH);

		return txHASH;
	}

	public static String getAddressFromFunctionWithoutABI(String _funcName, String _contract_address, EVMBlockChainConnector _connector) {

		String generic_string_funcJSON = "{\"constant\":true,\"inputs\":[],\"name\":\"" + _funcName + "\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"}";

		// input
		String function_args_hex1 = EVMContractUtils.genFunctionArgsForEmptyArgsUsingFunctionJSON(_funcName, generic_string_funcJSON);

		// execute
		String reply_rawstr1 = EVMUtils.makeUnsignedRequest(function_args_hex1, _contract_address, _connector, _connector.getTxRetryThreshold(), _connector.getConfirmTimeInSecondsBeforeRetry(), _connector.isHaltOnFailedCall());
		if (null == reply_rawstr1) return null;
		reply_rawstr1 = reply_rawstr1.replaceFirst("0x", "");
		LOGGER.debug("function: " + _funcName + " reply_rawstr: " + reply_rawstr1);

		// output
		String output = EVMContractUtils.getAddressFromFunctionResp(generic_string_funcJSON, reply_rawstr1);
		return output;
	}

	public static BigInteger getBigIntegerFromFunctionWithABI(String _funcName, String _abi, String _erc721_contract_address, EVMBlockChainConnector _connector) {
		// input
		String function_args_hex1 = EVMContractUtils.genFunctionArgsForEmptyArgsUsingABIJSON(_funcName, _abi);

		// execute
		String reply_rawstr1 = EVMUtils.makeUnsignedRequest(function_args_hex1, _erc721_contract_address, _connector, _connector.getTxRetryThreshold(), _connector.getConfirmTimeInSecondsBeforeRetry(), _connector.isHaltOnFailedCall());
		reply_rawstr1 = reply_rawstr1.replaceFirst("0x", "");
		LOGGER.debug("reply_rawstr: " + reply_rawstr1);

		// output
		BigInteger output = EVMContractUtils.getBigIntegerFromFunctionResp(_funcName, ABI.abiERC721Token, reply_rawstr1);
		return output;
	}


	public static void printAllFunctionsOfABI(String abiJSON) {
		HashMap<String, Boolean> abiFunctions = JSONUtils.getFunctionNamesOfABIJSON(abiJSON);
		int function_count = 0;
		for (String function: abiFunctions.keySet()) {
			System.out.println("function #" + function_count + ": " + function);
			function_count++;
		}
	}


	private static String getStringFromFunctionRespWithABI(String _funcName, String _abiJSON, String _response_hex) {

		// sanity check
		HashMap<String, Boolean> abiFunctions = JSONUtils.getFunctionNamesOfABIJSON(_abiJSON);
		if (null == abiFunctions.get(_funcName)) {
			LOGGER.error("No function named " + _funcName + " for ABI abiERC721Metadata");
			SystemUtils.halt();
		}

		// parse ABI
		String funcJSON = JSONUtils.getFunctionJSONUsingABI(_abiJSON, _funcName);

		// grab the string response
		return getStringFromFunctionResp(funcJSON, _response_hex);
	}

	public static String getStringFromFunctionResp(String _funcJSON, String _response_hex) {

		// parse function JSON
		Function func = Function.fromJson(_funcJSON);

		// grab the string
		String result = "";
		if ((func.getOutputs().size() == 1)) {

			// single output
			String output_type = func.getOutputs().get(0).getCanonicalType();
			if ("string".equals(output_type)) {
				LOGGER.debug("_response_hex: " + _response_hex);
				Tuple decoded_output = func.decodeReturn(FastHex.decode(_response_hex));
				String decoded_single_str = decoded_output.get(0);
				LOGGER.debug("decoded_output (string): " + decoded_single_str);
				result = decoded_single_str;
			} else {
				LOGGER.error("Not sure how to handle this function output, its not a single string");
				LOGGER.error("nr outputs: " + func.getOutputs().size());
				System.out.println(JSONUtils.prettyPrint(_funcJSON));
				SystemUtils.halt();
			}

		} else {
			LOGGER.error("Not sure how to handle this function output, its not a single string");
			LOGGER.error("nr outputs: " + func.getOutputs().size());
			System.out.println(JSONUtils.prettyPrint(_funcJSON));
			SystemUtils.halt();
		}

		return result;
	}

	public static String getAddressFromFunctionResp(String _funcJSON, String _response_hex) {

		// parse function JSON
		Function func = Function.fromJson(_funcJSON);

		// grab the string
		String result = "";
		if ((func.getOutputs().size() == 1)) {

			// single output
			String output_type = func.getOutputs().get(0).getCanonicalType();
			if ("address".equals(output_type)) {
				Tuple decoded_output = func.decodeReturn(FastHex.decode(_response_hex));
				Address decoded_single_address = decoded_output.get(0);
				LOGGER.info("decoded_output (address): " + decoded_single_address);
				result = decoded_single_address.toString();
			} else {
				LOGGER.error("Not sure how to handle this function output, its not a single string");
				LOGGER.error("nr outputs: " + func.getOutputs().size());
				System.out.println(JSONUtils.prettyPrint(_funcJSON));
				SystemUtils.halt();
			}

		} else {
			LOGGER.error("Not sure how to handle this function output, its not a single string");
			LOGGER.error("nr outputs: " + func.getOutputs().size());
			System.out.println(JSONUtils.prettyPrint(_funcJSON));
			SystemUtils.halt();
		}

		return result;
	}

	public static BigInteger getBigIntegerFromFunctionResp(String funcName, String abiJSON, String response_hex) {

		// sanity check
		HashMap<String, Boolean> abiFunctions = JSONUtils.getFunctionNamesOfABIJSON(abiJSON);
		if (null == abiFunctions.get(funcName)) {
			LOGGER.error("No function named " + funcName + " for ABI abiERC721Metadata");
			SystemUtils.halt();
		}

		// parse ABI
		String funcJSON = JSONUtils.getFunctionJSONUsingABI(abiJSON, funcName);
		Function func = Function.fromJson(funcJSON);

		// grab the string
		if ((func.getOutputs().size() == 1)) {

			// single output
			String output_type = func.getOutputs().get(0).getCanonicalType();
			if ("uint256".equals(output_type)) {
				Tuple decoded_output = func.decodeReturn(FastHex.decode(response_hex));
				BigInteger decoded_single = decoded_output.get(0);
				return decoded_single;
			} else {
				LOGGER.error("Not sure how to handle this function output, its not a single uint256");
				LOGGER.error("nr outputs: " + func.getOutputs().size());
				System.out.println(JSONUtils.prettyPrint(funcJSON));
				SystemUtils.halt();
			}

		} else {
			LOGGER.error("Not sure how to handle this function output, its not a single string");
			LOGGER.error("nr outputs: " + func.getOutputs().size());
			System.out.println(JSONUtils.prettyPrint(funcJSON));
			SystemUtils.halt();
		}

		return null;
	}

	private static String genFunctionArgsForEmptyArgsUsingABIJSON(String funcName, String abiJSON) {

		// sanity check
		HashMap<String, Boolean> abiFunctions = JSONUtils.getFunctionNamesOfABIJSON(abiJSON);
		if (null == abiFunctions.get(funcName)) {
			LOGGER.error("No function named " + funcName + " for provided ABI");
			System.out.println("ABI JSON: " + abiJSON);
			SystemUtils.halt();
		}

		// parse ABI
		String funcJSON = JSONUtils.getFunctionJSONUsingABI(abiJSON, funcName);

		return genFunctionArgsForEmptyArgsUsingFunctionJSON(funcName, funcJSON);

	}

	public static String genFunctionArgsForEmptyArgsUsingFunctionJSON(String _funcName, String _funcJSON) {

		// parse ABI
		Function func = Function.fromJson(_funcJSON);

		// generate the argument
		String function_args_hex = "";
		if (func.getInputs().isEmpty()) {

			// no input
			Tuple function_args = Tuple.EMPTY;
			ByteBuffer bb = func.encodeCall(function_args);
			function_args_hex = "0x" + CryptUtils.encodeHexString(bb.array());

		} else {
			LOGGER.error("This contract input function requires input");
			LOGGER.error("nr inputs: " + func.getInputs().size());
			System.out.println(JSONUtils.prettyPrint(_funcJSON));
			SystemUtils.halt();
		} 

		return function_args_hex;
	}

	public static String genFunctionArgsForSingleStringArg(String _arg, String _funcName, String _abiJSON) {

		// sanity check
		HashMap<String, Boolean> abiFunctions = JSONUtils.getFunctionNamesOfABIJSON(_abiJSON);
		if (null == abiFunctions.get(_funcName)) {
			LOGGER.error("No function named " + _funcName + " for provided ABI");
			System.out.println("ABI JSON: " + _abiJSON);
			SystemUtils.halt();
		}

		// parse ABI
		String funcJSON = JSONUtils.getFunctionJSONUsingABI(_abiJSON, _funcName);
		Function func = Function.fromJson(funcJSON);

		// generate the argument
		String function_args_hex = "";
		if (func.getInputs().isEmpty()) {
			LOGGER.error("genFunctionArgsForSingleStringArg() requires an ABI with 1 string argument as input");
			SystemUtils.halt();
		} else if ((func.getInputs().size() == 1)) {
			// single string input
			String input_type = func.getInputs().get(0).getCanonicalType();
			if ("string".equals(input_type)) {
				// 1 input string
				Tuple function_args = Single.of(_arg);
				ByteBuffer bb = func.encodeCall(function_args);
				function_args_hex = "0x" + CryptUtils.encodeHexString(bb.array());
			} else {
				LOGGER.error("Not sure how to handle this function input, its not a single string");
				LOGGER.error("nr inputs: " + func.getInputs().size());
				System.out.println(JSONUtils.prettyPrint(funcJSON));
				SystemUtils.halt();
			}
		} else {
			LOGGER.error("This contract input function requires input");
			LOGGER.error("nr inputs: " + func.getInputs().size());
			System.out.println(JSONUtils.prettyPrint(funcJSON));
			SystemUtils.halt();
		} 

		return function_args_hex;
	}


	public static ArrayList<Integer> getERC721TokenIdsOwnedBy(EVMBlockChainConnector _connector, String account_address, EVMERC721TokenInfo tokenInfo, boolean _haltOnFailedCall) {
		String meth = "getERC721TokenIdsOwnedBy()";
		ArrayList<Integer> tokenIds = new ArrayList<Integer>();
		
		boolean tx_attempt = false;
		int nodeCallAttemptCount = 0;
		int requestCount = 0;
		while ((nodeCallAttemptCount<10) && (requestCount<20)) {
			requestCount++;
			try {

				// Own more than 10k nfts from this contract?
				for (int i=0; i<=10000; i++) {

					// ---------------------------------------------------------------------------------------------------
					String funcName = "tokenOfOwnerByIndex";
					String abiERC721Enumerable = ABI.abiERC721Enumerable;
					String funcJSON = JSONUtils.getFunctionJSONUsingABI(abiERC721Enumerable, funcName);
					if ("".equals(funcJSON)) LOGGER.error("Unable to find function " + funcName + "in ABI JSON");
					com.esaulpaugh.headlong.abi.Function func = com.esaulpaugh.headlong.abi.Function.fromJson(funcJSON);
					com.esaulpaugh.headlong.abi.Address abi_account_address = com.esaulpaugh.headlong.abi.Address.wrap(com.esaulpaugh.headlong.abi.Address.toChecksumAddress(account_address));
					Tuple args = Tuple.of(abi_account_address, new BigInteger(Integer.toString(i)));
					ByteBuffer bb = func.encodeCall(args);
					String hexData = CryptUtils.encodeHexString(bb.array());
					// ---------------------------------------------------------------------------------------------------

					String response = EVMUtils.makeUnsignedRequest(hexData, tokenInfo.getContractAddress(), _connector, 10, 20, _haltOnFailedCall);
					if (null != response) {
						Integer tokenID = CryptUtils.getDecimalIntFromHex(response);
						tokenIds.add(tokenID);
					} else {
						return tokenIds;
					}

				}
				return tokenIds;
			} catch (Exception ex) {
				if (ex.getMessage().equals("Empty value (0x) returned from contract")) {
					if (tokenIds.isEmpty()) {
						LOGGER.warn("Found no tokenids owned by specified address");
					}
					return tokenIds;
				} else {
					// RPC call exceptions (readonly)
					EVMProviderException evmE = EVMUtils.analyzeProviderException(_connector.getChain(), _connector.getCurrent_nodeURL(), ex, meth, tx_attempt);
					if (evmE.isTimeout() && (requestCount>=5)) evmE.setSwitchNode(true); // give up on timeout retries and switch node
					EVMProviderExceptionActionState evmAS = EVMUtils.actAndGetStateEVMProviderException(evmE, _connector, false, nodeCallAttemptCount);
					if (evmE.isNodeInteraction()) nodeCallAttemptCount++; 
					if (evmAS.isNewEVMBlockChainConnector()) _connector = evmAS.getConnector();
				}
			}
		}
		LOGGER.error(meth + ": Unable to properly interact with the blockchain, out of retries .. ABORT!");
		SystemUtils.halt();
		return null;
	}


}
