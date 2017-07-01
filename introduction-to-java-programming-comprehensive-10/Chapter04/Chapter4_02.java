import java.util.Scanner;

public class  GreatCircleDistance {
  public static void main(String[] args) {

	double lat1, lat2, lon1, lon2;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter point 1 (latitude and longitude) in degrees: "); 
	lat1 = input.nextDouble();
	lon1 = input.nextDouble();
	
	System.out.print("Enter point 2 (latitude and longitude) in degrees: "); 
	lat2 = input.nextDouble();
	lon2 = input.nextDouble();
	
	double pointsDistance = 6371.01 * Math.acos( Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(lon1) - Math.toRadians(lon2)) );
	
	System.out.println( "The distance between the two points is :" + pointsDistance );
	 
  }
}
