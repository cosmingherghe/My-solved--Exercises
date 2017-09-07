/**
*       (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
*       isPrime(int number) method for testing whether a number is prime. Use this
*       method to find the number of prime numbers less than 10000.
*/


public class PrimeNumber {

	public static void main(String[] args) {
		
		int noOfPrimes = 0;
		
		/** Find the number of prime numbers less than 10000 
		 *  and sort them, 10 per line*/
		for(int i = 1; i<1000; i++) {
			if(isPrime(i)){
				System.out.printf("%4d",i);
				noOfPrimes++;
				
				if(noOfPrimes % 10 == 0) System.out.println(); //add a new line
			} 
			
		}
	}
	
	/** Check whether number is prime */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // Number is not a prime
			}
		}
		return true; // Number is prime
	}

}
