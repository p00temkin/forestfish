package crypto.forestfish.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.objects.burst.BurstBlockChain;

public class SignaUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(SignaUtils.class);

    public static void printNodeAddress(BurstBlockChain signumBlockChain) {
        LOGGER.info("node address: " + signumBlockChain.getNodeURL());
    }
    
}
