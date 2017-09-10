/**
*	(Check password) Some websites impose certain rules for passwords. Write a
*	method that checks whether a string is a valid password. Suppose the password
*	rules are as follows:
*	■ A password must have at least eight characters.
*	■ A password consists of only letters and digits.
*	■ A password must contain at least two digits.
*	Write a program that prompts the user to enter a password and displays Valid
*	Password if the rules are followed or Invalid Password otherwise.
*/

import java.io.*;
import java.lang.*;

public class HelloWorld {
	public static void main(String[] args) {
		passwordCheker("asdfgh12"); // test 1)
		passwordCheker("asdfgh1");  // test 2) 7 chars
		passwordCheker("asdfgh1$"); // test 3) 1 special char
		passwordCheker("asdfgh1a"); // test 4) only 1 digit
	}
	
	public static void passwordCheker(String password) {
		
		int pwlength = password.length(); 
		
		if(pwlength > 7){ //Check Password length
			int onlyLetterAndDigits = 0;
			int atLeastTwoDigits = 0;
			
			for(int i = 0; i < pwlength ;i++){
				char lORd = password.charAt(i);
				
				if( (lORd >= '0' && lORd <= '9') || (lORd >= 'a' && lORd <= 'z') || (lORd >= 'A' && lORd <= 'Z') ) {
					onlyLetterAndDigits++; //Check how many chars are only Letter and Digits
					
					if(lORd >= '0' && lORd <= '9')
						atLeastTwoDigits++; //Check how many Digits contains
				}
			}
			
			if( onlyLetterAndDigits == pwlength && atLeastTwoDigits > 1)
				System.out.println("Valid Password");
			else
				System.out.println("Invalid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
	}
}
