import java.util.Scanner;

// (Average an array) Write two overloaded methods that return the average of an
//array with the following headers:
//public static int average(int[] array)
//public static double average(double[] array)
//Write a test program that prompts the user to enter ten double values, invokes this
//method, and displays the average value.

public class AverageAnArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] userInput = new double[10];
		System.out.print("Enter ten double values: ");
		
		for (int i = 0; i < 10; i++) {
			userInput[i] = input.nextDouble();
		}
		
		System.out.println("The average is: " + average(userInput));
		
	}

	public static int average(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}
	
	public static double average(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}
}
