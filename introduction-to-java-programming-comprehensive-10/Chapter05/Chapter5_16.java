import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		int i = 2;
		String smallestFactors = "";
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int intNumber = input.nextInt();
				
		int testNumber = intNumber;
		
		while( i < testNumber){
			
			if( testNumber % i == 0 ) {
				testNumber /= i;
				smallestFactors += i + " "; 
			}
			else i++;
			
			if(i > testNumber || i == testNumber) smallestFactors += testNumber;
		}
		 
		if(smallestFactors.length() == 2) {
			System.out.println( "Smallest factor for " + intNumber + " is: " + smallestFactors );
		}
		else if(smallestFactors.length() > 2) {
			System.out.println("The smallest factors in increasing order for " + intNumber + " are: " + smallestFactors );
		}
		else {
			System.out.println( intNumber + " prime number." );
		}
	}
}
