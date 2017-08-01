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
		 
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
				(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12))); 
		double totalPayment = monthlyPayment * numberOfYears * 12; 
		
		System.out.printf("Monthly Payment: %.2f \n", monthlyPayment);
		System.out.printf("Total Payment: %.2f \n", totalPayment );

		System.out.println("Payment# \tInterest \tPrincipal \tBalance");		
	}
}
