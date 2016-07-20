package oopSession1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Avinash Chopra
 * @Date 19 july 2016
 */

public class TestMatrixMultiplication {
	MatrixMultiplication multiplication;
	int[][] expectedOutput;
	int[][] firstMatrix;
	int[][] secondMatrix;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		multiplication = new MatrixMultiplication();
		expectedOutput = new int[][] { { 14, 40, 46 }, { 32, 94, 109 },
				{ 50, 148, 172 }, };
		firstMatrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		secondMatrix = new int[][] { { 1, 4, 5 }, { 2, 6, 7 }, { 3, 8, 9 } };
	}

	@Test
	public void testMultiplyMatrix() {
		assertArrayEquals(expectedOutput,
				multiplication.multiplyMatrix(firstMatrix, secondMatrix));
	}

}
