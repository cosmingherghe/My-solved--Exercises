import java.util.Scanner;

public class Chapter2_08 {

	/**
	 * Sum the digits in an integer 
	 * 	- a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double seconds = System.currentTimeMillis()/1000;
		int second = (int)seconds%60; 	// second
		double minutes = seconds/60; 	//minutes
		int minut =  (int)minutes%60; 	// minute
		double hours = minutes/60; 		// hours
		int hour = (int)hours%24;		// hour
		
		System.out.print("Enter the time zone offset to GMT: ");

		hour += input.nextInt(); //reading zone
		
		if(hour<0) hour = Math.abs(hour);  // make a negative hour positive
		
		System.out.println( "The current time is: " + hour + ":" + minut + ":" +second );

	}
}