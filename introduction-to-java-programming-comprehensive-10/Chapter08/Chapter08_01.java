import java.util.Scanner;

// (Sum elements column by column) Write a method that returns the sum of all the
// elements in a specified column in a matrix using the following header:
// public static double sumColumn(double[][] m, int columnIndex)


public class SumElementsColumnByColumn {

	public static void main(String[] args) {
		
		double[][] matrix = new double[3][4];
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row:");
		 
		// Read input
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 4; column++) {
				matrix[row][column] = input.nextDouble();
			} 
		}
		
		for (int column = 0; column < 4; column++) {
			
			System.out.println( "Sum of the elements at column " + column +" is " + sumColumn(matrix, column) );
		}
	}
	
	//return the sum of all the elements in a specified column in the matrix
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		
		return sum;
	}

}
