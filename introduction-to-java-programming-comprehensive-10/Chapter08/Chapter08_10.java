/** (Largest row and column) Write a program that randomly fills in 0s and 1s into
* a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
* most 1s. 
*/

public class LargestRowAndColumn{
	public static void main(String[] args) {
	
		int[][] matrix = new int[4][4];
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				matrix[i][j] = (int)(Math.random() * 2);
			}
		}

		//Display results
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		showLargestRowAndColumn(matrix);
	}
	
	public static void showLargestRowAndColumn(int[][] mtrx) {

		//rowAndCol[0][0] = largest row index
		//rowAndCol[0][1] = largest column index	
		int[][] rowAndCol = { {0, 0} };
		
		for(int i = 0; i < mtrx.length; i++){
			int row = 0;
			int column = 0;
			
			for(int j = 0; j < mtrx.length; j++){
			
				if(mtrx[i][j] == 1)
					row++;
					
				if(mtrx[j][i] == 1)
					column++;
			} 
			
			if(row > rowAndCol[0][0])
				rowAndCol[0][0] = i;  //add largest row index
				
			if(column > rowAndCol[0][1])
				rowAndCol[0][1] = i;  //add largest column index
		}
		
		System.out.println("The largest row index: " + rowAndCol[0][0]);
		System.out.println("The largest column index: " + rowAndCol[0][1]);
	}
}
