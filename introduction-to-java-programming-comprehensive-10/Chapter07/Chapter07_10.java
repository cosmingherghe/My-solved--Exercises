import java.util.Scanner;

//	(Find the index of the smallest element) Write a method that returns the index of
//	the smallest element in an array of integers. If the number of such elements is
//	greater than 1, return the smallest index. Use the following header:
//	
//	public static int indexOfSmallestElement(double[] array)
//
//	Write a test program that prompts the user to enter ten numbers, invokes this
//	method to return the index of the smallest element, and displays the index.

public class IndexOfSmallestElement {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] userInput = new double[10];
		
		System.out.print("Enter ten numbers: ");
		
		for (int i = 0; i < 10; i++) {
			userInput[i] = input.nextDouble();
		}
		
		System.out.println("Index of the smallest element is: " + indexOfSmallestElement(userInput));
	}
	
	public static int indexOfSmallestElement(double[] array) {
		int min = 0;
		
		for (int i = 1; i < array.length; i++) {
			if(array[min] > array[i])
				min = i;
		}
		
		return min;
	}

}
