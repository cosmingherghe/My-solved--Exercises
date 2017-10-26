import java.util.Scanner;

//  (Algebra: add two matrices) Write a method to add two matrices. The header of
//  the method is as follows:
//	
//  public static double[][] addMatrix(double[][] a, double[][] b)
//
//  In order to be added, the two matrices must have the same dimensions and the
//  same or compatible types of elements. Let c be the resulting matrix. Each element 
//  c(ij) is a(ij) + b(ij).
//  Write a test program that prompts the user to enter two 3 * 3 matrices and
//  displays their sum. 

public class AddTwoMatrices {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter matrix1 then hit Enter: ");
		double[][] matrixA = getMatrix( input.nextLine() );
	 
		System.out.print("Enter matrix2 then hit Enter: ");
		double[][] matrixB = getMatrix( input.nextLine() );
 
		double[][] matrixC = addMatrix( matrixA, matrixB );
		
		//Display results
		for (int i = 0; i < matrixC.length; i++) {
			for (int j = 0; j < matrixC.length; j++) {
				
				System.out.print( matrixA[i][j] + " " + matrixB[i][j] + " " + matrixC[i][j] ); 
				System.out.print( ( i == 1 && j == matrixA.length - 1 ) ? "\t+\t" : "\t\t"); 
				System.out.print( ( i == 1 && j == matrixB.length - 1 ) ? "\t=\t" : "\t\t"); 
			}
			System.out.println(); //add new line
		}
		
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b) {

		double[][] c = new double[a.length][b.length];
		System.out.println("A:" + a.length + "B:" + b.length);
		//the two matrices must have the same dimensions
		if(a.length != b.length) {
			System.out.println("Run the program again the matrices do not have the same dimensions!");
		}
		else {  
			//add the 2 matrices 
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c.length; j++) {
					c[i][j] = a[i][j] + c[i][j];
				}
			}
			
		}
		
		return c;
	}
	
	public static double[][] getMatrix(String keyboardInput) {
	
		int numberOfNumbers = 0;
		
		//check how many numbers are in the array
		Scanner countNumbers = new Scanner(keyboardInput);
		while(countNumbers.hasNextDouble()){
				countNumbers.nextDouble();
			numberOfNumbers++;
		}
		
		//calculate how long the matrix array should be
		int x = (int)Math.sqrt(numberOfNumbers); 
		double[][] matrix = new double[x][x];
		
		countNumbers = new Scanner(keyboardInput);
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = countNumbers.nextDouble();
			}
		}
		return matrix;
	}

}
