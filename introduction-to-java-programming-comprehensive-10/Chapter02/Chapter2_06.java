import java.util.Scanner;


public class Chapter2_06 {

	/**
	 * Sum the digits in an integer 
	 * 	- a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");

		int entire_number = input.nextInt(); //reading the number
		
		int first_digit = entire_number/100; //getting the first digit
		
		int second_digits = entire_number%100; //getting the second digits
		int second_digit = second_digits/10; //getting the second digit
		
		int last_digit = second_digits%10; //getting the last digit
		
		int sum = first_digit + second_digit + last_digit;
		
		System.out.println( "The sum of the digits is: " + sum );

	}
}