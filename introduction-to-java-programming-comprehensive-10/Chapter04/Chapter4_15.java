import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    	    	Scanner input = new Scanner(System.in);
  	System.out.print("Enter a capital letter: ");
  	
  	char letterIn = input.nextLine().charAt(0);
  	 
  	if( Character.isLetter(letterIn) ) 
  	{
  		letterIn = Character.toUpperCase(letterIn);
  	}
  	
  	String telephoneButtonNumber = "The corresponding button is ";
  	
  	switch(letterIn) {
  	    case 'A': 
  	    case 'B':
  	    case 'C':
  	    		telephoneButtonNumber += "2";
                     break;
            case 'D':
            case 'E':
            case 'F':	telephoneButtonNumber += "3";
                     break;
            case 'G':
            case 'H':
            case 'I': 	telephoneButtonNumber += "4";
                     break;
            case 'J':
            case 'K':
            case 'L': 	telephoneButtonNumber += "5";
                     break;
            case 'M':
            case 'N':
            case 'O':	telephoneButtonNumber += "6";
                     break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S': 	telephoneButtonNumber += "7";
                     break;
            case 'T':
            case 'U':
            case 'V': 	telephoneButtonNumber += "8";
                     break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z': 	telephoneButtonNumber += "9";
                     break;
            case '+': 	telephoneButtonNumber += "*";
                     break;
            case '#': 	telephoneButtonNumber += '\u21E7';
                     break;                        
            default: telephoneButtonNumber = letterIn + " is an invalid input";
                     break;
  	}
  	
  	System.out.print(telephoneButtonNumber);
    
    }
}
