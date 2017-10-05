import java.util.Arrays;
import java.util.Scanner;

// (Eliminate duplicates) Write a method that returns a new array by eliminating the
// duplicate values in the array using the following method header:
//	
// public static int[] eliminateDuplicates(int[] list)
//
// Write a test program that reads in ten integers, invokes the method, and displays
// the result. 

public class EliminateDuplicates {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] userInput = new int[10];
		
		System.out.print("Enter ten numbers: ");
		
		for (int i = 0; i < 10; i++) {
			userInput[i] = input.nextInt();
		}
		
		int[] noDuplicates = eliminateDuplicates(userInput);
		String distinctNumbers = displayDistinctNumbers(noDuplicates);
		
		System.out.println("The minimum value is: " + distinctNumbers);
	}
	
	public static String displayDistinctNumbers(int... list) {
		String stringOfNumbers = "";
		
		for (int i = 0; i < list.length; i++) {
			stringOfNumbers += list[i] + " ";
		}
		
		return stringOfNumbers;
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		
		int[] numbers = new int[list.length];
		int numbersKey = 0; 
		boolean match;
		
		for (int i = 0; i < list.length; i++) {
			match = true;
			
			for (int j = i + 1; j < list.length; j++) {
				if(list[i] == list[j])
					match = false;
			}
			
			if(match) {
				numbers[numbersKey] = list[i];
				numbersKey++;
			}
		}
  
		return Arrays.copyOfRange(numbers, 0, numbersKey); 
	} 

}
