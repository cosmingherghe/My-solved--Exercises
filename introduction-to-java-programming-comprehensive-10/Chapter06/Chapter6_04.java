/**
*       (Display an integer reversed) Write a method with the following header to display
*       an integer in reverse order:
*       public static void reverse(int number)
*       For example, reverse(3456) displays 6543. Write a test program that prompts
*       the user to enter an integer and displays its reversal.
*/

import java.util.*;

public class IntegerReversed {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.println("The integer in reverse order is: " + reverseInt(number) );
	}
	
	public static int reverseInt(int number) {
		int reverse = 0;
		while(number != 0) {
			reverse = reverse * 10 + number % 10;
			number /= 10;
		}
		return reverse;
	}

}
