package crypto.forestfish.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Random;

public class NumUtils {

	private static final Random RANDOM = new Random();
	
	// credit https://www.geeksforgeeks.org/round-the-given-number-to-nearest-multiple-of-10/
    public static int getNearestMultipleOf10(int n) {
        
    	// Smaller multiple
        int a = (n / 10) * 10;
          
        // Larger multiple
        int b = a + 10;
      
        // Return of closest of two
        return (n - a > b - n)? b : a;
    }
	
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
        int randValue = RANDOM.nextInt(diff+1) + min;
        return randValue;
    }
    
    public static long randomNumWithinRangeAsLong(final long min, final long max) {
        if (max == min) {
            return min;
        }
        if (max<min) {
            return min; // default to max value
        }
        long diff = max-min;
        long randValue = RANDOM.nextLong(diff+1) + min;
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

	public static String prettyprintTotal(final BigInteger _bigintval) {
		
		Long _longval = _bigintval.longValue();
		BigInteger _longval2 = new BigInteger("" + _longval);
		if (!_bigintval.equals(_longval2)) {
			// we are beyond what can fit in Long ..
			return "dynamic";
		}
		
		String _val = "" + _longval;
		if (_val.contains("000000000000")) return _val.replace("000000000000","") + "T";
		if (_val.contains("000000000")) return _val.replace("000000000","") + "B";
		if (_val.contains("000000")) return _val.replace("000000","") + "M";
		if (_val.contains("0000")) return _val.replace("0000","") + "k";
		if (Long.valueOf(_val) < 100000L) return _val; // uneven small supply
		return "dynamic";
	}
}
