/** (Pattern recognition: consecutive four equal numbers) Write the following
  * method that tests whether the array has four consecutive numbers with the same
  * value.
  * 
  * public static boolean isConsecutiveFour(int[] values)
  * 
  * Write a test program that prompts the user to enter a series of integers and displays
  * if the series contains four consecutive numbers with the same value. Your
  * program should first prompt the user to enter the input size—i.e., the number of
  * values in the series. 
  */
  
import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {
 
		Scanner input = new Scanner(System.in);
		int consecutiveNumbers = 4;
		String userInput;
		int[] list;
		
		System.out.print("Enter more than 3 integers: "); 
		userInput = input.nextLine();
		list = getListNumbers(userInput);
		
		System.out.print( areConsecutiveNumbers(list, consecutiveNumbers) );

		if( areConsecutiveNumbers(list, consecutiveNumbers) )
			System.out.print("The list has consecutive fours."); 
		else
			System.out.print("The list has no consecutive fours."); 					 
				
	}
	
	public static boolean areConsecutiveNumbers(int[] list, int numbers) {
		boolean test = false;
		int count;
		
		for (int i = 0; i < list.length; i++) {
			count = 1; 
			for (int j = i + 1; j < list.length; j++) {
				if(list[i] == list[j])
					count++;
			} 
			if(count == numbers)  
				test = !test;
				
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
