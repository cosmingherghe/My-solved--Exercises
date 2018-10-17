/*
(Geometry: intersecting point) Suppose two line segments intersect. The two endpoints for the first line segment are (x1, y1) and (x2, y2) and for the second line segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
these four endpoints and displays the intersecting point. As discussed in Programming Exercise 3.25, the intersecting point can be found by solving a linear equation. Use the LinearEquation class in Programming Exercise 9.11 to solve this equation. See Programming Exercise 3.25 for sample runs.
*/

import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	 
        
    	LinearEquation equation = new LinearEquation( getIntersectingPoints() );

    	System.out.printf( !equation.isSolvable()
							? "The equation has no solution."
							: "\nx = %.2f \ny = %.2f ", equation.getX(), equation.getY() ); 
    	 
    }
    
    public static double[] getIntersectingPoints() {
    	
		Scanner input = new Scanner(System.in);
		double[] x = new double[4];
		double[] y = new double[4];
		double[] points;
		
		for (int i = 1, j = 0; i <= x.length; i++, j++) {
			System.out.println("Enter numbers for x"+i+", y"+i+": "); 
			x[j] = input.nextDouble(); 
			y[j] = input.nextDouble();
		}
		
        double a = y[0] - y[1];
        double b = x[0] - x[1];
        double c = y[2] - y[3];
        double d = x[2] - x[3];
        double e = (y[0]-y[1]) * x[0] - (x[0]-x[1]) * y[0];
        double f = (y[2]-y[3]) * x[2] - (x[2]-x[3]) * y[2];
		
        points = new double[] { a, b, c , d, e, f};
        
		return points;
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
	
	public LinearEquation(double p[]) {
		this.a = p[0];
		this.b = p[1];
		this.c = p[2];
		this.d = p[3];
		this.e = p[4];
		this.f = p[5];
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
