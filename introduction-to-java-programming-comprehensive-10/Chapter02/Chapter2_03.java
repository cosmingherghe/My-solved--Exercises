import java.util.Scanner;

public class Chapter2_03 {

	/**
	 *  Convert feet into meters
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value for feet: ");
		
		double feet = input.nextDouble(); 
		
		System.out.println( feet + " feet is " + feet * 0.305 + " meters"  );
	}

}