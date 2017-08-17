/**   
 * (Decimal to octal) Write a program that prompts the user to enter a decimal
 * integer and displays its corresponding octal value. Don’t use Java’s Integer
 * .toOctalString(int) in this program.
 */
 
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
 	
                Scanner input = new Scanner(System.in);

                System.out.print("Enter a decimal number: ");
                int decimalnumber = input.nextInt();

                String octalNumber = "";
                int rowOctalNumber;

                do{
                        octalNumber += decimalnumber%8;
                        decimalnumber /=8;
                }while(decimalnumber > 0);


                rowOctalNumber = Integer.valueOf(octalNumber);
                int i = octalNumber.length();
                octalNumber = "";

                while(i>0){
                        octalNumber += rowOctalNumber%10;
                        rowOctalNumber /= 10;
                        i--;
                }

                System.out.println("The binary value is: " + octalNumber );

	}
}
