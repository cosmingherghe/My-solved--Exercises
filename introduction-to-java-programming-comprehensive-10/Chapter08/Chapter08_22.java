/**
	(Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
	matrix filled with 0s and 1s, displays the matrix, and checks if every row and
	every column have an even number of 1s.
*/ 

public class MatrixEvenNumber {
	public static void main(String[] args) {
 
		int[][] matrix = getMatrix(); 
		
		computeIfRowOrColumnHaveEvenNumber(matrix);
	}
	
	public static void computeIfRowOrColumnHaveEvenNumber(int[][] mtrx) {
	 		
	 	int rowsTotalOnes;
	 	int columnsTotalOnes;

		//compute rows & columns total of 1s
		for(int i = 0; i < mtrx.length; i++) {

		 	rowsTotalOnes = 0;
		 	columnsTotalOnes = 0;
		 	
			for(int j = 0; j < mtrx.length; j++) {
				rowsTotalOnes += mtrx[i][j];
				columnsTotalOnes += mtrx[j][i];
			}
			
			if( rowsTotalOnes % 2 == 0)
				System.out.printf("Row %d have an even number of 1s \n", i + 1);
				
			if( columnsTotalOnes % 2 == 0)
				System.out.printf("Column %d have an even number of 1s \n", i + 1);
		}
	}
	
	public static int[][] getMatrix() {
	 
		int[][] mtrx = new int[6][6]; 
		 
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
