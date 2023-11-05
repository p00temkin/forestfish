package crypto.forestfish.utils;

import java.math.BigInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.abi.datatypes.generated.Uint256;

public class FormatUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(FormatUtils.class);
	
    public static String convertUint256ToString(Uint256 param1) {
        int nrHexCharacters = 0;
        if (param1.getBitSize() == 256) nrHexCharacters = 64;
        if (0 == nrHexCharacters) {
            LOGGER.error("Unable to handle bitsize " + param1.getBitSize() + ". we no go with uint256 no moe? fixit.");
            SystemUtils.halt();
        }
        return StringsUtils.prefixStringWith0sToLengthN(param1.getValue().toString(), nrHexCharacters);
    }

    public static String makeUINT256WithDec2Hex(int i) {
        String hex = Integer.toHexString(i);
        return StringsUtils.prefixStringWith0sToLengthN(hex, 64); // bitsize 256 = 64 hex chars
    }

    public static String makeUINT256WithHex(String hex) {
        return StringsUtils.prefixStringWith0sToLengthN(hex, 64); // bitsize 256 = 64 hex chars
    }
    
    public static String makeUINT256WithDec2Hex(long i) {
        String hex = Long.toHexString(i);
        return StringsUtils.prefixStringWith0sToLengthN(hex, 64); // bitsize 256 = 64 hex chars
    }
    
    public static String makeUINT256WithDec2Hex(BigInteger i) {
        return StringsUtils.prefixStringWith0sToLengthN(i.toString(16), 64); // bitsize 256 = 64 hex chars
    }
    
}
