import java.util.*;

public class Chapter2_14 {

	/**
	 * 	Health application: computing BMI
	 * 	 - Body Mass Index (BMI) is a measure of health on weight.
	 *	 - a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. 
	 */
	 
	public static void main (String[] args)	{

		Scanner input = new Scanner(System.in);

		System.out.print( "Enter weight in pounds and height: ");

		double weight_pounds =  input.nextDouble();
		double height_inches = input.nextDouble();

		//one pound is 0.45359237 kilograms and one inch is 0.0254 meters; BMI = kg/m(2)
		double bmi = ( weight_pounds * 0.45359237 ) / Math.pow( ( height_inches * 0.0254 ), 2);
		
		System.out.println( BMI is " + bmi );
	}
}
