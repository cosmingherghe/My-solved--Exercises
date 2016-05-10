import java.util.Scanner;

public class Chapter2_22 {
	/**
	 *		Financial application: monetary units)
	 *
	 *		Enter the input as an integer whose last two digits represent the cents. For example, the input 1156 represents 11 dollars and 56 cents
	 */
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter an amount in double, for example 11.56: ");
	double amount = input.nextDouble();
	
	double remainingAmount = amount * 100;
	
	// Find the number of one dollars
	int numberOfOneDollars = (int)remainingAmount/100;
	remainingAmount = remainingAmount % 100;
	
	// Find the number of quarters in the remaining amount
	int numberOfQuarters = (int)remainingAmount / 25;
	remainingAmount = remainingAmount % 25;
	
	// Find the number of dimes in the remaining amount
	int numberOfDimes = (int)remainingAmount / 10;
	remainingAmount = remainingAmount % 10;
	
	// Find the number of nickels in the remaining amount
	int numberOfNickels = (int)remainingAmount / 5;
	remainingAmount = remainingAmount % 5;
	
	// Find the number of pennies in the remaining amount
	int numberOfPennies = (int)remainingAmount;
	
	// Display results
	System.out.println("Your amount " + amount + " consists of");
	System.out.println(" " + numberOfOneDollars + " dollars");
	System.out.println(" " + numberOfQuarters + " quarters ");
	System.out.println(" " + numberOfDimes + " dimes");
	System.out.println(" " + numberOfNickels + " nickels");
	System.out.println(" " + numberOfPennies + " pennies");

	}
}
