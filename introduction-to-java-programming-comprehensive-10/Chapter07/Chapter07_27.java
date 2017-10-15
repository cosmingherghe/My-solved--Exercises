/** (Identical arrays) The arrays list1 and list2 are identical if they have the
  * same contents. Write a method that returns true if list1 and list2 are identical,
  * using the following header:
  * 
  * public static boolean equals(int[] list1, int[] list2)
  * 

  * Write a test program that prompts the user to enter two lists of integers and displays
  * whether the two are identical. Here are the sample runs. Note that the first
  * number in the input indicates the number of the elements in the list. This number
  * is not part of the list.
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
		
		if( equals(list1, list2) )
			System.out.print("Two lists are identical."); 
		else
			System.out.print("Two lists are not identical."); 
	}

	public static boolean equals(int[] list1, int[] list2) {
		boolean test = true;
		boolean[] testArray = new boolean[list2.length];
		
		if(list1.length != list2.length)
			test = false;
		else {
			for(int i = 0; i < list1.length; i++){
				for(int j = 0; j < list1.length; j++){
					//if list1[j] was not found yet, testArray[j] is false
					if(!testArray[i] && (list1[i] == list2[j])){				
							testArray[i] = !testArray[j];
					}
				}
			}
			
			for(int i = 0; i < testArray.length; i++){
				//System.out.println(testArray[i]); 
				if(!testArray[i])
					test = false;
			}
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
