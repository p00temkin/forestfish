package crypto.forestfish.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateUtils {
	
    @SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(DateUtils.class);
	
	public static String epochInMilliSecondsToUTC(final long epoch) {
		Date date = new Date(epoch);
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		format.setTimeZone(TimeZone.getTimeZone("UTC"));
		return format.format(date);
	}
	
	public static String epochInSecondsToUTC(final long epoch) {
		Date date = new Date(epoch*1000L);
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		format.setTimeZone(TimeZone.getTimeZone("UTC"));
		return format.format(date);
	}
	
	public static long secondsToHours(long seconds) {
        if (seconds < 0) {
            return -1;
        }
        return seconds / 3600;
    }
}
