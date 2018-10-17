/*
(Algebra: quadratic equations) Design a class named QuadraticEquation for
a quadratic equation ax2 + bx + c = 0. The class contains:
■■ Private data fields a, b, and c that represent three coefficients.
■■ A constructor with the arguments for a, b, and c.
■■ Three getter methods for a, b, and c.
■■ A method named getDiscriminant() that returns the discriminant, which
is b2 - 4ac.
■■ The methods named getRoot1() and getRoot2() for returning two roots
of the equation
These methods are useful only if the discriminant is nonnegative. Let these methods
return 0 if the discriminant is negative.
Draw the UML diagram for the class then implement the class. Write a test program that prompts the user to enter values for a, b, and c and displays the result
based on the discriminant. If the discriminant is positive, display the two roots. If
the discriminant is 0, display the one root. Otherwise, display “The equation has
no roots.” See Programming Exercise 3.1 for sample runs
*/

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	 
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter three numbers (values for a, b, and c): ");
    	
    	QuadraticEquation equ1 = new QuadraticEquation( scan.nextDouble(), scan.nextDouble(), scan.nextDouble() );

    	if( equ1.getDiscriminant() < 0) 
			System.out.println("The equation has no real roots.");
		else if( BigDecimal.ZERO.compareTo(BigDecimal.valueOf( equ1.getDiscriminant() )) == 0) {
			System.out.println("The root of the quadratic equation is: " + equ1.getRoot1() ); 
		}
		else {
			System.out.println("The two roots of the quadratic equation are: "
					 + equ1.getRoot1() + " and " + equ1.getRoot2() + "." );
		}
    	 
    	//System.out.printf("\nResults \nRoot1 = %.2f \nRoot2 = %.2f\n", equ1.getRoot1(), equ1.getRoot2() ); 
          
    }
}

class QuadraticEquation {

	private double a, b, c; 
	
	public QuadraticEquation(double a, double b, double c) { 
		this.a = a;
		this.b = b;
		this.c = c;
	}

	//Three getter methods for a, b, and c.
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}
	
	//returns the discriminant
	public double getDiscriminant() {
		return Math.pow(b, 2) - (4 * a * c);
	}
	
	public double getRoot1() {
		return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	}
	
	public double getRoot2() {
		System.out.println(a + " " + b + " " + c);
		return (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	}
	
}
