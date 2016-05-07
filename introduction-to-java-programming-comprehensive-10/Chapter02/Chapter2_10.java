import java.util.Scanner;

public class Chapter2_10 {

	/**
	 *  Science: calculating energy 
	 * 	- calculates the energy needed to heat water from an initial temperature to a final temperature
	 */
	
	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of water in kilograms: ");
 		double M = input.nextDouble();
 		
		System.out.print("Enter the initial temperature: ");
 		double initialTemperature = input.nextDouble();

		System.out.print("Enter the final temperature: ");
 		double finalTemperature = input.nextDouble();
 		
 		double Q = M * (finalTemperature - initialTemperature) * 4184;
 		
		System.out.println( "The energy needed is " + Q );
	}
}