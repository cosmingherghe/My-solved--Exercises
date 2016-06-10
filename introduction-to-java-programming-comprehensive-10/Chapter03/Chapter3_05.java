import java.util.Scanner;

public class Chapter3_05 {

	/**
	 * Find future dates
	 */
	
	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		
		String todayDayString = null;
		String futureDayString = null;
		
		System.out.println("Enter today's day: ");
		int todayNoDay = input.nextInt();
		
		System.out.println("Enter the number of days elapsed since today: ");
		int elapseDay = input.nextInt();

		elapseDay = (todayNoDay + elapseDay) % 7;
				
		switch (todayNoDay) {
		case 0:
			todayDayString = "Monday";
			break;
		case 1:
			todayDayString = "Tuesday";			
			break;
		case 2:
			todayDayString = "Wednesday";
			break;
		case 3:
			todayDayString = "Thursday";
			break;
		case 4:
			todayDayString = "Friday";
			break;
		case 5:
			todayDayString = "Saturday";
			break;
		case 6:
			todayDayString = "Sunday";
			break;
		}
		
		switch (elapseDay) {
		case 0:
			futureDayString = "Monday";
			break;
		case 1:
			futureDayString = "Tuesday";			
			break;
		case 2:
			futureDayString = "Wednesday";
			break;
		case 3:
			futureDayString = "Thursday";
			break;
		case 4:
			futureDayString = "Friday";
			break;
		case 5:
			futureDayString = "Saturday";
			break;
		case 6:
			futureDayString = "Sunday";
			break;
		}

		System.out.println("Today is " + todayDayString + " and the future day is " + futureDayString);
	}
}
