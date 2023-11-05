package crypto.forestfish.objects.ipfs.connector;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.objects.embedded.ipfs.IPFSDetails;
import crypto.forestfish.utils.HttpRequestUtils;
import crypto.forestfish.utils.SystemUtils;

public class IPFSConnector {

	private static final Logger LOGGER = LoggerFactory.getLogger(IPFSConnector.class);

	private HashMap<String, Boolean> active_gatewayURLs;

	public IPFSConnector() {
		super();
		LOGGER.debug("Creating a new IPFSConnector");

		// Initial scan for active IPFS gateway nodes
		this.updateActiveGatewayURLs();
	}

	public void updateActiveGatewayURLs() {
		LOGGER.info("Updating list of active IPFS gateway URLs ..");
		HashMap<String, Boolean> active_gatewayURLs_new = new HashMap<>();
		String url = "ipfs://" + IPFSDetails.network.getGateway_checker_cid();

		// Walk through all gateways
		for (String gatewayURL: IPFSDetails.network.getGatewayURLs()) {

			String content_url = url.replace("ipfs://", gatewayURL);
			try {
				String content = HttpRequestUtils.getBodyUsingGETUrlRequestOpportunistic(content_url);
				if ("".equals(content)) {
					LOGGER.debug("Unable to get gateway checked CID content from " + gatewayURL);
				} else {
					if (content.contains("Hello from IPFS Gateway Checker")) {
						active_gatewayURLs_new.put(gatewayURL, true);
						LOGGER.debug("Verified gateway checked CID content access from " + gatewayURL);
					} else {
						LOGGER.debug("Unable to get gateway checked CID content from " + gatewayURL);
					}
				}
			} catch (Exception e) {
				LOGGER.debug("Unable to get gateway checked CID content from " + gatewayURL);
			}
		}
		this.active_gatewayURLs = active_gatewayURLs_new;
		LOGGER.info("Nr of active IPFS gateways: " + this.getNrActiveGatewayURLs());
	}

	public Integer getNrActiveGatewayURLs() {
		return this.active_gatewayURLs.size();
	}

	public HashMap<String, Boolean> getActive_gatewayURLs() {
		return active_gatewayURLs;
	}

	public void setActive_gatewayURLs(HashMap<String, Boolean> active_gatewayURLs) {
		this.active_gatewayURLs = active_gatewayURLs;
	}

	public String getStringContent(final String content_url) {
		LOGGER.debug("getStringContent() called for " + content_url);
		
		if (false ||
				content_url.startsWith("https://") ||
				content_url.startsWith("ipfs://") ||
				false) {
			// all good
		} else {
			LOGGER.warn("Unsupported URL schema for content_url: " + content_url);
			return "";
		}
		
		if (this.active_gatewayURLs.isEmpty()) {
			LOGGER.error("Number of active IPFS URLs is 0.");
			SystemUtils.halt();
		}
		
		for (String gatewayURL: this.active_gatewayURLs.keySet()) {
			String fetch_url = content_url;
			if (content_url.startsWith("ipfs://")) fetch_url = fetch_url.replace("ipfs://", gatewayURL);
			LOGGER.info("Attempting to fetch " + content_url);
			String content = HttpRequestUtils.getBodyUsingGETUrlRequestOpportunistic(fetch_url);
			if (!"".equals(content)) {
				// Exit on first successful download
				return content;
			}
		}
		return "";
	}

	public byte[] getBinaryContent(String _content_url) {
		if (false ||
				_content_url.startsWith("https://") ||
				_content_url.startsWith("ipfs://") ||
				false) {
			// all good
		} else {
			LOGGER.warn("Unsupported URL schema for content_url: " + _content_url);
			return null;
		}
		if (_content_url.endsWith("#arc3")) _content_url = _content_url.replace("#arc3", "arc3");
		
		for (String gatewayURL: this.active_gatewayURLs.keySet()) {
			String fetch_url = _content_url;
			if (_content_url.startsWith("ipfs://")) fetch_url = fetch_url.replace("ipfs://", gatewayURL);
			LOGGER.info("Attempting to fetch " + _content_url + " using " + gatewayURL);
			
	        byte[] bytes = HttpRequestUtils.downloadImage(fetch_url);
	        if (null != bytes) return bytes;
		}
		return null;
	}
}
