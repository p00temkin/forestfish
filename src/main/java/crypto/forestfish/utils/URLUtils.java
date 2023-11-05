package crypto.forestfish.utils;

import org.jsoup.Jsoup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class URLUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(URLUtils.class);
    
    public static String extractURLHostnameFromURL(final String url) {
        try {
            String urlProcess = url;
            String[] urlArray = url.split(":\\/\\/");
            if (urlArray.length >= 2) {
                urlProcess = urlArray[1].toLowerCase();
            }
            urlProcess = urlProcess.split(":")[0].split("/")[0];
            if (urlProcess.endsWith(".")) {
                return StringsUtils.removeLastDot(urlProcess);
            } else {
                return urlProcess;
            }
        } catch (Exception e) {
            LOGGER.error("Unable to extract hostname from url: " + url);
            return "";
        }
    }

	public static String makeSafe(String text) {
		String s = text
				.replaceFirst("http", "hxxp")
				.replaceFirst("HTTPS", "hxxps")
				.replaceFirst("HTTP", "hxxp")
				.replace("\n", "")
				.replace("\r", "");
		s = html2text(s);
		return s;
	}
	
	public static String html2text(String html) {
		return Jsoup.parse(html).text();
	}
	
}
