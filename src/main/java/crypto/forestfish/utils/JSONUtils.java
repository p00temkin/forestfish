package crypto.forestfish.utils;

import com.alibaba.fastjson.JSON;

import crypto.forestfish.objects.evm.DevContractState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JSONUtils {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(JSONUtils.class);

    public static String createJSONFromDevContractState(final DevContractState ev) {
        String jsonString = "";
        try {
            jsonString = JSON.toJSONString(ev);
        } catch (Exception e) {
            LOGGER.error("Exception during JSON parsing: " + e.getClass() + ": " + e.getMessage(), e);
        }
        return jsonString;
    }
    
    public static DevContractState createDevContractState(String str) {
    	DevContractState ev = null;
        try {
            ev = JSON.parseObject(str, DevContractState.class);
        } catch (Exception e) {
            LOGGER.error("Exception during JSON parsing: " + e.getClass() + ": " + e.getMessage(), e);
            LOGGER.error("JSON string for above error: " + str);
        }
        return ev;
    }
    
}
