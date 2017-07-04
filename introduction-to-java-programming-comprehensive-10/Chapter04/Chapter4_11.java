import java.util.*;

public class HelloWorld {
  public static void main(String[] args) {

		int answer; 
		Scanner input = new Scanner(System.in);
		
		System.out.print( "Enter a decimal value (0 to 15): " );
		answer = input.nextInt();
		
		if( answer < 0 || answer > 15 ) {
			 System.out.println( answer + " is an invalid input" );
		} 
		else {
			System.out.println( "The hex value is " +   Integer.toHexString(answer).toUpperCase() );
		}
  }
}
