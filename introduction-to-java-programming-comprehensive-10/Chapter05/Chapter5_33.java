/** 
 * (Perfect number) A positive integer is called a perfect number if it is equal to
 * the sum of all of its positive divisors, excluding itself. For example, 6 is the first
 * perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2
 * + 1. There are four perfect numbers less than 10,000. Write a program to find all
 * these four numbers.
 */
 
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
 	
 		int findPositiveIntUpTo = 10000;
		String stringNumbers = "";
		
		for(int i = 6; i<findPositiveIntUpTo; i++){
		
			int sumOfAllDiv = 0; 
			String divNumbers = "1";
			 
			for(int j = 2; j<i; j++){
				
				if(i % j == 0) {
					divNumbers += " + " + j;
					sumOfAllDiv += j;
				}
				
			}//end for j
			
			if(sumOfAllDiv + 1 == i) {
				stringNumbers += i + " = " + divNumbers + "\n";
			}
			else {}
		
		}//end for i
		
		System.out.println("The perfect numbers less than " + findPositiveIntUpTo + " are: " );
		System.out.println(stringNumbers);

	}
}
