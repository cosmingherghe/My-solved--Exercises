/** (Sum the major diagonal in a matrix) Write a method that sums all the numbers
  * in the major diagonal in an n * n matrix of double values using the following
  * header:
  * 
  * public static double sumMajorDiagonal(double[][] m)
  * 
  * Write a test program that reads a 4-by-4 matrix and displays the sum of all its
  * elements on the major diagonal.
  */


import java.util.Scanner;

public class SumMajorDiagonalInMatrix {
	public static void main(String[] args) {
		
		double[][] matrix = new double[4][4];
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row:");
		 
		// Read input
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				matrix[row][column] = input.nextDouble();
			} 
		}
		
		System.out.println( "Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix) );
	}


	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;

		for(int rowAndColumn = 0; rowAndColumn < m.length; rowAndColumn++){

			sum += m[rowAndColumn][rowAndColumn];
		}
		return sum;
	}
}
