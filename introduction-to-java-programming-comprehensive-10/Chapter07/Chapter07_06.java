//(Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a number n is prime by checking whether 2, 3, 4, 5, 6, ..., n/2 is a divisor. If a divisor
//is found, n is not prime. A more efficient approach is to check whether any of the
//prime numbers less than or equal to 2n can divide n evenly. If not, n is prime.
//Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
//You need to use an array to store the prime numbers and later use them to check
//whether they are possible divisors for n.

public class PrimeNumber {

	public static void main(String[] args) { 
		
		int[] test = getFirst50Primes();
		
		System.out.println("The first 50 prime numbers are \n");
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		} 
		System.out.println();
		
		
		possileDivisors(test);
	}
	
	public static void possileDivisors(int[] x) {
		
		for (int i = 2; i < x[x.length - 1]; i++) {
			for (int j = 0; j < x.length; j++) {
				
				if(i > x[j]) { 
					if(i % x[j] == 0)
					System.out.println("The prime number " + x[j] + "  is a divisors for " + i);
				}
			}
		}
	}
	
	public static int[] getFirst50Primes() {
		int[] first50primes = new int[50];  

		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness

		

		// Repeatedly find prime numbers
		while (count < first50primes.length) {
			// Assume the number is prime
			boolean isPrime = true; // Is the current number prime?
	
			// Test whether number is prime
			for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
				if (number % divisor == 0) { // If true, number is not prime
					isPrime = false; // Set isPrime to false
					break; // Exit the for loop
				}
			}
 
			if (isPrime) {
				first50primes[count] = number;
				count++; // Increase the count 
			}
			
			// Check if the next number is prime
			number++;
		}
		
		return first50primes;
	}

}
