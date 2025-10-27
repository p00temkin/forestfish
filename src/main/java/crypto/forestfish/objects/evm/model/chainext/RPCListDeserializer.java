package crypto.forestfish.objects.evm.model.chainext;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * Custom deserializer for RPC field that can be either a String or an Object with a url field
 */
public class RPCListDeserializer implements JsonDeserializer<List<String>> {
	
	@Override
	public List<String> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		
		List<String> rpcList = new ArrayList<>();
		
		if (json.isJsonArray()) {
			JsonArray jsonArray = json.getAsJsonArray();
			
			for (JsonElement element : jsonArray) {
				if (element.isJsonPrimitive() && element.getAsJsonPrimitive().isString()) {
					// Simple string URL
					rpcList.add(element.getAsString());
				} else if (element.isJsonObject()) {
					// Object with url property
					JsonObject rpcObj = element.getAsJsonObject();
					if (rpcObj.has("url")) {
						rpcList.add(rpcObj.get("url").getAsString());
					}
				}
			}
		}
		
		return rpcList;
	}
}