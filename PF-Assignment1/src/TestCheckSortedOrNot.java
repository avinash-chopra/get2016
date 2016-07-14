import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCheckSortedOrNot {
	CheckSortedOrNot sampleClass;
	int[] array1;
	int[] array2;
	int[] array3;

	@Before
	public void setUp() throws Exception {
		sampleClass = new CheckSortedOrNot();
		array1 = new int[]{1,2,3,4,5,6,7,8,9};
		array2 = new int[]{9,8,7,6,5,4,3,2,1};
		array3 = new int[]{16,7,34,8,9};
	}

	@Test
	public void testSortedOrNOt() {
		assertEquals(2, sampleClass.sortedOrNOt(array1));
		assertEquals(1, sampleClass.sortedOrNOt(array2));
		assertEquals(0, sampleClass.sortedOrNOt(array3));
	}

}
