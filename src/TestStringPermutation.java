import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
/**
 * @author Avinash Chopra
 * @Date 18 july 2016 
 */

public class TestStringPermutation {

	StringPermutation stringPermutation;
	ArrayList<String> testSolution ;
	ArrayList<String> output ;
	@Before
	public void setUp() throws Exception {
		stringPermutation = new StringPermutation();
		testSolution = new ArrayList<String>();
		output = new ArrayList<String>();
		testSolution.add("ABC");
		testSolution.add("ACB");
		testSolution.add("BAC");
		testSolution.add("BCA");
		testSolution.add("CBA");
		testSolution.add("CAB");
		
	}

	@Test
	public void testGetPermutations() {
		output = stringPermutation.getPermutations("ABC", output);
		assertEquals("Success", testSolution, output);
		
	}

}
