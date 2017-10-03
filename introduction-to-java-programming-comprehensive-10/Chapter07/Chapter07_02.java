/*
 * (Reverse the numbers entered) Write a program that reads ten integers and displays them 
 * in the reverse of the order in which they were read.
 */

import java.util.*;

public class ReverseNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		
		System.out.print("Enter 10 integers: ");
		
		//read the integers
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		//displays numbers in the reverse of the order in which they were read.
		System.out.print("Reverse order: ");
		for(int i = numbers.length -1; i >= 0 ; i--) {
			System.out.print(numbers[i] + " ");
		}
	}

}
