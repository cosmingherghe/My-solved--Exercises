import java.util.Scanner;

//(Find the smallest element) Write a method that finds the smallest element in an
//array of double values using the following header:

//public static double min(double[] array)

//Write a test program that prompts the user to enter ten numbers, invokes this
//method to return the minimum value, and displays the minimum value.
		
public class SmallestElement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[] userInput = new double[10];
		
		System.out.print("Enter ten numbers: ");
		
		for (int i = 0; i < 10; i++) {
			userInput[i] = input.nextDouble();
		}
		
		System.out.println("The minimum value is: " + min(userInput));

	}

	public static double min(double[] array) {
		double min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if(min > array[i])
				min = array[i];
		}
		
		return min;
	}
}
