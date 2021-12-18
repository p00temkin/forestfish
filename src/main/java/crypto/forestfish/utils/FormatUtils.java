package crypto.forestfish.utils;

import org.web3j.abi.datatypes.generated.Uint256;

public class FormatUtils {

    public static String convertUint256ToString(Uint256 param1) {
        int nrHexCharacters = 0;
        if (param1.getBitSize() == 256) nrHexCharacters = 64;
        if (0 == nrHexCharacters) {
            System.out.println("Unable to handle bitsize " + param1.getBitSize() + ". we no go with uint256 no moe? fixit.");
            System.exit(1);
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
    
}
