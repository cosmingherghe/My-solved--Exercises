/**
	(Game: find the flipped cell) Suppose you are given a 6-by-6 matrix filled with
	0s and 1s. All rows and all columns have an even number of 1s. Let the user flip
	one cell (i.e., flip from 1 to 0 or from 0 to 1) and write a program to find which
	cell was flipped. Your program should prompt the user to enter a 6-by-6 array
	with 0s and 1s and find the first row r and first column c where the even number
	of the 1s property is violated (i.e., the number of 1s is not even). The flipped cell
	is at (r, c). Here is a sample run:
	
	Enter a 6-by-6 matrix row by row:
	1 1 1 0 1 1
	1 1 1 1 0 0
	0 1 0 1 1 1
	1 1 1 1 1 1
	0 1 1 1 1 0
	1 0 0 0 0 1
	The flipped cell is at (0, 1)
*/ 

public class MatrixEvenNumber {
	public static void main(String[] args) {
 
		int[][] matrix = { 	{ 1, 1, 1, 0, 1, 1 },
					{ 1, 1, 1, 1, 0, 0 },
					{ 0, 1, 0, 1, 1, 1 },
					{ 1, 1, 1, 1, 1, 1 },
					{ 0, 1, 1, 1, 1, 0 },
					{ 1, 0, 0, 0, 0, 1 } };
					
		// simulate user randomly flipping a random cell from 1 to 0 or from 0 to 1
		int x = (int)(Math.random() * 6);		
		int y = (int)(Math.random() * 6); 
		matrix[x][y] = ( matrix[x][y] == 0) ? 1 : 0 ;
		
		//show flipped Row and Column
		flippedRowAndColumn(matrix); 
	}
	
	public static void flippedRowAndColumn(int[][] mtrx) {
	 		
	 	int rowsTotalOnes;
	 	int columnsTotalOnes;
	 	int row = 0;
	 	int column = 0;

		//compute rows & columns total of 1s
		for(int i = 0; i < mtrx.length; i++) {

		 	rowsTotalOnes = 0;
		 	columnsTotalOnes = 0;
		 	
			for(int j = 0; j < mtrx.length; j++) {
				rowsTotalOnes += mtrx[i][j];
				columnsTotalOnes += mtrx[j][i];
			}
			
			//find row of flipped cell
			if( rowsTotalOnes % 2 != 0)
				row = i;
				
			//find column of flipped cell
			if( columnsTotalOnes % 2 != 0)
				column = i;
		}

		System.out.printf("The flipped cell is at (%d, %d).", row, column); 
	}
	 
}
