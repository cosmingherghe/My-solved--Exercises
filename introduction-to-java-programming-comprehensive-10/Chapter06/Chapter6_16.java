/**
*	(Number of days in a year) Write a method that returns the number of days in a
*	year using the following header:
*	public static int numberOfDaysInAYear(int year)
*	Write a test program that displays the number of days in year from 2000 to 2020.
*/
public class DaysInAYear {
	public static void main(String[] args) {
  
  		for(int i =2000; i<=2020; i++){
			System.out.printf("Year: %d  %d days \n",i , numberOfDaysInAYear(i));
		}
  	
  	}
  
	public static int numberOfDaysInAYear(int year) {
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		return (isLeapYear) ? 366 : 365;
    	}
}
