/** (Math: combinations) Write a program that prompts the user to enter 10 integers
  * and displays all combinations of picking two numbers from the 10.
  */

import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] list1;
		String userInput;
		
		System.out.print("Enter 10 integers: "); 
		userInput = input.nextLine();
		list1 = getListNumbers(userInput);
		
		System.out.println("All combinations of picking two numbers from the 10 are:");
		for (int i = 0; i < list1.length; i++) {
			for (int j = i; j < list1.length; j++) {
				System.out.println(list1[i] + " - " + list1[j]);
			}
		} 		 
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
