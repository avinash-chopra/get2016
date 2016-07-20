package oopSession1;
/**
 * @author Avinash Chopra
 * @Date 19 july 2016 
 *	use to transpose of matrix
 */
public class Transpose {
	public int[][] transposeOfMatrix(int[][] matrix){
		int[][] matrixTranspose = new int[matrix.length][matrix[0].length];
		for(int i=0; i<matrix[0].length; i++){
			for(int j=0; j<matrix.length; j++){
				matrixTranspose[i][j] = matrix[j][i];
			}
		}
		return matrixTranspose;
	}
}