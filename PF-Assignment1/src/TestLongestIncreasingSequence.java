import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestLongestIncreasingSequence {
	LongestIncreasingSequence sampleClass;
	int sampleNumber[];
	@Before
	public void setUp() throws Exception {
		sampleClass = new LongestIncreasingSequence();
		sampleNumber = new int[] {2,5,4,7,5,3,7,8,9,5,3,7};
	}

	@Test
	public void testLonestSequence() {
		assertArrayEquals(new int[]{3,7,8,9},sampleClass.lonestSequence(sampleNumber));
	}

}
