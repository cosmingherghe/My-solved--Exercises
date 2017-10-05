import java.util.Scanner;

//  (Computing gcd) Write a method that returns the gcd of an unspecified number
//  of integers. The method header is specified as follows:
//	
//  public static int gcd(int... numbers)
//
//  Write a test program that prompts the user to enter five numbers, invokes the
//  method to find the gcd of these numbers, and displays the gcd.


public class Computing_gcd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] userInput = new int[5];
		
		System.out.print("Enter five numbers: ");
		
		for (int i = 0; i < 5; i++) {
			userInput[i] = input.nextInt();
		}
		
		System.out.println("The greatest common divisor is: " + gcd(userInput));

	}
	
	public static int gcd(int... numbers) {
		
		int lastDivisor = 1;
		int testResult; 
		int minNumber = minNumber(numbers);
				
		for (int i = 2; i <= minNumber + 1; i++) {
			testResult = numbers.length;  
			for (int j = 0; j < numbers.length; j++) {
				 
				if(numbers[j] % i == 0)  
					testResult--; // i is a divisor (factors) for all numbers if testResult is 0 
			} 
			if(testResult == 0)
				lastDivisor = i;  
		} 
		return lastDivisor;
	}
	
	public static int minNumber(int... numbers) {
		int min = numbers[0]; 
		
		for (int i = 1; i < numbers.length; i++) {
			if(min > numbers[i])
				min = numbers[i];
		}
		
		return min;
	}

}
