/**
 * Write a program that prompts the user to enter an amount (e.g., 100), the annual
 * interest rate (e.g., 5), and the number of months (e.g., 6) and displays the amount
 * in the savings account after the given month.
*/


import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		double finalAmount = 0;
		double amount, monthlyInterest;
		int numberOfMonths; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount (e.g., 100): ");
		amount = input.nextDouble(); 
		
		System.out.print("Enter the annual interest rate (e.g., 0.05 for 5%): ");
		monthlyInterest = input.nextDouble() / 12;
		
		System.out.print("Enter the number of months (e.g., 6): ");
		numberOfMonths= input.nextInt();
		 
		 
	  	for(int i= 0; i < numberOfMonths; i++) {
		  
			finalAmount += (1 + monthlyInterest) * amount; 
		} 
 
 		System.out.println("The amount in the savings account after " + numberOfMonths + " months is: $" + finalAmount + ".");
	}
}
