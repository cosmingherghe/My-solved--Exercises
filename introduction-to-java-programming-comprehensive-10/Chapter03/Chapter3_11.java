// (Find  the  number  of  days  in  a  month)  Write  a  program  that  prompts  the  user to enter the 
// month and year and displays the number of days in the month. For example, if the user entered month 2 
// and year 2012, the program should display that February 2012 had 29 days. If the user entered month 3 
// and year 2015, the program should display that March 2015 had 31 days.

import java.util.*;

public class Main {
  public static void main(String[] args) {

	int days = 0;
	int month;
	int year;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the month and year (e.g. 2 2012): ");
	month = input.nextInt();
	year = input.nextInt();
	
  	String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        if( (month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)){
        	days = 31;
        }
        else if((month == 4) || (month == 6) || (month == 9) || (month == 11)){
        	days = 30;
        }else if(month == 2) {
        	days = (isLeapYear) ? 29 : 28;
        }
        
    System.out.println(monthString + " " + year + " had " + days + " days");
  }
}
