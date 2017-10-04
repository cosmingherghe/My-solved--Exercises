//	(Print distinct numbers) Write a program that reads in ten numbers and displays
//	the number of distinct numbers and the distinct numbers separated by exactly one
//	space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
//	Read a number and store it to an array if it is new. If the number is already in the
//	array, ignore it.) After the input, the array contains the distinct numbers. Here is
//	the sample run of the program:
//	Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
//	The number of distinct number is 6
//	The distinct numbers are: 1 2 3 6 4 5

import java.util.Scanner;

public class DistinctNumbers {

	public static void main(String[] args) {

		 distinctNumbers(getNumbers()); 
	}
	
	public static int[] getNumbers() {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		
		System.out.print("Enter ten numbers: ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		return numbers;
	}
	
	public static void distinctNumbers(int[] x) {
		int[] distinctNumbers = new int[x.length];
		int distinctNumbersIndex = 0;
		boolean match;
		
		for (int i = 0; i < x.length; i++) {
			match = true;
			
			for (int j = i + 1; j < x.length; j++) {
				
				if(x[i] == x[j])
					match = false;
			}
			
			if(match) {
				distinctNumbers[distinctNumbersIndex] = x[i];
				distinctNumbersIndex++;
			}
		} 
		
		System.out.println("The number of distinct number is: " + distinctNumbersIndex );

		System.out.print("The distinct numbers are: ");
		
		for (int j = 0; j < distinctNumbersIndex; j++) {
			System.out.print(distinctNumbers[j] + " ");
		}
	}

}
