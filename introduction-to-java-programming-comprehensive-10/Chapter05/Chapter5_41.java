/**    
 *  (Occurrence of max numbers) Write a program that reads integers, finds the largest of them, and counts its occurrences. Assume that the input ends with number
 *  0. Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest
 *  is 5 and the occurrence count for 5 is 4
 */
 
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
  
 		Scanner input = new Scanner(System.in);
		int numberIn = 0;
		int max = 0;
		int count = 0;
		
		System.out.print("Write a series of integers ending in 0: ");
		
		do{
			numberIn = input.nextInt();
			
			if(numberIn > max) {  
				count = 1;
				max = numberIn; 
			}
			else if(numberIn == max) {
				count++;
			}
			
		}while(numberIn != 0);

 		System.out.print("The largest number is " + max + "\nThe occurrence count of the largest number is " + count );
	}
}
