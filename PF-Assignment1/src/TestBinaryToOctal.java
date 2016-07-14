import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestBinaryToOctal {
	BinaryToOctal testBinaryToOctalObject;
	int number;
	@Before
	public void setUp() throws Exception{
		testBinaryToOctalObject = new BinaryToOctal();
		number = 110101 ;
	}
	@Test
	public void testConvertBinaryToOctal() {
		assertEquals(65, testBinaryToOctalObject.convertBinaryToOctal(number));
	}

}
