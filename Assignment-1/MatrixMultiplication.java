package oopSession1;

/**
 * @author Avinash Chopra
 * @Date 19 july 2016 use to multiplication of matrix
 */

public class MatrixMultiplication {
	Matrix matrix = new Matrix();

	/**
	 * 
	 * @param firstMatrix
	 *            //take input of first matrix
	 * @param secondMatrix
	 *            //take input of second matrix
	 * @return // return resultant matrix after the multiplication
	 */
	public int[][] multiplyMatrix(int[][] firstMatrix, int[][] secondMatrix) {
		int sum = 0;
		int[][] resultantMatrix = new int[firstMatrix[0].length][secondMatrix.length];
		for (int i = 0; i < firstMatrix[0].length; ++i) {
			for (int j = 0; j < secondMatrix.length; ++j) {
				for (int k = 0; k < firstMatrix.length; ++k) {
					sum += firstMatrix[i][k] * secondMatrix[k][j];
				}
				resultantMatrix[i][j] = sum;
				sum = 0;
			}
		}
		return resultantMatrix;
	}

	// getting first matrix
	public int[][] getFirstMatrix() {
		int[][] firstMatrix = matrix.readMatrix();
		return firstMatrix;
	}

	// getting second matrix
	public int[][] getSecondMatrix() {
		int[][] secondMatrix = matrix.readMatrix();
		return secondMatrix;
	}
}
