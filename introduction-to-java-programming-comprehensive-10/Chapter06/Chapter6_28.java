/**
*	(Mersenne prime) A prime number is called a Mersenne prime if it can be written
*	in the form 2p - 1 for some positive integer p. Write a program that finds all
*	Mersenne primes with p … 31 and displays the output.
*/
 
public class mersennePrime {

	public static void main(String[] args) {
	
		System.out.println("p \t 2^p –1\n");
		for(int i=2; i<=31;i++){
			if(isPrime(i)) {
				System.out.printf("%d \t %d \n",i , ((int)Math.pow(2, i) - 1) );
			}
		}
		
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
