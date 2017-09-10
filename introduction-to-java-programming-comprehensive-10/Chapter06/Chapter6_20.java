/**
*	(Count the letters in a string) Write a method that counts the number of letters in
*	a string using the following header:
*	public static int countLetters(String s)
*	Write a test program that prompts the user to enter a string and displays the number
*	of letters in the string.
*/

import java.io.*;
import java.lang.*;
import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter a String: ");
		
		System.out.printf( "The String has %d letters.", countLetters( input.nextLine() ) );
	}
	
	public static int countLetters(String s) {
		System.out.println(s);
		int countLetters = 0;
		char letter;
		for(int i = 0; i < s.length(); i++){
			letter = s.charAt(i);
			if( (letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z') )
				countLetters++;
		}
		return countLetters;
	}
}
