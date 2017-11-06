/** 
(Explore matrix) Write a program that prompts the user to enter the length of a
square matrix, randomly fills in 0s and 1s into the matrix, prints the matrix, and
finds the rows, columns, and diagonals with all 0s or 1s.
*/


import java.util.Scanner;

public class ExploreMatrix {

	public static void main(String[] args) {

		int[][] matrix = getMatrix();
		showMatrix(matrix);
		showRows(matrix);
		showColumns(matrix);
		showDiagonals(matrix);
	}
	
	public static void showDiagonals(int[][] mtrx) {
		
		boolean noSubDiagonal = true; // noSubDiagonal of 0s or 1s
		int diagonalLine = 2;

		//matrix diagonals = (matrix.length - 1) + (matrix.length - 2) 
		for (int i = mtrx.length - 2; i > 0; i--) {
			int sumIncline = 0;
			int sumDecline = 0;
			
			for (int r = i, c = 0; c < diagonalLine; r++, c++) { //r = row , c = column
				sumIncline += mtrx[r][c];
				sumDecline += mtrx[c][r];
			} 
			diagonalLine++; 

			if(sumIncline == 0 || sumDecline == i ){
				System.out.println( (sumIncline == 0) ? "0s on the decline sub-diagonal: " + i : "1s on the decline sub-diagonal: " + i);
				noSubDiagonal = false;
			}
			else if(sumDecline == 0 || sumIncline == i){
				System.out.println( (sumIncline == 0) ? "0s on the incline sub-diagonal: " + i : "1s on the incline sub-diagonal: " + i);
				noSubDiagonal = false;
			}
			
		}//end for i
		 
		if(noSubDiagonal)
			System.out.println("No same numbers on any sub-diagonals");
		
		
		//compute major diagonals
		int sumMajorIncline = 0;
		int sumMajorDecline = 0;
		for (int i = 0, j = mtrx.length - 1; i < mtrx.length; i++, j--) {
			sumMajorDecline += mtrx[i][i];
			sumMajorIncline += mtrx[i][j];
		}
		//display results for major diagonals
		if(sumMajorIncline == 0 || sumMajorIncline == mtrx.length){
			System.out.println( (sumMajorIncline == 0) ? "0s on the incline major diagonal " : "1s on the incline major diagonal" );			
		}
		else if(sumMajorDecline == 0 || sumMajorDecline == mtrx.length){
			System.out.println( (sumMajorIncline == 0) ? "0s on the decline major diagonal" : "1s on the decline major diagonal" );			
		}
		else
			System.out.println("No same numbers on major diagonals");
	}

	public static void showColumns(int[][] mtrx) {
		// [0] - 0s or 1s per column; [1] > 0 if at least 1 column of 0s or 1s per column
		int[] columns = new int[2];
		columns[1] = 0;

		for (int i = 0; i < mtrx.length; i++) {
			columns[0] = 0; 
			for (int j = 0; j < mtrx.length; j++) {
				columns[0] += mtrx[j][i]; 
			}
			if (columns[0] == mtrx.length || columns[0] == 0) {
				System.out.println((columns[0] == 0) ? "All 0s on column " + (i + 1) : "All 1s on column " + (i + 1) );
				columns[1]++;
			}
		}
		if(columns[1] == 0)
			System.out.println("No same numbers on a column");
	}
	
	public static void showRows(int[][] mtrx) {
		// [0] - 0s or 1s per row; [1] > 0 if at least 1 row of 0s or 1s per row
		int[] rows = new int[2];
		rows[1] = 0;

		for (int i = 0; i < mtrx.length; i++) {
			rows[0] = 0; 
			for (int j = 0; j < mtrx.length; j++) {
				rows[0] += mtrx[i][j]; 
			}
			if (rows[0] == mtrx.length || rows[0] == 0) {
				System.out.println((rows[0] == 0) ? "All 0s on row " + (i + 1) : "All 1s on row " + (i + 1));
				rows[1]++;
			}
		}
		if(rows[1] == 0)
			System.out.println("No same numbers on a row");
	}

	public static void showMatrix(int[][] mtrx) {
		for (int i = 0; i < mtrx.length; i++) {
			for (int j = 0; j < mtrx.length; j++) {
				System.out.print(mtrx[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] getMatrix() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of a square matrix: ");
		int matrixLength = input.nextInt();
		int[][] mtrx = new int[matrixLength][matrixLength];

		for (int i = 0; i < mtrx.length; i++) {
			for (int j = 0; j < mtrx.length; j++) {
				mtrx[i][j] = (int) (Math.random() * 2);
			}
		}

		return mtrx;
	}

}
