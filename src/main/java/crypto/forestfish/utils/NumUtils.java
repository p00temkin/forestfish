package crypto.forestfish.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class NumUtils {

    public static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }
    
    public static int randomNumWithinRangeAsInt(final int min, final int max) {
        if (max == min) {
            return min;
        }
        if (max<min) {
            return min; // default to max value
        }
        int diff = max-min;
        final Random random = new Random();
        int randValue = random.nextInt(diff+1) + min;
        return randValue;
    }
    
    public static double round(Double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        if (value.equals(Double.NaN)) {
            return 0.0d;
        }
        if (Double.isInfinite(value)) {
            return 0.0d;
        }

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
