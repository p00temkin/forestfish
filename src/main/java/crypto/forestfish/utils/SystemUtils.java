package crypto.forestfish.utils;

public class SystemUtils {

	public static void halt() {
		System.exit(1);
	}

	public static String getSystemInformation() {
		String systemInfo = System.getProperty("java.vendor") + " " + System.getProperty("java.version") + " on " + System.getProperty("os.name") + " " + System.getProperty("os.version");
		return systemInfo;
	}

	public static String getQuote() {
		return "";
	}

	public static void sleepInSeconds(int _seconds) {
		try {
			Thread.sleep(_seconds*1000);
		} catch (InterruptedException e) {
		}
	}

	public static void sleepInMilliSeconds(int _milliseconds) {
		try {
			Thread.sleep(_milliseconds);
		} catch (InterruptedException e) {
		}
	}

}
