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
import java.util.*;

public class Main {
	public static void main(String[] args) {

		int[][] matrix = getMatrix(); 
 
		int[] submatrix = minSquareFound(matrix);
		
		if(submatrix[2] > 0) {
			System.out.println( "The maximum square submatrix is at (" + submatrix[0] + ", " + submatrix[1] + ") with size " + submatrix[2] );
		}
		else{
			System.out.println( "There is no maximum square submatrix" );
		}

	}
    
	public static int[] minSquareFound(int[][] mtrx) {
	
		int col, row, line;
		int[] submtrx = new int[3];
		submtrx[2] = 0; 
		
		for(int i = 0; i < mtrx.length - 1; i++) {
			for(int j = 0; j < mtrx[i].length - 1; j++){

				if( minSquareFound(mtrx, i, j) ) {
				
					col = i;
					row = j;
					line = 3; 
                    
					if(submtrx[2] < 2) {
						submtrx[0] = i;
						submtrx[1] = j;
						submtrx[2] = 2;
					} 
					
					do {
						if( verifyLines(mtrx, line, col,  row) ) { 
				                                line++;
					                        if(submtrx[2] < line - 1) { 
					                               	submtrx[0] = i;
									submtrx[1] = j;
									submtrx[2] = line - 1;
				                                }
				                 }
						 
					} while( verifyLines(mtrx, line, col,  row) );			
					 
				}
			}
			System.out.println( " " );
		}
		
		return submtrx;
	}
	
	//extra lines of 1s
	public static boolean verifyLines(int[][] mtrx, int line, int col, int row) {

		boolean validl = true;
		
		int colR = col + line - 1;
		int rowR = row + line - 1;
		
		int colL = colR;
		int rowL = rowR;
		
       		
       		if( (col + line <= mtrx.length) && (row + line <= mtrx.length) ) { 
	       		
			for(int i = 0; i < line; i++) {  
	            		
				colR -= i;
				rowL -= i;
	            		
				if(mtrx[colR][rowR] != 1)
					validl = false;
				
				if(mtrx[colL][rowL] != 1)
					validl = false;
	            
	            		colR = col + line - 1;
				rowL = row + line - 1;
			}
		}
		else {
			validl = false;
		}
		
		return validl;
	}
	
	// find min square
	public static boolean minSquareFound(int[][] mtrx, int r, int c) {
		if( mtrx[r][c] == 1 && mtrx[r][c + 1] == 1 && mtrx[r + 1][c] == 1 && mtrx[r + 1][c + 1] == 1 ) {
			return true;
		}
		else
			return false;
	}

	public static int[][] getMatrix() {
      
        Scanner input = new Scanner(System.in);
	 	System.out.print("Enter the number of rows in the matrix: ");
	 	int rows = input.nextInt();
		int[][] mtrx = new int[rows][rows]; 
		 
		System.out.println();
		for(int i = 0; i < mtrx.length; i++) {
			for(int j = 0; j < mtrx[i].length; j++){
				mtrx[i][j] = (int)(Math.random() * 2);
				
				//Display Matrix
				System.out.print(mtrx[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		return mtrx;
	}
}
