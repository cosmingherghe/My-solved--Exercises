import java.time.*;
public class Chapter2_12 {
	
	/*
	 * If today is Tuesday, what will be the day in 100 days?
	 */

	public static void main(String[] args) {
 
		 System.out.println("If today is Tuesday, in 100 days would be "
								 + DayOfWeek.TUESDAY.plus(100%7) + ".");
	}

}
