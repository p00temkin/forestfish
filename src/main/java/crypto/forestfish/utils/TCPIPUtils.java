package crypto.forestfish.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TCPIPUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(TCPIPUtils.class);

    public static String sendAndReceiveSingleLineReply(String destIp, int destPort, String data, int timeoutMs) {
        final String target = destIp + ":" + destPort;
        Socket socket = null;
        try {
            socket = new Socket(destIp, destPort);
            socket.setSoTimeout(timeoutMs);
            socket.getOutputStream().write(data.getBytes());
        } catch (Exception e) {
            LOGGER.error("Failed to send data to \"" + target + "\". Reason: " + e.getMessage());
            if (socket != null && socket.isConnected()) {
                try {
                    socket.close();
                } catch (Exception closeException) {
                    LOGGER.error("Unable to close socket to " + target + ". Reason: " + closeException.getMessage());
                }
            }
            return null;
        }

        String reply = null;
        InputStream is;
        BufferedReader in;
        try {
            is = socket.getInputStream();
            in = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            reply = in.readLine();
        } catch (Exception e) {
            LOGGER.error("Unable to receive any or all data from socket. Reason: " + e.getMessage());
            return null;
        } finally {
            if (socket != null && socket.isConnected()) {
                try {
                    socket.close();
                } catch (Exception e) {
                    LOGGER.error("Unable to close socket to " + target + ". Reason: " + e.getMessage());
                }
            }
        }
        return reply;
    }

    public static ArrayList<String> sendAndReceiveMultiLineReply(String destIp, int destPort, String data, int timeoutMs) {
        ArrayList<String> response = new ArrayList<String>();
        final String target = destIp + ":" + destPort;
        Socket socket = null;
        try {
            socket = new Socket(destIp, destPort);
            socket.setSoTimeout(timeoutMs);
            socket.getOutputStream().write(data.getBytes());
        } catch (Exception e) {
            LOGGER.error("Failed to send data to \"" + target + "\". Reason: " + e.getMessage());
            if (socket != null && socket.isConnected()) {
                try {
                    socket.close();
                } catch (Exception closeException) {
                    LOGGER.error("Unable to close socket to " + target + ". Reason: " + closeException.getMessage());
                }
            }
            return null;
        }

        String row = "";
        InputStream is;
        BufferedReader in;
        try {
            is = socket.getInputStream();
            in = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            while ((row = in.readLine()) != null) {
                response.add(row);
            }
        } catch (Exception e) {
            LOGGER.error("Unable to receive any or all data from socket. Reason: " + e.getMessage());
            return null;
        } finally {
            if (socket != null && socket.isConnected()) {
                try {
                    socket.close();
                } catch (Exception e) {
                    LOGGER.error("Unable to close socket to " + target + ". Reason: " + e.getMessage());
                }
            }
        }
        return response;
    }

    public static String httpGETContent(String connString, int secondsTimeout) {
        OkHttpClient client = new OkHttpClient.Builder()
                .readTimeout(secondsTimeout, TimeUnit.SECONDS)
                .writeTimeout(secondsTimeout, TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder()
                .url(connString)
                .get()
                .build();
        try {
            Response response = client.newCall(request).execute();
            if ("OK".equals(response.message())) {
                String body = response.body().string();
                if (body.length() > 0) {
                    return body;
                } else {
                    LOGGER.warn("Got an empty reply");
                    return null;
                }
            } else {
                LOGGER.warn("response: " + response.message());
            }
        } catch (Exception e) {
            LOGGER.warn("e1: " + e.getMessage());
        }
        return null;
    }

}
