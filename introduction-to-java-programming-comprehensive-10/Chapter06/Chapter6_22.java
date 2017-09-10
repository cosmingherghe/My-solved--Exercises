/**
*	(Phone keypads) The international standard letter/number mapping for telephones
*	is shown in Programming Exercise 4.15. Write a method that returns a number,
*	given an uppercase letter, as follows:
*	
*	int getNumber(char uppercaseLetter)
*	
*	Write a test program that prompts the user to enter a phone number as a string.
*	The input number may contain letters. The program translates a letter (uppercase
*	or lowercase) to a digit and leaves all other characters intact
*/

import java.io.*;
import java.lang.*;
import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		
		System.out.print( getFullNumber( input.nextLine() ) );
	}
	
	public static String getFullNumber(String s) {
		char letter;
		String fullNumber = "";
		
		for(int i = 0; i < s.length(); i++){
		
			letter = s.charAt(i);
			if( (letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z') ){
				fullNumber += getNumber(letter);
			}
			else {
				fullNumber += letter;
			}
		}
	}
	
	public static int getNumber(char letter) {
		int telephoneButtonNumber = 0;
		switch(letter) {
	  	    case 'A': 
	  	    case 'B':
	  	    case 'C':
	  	    case 'a': 
	  	    case 'b':
	  	    case 'c':
	  	    		telephoneButtonNumber = 2;
	                     break;
	            case 'D':
	            case 'E':
	            case 'F':
	            case 'd':
	            case 'e':
	            case 'f':	telephoneButtonNumber = 3;
	                     break;
	            case 'G':
	            case 'H':
	            case 'I': 
	            case 'g':
	            case 'h':
	            case 'i':	telephoneButtonNumber = 4;
	                     break;
	            case 'J':
	            case 'K':
	            case 'L':
	            case 'j':
	            case 'k':
	            case 'l': 	telephoneButtonNumber = 5;
	                     break;
	            case 'M':
	            case 'N':
	            case 'O':
	            case 'm':
	            case 'n':
	            case 'o':	telephoneButtonNumber = 6;
	                     break;
	            case 'P':
	            case 'Q':
	            case 'R':
	            case 'S':
	            case 'p':
	            case 'q':
	            case 'r':
	            case 's': 	telephoneButtonNumber = 7;
	                     break;
	            case 'T':
	            case 'U':
	            case 'V':
	            case 't':
	            case 'u':
	            case 'v': 	telephoneButtonNumber = 8;
	                     break;
	            case 'W':
	            case 'X':
	            case 'Y':
	            case 'Z':
	            case 'W':
	            case 'x':
	            case 'y':
	            case 'z': 	telephoneButtonNumber = 9;
	                     break;
  		}

		return telephoneButtonNumber;
	}	
}
