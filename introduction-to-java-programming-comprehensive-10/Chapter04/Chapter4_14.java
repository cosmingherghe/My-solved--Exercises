import java.util.*;

public class Main {
    public static void main(String[] args) {

	  Scanner input = new Scanner(System.in);
  	System.out.print("Enter a capital letter: ");
  	
  	char letterIn = input.nextLine().charAt(0);
  	  	
  	if(Character.isLetter(letterIn)) {
  		if( letterIn == 'A') {
  			System.out.print("The numeric value for grade A is 4");
  		}
  		else if
  		( letterIn == 'B') {
  			System.out.print("The numeric value for grade B is 3");
  		}
  		else if( letterIn == 'C') {
  			System.out.print("The numeric value for grade C is 2");
  		}
  		else if( letterIn == 'D') {
  			System.out.print("The numeric value for grade D is 1");
  		}
  		else if( letterIn == 'F') {
  			System.out.print("The numeric value for grade F is 0");
  		}
	  	else {
	  		System.out.print(letterIn + " is an invalid grade");
	  	}	
      
  	} else {
  		System.out.print(letterIn + " is an invalid input");
  	}
  
    }
}
