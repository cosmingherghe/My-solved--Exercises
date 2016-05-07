import java.util.Scanner;


public class Chapter2_07 {

	/**
	 * Find the number of years EX: 7777777
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of minutes: ");
		
		int minutes = input.nextInt();
		int hours = minutes/60;
		int days = hours/24;
		int years = days/365; // get numbers of years from days
		days %= 365; //get days left
		
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
	}

}
