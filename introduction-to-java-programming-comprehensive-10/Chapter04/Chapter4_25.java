import java.util.*;
import java.lang.*;

public class HelloWorld {
  public static void main(String[] args) {
  
  	//(int)(Math.random() * ((upperbound - lowerbound) + 1) + lowerbound); 
    	//(where lowerbound is inclusive and upperbound exclusive).
 	int  plateNumber = (int)( Math.random() * ((10000 - 1000) + 1) + 1000 );
 	
 	//Character.toString(char)  https://stackoverflow.com/questions/8172420/how-to-convert-a-char-to-a-string
 	String plateThreeLetters = 	Character.toString( (char)(int)( Math.random() * ((91 - 65) + 1) + 65 ) ) +
 					Character.toString( (char)(int)( Math.random() * ((91 - 65) + 1) + 65 ) ) +
 					Character.toString( (char)(int)( Math.random() * ((91 - 65) + 1) + 65 ) );
	
	System.out.print( "Generated vehicle plate number is: " + plateThreeLetters + plateNumber );	
  
  }
}
