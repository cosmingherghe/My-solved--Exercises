/**

	(Geometry: intersecting point) Write a method that returns the intersecting point of
	two lines. The intersecting point of the two lines can be found by using the formula
	shown in Programming Exercise 3.25. Assume that (x1, y1) and (x2, y2) are the
	two points on line 1 and (x3, y3) and (x4, y4) are on line 2. The method header is

	public static double[] getIntersectingPoint(double[][] points)

	The points are stored in a 4-by-2 two-dimensional array points with
	(points[0][0], points[0][1]) for (x1, y1). The method returns the intersecting
	point or null if the two lines are parallel. Write a program that prompts
	the user to enter four points and displays the intersecting point. See Programming
	Exercise 3.25 for a sample run

*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double[][] lines = getPoints();

        getIntersectingPoint(lines);


    }

	public static double[] getIntersectingPoint(double[][] points) {

		double a = y[0][1] - y[1][1];
		double b = x[0][0] - x[1][0];
		double c = y[2][1] - y[3][1];
		double d = x[2][0] - x[3][0];
		double e = ( y[0][1] - y[1][1] ) * x[0][0] - ( x[0][0] - x[1][0] ) * y[0][1];
		double f = ( y[2][0] - y[3][1] ) * x[2][0] - ( x[2][0] - x[3][0] ) * y[2][0];

		double x = (e*d - b*f) / (a*d - b*c);
		double y = (a*f - e*c) / (a*d - b*c);

		// If the equation has no solutions, the two lines are parallel
		System.out.println( ( (a*d - b*c) == 0 ) ? "null" : "x is " + x + " and y is " + y );
	}

	public static double[][] getPoints() {
	
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[4][2]; 
		
		System.out.println("Enter (x1, y1) and (x2, y2) the two points on line 1 and (x3, y3) and (x4, y4) for line 2:");
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
			
				matrix[i][j] = input.nextDouble(); 
			}
		}
		System.out.println(); //a new line 
		return matrix;
	}
}
