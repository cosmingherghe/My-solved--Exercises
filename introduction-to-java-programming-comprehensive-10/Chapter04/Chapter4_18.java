import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    	    	String major, whetherStudentIs, twoCharactersIn;
    	char firstCharacter, secondCharacter;
    	
    	Scanner input = new Scanner(System.in);
    	
  	System.out.print("Enter two characters (M1, C3, I2) : ");
  	twoCharactersIn = input.nextLine();
  	
  	firstCharacter = twoCharactersIn.charAt(0);
  	secondCharacter = twoCharactersIn.charAt(1); 
  	
  	switch(firstCharacter) {
  		case 'M': 
  			major = "Mathematics";
  			break;
  		case 'C':
  			major = "Computer Science";
  			break;
  		case 'I':
  			major = "Information Technology";
  			break;
  		default: 
  			major = "invalid";
                     break;
  	}
  	
  	switch(secondCharacter) {
  		case '1': 
  			whetherStudentIs = "Freshman";
  			break;
  		case '2':
  			whetherStudentIs = "Sophomore";
  			break;
  		case '3':
  			whetherStudentIs = "Junior";
  			break;  
  		case '4':
  			whetherStudentIs = "Senior";
  			break; 
  		default: 
  			whetherStudentIs = "invalid";
                     break;
  	}
  	
  	if( major.equals("invalid") || whetherStudentIs.equals("invalid") ) {
  	
  		System.out.print("Invalid input");
  	} 
  	else {
  		System.out.print(major + " " + whetherStudentIs );
  	}
	
    }
}
