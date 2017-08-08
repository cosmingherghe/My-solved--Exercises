/** 
 *      (Financial application: loan amortization schedule)
 *      The monthly payment for a given loan pays the principal and the interest.
 *      The monthly interest is computed by multiplying the monthly interest rate
 *      and the balance (the remaining principal). The principal paid for
 *      the month is therefore the monthly payment minus the monthly interest.
 *      Write a program that lets the user enter the loan amount,number of years,
 *      and interest rate and displays the amortization schedule for the loan.
 *      loan. 
 */

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();
				
		System.out.print("Enter number of years as an integer: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Enter Annual Interest Rate, for example, 3.7: ");
		double annualInterestRate = input.nextDouble();
		 
		//Calc mortgage
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
				(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12))); 
		double totalPayment = monthlyPayment * numberOfYears * 12; 
		
		double interest; 
		double principal; 
		
		//Print info
		System.out.printf("Monthly Payment: %.2f \n", monthlyPayment);
		System.out.printf("Total Payment: %.2f \n", totalPayment );

		System.out.println("Payment# \tInterest \tPrincipal \tBalance \n");
		
		for(int i = 1; i < numberOfYears * 12 + 1; i++){
		
			interest = monthlyInterestRate * loanAmount;
			principal = monthlyPayment - interest;
			loanAmount -= principal;
			
			System.out.printf( i + "\t\t %.2f \t\t %.2f \t %.2f \n", interest, principal, loanAmount );
		}
			
	}
}
