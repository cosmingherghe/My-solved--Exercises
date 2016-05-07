import java.util.Scanner;


public class Chapter2_05 {

	/**
	 * Financial application: calculate tips
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the subtotal and a gratuity % rate: ");

		double subtotal = input.nextDouble();
		double gratuity_rate = input.nextDouble() * 0.1;
		
		System.out.println( "The gratuity is " + subtotal/gratuity_rate + " and total is " + ( subtotal + gratuity_rate ) );
		
	}

}
