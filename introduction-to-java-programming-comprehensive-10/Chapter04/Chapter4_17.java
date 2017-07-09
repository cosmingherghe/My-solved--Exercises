import java.util.*;

public class Main {
    public static void main(String[] args) {
    
      	int yearIn;
  	String monthIn;
  	String days;
  	boolean leap = false;
  	
  	Scanner input = new Scanner(System.in);
  	
  	System.out.print("Enter a year: ");	
  	yearIn = input.nextInt();
  	
  	System.out.print("Enter  the first three letters of a month name (with the first letter in uppercase): ");
  	monthIn = input.nextLine();
  	monthIn = input.nextLine(); 

	if( monthIn.equals("Feb") ) { 

		// Check a Leap Year
        	if( yearIn % 4 == 0 ){
            		if( yearIn % 100 == 0 ){
                		// year is divisible by 400, hence the year is a leap year
                		if ( yearIn % 400 == 0 )
                    			leap = true;
                		else	
                    			leap = false;
            		}
            		else
                		leap = true;
        	} //end if(year % 4 == 0)
        	else
            		leap = false;
            
            	if(leap) 
            		days= "29";
            	else 
            		days= "28"; 
            	
	} //end if(monthIn == "Feb")
	else {
  		switch(monthIn) {
	  	    case "Jan": 
	  	    case "Mar":
	  	    case "May":
	  	    case "Jul":
	  	    case "Aug":
	  	    case "Oct":
	  	    case "Dec": days = "31";
	                     break;
	            case "Apr": 
	  	    case "Jun":
	  	    case "Sep":
	  	    case "Nov": days = "30";
	                     break;
	            default: days = monthIn + " is an invalid input. Try again!";
	                     break;
	        }//end switch
        }//end else
        
    	System.out.println( monthIn + " " + yearIn + " has " + days );

    }
}
