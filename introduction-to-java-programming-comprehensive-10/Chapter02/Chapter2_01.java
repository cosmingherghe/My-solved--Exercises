import java.util.*;

public class Chapter2_01 {

	/**
	 *  Convert Celsius to Fahrenheit
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter Celsius value: ");
		
		double celsius = input.nextDouble();
		
		System.out.println( celsius + " Celsius degree to Fahrenheit = " + ((9 / 5.0) * celsius + 32));
	}
}
