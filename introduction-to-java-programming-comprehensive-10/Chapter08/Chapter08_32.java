/**
	  (Geometry: area of a triangle) Write a method that returns the area of a triangle
	  using the following header:

	  public static double getTriangleArea(double[][] points)

	  The points are stored in a 3-by-2 two-dimensional array points with points[0][0] 
	  and points[0][1] for (x1, y1). The triangle area can be computed using the
	  formula in Programming Exercise 2.19. The method returns 0 if the three points
	  are on the same line. Write a program that prompts the user to enter three points of
	  a triangle and displays the triangle's area. Here is a sample run of the program:

	  Enter x1, y1, x2, y2, x3, y3: 2.5 2 5 -1.0 4.0 2.0
	  The area of the triangle is 2.25

	  Enter x1, y1, x2, y2, x3, y3: 2 2 4.5 4.5 6 6
	  The three points are on the same line
*/

import java.util.Scanner;

public class AreaOfAtriangle { 

	public static void main(String[] args) {
 
		double[][] trianglePoints = getPoints();
		
		getTriangleArea(trianglePoints);
	}

	public static double getTriangleArea(double[][] points) {
		
		double area = ( points[0][0] * (points[1][1] - points[2][1]) + points[1][0] * (points[2][1] - points[0][1]) + points[2][0] * (points[0][1] - points[1][1]) )/2;

		System.out.println( "The area of the triangle is: " + Math.abs(area) );
	}
 
	public static double[][] getPoints() {
	
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][2]; 
		
		System.out.println( "Exemple three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4" +
							"\nEnter three points for a triangle: ");
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
			
				matrix[i][j] = input.nextDouble(); 
			}
		}
		System.out.println(); //a new line 
		return matrix;
	}
}
