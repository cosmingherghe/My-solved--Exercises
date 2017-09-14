/**
*	(Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
*	whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17
*	and 71 are emirps. Write a program that displays the first 100 emirps. Display 10
*	numbers per line, separated by exactly one space, as follows:
*	13 17 31 37 71 73 79 97 107 113
*	149 157 167 179 199 311 337 347 359 389
*	...
*/


public class anEmirp {

	public static void main(String[] args) {
		
		for(int i = 2, first100 = 0; first100 < 100; i++){
			if(isEmirp(i)) {
				System.out.print(i + " "); //Display 10 numbers separated by exactly one space
				first100++;

				if(first100 % 10 == 0){ // Add new line to Display 10 numbers per line
					System.out.println();
				}
			}//end if
		}//end for
		
	}
	
	public static boolean isEmirp(int number) {
		if(isPrime(number) && isPrime(reverseInt(number)) && !isPalindromicPrime(number) )
			return true;
		else
			return false;
	}
	
	public static boolean isPalindromicPrime(int number) {
		if(isPalindromic(String.valueOf(number)) && isPrime(number))  
			return true; 
		else
			return false;
	}
	
	public static int reverseInt(int number) {
		int reverse = 0;
		while(number != 0) {
			reverse = reverse * 10 + number % 10;
			number /= 10;
		}
		return reverse;
	}
	
	public static boolean isPalindromic(String chars) {
		boolean isPalindromic = true;
		int low = 0;
		int high = chars.length() - 1;
		
		while(low < high){
			
			if(chars.charAt(low) != chars.charAt(high)) {
				isPalindromic = false;
				break;
			}
			low++;
			high--;
		} 
		
		return isPalindromic;
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
