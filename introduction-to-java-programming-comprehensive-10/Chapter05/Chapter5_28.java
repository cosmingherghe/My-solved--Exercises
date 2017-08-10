import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		int days = 0;
		int switchFirstDay;
		int year;
		String monthString = "";
		String monthFirstDay = ""; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first day of the year and year (e.g. 2 for Tuesday, 2012): ");
		days = input.nextInt() - 1; // if switchFirstDay = 0 is "Monday"
		year = input.nextInt();
		
		System.out.println(); //a new line for a clearer output 
		
	  	for(int month = 1; month < 13; month++) {
	  
	  		//set name of the month
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
		        }//end month switch 

			
		        days %= 7; //set name of the day for the first day of the month 
		         
			switch (days) {
			case 0:
				monthFirstDay = "Monday";
				break;
			case 1:
				monthFirstDay = "Tuesday";			
				break;
			case 2:
				monthFirstDay = "Wednesday";
				break;
			case 3:
				monthFirstDay = "Thursday";
				break;
			case 4:
				monthFirstDay = "Friday";
				break;
			case 5:
				monthFirstDay = "Saturday";
				break;
			case 6:
				monthFirstDay = "Sunday";
				break;
			}//end day switch 
			
			 
			//check if it's a leap year
			boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		        
		        //compute how many days has each month
		        if( (month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)){
		        	days += 31;
		        }
		        else if((month == 4) || (month == 6) || (month == 9) || (month == 11)){
		        	days += 30;
		        }else if(month == 2) {
		        	days += (isLeapYear) ? 29 : 28;
		        } 
		        
		        //Print the month, day, year and the name of the day
		        System.out.println( monthString + " 1, " + year + " is " + monthFirstDay);

		}//end for loop 
 
	}
}
