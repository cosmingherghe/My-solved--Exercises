/*

(The Location class) Design a class named Location for locating a maximal value and its location in a two-dimensional array. The class contains public data fields row, column, and maxValue that store the maximal value and its indices in a two-dimensional array with row and column as int types and maxValue as a double type.
Write the following method that returns the location of the largest element in a two-dimensional array:
public static Location locateLargest(double[][] a)
The return value is an instance of Location. Write a test program that prompts the user to enter a two-dimensional array and displays the location of the largest element in the array. 

*/
 
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
    	 
    	Location arr1 = new Location();
    	 arr1.locateLargest(createTwoDimensionalArray());
    	 
    }
    
    public static double[][]  createTwoDimensionalArray() {
    	
    	int row, column;
    	double[][] array;
    	Scanner input = new Scanner(System.in);
    	
		System.out.println("Enter the number of rows and columns in the array:");
		row = input.nextInt();
		column = input.nextInt();
		array = new double[row][column];
		
		System.out.println("\nEnter the array:");
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
		return array;
		
	}
}



class Location {
 
	private int row = 0;
	private int column = 0;
	private double maxValue;

	public void locateLargest(double[][] a) {
		
		this.maxValue = a[0][0];
		
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a.length; column++) {
				if(a[row][column] > this.maxValue) {
					this.maxValue = a[row][column];
					this.row = row;
					this.column = column;	
				}
			}
		}
		
		System.out.println("\nThe location of the largest element is " + maxValue + " at (" + row + ", " + column + ")");
		
	}
	
	 
}
