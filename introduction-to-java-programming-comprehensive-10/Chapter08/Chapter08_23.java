/**
(Largest block) Given a square matrix with the elements 0 or 1, write a program
to find a maximum square submatrix whose elements are all 1s. Your program
should prompt the user to enter the number of rows in the matrix. The program
then displays the location of the first element in the maximum square submatrix
and the number of the rows in the submatrix. Here is a sample run:

Enter the number of rows in the matrix: 5
Enter the matrix row by row:
1 0 1 0 1
1 1 1 0 1
1 0 1 1 1
1 0 1 1 1
1 0 1 1 1

The maximum square submatrix is at (2, 2) with size 3

Your program should implement and use the following method to find the maximum
square submatrix:

public static int[] findLargestBlock(int[][] m)

The return value is an array that consists of three values. The first two values are
the row and column indices for the first element in the submatrix, and the third
value is the number of the rows in the submatrix.
*/

public class HelloWorld {
	public static void main(String[] args) {
	
		int[][] matrix = { 	{1, 0, 1, 0, 1},
					{1, 1, 1, 0, 1},
					{1, 0, 1, 1, 1},
					{1, 0, 1, 1, 1},
					{1, 0, 1, 1, 1 } };
					
					
		System.out.println("Hello World");
	}
	
	public static int[] findLargestBlock(int[][] m) {

		for(int row = 0; row < m.length - 1; row++) {
			for(int column = 0; column < m.length - 1; column++) {
	
				if( minSquareFound(m, row, column) ) {
	
				}
			}
		}
		return 
	}
	
	
	//daca exista rand si coloana in plus sunt si ele pline de 1; returneaza cate
	public static int getExtraSides(int[][] mtrx, int r, int c) {
		
		if(r + 2 < mtrx.length) {
	
		}	
	}
	
	// find min square
	public static boolean minSquareFound(int[][] mtrx, int r, int c) {
		if( mtrx[r][c] == 1 && mtrx[r][c + 1] == 1 && mtrx[r + 1][c] == 1 && mtrx[r + 1][c + 1] == 1 ) {
			return true;
		}
		else
			return false;
	}
}
