/** (Sort characters in a string) Write a method that returns a sorted string using the
  * following header:
  *   
  * public static String sort(String s)
  * 
  * For example, sort("acb") returns abc. Write a test program that prompts the user to enter a string and displays the sorted
  * string.
  */

import java.util.*;
import java.lang.*;

public class HelloWorld {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);  
		String userInput;
		
		System.out.print("Enter  a string of characters): "); 
		userInput = input.nextLine();
		
		System.out.print( sort(userInput) ); 
	}
	
	public static String sort(String s) { 
		String outPut = "";
		char[] charArray = s.toCharArray();
		charArray = selectionSort(charArray);
		
		for (int i = 0; i < charArray.length; i++) 
			outPut += "" + Character.toString(charArray[i]);
		
		return outPut;
	}
	
	public static char[] selectionSort(char[] list) {
	
		for (int i = 0; i < list.length - 1; i++) {
		
			// Find the minimum in the list[i..list.length-1]
			char currentMin = list[i];
			int currentMinIndex = i;
	
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
	
			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
		return list;
	}
}
