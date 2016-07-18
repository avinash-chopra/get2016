import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * @author Avinash
 * @Date 16 july 2016       
 */
public class TestGreatestCommonDivisor {

	GreatestCommonDivisor greatestCommonDivisor;
	String success = "Success";
	String fail = "Fail";

	@Before
	public void setUp() throws Exception {
		greatestCommonDivisor = new GreatestCommonDivisor();
	}

	@Test
	public void testGreatestCommonDivisorOfTwoNumbers() {
		assertEquals(success, 1,
				greatestCommonDivisor.greatestCommonDivisorOfTwoNumbers(2, 1));
		assertEquals(success, 6,
				greatestCommonDivisor.greatestCommonDivisorOfTwoNumbers(12, 18));
		assertEquals(success, 1,
				greatestCommonDivisor.greatestCommonDivisorOfTwoNumbers(100, 3));
		assertNotEquals(fail, 2,
				greatestCommonDivisor.greatestCommonDivisorOfTwoNumbers(2, 9));
		assertNotEquals(fail, 3,
				greatestCommonDivisor.greatestCommonDivisorOfTwoNumbers(2, 3));
	}

}
