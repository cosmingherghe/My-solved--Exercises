/**  
 * (Decimal to binary) Write a program that prompts the user to enter a decimal
 * integer and displays its corresponding binary value. Don’t use Java’s Integer
 * .toBinaryString(int) in this program.
 */
 
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
 	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal number: ");
		int decimalnumber = input.nextInt();

		String binaryNumber = "";
		int rowBinaryNumber;

		do{
			binaryNumber += decimalnumber%2;
			decimalnumber /=2;
		}while(decimalnumber > 0);


		rowBinaryNumber = Integer.valueOf(binaryNumber);
		int i = binaryNumber.length();
		binaryNumber = "";

		while(i>0){
			binaryNumber += rowBinaryNumber%10;
			rowBinaryNumber /= 10;
			i--;
		}

		System.out.println("The binary value is: " + binaryNumber );

	}
}
