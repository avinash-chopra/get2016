import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author Avinash
 * @Date 16 july 2016 
 */
public class TestQuickSort {

	QuickSort quickSort;
	int numbers[] ;
	String success = "Success" ;
	String fail = "Fail" ;
	@Before
	public void setUp() throws Exception {
		quickSort = new QuickSort();
		numbers = new int[]{2,5,8,9,10, 77, 55, 11};		// numbers in array
	}

	@Test
	public void testQuickSorting() {
		assertArrayEquals(success,new int[]{2,5,8,9,10,11,55,77},quickSort.quickSorting(numbers, 0, 7));
		assertArrayEquals(success,new int[]{},quickSort.quickSorting(new int[]{}, 0, 0));
	}

}
