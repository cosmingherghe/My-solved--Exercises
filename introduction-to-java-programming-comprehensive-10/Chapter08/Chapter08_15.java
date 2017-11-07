/**
(Geometry: same line?) Programming Exercise 6.39 gives a method for testing
whether three points are on the same line.
Write the following method to test whether all the points in the array points are
on the same line.

public static boolean sameLine(double[][] points)

Write a program that prompts the user to enter five points and displays whether
they are on the same line.
*/
import java.util.*;

public class SameLine { 
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[][] fivePoints = new double[5][2];
		
		System.out.print("Enter five points: ");  
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) { 
				double value = input.nextDouble(); 
				fivePoints[i][j] = value;
			} 
		}
		
		System.out.println( (sameLine(fivePoints) ) ? "The five points are on the same line" : "The five points are not on the same line");
	}

	public static boolean sameLine(double[][] points) {
		int sameLine = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				sameLine += (points[i][j] > 0) ? 1 : 0 ;
			} 
		} 
		return (sameLine == 0 || sameLine == 10);
	}
	
	
}
