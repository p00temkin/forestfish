package crypto.forestfish.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.objects.evm.farcaster.FnameLookupResponse;

public class FarcasterUtils {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(FarcasterUtils.class);

	public static FnameLookupResponse getInfoForFID(long _fid) {
		String json = HttpRequestUtils.getBodyUsingGETUrlRequest("https://fnames.farcaster.xyz/transfers?fid=" + _fid);
		if ((null != json) && json.startsWith("{") && json.endsWith("}")) {
			FnameLookupResponse fnr = JSONUtils.createPOJOFromJSON(json, FnameLookupResponse.class);
			return fnr;
		} else {
			LOGGER.error("Got a non-JSON reply from the FName endpoint");
			LOGGER.error(json);
		}
		return null;
	}

}
