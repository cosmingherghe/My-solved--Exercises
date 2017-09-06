/**
*	(Palindrome integer) Write the methods with the following headers
*	// Return the reversal of an integer, i.e., reverse(456) returns 654
*	public static int reverse(int number)
*	// Return true if number is a palindrome
*	public static boolean isPalindrome(int number)
*	Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself. 
*	Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome
*/

import java.util.*;

public class PalindromeInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.println("Is " + number + " a palindrome? " + " \n Answer: " + (isPalindrome(number)) );
	}
	
	public static int reverse(int number) {
		int reverse = 0;

		while(number != 0) {
			reverse = reverse * 10 + number % 10;
			number /= 10;
		}
		
		return reverse;
	}
	
	public static boolean isPalindrome(int number) {
		if(number == reverse(number)) 
			return true; 
		else 
			return false;  
	}

}
