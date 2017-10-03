/*
 * (Count occurrence of numbers) Write a program that reads the integers between 1
 *  and 100 and counts the occurrences of each. Assume the input ends with 0. 
 */ 
import java.util.*;

public class CountOccurrenceOfNumbers {

	public static void main(String[] args) { 
		
		displayOccurrences(askForNumbers());
	}
	
	public static int[] askForNumbers() {
		Scanner input = new Scanner(System.in);
		int[] first100numbers = new int[100];
		System.out.print("Enter the integers between 1 and 100 (input ends with 0): ");

		int test = 0;
		do{
			test = input.nextInt();
			first100numbers[test]++;
		}while(test != 0);
		
		return first100numbers;
	}
	
	public static void displayOccurrences(int[] x) {
		for (int i = 1; i < x.length; i++) {
			if(x[i] > 0) {
				if(x[i] == 1)
					System.out.println(i + " occurs " + x[i] + " time"); 
				else
					System.out.println(i + " occurs " + x[i] + " times");
			}
				
		}
	}
}
