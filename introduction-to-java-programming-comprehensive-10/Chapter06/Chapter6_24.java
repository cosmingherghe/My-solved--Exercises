/**
*	(Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the
*	current time. Improve this example to display the current date and time. The calendar
*	example in Listing 6.12, PrintCalendar.java, should give you some ideas on
*	how to find the year, month, and day.
*/

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println( showCurrentTime() );
	}
	
	public static String showCurrentTime() {
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		
		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute the current hour
		long currentHour = totalHours % 24;
		
		// Compute the total days
		long totalDays = totalHours / 24;
		
		
		System.out.println("totalDays " + totalDays );

		// Display results
		return( currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
	}
	
	/** Get the day of current year since January 1, 1970 */
	public static int getTotalNumberOfDays(int days) {
		int total = 0;
	
		// Get the day of current year
		for (int i = 1970; i < year; i++)
			if (isLeapYear(i))
			total = total + 366;
			else
			total = total + 365;
	
		// Add days from Jan to the month prior to the calendar month
		for (int i = 1; i < month; i++)
		total = total + getNumberOfDaysInMonth(year, i);
	
		return total;
	}
	
	/** Determine if it is a leap year */
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}
