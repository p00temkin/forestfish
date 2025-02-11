package crypto.forestfish.utils;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(NetUtils.class);
	
	public static boolean isValidIPV4(final String _ip) {
		if (null == _ip) {
			return false;
		} else {
			// Optimization
			if ("::1".equals(_ip)) {
				return false;
			}
			if ("".equals(_ip)) {
				return false;
			}

			// Length optimization, xxx.xxx.xxx.xxx = 15, x.x.x.x = 7
			if ((_ip.length() > 15) || (_ip.length() < 7)) {
				return false;
			}

			// Make sure first and last char is a digit
			if (Character.isDigit(_ip.charAt(0)) && Character.isDigit(_ip.charAt(_ip.length()-1))) {
				// Make sure we have 4 dots
				final String[] octets = _ip.split("\\.");
				if (octets.length == 4) {
					try {
						int octet1 = Integer.parseInt(octets[0]);
						int octet2 = Integer.parseInt(octets[1]);
						int octet3 = Integer.parseInt(octets[2]);
						int octet4 = Integer.parseInt(octets[3]);
						if (true &&
								(octets[0].length()<=3) &&
								(octets[1].length()<=3) &&
								(octets[2].length()<=3) &&
								(octets[3].length()<=3) &&
								(octet1 >= 0) &&
								(octet1 <= 255) &&
								(octet2 >= 0) &&
								(octet2 <= 255) &&
								(octet3 >= 0) &&
								(octet3 <= 255) &&
								(octet4 >= 0) &&
								(octet4 <= 255) &&
								true) {
							return true;
						}
					} catch (Exception e) {
						return false;
					}
				}
			}
		}
		return false;
	}
	
	public static boolean isRFC1918(final String _ip) {
		if (_ip == null) return false;
		if (_ip.startsWith("192.168")) return true;
		if (_ip.startsWith("10.")) return true;
		if (_ip.startsWith("172.16.")) return true;
		if (_ip.startsWith("172.16.")) return true;
		if (_ip.startsWith("172.17.")) return true;
		if (_ip.startsWith("172.18.")) return true;
		if (_ip.startsWith("172.19.")) return true;
		if (_ip.startsWith("172.20.")) return true;
		if (_ip.startsWith("172.21.")) return true;
		if (_ip.startsWith("172.22.")) return true;
		if (_ip.startsWith("172.23.")) return true;
		if (_ip.startsWith("172.24.")) return true;
		if (_ip.startsWith("172.25.")) return true;
		if (_ip.startsWith("172.26.")) return true;
		if (_ip.startsWith("172.27.")) return true;
		if (_ip.startsWith("172.28.")) return true;
		if (_ip.startsWith("172.29.")) return true;
		if (_ip.startsWith("172.30.")) return true;
		if (_ip.startsWith("172.31.")) return true;
		return false;
	}
	
	public static boolean isLocalHost(final String _ip) {
		if (_ip == null) return false;
		if (_ip.startsWith("127.")) return true;
		return false;
	}

	public static ArrayList<String> determineLocalIPv4s() {
		ArrayList<String> localips = new ArrayList<String>();
		localips.add("127.0.0.1");
		try {
			Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
			while (interfaces.hasMoreElements()) {
				NetworkInterface iface = interfaces.nextElement();
				if (iface.isLoopback() || !iface.isUp())
					continue;
				Enumeration<InetAddress> addresses = iface.getInetAddresses();
				while(addresses.hasMoreElements()) {
					InetAddress addr = addresses.nextElement();
					String ip = addr.getHostAddress();
					if (isValidIPV4(ip)) localips.add(ip);
				}
			}
		} catch (SocketException e) {
			throw new RuntimeException(e);
		}
		return localips;
	}

	public static String grabCnetworkSlice(final String ip) {
		final String octets[] = ip.split("\\.");
		if (octets.length == 4) {
			return octets[0] + "." + octets[1] + "." + octets[2];
		} else {
			return ip;
		}
	}

	public static TreeMap<String, Boolean> performTCPPortSweep(int port, ArrayList<String> cnets, int startIP, int stopIP, int timeout, int threadPoolCount) {
		TreeMap<String, Boolean> activeIps = new TreeMap<String, Boolean>();
		if (stopIP<startIP) {
			LOGGER.error("stopIP (" + stopIP + ") cannot be smaller than startIP (" + startIP + ")");
			SystemUtils.halt();
		}
		if (port>65535) {
			LOGGER.error("invalid port " + port + " specified as input");
			SystemUtils.halt();
		}
		if (port<0) {
			LOGGER.error("invalid port " + port + " specified as input");
			SystemUtils.halt();
		}
		try {
			final ExecutorService es = Executors.newFixedThreadPool(threadPoolCount);
			final List<Future<String>> futures = new ArrayList<>();
			for (int lastOctet = startIP; lastOctet <= stopIP; lastOctet++) {
				for (String cnet: cnets) {
					if ("127.0.0".equals(cnet)) {
						if (lastOctet>1) continue;
					}
					String ip = cnet + "." + lastOctet;
					if (!NetUtils.isValidIPV4(ip)) {
						LOGGER.error("Invalid ip generated from input parameters: " + ip);
						SystemUtils.halt();
					}
					futures.add(portIsOpenForHost(es, ip, port, timeout));
				}
			}
			es.shutdown();
			for (final Future<String> f : futures) {
				if (!"".equals(f.get())) {
					activeIps.put(f.get(), true);
				}
			}
		} catch (Exception ex) {
		}
		return activeIps;
	}
	
	public static Future<String> portIsOpenForHost(final ExecutorService es, final String ip, final int port, final int timeout) {
		return es.submit(new Callable<String>() {
			@Override public String call() {
				try {
					Socket socket = new Socket();
					socket.connect(new InetSocketAddress(ip, port), timeout);
					socket.close();
					return ip;
				} catch (Exception ex) {
					return "";
				}
			}
		});
	}
}
