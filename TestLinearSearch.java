import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLinearSearch {

	String success = "Success";
	String fail = "Fail";
	LinearSearch linearSearch;
	int numbers[];
	int currentIndex;
	int target1;
	int target2;
	int NUMBER_EXIST;
	int NUMBER_NOT_EXIST;

	@Before
	public void setUp() throws Exception {
		linearSearch = new LinearSearch();
		numbers = new int[] { 2, 5, 8, 9, 10, 77, 55 };
		currentIndex = 0;
		target1 = 88;
		target2 = 77;
		NUMBER_EXIST = 1;
		NUMBER_NOT_EXIST = 0;
	}

	@Test
	public void testSearching() {
		assertEquals(fail, NUMBER_NOT_EXIST,
				linearSearch.searching(numbers, currentIndex, target1));
		assertEquals(success, NUMBER_EXIST,
				linearSearch.searching(numbers, currentIndex, target2));
	}

}
