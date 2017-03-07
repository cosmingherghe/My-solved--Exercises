//         (Geometry: two rectangles) Write a program that prompts the user to enter the
//        center x-, y-coordinates, width, and height of two rectangles and determines
//        whether the second rectangle is inside the first or overlaps with the first, as shown
//        in Figure 3.9. Test your program to cover all cases..

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double r1x = input.nextDouble();
        double r1y = input.nextDouble();
        double r1width = input.nextDouble();
        double r1height = input.nextDouble();

        //finding the corner points of rectangle 1
        double xAB = r1x - (r1width/2.0);
        double xDC = r1x + (r1width/2.0);
        double yAD = r1y - (r1height/2.0);
        double yBC = r1y + (r1height/2.0);

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double r2x = input.nextDouble();
        double r2y = input.nextDouble();
        double r2width = input.nextDouble();
        double r2height = input.nextDouble();

        double xEF = r2x - (r2width/2.0);
        double xHG = r2x + (r2width/2.0);
        double yEH = r2y - (r2height/2.0);
        double yFG = r2y + (r2height/2.0);


        // determines whether the second rectangle is inside the first or overlaps with the first
        if(xEF>xAB && xDC>xHG && yEH>yAD && yBC>yFG) {
            System.out.println("r2 is inside r1");
        }else if( (xEF=<xAB && xHG =<xAB) || (yEH=<yAD && yFG=>yAD) ) {
            System.out.println("r2 overlaps r1");
        }else {
            System.out.println("r2 does not overlap r1");
        }

    }
}
