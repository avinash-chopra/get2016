package oopSession1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * @author Avinash Chopra
 * @Date 19 july 2016 
 *
 */
public class Matrix {
	BufferedReader br;
	public Matrix() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String[] args) {
		// crate a new matrix
		Matrix matrix = new Matrix();
		int choice = 0;
		int[][] outputMatrix;
		int[][] inputMatrix;

		while (true) {
			int flag = 0;
			System.out.println("1. Multiplication Of Matrix");
			System.out.println("2. Transpose of Matrix");
			System.out.println("3. exit");
			// get the choice from user
			choice = matrix.getAnyInteger("Please enter your choice");
			switch (choice) {
			// multiplication of matrix
			case 1:
				MatrixMultiplication multiplication = new MatrixMultiplication();
				int[][] firstMatrix = multiplication.getFirstMatrix();
				int[][] secondMatrix = multiplication.getSecondMatrix();
				outputMatrix = multiplication.multiplyMatrix(firstMatrix,
						secondMatrix);
				matrix.displayMatrix(outputMatrix);
				break;

			// transpose of matrix
			case 2:
				Transpose transpose = new Transpose();
				inputMatrix = matrix.readMatrix();
				outputMatrix = transpose.transposeOfMatrix(inputMatrix);
				matrix.displayMatrix(outputMatrix);
				break;

			case 3:
				flag = 1;
				break;
			}
			// to break continuous loop
			if (flag == 1) {
				break;
			}
		}

		System.out.println("Program Exited");

	}

	// read the matrix from user
	public int[][] readMatrix() {
		Matrix matrix = new Matrix();
		int numberOfRowsInMatrix = matrix
				.getAnyInteger("Enter number of rows in matrix");
		int numberOfColumnsInMatrix = matrix.getAnyInteger("Enter "
				+ "number of columns in matrix");
		int[][] matrixArray = new int[numberOfRowsInMatrix][numberOfColumnsInMatrix];
		for (int i = 0; i < numberOfRowsInMatrix; ++i) {
			for (int j = 0; j < numberOfColumnsInMatrix; ++j) {
				matrixArray[i][j] = matrix
						.getAnyInteger("Enter value at "
								+ (i + 1) + " th row and " + (j + 1)
								+ " th column in matrix");
			}
		}
		return matrixArray;
	}

	public int getPositiveInteger(String inputMessage) {
		int inputNumber;
		try {
			System.out.println(inputMessage);
			inputNumber = Integer.parseInt(br.readLine());
			if (inputNumber <= 0) {
				inputNumber = getPositiveInteger(inputMessage);
			}
		} catch (Exception ex) {
			System.out.println("invalid input: " + ex.getMessage());
			inputNumber = getPositiveInteger(inputMessage);
		}
		return inputNumber;
	}

	public int getAnyInteger(String inputMessage) {
		int inputNumber;
		try {
			System.out.println(inputMessage);
			inputNumber = Integer.parseInt(br.readLine());
		} catch (Exception ex) {
			System.out.println("invalid input: " + ex.getMessage());
			inputNumber = getAnyInteger(inputMessage);
		}
		return inputNumber;
	}

	public void displayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[0].length; ++j) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
