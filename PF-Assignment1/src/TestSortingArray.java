import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestSortingArray {
	SortingArray sampleObject;
	int a[];
	int aSize;
	int b[];
	int bSize;
	int c[];

	@Before
	public void setUp() throws Exception {
		sampleObject = new SortingArray();
		int temp ;
		a =  new int[] {2,4,8};
		aSize = 3;
		b = new int[] {1,4,7,9,78};
		bSize = 5;
		temp = aSize + bSize ;
		c = new int[temp] ;
	}

	@Test
	public void testJoin() {
		assertArrayEquals(new int[]{1,2,4,4,7,8,9,78},sampleObject.join(a,
				aSize, b, bSize, c));
	}

}
