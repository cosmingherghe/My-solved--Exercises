/**
*	(The MyTriangle class) Create a class named MyTriangle that contains the following two methods:
*	
*	/** Return true if the sum of any two sides is greater than the third side. */
*	public static boolean isValid(double side1, double side2, double side3)
*	
*	/** Return the area of the triangle. */
*	public static double area(double side1, double side2, double side3)
*	
*	Write a test program that reads three sides for a triangle and computes the area if
*	the input is valid. Otherwise, it displays that the input is invalid. 
*/

public class MyTriangle {
	public static void main(String[] args) {

		double side1 = 2;
		double side2 = 3;
		double side3 = 4;
		
		if( isValid(side1, side2, side3) ) {
			System.out.print("The input is invalid.");
		}
		else {
			System.out.printf("Area: %f", area(side1, side2, side3) );
		}
	}
	
	/** Return the area of the triangle. */
	public static double area(double side1, double side2, double side3){
		double hp = (side1 + side2 + side3) / 2; // compute half the perimeter
		return Math.sqrt(hp * (hp-side1) * (hp-side2) * (hp-side3)); //compute area
	}
	
	/** Return true if the sum of any two sides is greater than the third side. */
	public static boolean isValid(double side1, double side2, double side3) {
		return (side1 > side2 + side3) || (side2 > side1 + side3) || (side3 > side1 + side2);
	}
	
	
}
