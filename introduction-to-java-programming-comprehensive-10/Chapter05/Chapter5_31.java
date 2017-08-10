/** 
 * Write a program that prompts the user to enter an amount (e.g., 10000), the
 * annual percentage yield (e.g., 5.75), and the number of months (e.g., 18) and
 * displays a table.
*/


import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		double finalAmount = 0;
		double amount, annualInterest;
		int numberOfMonths; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount (e.g., 10000): ");
		amount = input.nextDouble(); 
		
		System.out.print("Enter the annual interest rate (e.g., 5.75 for 5.75%): ");
		annualInterest = input.nextDouble();
		
		System.out.print("Enter the number of months (e.g., 18): ");
		numberOfMonths= input.nextInt();
		 
		
		System.out.println("\n\nAfter 1 month, the CD is worth");
 		
 		finalAmount += (1 + (annualInterest/1200)) * amount; 
		System.out.printf( "%g + %g * %.2f / 1200 = %.2f \n\n", amount, amount, annualInterest, finalAmount );
		amount = finalAmount;
		finalAmount = 0;
		
	  	for(int i= 2; i <= numberOfMonths; i++) {
		  
			System.out.println("After " + i + " months, the CD is worth"); 
			finalAmount += (1 + annualInterest/1200) * amount;  
			 
			System.out.printf( "%.2f + %.2f * %.2f / 1200 = %.2f \n\n", amount, amount, annualInterest, finalAmount );
			amount = finalAmount;
			finalAmount = 0;
		}

	}
}
