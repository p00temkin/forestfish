package crypto.forestfish.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HashUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(HashUtils.class);

	public static HashMap<String, Boolean> createKStringVbooleanHashMapListFromFile(final String filePath) {
		HashMap<String, Boolean> hMap = new HashMap<String, Boolean>();
		File sigFile = new File(filePath);
		if (!sigFile.exists()) {
			LOGGER.error("Unable to find file " + filePath);
			SystemUtils.halt();
		}
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(filePath));
			String line = null;
			line = br.readLine();
			while (line != null) {
				String key = line.replace("\n", "").replace("\r", "");
				if (false ||
						line.equals("") ||
						line.contains("#") ||
						false) {
					line = br.readLine();
					continue;
				} else if (null == hMap.get(key)) {
					hMap.put(key, true);
					line = br.readLine();
				} else {
					line = br.readLine();
				}
			}
			br.close();
		} catch (Exception e) {
			LOGGER.error("Caught exception while parsing file: " + e.getMessage());
			SystemUtils.halt();
		}
		return hMap;
	}
	
}
