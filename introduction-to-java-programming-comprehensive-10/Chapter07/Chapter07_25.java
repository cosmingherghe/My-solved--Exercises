/** (Algebra: solve quadratic equations) Write a method for solving a quadratic
*   equation using the following header:
*   
*   public static int solveQuadratic(double[] eqn, double[] roots)
*   
*   The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the
*   array eqn and the real roots are stored in roots. The method returns the number
*   of real roots. See Programming Exercise 3.1 on how to solve a quadratic
*   equation.
*   Write a program that prompts the user to enter values for a, b, and c and displays
*   the number of real roots and all real roots.
 */
import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {
		double[] roots = new double[2];
		double[] eqn = new double[3];
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value for a, b and c: ");
		
		eqn[0] = input.nextDouble();
		eqn[1] = input.nextDouble();
		eqn[2] = input.nextDouble();
		
		int numberOfRoots = solveQuadratic(eqn, roots);
		displaysRealRoots(roots, numberOfRoots);
	}
	
	public static int solveQuadratic(double[] eqn, double[] roots) {
		int numberOfRoots;
		double a, b, c;
		a = eqn[0];
		b = eqn[1];
		c = eqn[2];
	
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		
		if(discriminant < 0){
			numberOfRoots = 0;
		}
		else if(discriminant == 0) {
			roots[0] = -b/(2*a);
			numberOfRoots = 1;
		}
		else {
			roots[0] =  (-b - Math.pow(discriminant, 0.5)) / (2*a); 
			roots[1] =  (-b + Math.pow(discriminant, 0.5)) / (2*a);
			numberOfRoots = 2;
		}
		return numberOfRoots;
	}
			
	public static void displaysRealRoots(double[] roots, int numberOfRoots ){
		if( (numberOfRoots == 0) ){
			System.out.println("The equation has no real roots.");
		}
		else if( numberOfRoots == 1) { 
			System.out.println("The root of the quadratic equation is: " + roots[0] );
		}
		else {
			System.out.println("The two roots of the quadratic equation are: "
					 + roots[0] + " and " + roots[1] + "." );
		}
	}

}
