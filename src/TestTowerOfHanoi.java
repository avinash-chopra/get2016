import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Avinash Chopra	
 * @Date 18 july 2016
 *
 */
public class TestTowerOfHanoi{
	
	TowerOfHanoi hanoiProblem;
	ArrayList<String> expectedStepsList1;
	ArrayList<String> expectedStepsList2;
	ArrayList<String> requiredStepsList1;
	ArrayList<String> requiredStepsList2;

	@Before
	public void setUp() throws Exception {
		
		hanoiProblem = new TowerOfHanoi();
		
		expectedStepsList1 = new ArrayList<String>(){{
			add("Move Disk 1 from A to B"); 
			add("Move Disk 2 from A to C"); 
			add("Move Disk 1 from B to C"); 
			add("Move Disk 3 from A to B"); 
			add("Move Disk 1 from C to A");
			add("Move Disk 2 from C to B");
			add("Move Disk 1 from A to B");}};
		
		expectedStepsList2 = new ArrayList<String>(){{
			add("Move Disk 1 from A to C"); 
			add("Move Disk 2 from A to B");
			add("Move Disk 1 from C to B");}};
			
		requiredStepsList1 = new ArrayList<String>();
		
		requiredStepsList2 = new ArrayList<String>();

	}

	/**
	 * Test method for {@link assignment_1.HanoiProblem#towerOfHanoi(java.lang.String, java.lang.String, java.lang.String, int, java.util.List)}.
	 */
	@Test
	public void testTowerOfHanoi() {
		
		assertEquals(expectedStepsList1, hanoiProblem.towerOfHanoi("A", "C", "B", 3, requiredStepsList1));
		
		assertEquals(expectedStepsList2 , hanoiProblem.towerOfHanoi("A", "C", "B", 2, requiredStepsList2));
		
	}
}