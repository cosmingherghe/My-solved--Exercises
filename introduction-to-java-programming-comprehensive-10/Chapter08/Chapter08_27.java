/**
	(Column sorting) Implement the following method to sort the columns in a twodimensional
	array. A new array is returned and the original array is intact.
	
	public static double[][] sortColumns(double[][] m)
	
	Write a test program that prompts the user to enter a 3 * 3 matrix of double
	values and displays a new column-sorted matrix. Here is a sample run:
	
	Enter a 3-by-3 matrix row by row:
	0.15 0.875 0.375	>Enter
	0.55 0.005 0.225	>Enter
	0.30 0.12 0.4  		>Enter
	
	The column-sorted array is
	0.15 0.0050 0.225
	0.3 0.12 0.375
	0.55 0.875 0.4
*/

import java.util.*;

public class ColumnSorting{
	public static void main(String[] args) {

					 
		double[][] matrix = getMatrix(); 

	 	double[][] sortedMatrixColumns = sortColumns( matrix );
	 	
	 	//Display sorted columns of matrix
	 	System.out.println("The column-sorted array is");
	 	for(int i = 0; i < sortedMatrixColumns.length; i++) {
			for(int j = 0; j < sortedMatrixColumns.length; j++) {
				System.out.print(sortedMatrixColumns[i][j] + " " );
			}
			System.out.println();
		}
	}
	
	public static double[][] sortColumns(double[][] m) {

		double temp; 
		 
		for(int column = 0; column < m.length  - 1; column++) {  
			for(int row = 0; row < m.length; row++){ 
			
				if( m[column + 1][row] < m[column][row] ) { 
					temp = m[column][row];
					m[column][row] = m[column + 1][row];
					m[column + 1][row] = temp; 
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
		return matrix;
	}
	 
}
