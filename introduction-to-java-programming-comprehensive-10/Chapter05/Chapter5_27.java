/**
 * (Display leap years) Write a program that displays all the leap years, ten per line, 
 * from 101 to 2100, separated by exactly one space. Also display the number of leap years
 * in this period. 
 */

public class HelloWorld {
	public static void main(String[] args) {
	
	String leapYears = "";
	int numberOfLeapYears = 0;
	
		for(int year = 101; year < 2101; year++){

			if( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {

				leapYears += year + "\t";
				numberOfLeapYears ++;
				
				if( numberOfLeapYears%10 == 0 ) {
				
					leapYears += "\n"; //start a new line
				}
			}
			
		}//end for
		
		System.out.println( leapYears  + "\n");
		System.out.print( "There are " + numberOfLeapYears + " of leap years in this period.");
	}
}
