/**
*	(Twin primes) Twin primes are a pair of prime numbers that differ by 2. For example, 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes.
* 	Write a program to find all twin primes less than 1,000.
*/


public class twinPrimes {

	public static void main(String[] args) {

		int lastPrime = 1;
		int newPrime = 2;
		
		for(int i = 2; i < 1000; i++) {
			
			if(isPrime(i) & (i > newPrime)) { 
				
				if(isTwinPrimes(i, newPrime)) {
					
					System.out.printf("(%d, %d)\n", newPrime, i);
				}
				
				lastPrime = newPrime;
				newPrime = i;
			}
		} 
	}
	
	public static boolean isTwinPrimes(int a, int b) {
		if(a - b == 2)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int number) {
		boolean isPrime = true;
		for(int i = 2; i <= number/2; i++) {
			if(number % i == 0){
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
