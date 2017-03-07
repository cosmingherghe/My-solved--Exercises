//        (Geometry: two circles) Write a program that prompts the user to enter the center
//        coordinates and radii of two circles and determines whether the second circle is
//        inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle2 is
//        inside circle1 if the distance between the two centers 6 = |r1 - r2| and circle2
//        overlaps circle1 if the distance between the two centers <= r1 + r2.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("EEnter circle1's center x-, y-coordinates, and radius: ");
        double c1x = input.nextDouble();
        double c1y = input.nextDouble();
        double c1radius = input.nextDouble();

        System.out.print("EEnter circle2's center x-, y-coordinates, and radius: ");
        double c2x = input.nextDouble();
        double c2y = input.nextDouble();
        double c2radius = input.nextDouble();

        //distance between the two centers
        double distance = Math.sqrt(Math.pow( (c2x-c1x),2) + Math.pow( (c2y-c1y),2) );

        if(distance <= Math.abs(c1radius - c2radius)){
            System.out.println("circle2 is inside circle1");
        } else if(distance <= (c1radius + c2radius)) {
            System.out.println("circle2 overlaps circle1");
        } else {
            System.out.println("circle2 does not overlap circle1");
        }

    }
}
