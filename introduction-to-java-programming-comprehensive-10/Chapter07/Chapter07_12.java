import java.util.Scanner;

//(Reverse an array) The reverse method in Section 7.7 reverses an array by
//copying it to a new array. Rewrite the method that reverses the array passed in
//the argument and returns this array. Write a test program that prompts the user to
//enter ten numbers, invokes the method to reverse the numbers, and displays the
//numbers.

public class ReverseArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] userInput = new double[10];
		
		System.out.print("Enter ten numbers: ");
		
		for (int i = 0; i < 10; i++) {
			userInput[i] = input.nextDouble();
		}
		
		double[] newArray = reverseArray(userInput);
		
		displayArray(newArray);
	}
	
	public static double[] reverseArray(double[] array) {
		double temp;
		for (int i = 0, j = array.length  -1; i < j; i++, j--) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		
		return array;
	}
	
	public static void displayArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
	}

}
