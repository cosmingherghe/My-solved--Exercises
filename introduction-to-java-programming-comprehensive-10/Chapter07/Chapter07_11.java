import java.util.Scanner;

// (Statistics: compute deviation) Programming Exercise 5.45 computes the standard deviation of numbers. 
// This exercise uses a different but equivalent formula to compute the standard deviation of n numbers.
// To compute the standard deviation with this formula, you have to store the individual numbers using 
// an array, so that they can be used after the mean is obtained.
// Your program should contain the following methods:
//	
// /** Compute the deviation of double values */
// public static double deviation(double[] x)
//
// /** Compute the mean of an array of double values */
// public static double mean(double[] x)
//
// Write a test program that prompts the user to enter ten numbers and displays the
// mean and standard deviation.

public class ComputeDeviation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] userInput = new double[10];
		
		System.out.print("Enter ten numbers: ");
		
		for (int i = 0; i < 10; i++) {
			userInput[i] = input.nextDouble();
		}
		
		System.out.println("The mean is: " + mean(userInput) 
							+ "\nThe  standard deviation is: " + deviation(userInput) );
	}

	/** Compute the deviation of double values */
	public static double deviation(double[] x) {
		
		double xiResult = 0;
		double mean = mean(x);
		
		for (int i = 0; i < x.length; i++) {
			xiResult += Math.pow( ( x[i] - mean), 2); 
		}
		
		return Math.sqrt( xiResult / (x.length - 1) );

	}
	
	/** Compute the mean of an array of double values */
	public static double mean(double[] x) {
		
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		
		return sum / x.length;
	}
}
