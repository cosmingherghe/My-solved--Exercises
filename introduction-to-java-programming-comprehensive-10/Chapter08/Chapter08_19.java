/**
 * (Pattern recognition: four consecutive equal numbers) Write the following
	method that tests whether a two-dimensional array has four consecutive numbers of the same value, either horizontally, vertically, or diagonally.
	
	public static boolean isConsecutiveFour(int[][] values)
 
 	Write a test program that prompts the user to enter the number of rows and columns of a two-dimensional array and then the values in the array and displays
	true if the array contains four consecutive numbers with the same value. Otherwise, display false. 
 
 */

public class PatternRecognitionFourConsecutiveEqualNumbers {

	public static void main(String[] args) {

		int[][] matrix = getMatrix();
		showMatrix(matrix);
		 
		System.out.println("Array contains four consecutive numbers with the same value: " + isConsecutiveFour(matrix));
	}
	
	public static boolean isConsecutiveFour(int[][] values) {
		return isConsecutiveFourOnDiagonals(values) || isConsecutiveFourOnColumns(values) || isConsecutiveFourOnRows(values);
	}
	
	public static void showMatrix(int[][] mtrx) {

		for (int i = 0; i < mtrx.length; i++) {
			for (int j = 0; j < mtrx.length; j++) {
				System.out.print( mtrx[i][j] + " " );
			}
			System.out.println();
		}
	}
	
	public static boolean isConsecutiveFourOnDiagonals(int[][] mtrx) {
		
		 boolean consecutive = false; 
		 
				//matrix diagonals = (matrix.length - 1) + (matrix.length - 2) 
				for (int i = mtrx.length - 2; i > 0; i--) {
					int count = 0;
					for (int r = i; r < mtrx.length - 1; r++ ) { //r = row , c = column
						for (int r2 = r + 1; r2 < mtrx.length; r2++ ) {
							if(mtrx[i][r] == mtrx[i][r2]) 
								count++;
						}
					}
					if(count > 3) 
						consecutive = true; 
				}//end for i
				   
				//compute major diagonals
				int count1 = 0;
				int count2 = 0;
				for (int i = 0, c = mtrx.length; i < mtrx.length - 1; i++, c-- ) {
					for (int j = i + 1, c2 = mtrx.length - 1; j < mtrx.length; j++, c2-- ) {
						if(mtrx[i][i] == mtrx[j][j]) 
							count1++;
						
						if(mtrx[c2][i] == mtrx[c2][j]) 
							count2++;
					}
					if( count1 > 3 || count2 > 3 ) 
						consecutive = true; 
				} 

		 return consecutive;
	}
	
	public static boolean isConsecutiveFourOnColumns(int[][] mtrx) {
		 boolean consecutive = false;
		 
		 for (int i = 0; i < mtrx.length; i++) {
			int count = 0;
			for (int j = 0; j < mtrx.length - 1; j++) {
				for (int j2 = j + 1; j2 < mtrx.length; j2++) {
					if(mtrx[j][i] == mtrx[j2][i]) 
						count++; 
				}
			}
			if(count > 3)
				consecutive = true;
		 }
		 return consecutive;
	}
	
	public static boolean isConsecutiveFourOnRows(int[][] mtrx) {
		 boolean consecutive = false;
		 
		 for (int i = 0; i < mtrx.length; i++) {
			int count = 0;
			for (int j = 0; j < mtrx.length - 1; j++) {
				for (int j2 = j + 1; j2 < mtrx.length; j2++) {
					if(mtrx[i][j] == mtrx[i][j2])
						count++;
				}
			}
			if(count > 3)
				consecutive = true;
		 }
		 return consecutive;
	}
		
	public static int[][] getMatrix() {

		int[][] mtrx = new int[6][6];
		for (int i = 0; i < mtrx.length; i++) {
			for (int j = 0; j < mtrx.length; j++) {
				mtrx[i][j] = (int)(Math.random() * 10);
			}
		}
		return mtrx;
	}

}
