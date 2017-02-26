import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	// circle centered at (0, 0)
	double x1 = 0;
	double y1 = 0;
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a point with two coordinates e.g. 4 5:");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	double answer = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) );
	
	if(answer <= 10) {
		System.out.print("Point (" + x2 + ", " + y2 + ") is in the circle.");
	} else {
		System.out.print("Point (" + x2 + ", " + y2 + ") is not in the circle.");
	}
  
    }
}
