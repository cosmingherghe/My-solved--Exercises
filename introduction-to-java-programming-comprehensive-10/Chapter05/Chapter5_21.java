import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		double annualInterestRate = 5.0;
		double maxInterestRate = 8;
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of years as an integer: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();
		 
		System.out.println("Interest Rate \tMonthly Payment \tTotal Payment");
		
		while(maxInterestRate >= annualInterestRate) {
		
			double monthlyInterestRate = annualInterestRate / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
					(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12))); 
	
			double totalPayment = monthlyPayment * numberOfYears * 12; 
			
			System.out.printf(" %.3f%% \t %.2f \t\t %.2f \n", annualInterestRate, monthlyPayment, totalPayment);
			annualInterestRate += 0.125;
		}


	}
}
