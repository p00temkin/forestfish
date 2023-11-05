package crypto.forestfish.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumUtilsTest {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(NumUtilsTest.class);

	@Test
	public void testNearestMultipleOf10() {
		assertEquals("Nearest multiple of 10 for 4722 is 4720", 4720, NumUtils.getNearestMultipleOf10(4722));
		assertEquals("Nearest multiple of 10 for 2 is 0", 0, NumUtils.getNearestMultipleOf10(2));
		assertEquals("Nearest multiple of 10 for 8 is 10", 10, NumUtils.getNearestMultipleOf10(8));
	}
}
