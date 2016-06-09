import java.util.Scanner;

public class Chapter3_03 {

	/**
	 * Algebra: solve 2 * 2 linear equations
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
 		
		System.out.print("Enter numbers for a, b, c, d, e, f: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		//calculating x, y and rounding to 2 digits 
		double x = (double)Math.round( ( (e*d - b*f) / (a*d - b*c) )*100)/100;
		double y = (double)Math.round( ( (a*f - e*c) / (a*d - b*c) )*100)/100;
		
		System.out.println( ( (a*d - b*c) == 0 ) 
							? "The equation has no solution." 
							: "x is " + x + " and y is " + y );

	}

}
