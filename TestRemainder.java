
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * @author Avinash
 * @Date 16 july 2016
 * 	 
 */
public class TestRemainder {

	String success = "Success";
	String fail = "Fail";
	Remainder remainder;
	@Before
	public void setUp() throws Exception {
		remainder = new Remainder();
	}

	@Test
	public void testRemaining() {
		assertEquals(success, 0,remainder.remaining(2, 1));
		assertEquals(success, 1,remainder.remaining(100, 3));
		assertNotEquals(fail, 0,remainder.remaining(200, 9));
	}

}
