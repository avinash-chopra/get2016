import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestTrianglePattern {

	TrianglePattern trianglePattern ;
	@Before
	public void setUp() throws Exception {
		trianglePattern = new TrianglePattern();
		
	}

	@Test
	public void testPattern() {
		String success = "success";
		String fail = "fail";
		String test1 = "12345";
		String test2 = " 1234";
		String test3 = "  123";
		String test4 = "   12";
		String test5 = "    1";
		String test6 = "     1";
		String test7 = "   1";
		assertEquals(success, test1, trianglePattern.pattern(5, 1));
		assertEquals(success, test2, trianglePattern.pattern(5, 2));
		assertEquals(success, test3, trianglePattern.pattern(5, 3));
		assertEquals(success, test4, trianglePattern.pattern(5, 4));
		assertEquals(success, test5, trianglePattern.pattern(5, 5));
		assertNotEquals(fail, test6, trianglePattern.pattern(5, 5));
		assertNotEquals(fail, test7, trianglePattern.pattern(5, 5));
		
	}

}
