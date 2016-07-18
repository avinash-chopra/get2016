import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBinarySearch {

	String success = "Success" ;
	String fail = "Fail" ;
	int NUMBER_EXIST = 1;
	int NUMBER_NOT_EXIST = 0;
	int numbers[];
	int test1;
	int test2;
	int lowerIndex;
	int upperIndex;
	BinarySearch binarySearch;
	@Before
	public void setUp() throws Exception {
		binarySearch = new BinarySearch();
		numbers = new int[]{2,5,8,9,10,55,77};
		lowerIndex = 0;
		upperIndex = 6;
		test1 = 88;
		test2 = 77;
	}

	@Test
	public void testSearching() {
		assertEquals(fail, NUMBER_NOT_EXIST,binarySearch.searching(numbers, lowerIndex, upperIndex, test1));
		assertEquals(success, NUMBER_EXIST,binarySearch.searching(numbers, lowerIndex, upperIndex, test2));
	}

}
