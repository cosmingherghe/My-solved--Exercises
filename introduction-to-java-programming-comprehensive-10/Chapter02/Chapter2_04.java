import java.util.*;

public class Chapter2_04 {

	/**
	 * Convert pounds into kilograms
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number in pounds: ");

		double pounds = input.nextDouble();
		
		System.out.println( pounds + " pounds is " + pounds * 0.454 + " kilograms.");
	}

}
