
//        If the checksum is 10, the last digit is denoted as X according to the ISBN-10
//        convention. Write a program that prompts the user to enter the first 9 digits and
//        displays the 10-digit ISBN (including leading zeros). Your program should read
//        the input as an integer.
 
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
 	
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int digitsint = input.nextInt();
        int first9digits = digitsint;
        
        int checksum = 0;

        //calculate checksum
        for(int i=9; i>0; i--){  
        	checksum += i * (digitsint % 10);
        	digitsint /=10;
        }
        checksum %= 11; 
        
        System.out.println("The ISBN-10 number is: " + first9digits + "" +  checksum);

	}
}
