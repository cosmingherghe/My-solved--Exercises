/**
	(Row sorting) Implement the following method to sort the rows in a twodimensional
	array. A new array is returned and the original array is intact.
	
	public static double[][] sortRows(double[][] m)
	
	Write a test program that prompts the user to enter a 3 * 3 matrix of double
	values and displays a new row-sorted matrix. Here is a sample run:

	Enter a 3-by-3 matrix row by row:
	0.15 0.875 0.375
	0.55 0.005 0.225
	0.30 0.12 0.4
	
	The row-sorted array is
	0.15 0.375 0.875
	0.005 0.225 0.55
	0.12 0.30 0.4
*/
import java.util.*;

public class MatrixEvenNumber {
	public static void main(String[] args) {

					 
		double[][] matrix = getMatrix(); 

	 	double[][] sortedMatrixRows = sortRows( matrix );
	 	
	 	//Display sorted rows of matrix
	 	System.out.println("The row-sorted array is");
	 	for(int i = 0; i < sortedMatrixRows.length; i++) {
			for(int j = 0; j < sortedMatrixRows.length; j++) {
				System.out.print(sortedMatrixRows[i][j] + " " );
			}
			System.out.println();
		}
	}
	
	public static double[][] sortRows(double[][] m) {

		double temp; 
		 
		for(int row = 0; row < m.length; row++) {  
			for(int column = 0; column < m.length - 1; column++){
  
				if(m[row][column + 1] < m[row][column]) { 
					temp = m[row][column];
					m[row][column] = m[row][column + 1];
					m[row][column + 1] = temp; 
				}
			}
		}

		return m;
	}
	
	public static double[][] getMatrix() {
	
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][3]; 
		
		System.out.println("Enter a 3-by-3 matrix row by row:");
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
			
				matrix[i][j] = input.nextDouble(); 
			}
		}
		System.out.println(); //a new line 
		return matrix;
	}
	 
}
