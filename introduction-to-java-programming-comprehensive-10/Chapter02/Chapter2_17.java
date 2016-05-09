import java.util.Scanner;

public class Chapter2_17 {
	/**
	 *		Geometry: area of a hexagon
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print( "Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double temperature =  input.nextDouble();

		System.out.print( "Enter the wind speed (>=2) in miles per hour: ");	
		double wind_speed = input.nextDouble();
		
		System.out.println( "The wind chill index is: " + 
							( 35.74 + 0.6215 * temperature - 35.75 * Math.pow(wind_speed, 0.16) + 0.4275 * temperature * Math.pow(wind_speed, 0.16) ) );
	}
}