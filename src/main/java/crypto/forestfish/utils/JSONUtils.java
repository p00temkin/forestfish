package crypto.forestfish.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import crypto.forestfish.objects.evm.model.solidity.ABIFunctionEntry;
import crypto.forestfish.objects.evm.moralis.MoralisERC20ContractMetaInfo;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.reflect.TypeToken;

public class JSONUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(JSONUtils.class);

	@SuppressWarnings("unchecked")
	public static String getFunctionJSONUsingABI(String jsonSTR, String functionName) {
		String result = "";
		Type type = new TypeToken<ArrayList<Object>>() {}.getType();
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		ArrayList<Object> data = gson.fromJson(jsonSTR, type);
		for (Object obj: data) {
			Map<String, Object> abiEntry = (Map<String, Object>) obj;
			String fName = (String) abiEntry.get("name");
			if (null != fName) {
				String entry_type = (String) abiEntry.get("type");
				if (null != entry_type) {
					if (fName.equals(functionName)) {
						if ("function".equals(entry_type)) {
							//System.out.println("obj: " + obj.toString());
							result = gson.toJson(obj);
						}
					}
				}
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, Boolean> getFunctionNamesOfABIJSON(String jsonSTR) {
		HashMap<String, Boolean> functions = new HashMap<>();
		// Sanity check
		if (!jsonSTR.startsWith("[")) {
			LOGGER.error("ABI JSON needs to be an array (start with '[')");
			System.out.println("ABI JSON:");
			System.out.println(jsonSTR);
			SystemUtils.halt();
		}
		try {
			Type type = new TypeToken<ArrayList<Object>>() {}.getType();
			Gson gson = new GsonBuilder().disableHtmlEscaping().create();
			ArrayList<Object> data = gson.fromJson(jsonSTR, type);
			for (Object obj: data) {
				Map<String, Object> abiEntry = (Map<String, Object>) obj;
				String fName = (String) abiEntry.get("name");
				String entry_type = (String) abiEntry.get("type");
				if (fName != null) {
					if ("function".equals(entry_type)) {
						functions.put(fName, true);
					}
				}
			}
		} catch (Exception e) {
			LOGGER.error("getFunctionNamesOfABIJSON() exception: " + e.getMessage());
			System.out.println("ABI JSON:");
			System.out.println(jsonSTR);
			SystemUtils.halt();
		}
		return functions;
	}

	@SuppressWarnings("unchecked")
	public static HashMap<ABIFunctionEntry, Boolean> getFunctionsOfABIJSON(String jsonSTR) {
		HashMap<ABIFunctionEntry, Boolean> functions = new HashMap<>();
		Type type = new TypeToken<ArrayList<Object>>() {}.getType();
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		ArrayList<Object> data = gson.fromJson(jsonSTR, type);
		for (Object obj: data) {
			Map<String, Object> abiEntry = (Map<String, Object>) obj;
			String fName = (String) abiEntry.get("name");
			String entry_type = (String) abiEntry.get("type");
			if (fName != null) {
				if ("function".equals(entry_type)) {
					String result = gson.toJson(obj);
					ABIFunctionEntry abiE = JSONUtils.createPOJOFromJSON(result, ABIFunctionEntry.class);
					if (abiE == null) {
						System.out.println("Unable to properly parse ABI json: " + jsonSTR);
						SystemUtils.halt();
					}
					functions.put(abiE, true);
				}
			}
		}
		return functions;
	}

	public static <T> T createPOJOFromJSON(final String jsonSTR, Class<T> valueType) {
		ObjectMapper mapper = new ObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		T pojo = null;
		try {
			pojo = mapper.readValue(jsonSTR, valueType);
		} catch (JsonParseException e) {
			LOGGER.error("Unable to parse JSON: " + e.getClass() + ": " + e.getMessage(), e);
			LOGGER.error("JSON string for above error: " + StringsUtils.cutAndPadStringTo50(jsonSTR));
		} catch (JsonMappingException e) {
			LOGGER.error("Unable to map JSON: " + e.getClass() + ": " + e.getMessage(), e);
			LOGGER.error("JSON string for above error: " + StringsUtils.cutAndPadStringTo50(jsonSTR));
		} catch (IOException e) {
			LOGGER.error("IO exception during JSON parsing: " + e.getClass() + ": " + e.getMessage(), e);
			LOGGER.error("JSON string for above error: " + StringsUtils.cutAndPadStringTo50(jsonSTR));
		}
		return pojo;
	}

	public static String compactPrint(final String jsonSTR) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode jsonNode = objectMapper.readValue(jsonSTR, JsonNode.class);
			return(jsonNode.toString());
		} catch (Exception e) {
			LOGGER.error("Unable to JSON parse string with GSON");
		}
		return jsonSTR;
	}

	public static String prettyPrint(final String jsonSTR) {
		try {
			Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
			JsonObject jobject = JsonParser.parseString(jsonSTR).getAsJsonObject();
			return gson.toJson(jobject);
		} catch (Exception e) {
			System.out.println("JSON: " + jsonSTR);
			LOGGER.error("Unable to JSON parse string with GSON");
		}
		return jsonSTR;
	}

	public static String createJSONFromPOJO(Object o) {
		String jsonString = "";
		try {
			jsonString = JSON.toJSONString(o);
		} catch (Exception e) {
			LOGGER.error("Exception during JSON parsing: " + e.getClass() + ": " + e.getMessage(), e);
		}
		return jsonString;
	}

	public static ArrayList<MoralisERC20ContractMetaInfo> createFromMoralisERC20ContractQueryFromJSON(String str) {
		ArrayList<MoralisERC20ContractMetaInfo> oo = new ArrayList<MoralisERC20ContractMetaInfo>();
		try {
			JSONArray jsonArray = JSON.parseArray(str);
			for(int i=0;i<jsonArray.size();i++){
				JSONObject json = jsonArray.getJSONObject(i);
				MoralisERC20ContractMetaInfo ci = JSON.toJavaObject(json, MoralisERC20ContractMetaInfo.class);
				oo.add(ci);
			}
		} catch (Exception e) {
			LOGGER.error("Exception during JSON parsing: " + e.getClass() + ": " + e.getMessage(), e);
			LOGGER.error("JSON string for above error: " + str);
		}
		return oo;
	}

	public static ArrayList<String> getKeyNamesOfJSON(String jsonSTR) {
		ArrayList<String> keys = new ArrayList<String>();
		JsonObject jobject = JsonParser.parseString(jsonSTR).getAsJsonObject();
		Set<Map.Entry<String, JsonElement>> entries = jobject.entrySet();
		for(Map.Entry<String, JsonElement> entry: entries) {
			keys.add(entry.getKey());
		}
		return keys;
	}

}
