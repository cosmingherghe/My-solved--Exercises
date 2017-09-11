/**
*       (Occurrences of a specified character) Write a method that finds the number of
*       occurrences of a specified character in a string using the following header:
*       
*       public static int count(String str, char a)
*       
*       For example, count("Welcome", 'e') returns 2. Write a test program that
*       prompts the user to enter a string followed by a character and displays the number
*       of occurrences of the character in the string.
*/

import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a String fallowed by a character: \n=> ");
		String usermsg = input.nextLine();
		
		System.out.println( count(usermsg, usermsg.charAt(usermsg.length() -1)) );
	}
	
	public static int count(String str, char a) {
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == a)
				count++;
		}
		return count - 1;
	}
}
