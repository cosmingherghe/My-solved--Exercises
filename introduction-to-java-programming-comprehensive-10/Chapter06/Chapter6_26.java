/**
*	(Palindromic prime) A palindromic prime is a prime number and also palindromic. For example, 131 is a prime and also a palindromic prime, as are 313 and
*	757. Write a program that displays the first 100 palindromic prime numbers. Display 10 numbers per line, separated by exactly one space, as follows:
*	2 3 5 7 11 101 131 151 181 191
*	313 353 373 383 727 757 787 797 919 929
*	...
*/

public class PalindromicPrime {

	public static void main(String[] args) {
 
		for(int i = 2, first100 = 0; first100 < 100; i++){
			if(palindromicPrime(i)) {
				System.out.print(i + " "); //Display 10 numbers separated by exactly one space
				first100++;

				if(first100 % 10 == 0){ // Add new line to Display 10 numbers per line
					System.out.println();
				}
			}//end if
		}//end for
		
	} 
	
	public static boolean palindromicPrime(int number) {
		if(isPalindromic(String.valueOf(number)) && isPrime(number))  
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
}


