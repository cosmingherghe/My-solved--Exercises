import java.util.Scanner;

public class Chapter2_13 {

	/**
	 * 	Exercise 2.13
	 * 	 - a savings account with the annual interest rate 5%
	 */
	 
	public static void main (String[] args)	{

		Scanner input = new Scanner(System.in);

		System.out.print( "Enter the monthly saving amount and for how many months: ");

		double amount =  input.nextDouble();
		double months = input.nextDouble();
		
		double account_value = amount * (1 + 0.00417); //calculating first month

		for( int i = 1; i<months; i++) { //calculating rest of months 
			
			account_value  = (account_value + amount) * (1 + 0.00417);
		}
		
		System.out.println( "After the " + months  + " months, the account value is " + account_value );
	}
}
