/**
	(Identical arrays) The two-dimensional arrays m1 and m2 are identical if they
	have the same contents. Write a method that returns true if m1 and m2 are identical,
	using the following header:
	
	public static boolean equals(int[][] m1, int[][] m2)
	
	Write a test program that prompts the user to enter two 3 * 3 arrays of integers
	and displays whether the two are identical. Here are the sample runs.
	
	Enter list1: 51 25 22 6 1 4 24 54 6
	Enter list2: 51 22 25 6 1 4 24 54 6
	The two arrays are identical
	
	Enter list1: 51 5 22 6 1 4 24 54 6
	Enter list2: 51 22 25 6 1 4 24 54 6
	The two arrays are not identical
*/

import java.util.*;

public class IdenticalArrays{
	public static void main(String[] args) { 
	/**	
		int[][] matrix1 = new int[3][3]; 
		int[][] matrix2 = new int[3][3];

		getMatrix(matrix1, 1);
		getMatrix(matrix2, 2);
	*/	
	
		int[][] matrix1 = {{1, 1, 1}, {2, 2, 3},{3, 3, 3}};
		int[][] matrix2 = {{1, 1, 1}, {2, 2, 2},{3, 3, 3}};
		
		System.out.println("The two arrays are" + ( (equals(matrix1, matrix2)) ? "" : " not" ) + " identical");

	}
	
	public static boolean equals(int[][] m1, int[][] m2) {

		boolean[][] numberFound = new boolean[m2.length * m2.length][2];
		int numberFoundIndex = 0;
		
		for(int i = 0; i < m1.length; i++) {  
			for(int j = 0; j < m1.length; j++) { 
				//foreach number in Matrix1 check for a match in Matrix2   
				numberFound[numberFoundIndex][0] = !numberFound[numberFoundIndex][0];
				
				if( numberFoundInMatrix(m1[i][j], m2, numberFound) ) { 
					numberFound[numberFoundIndex][1] = !numberFound[numberFoundIndex][1];
				}
				numberFoundIndex++;
			} 
		}
		
		for (int i = 0; i < numberFound.length; i++) {
			for (int j = 0; j < numberFound[i].length; j++) {
				if(!numberFound[i][j])
					return false;
			}
		}
		return true;
	}
	public static boolean numberFoundInMatrix(int number, int[][] mtrx, boolean[][] numberFoundAt) {
		
		int numberFoundIndex = 0;
		
		for (int i = 0; i < mtrx.length; i++) {
			for (int j = 0; j < mtrx.length; j++) {
				if( number == mtrx[i][j] && !numberFoundAt[numberFoundIndex][0] && !numberFoundAt[numberFoundIndex][1] ) {
					System.out.println(mtrx[i][j] + " < ");
					return true;
				}
				numberFoundIndex++;
			}
		}
		return false;
	}
	
	public static int[][] getMatrix(int[][] mtrx, int lineNumber) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("(3 * 3 arrays) Enter list " + lineNumber + " : ");
		
		for(int i = 0; i < mtrx.length; i++) {
			for(int j = 0; j < mtrx[i].length; j++) { 
				mtrx[i][j] = input.nextInt(); 
			}
		}
		return mtrx;
	}
	 
}
