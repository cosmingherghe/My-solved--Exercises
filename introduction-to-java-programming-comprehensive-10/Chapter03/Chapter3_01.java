import java.util.*;

public class Chapter3_01 {

	/**
	 * Algebra: solve quadratic equations
	 * If the discriminant is positive, display two roots. 
	 * If the discriminant is 0 , display one root. Otherwise, display “The equationhas no real roots”.
	 */
	
	public static void main(String[] args) {
 		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value for a, b and c:");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		
		if(discriminant < 0){
			System.out.println("The equation has no real roots.");
		}
		else if(discriminant == 0) {
			System.out.println("The root of the quadratic equation is: " 
								        + (-b/(2*a)) );
		}
		else {
			System.out.println("The two roots of the quadratic equation are: "
					              + ( (-b - Math.pow(discriminant, 0.5)) / (2*a) ) + " and "
								        + ( (-b + Math.pow(discriminant, 0.5)) / (2*a) ) + "." 
								        );
		}
		 
	}
}
