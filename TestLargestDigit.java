import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author Avinash
 * @Date 16 july 2016 
 *  
 */
public class TestLargestDigit {

	int numberTest1;
	int numberTest2;
	int numberTest3;
	LargestDigit largestDigit;
	String success = "Success" ;
	String fail = "Fail" ;
	@Before
	public void setUp() throws Exception {
		largestDigit = new LargestDigit();
		numberTest1 = 2;
		numberTest2 = 1257369;
		numberTest3  = 444;
	}

	@Test
	public void testDigit() {
		assertEquals(success, 2,largestDigit.digit(numberTest1));
		assertEquals(success, 9,largestDigit.digit(numberTest2));
		assertEquals(success, 4,largestDigit.digit(numberTest3));
		assertNotEquals(success, 0,largestDigit.digit(numberTest2));
		assertNotEquals(success, 0,largestDigit.digit(numberTest3));
		
	}

}
