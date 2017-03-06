//        The right-angle point is placed at (0, 0), and the other two points
//        are placed at (200, 0), and (0, 100). Write a program that prompts the user to enter
//        a point with x- and y-coordinates and determines whether the point is inside the
//        triangle.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

//        The right-angle point is placed at (0, 0), and the other two points
//        are placed at (200, 0), and (0, 100).
        double xA = 0;
        double yA = 0;
        double xB = 200;
        double yB = 0;
        double xC = 0;
        double yC = 100;

        //Area of main triangle
        double areaP = Math.abs(xA*yC - xA*yB + xB*yA - xC*yA + xC*yB - xB*yC) / 2;

        //Calculating areas of three triangles (triangle's points with the given x- and y-coordinates)
        double areaA = Math.abs(x*yC - x*yB + xB*y - xC*y + xC*yB - xB*yC) / 2;
        double areaB = Math.abs(xA*yC - xA*y + x*yA - xC*yA + xC*y - x*yC) / 2;
        double areaC = Math.abs(xA*y - xA*yB + xB*yA - x*yA + x*yB - xB*y) / 2;


        //if areaA > 0 && areaB > 0 && areaC > 0 , the point is in one of the three sides of the triangle, not in the triangle.
        // and if areaP == (areaA + areaB + areaC) the point is in the triangle
        System.out.println( "The point is " + (areaP == (areaA + areaB + areaC)) &&  areaA > 0 && areaB > 0 && areaC > 0
                            ? "in the triangle "
                            : "not in the triangle ");
    }
}
