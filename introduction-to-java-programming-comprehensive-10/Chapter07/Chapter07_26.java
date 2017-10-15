/** (Strictly identical arrays) The arrays list1 and list2 are strictly identical
  * if their corresponding elements are equal. Write a method that returns true if
  * list1 and list2 are strictly identical, using the following header:

  * public static boolean equals(int[] list1, int[] list2)

  * Write a test program that prompts the user to enter two lists of integers and 
  * displays whether the two are strictly identical. Here are the sample runs. Note that
  * the first number in the input indicates the number of the elements in the list. This
  * number is not part of the list
  */

import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] list1, list2;
		String userInput;
		
		System.out.print("Enter list1: "); 
		userInput = input.nextLine();
		list1 = getListNumbers(userInput);
		
		System.out.print("Enter list2: "); 
		userInput = input.nextLine();
		list2 = getListNumbers(userInput);
		
		if( areArraysStrictlyIdentical(list1, list2) )
			System.out.print("Two lists are strictly identical."); 
		else
			System.out.print("Two lists are not strictly identical."); 
	}

	public static boolean areArraysStrictlyIdentical(int[] list1, int[] list2) {
		boolean test = true;
		if(list1.length != list2.length)
			test = false; 

		for(int i = 0; i < list1.length; i++){ 
			if(list1[i] != list2[i])
				test = false;
		}
		 
		return test;
	}
	
	public static int[] getListNumbers(String userInput) { 
		int numberOfNumbers = 0;
		int[] numbers;

		//check how long the array should be
		Scanner countNumbers = new Scanner(userInput);
		while(countNumbers.hasNextInt()){
				countNumbers.nextInt();
			numberOfNumbers++;
		}

		//create the array
		countNumbers = new Scanner(userInput);
		numbers = new int[numberOfNumbers];

		//add values in the array
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = countNumbers.nextInt();
		} 

		return numbers;
	}
}
