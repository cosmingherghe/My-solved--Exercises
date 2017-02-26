import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	// A point is in the rectangle if its horizontal distance to (0, 0) 
    	// is less than or equal to 10 / 2 and its vertical distance to (0, 0) 
    	// is less than or equal to 5.0 / 2.
	double x1 = 5;
	double y1 = 2.5;
	double x2 = -5;
	double y2 = -2.5;
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a point with two coordinates e.g. 4 5:");
	double point1 = input.nextDouble();
	double point2 = input.nextDouble();
	
	if( point1 < x1 && point1 > x2 && point2 < y1 && point2 > y2 ) {
		System.out.print("Point (" + point1 + ", " + point2 + ") is in the rectangle.");
	} else {
		System.out.print("Point (" + point1 + ", " + point2 + ") is not in the rectangle.");
	}
  
    }
}
