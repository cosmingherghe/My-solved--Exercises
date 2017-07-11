
import java.util.*;

public class HelloWorld {
  public static void main(String[] args) {
  
  	Scanner input = new Scanner(System.in);
	
	System.out.print( "Enter an amount in double, for example 11.56: ");
	
	String amount = input.nextLine();
	//substring from index 0 to .
	String numberOfOneDollars = amount.substring(0, amount.lastIndexOf("."));
	//substring from . to the end 
	String numberOfDecimals = amount.substring(amount.lastIndexOf(".") + 1);

	int numberOfQuarters =  Integer.parseInt( numberOfDecimals ) / 25;
	int remainingAmount = Integer.parseInt( numberOfDecimals ) % 25;
	
	int numberOfDimes = remainingAmount / 10;
	remainingAmount  = remainingAmount % 10;
	
	int numberOfNickels = remainingAmount / 5;
	int numberOfPennies =  remainingAmount % 5;
  
	System.out.println("Your amount " + amount + " consists of");
	System.out.println(" " + numberOfOneDollars + " dollars");
	System.out.println(" " + numberOfQuarters + " quarters ");
	System.out.println(" " + numberOfDimes + " dimes");
	System.out.println(" " + numberOfNickels + " nickels");
	System.out.println(" " + numberOfPennies + " pennies");
  
  }
}
