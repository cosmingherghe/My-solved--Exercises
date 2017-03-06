import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers for x1, y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter numbers for x2, y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter numbers for x3, y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        System.out.print("Enter numbers for x4, y4: ");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Set a, b, c, d, e, f
        // ((y1 - y2) * x ) - ( (x1 - x2) * y) = ((y1 - y2) * x1 ) - ( (x1 - x2) * y1);
        // ((y3 - y4) * x ) - ( (x3 - x4) * y) = ((y3 - y4) * x3 ) - ( (x3 - x4) * y3);

        double a = y1 - y2;
        double b = x1 - x2;
        double c = y3 - y4;
        double d = x3 - x4;
        double e = (y1-y2) * x1 - (x1-x2) * y1;
        double f = (y3-y4) * x3 - (x3-x4) * y3;

        double x = (e*d - b*f) / (a*d - b*c);
        double y = (a*f - e*c) / (a*d - b*c);

        // If the equation has no solutions, the two lines are parallel
        System.out.println( ( (a*d - b*c) == 0 )
                ? "The equation has no solution."
                : "x is " + x + " and y is " + y );
    }
}
