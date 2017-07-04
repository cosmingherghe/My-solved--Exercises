import java.util.Scanner;

public class HexToBinary{
	public static void main(String[] args) {

		String answer; 
		Scanner input = new Scanner(System.in);
		
		System.out.print( "Enter a hex digit: " );
		answer = input.nextLine();
		
		    try {
		    	
		    	int ifHexToBinary = (int)Long.parseLong(answer, 16);
        		System.out.println( Integer.toBinaryString(ifHexToBinary) );

		    } catch (NumberFormatException nfe) {

		         System.out.print( answer + " is an invalid input.");
    		}

	}
}
