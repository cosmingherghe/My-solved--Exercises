import java.util.Scanner;

public class Chapter2_12 {
	/**
	 * 	Exercise 2.12
	 * 	 Physics: finding runway length)
	 */
	 
	public static void main (String[] args)	{
		 
		Scanner input = new Scanner(System.in);
 
		System.out.print( "Enter speed and acceleration: ");

		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
		double runway = Math.pow(speed,2) / ( 2 * acceleration ); //calculating runway length
		
		System.out.println( "The minimum runway length for this airplane is " + runway );
	}
}