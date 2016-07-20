package oopSession1;
/**
 * @author Avinash Chopra
 * @Date 19 july 2016 
 *	use to display the matrix
 */

public class DisplayMatrix {
	public void displayMatrix(int[][] matrix){
		for(int i=0;i < matrix[0].length ; ++i){
			for(int j=0;j<matrix.length;++j){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
