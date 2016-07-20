package oopSession1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Avinash Chopra
 * @Date 19 july 2016
 */
public class TestTranspose {

	Transpose transpose;

	int[][] inputMatrix;
	int[][] expectedMatrix;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		transpose = new Transpose();

		inputMatrix = new int[][] {

		{ 1, 4, 5 }, { 2, 6, 7 }, { 3, 8, 9 } };

		expectedMatrix = new int[][] {

		{ 1, 2, 3 }, { 4, 6, 8 }, { 5, 7, 9 } };
	}

	@Test
	public void testTransposeOfMatrix() {

		assertArrayEquals(expectedMatrix,
				transpose.transposeOfMatrix(inputMatrix));
	}

}
