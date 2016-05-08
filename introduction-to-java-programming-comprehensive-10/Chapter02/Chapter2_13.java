import java.util.Scanner;

public class Chapter2_13 {

	/**
	 * 	Exercise 2.13
	 * 	 Physics: finding runway length)
	 */
	 
	public static void main (String[] args)	{

		double account_value = 0;
		 
		Scanner input = new Scanner(System.in);

		System.out.print( "Enter the monthly saving amount and for how many months: ");

		double amount =  input.nextDouble();
		double months = input.nextDouble();

		for( int i = 0; i<months; i++) {
			
			account_value = amount * (1 + 0.00417);
		}
		
		System.out.println( "After the " + months  + " months, the account value is " + account_value );
	}
}
