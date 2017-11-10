/**
	(Markov matrix) An n * n matrix is called a positive Markov matrix if each
	element is positive and the sum of the elements in each column is 1. Write the
	following method to check whether a matrix is a Markov matrix.
	
	public static boolean isMarkovMatrix(double[][] m)
	
	Write a test program that prompts the user to enter a 3 * 3 matrix of double
	values and tests whether it is a Markov matrix. Here are sample runs:
	
	
	Enter a 3-by-3 matrix row by row:
	0.15 0.875 0.375
	0.55 0.005 0.225
	0.30 0.12 0.4
	It is a Markov matrix
	
	Enter a 3-by-3 matrix row by row:
	0.95 -0.875 0.375
	0.65 0.005 0.225
	0.30 0.22 -0.4
	It is not a Markov matrix

*/
import java.util.*;

public class MatrixEvenNumber {
	public static void main(String[] args) {

					 
		double[][] markovMatrix = {{ 0.15, 0.875, 0.375 }, // getMarkovMatrix();
					  { 0.55, 0.005, 0.225 },
	 				  { 0.30, 0.12, 0.4 }};
	 				  
	 	System.out.println( "It is" + (isMarkovMatrix(markovMatrix) ? " " : " not " ) + "a Markov matrix" );
	}
	
	public static boolean isMarkovMatrix(double[][] m) {

		double sum; 
		
		for(int column = 0; column < m.length; column++) {
		
			sum = 0;
			for(int row = 0; row < m[column].length; row++){
			
				// check if eachElementIsPositive
				if(m[row][column] <= 0.0)
					return false;
					
				sum += m[row][column]; 			
			}
			
			if(sum != 1)
				return false;
		}
		
		return true;
	}
	
	public static double[][] getMarkovMatrix() {
	
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
