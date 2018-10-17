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
    	System.out.println("Enter a, b, c, d, e, and f: ");
    	
    	LinearEquation equation = new LinearEquation( scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()  );

    	if(!equation.isSolvable()) 
			System.out.println("The equation has no solution."); 
		else
			System.out.printf("\nx = %.2f \ny = %.2f ", equation.getX(), equation.getY() ); 
    	  
    }
}

class LinearEquation {

	private double a, b, c, d, e, f;

	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}
	
	public boolean isSolvable() {
		return !(a * d - b * c == 0);
	}
	
	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}

	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
	
	 
}
