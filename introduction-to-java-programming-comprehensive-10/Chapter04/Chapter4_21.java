import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    	String SNN, patternStr;
	boolean isValid, _4thCharLine, _7thCharLine, firstNumber, secondNumber, thirdNumber;
	
	patternStr = "^[0-9]*$";
	
	Scanner input = new Scanner(System.in);	

        System.out.print("Enter a SSN (format 232-23-5435): ");
        SNN = input.nextLine();

	if( SNN.length() == 11 ) {
	
		_4thCharLine = (SNN.charAt(3) == '-');
		_7thCharLine = (SNN.charAt(6) == '-');
		firstNumber = SNN.substring(0,3).matches(patternStr);
		secondNumber = SNN.substring(5,6).matches(patternStr);
		thirdNumber = SNN.substring(8,10).matches(patternStr);
	
    	
    		if( _4thCharLine && _7thCharLine && firstNumber && secondNumber && thirdNumber ) {
    	
    			System.out.println( SNN + " is a valid social security number" );
    		}
    		else {
    			System.out.println( SNN + " is an invalid social security number" );
    		}
    	}	
    	else {
    		System.out.println( SNN + " is an invalid social security number" );
    	}
	
    }
}
