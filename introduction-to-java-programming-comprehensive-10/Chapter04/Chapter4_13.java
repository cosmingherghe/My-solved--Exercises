import java.util.*;

public class Main {
    public static void main(String[] args) {
    
      	Scanner input = new Scanner(System.in);
  	System.out.print("Enter a letter: ");
  	
  	char letterIn = input.nextLine().charAt(0);
  	  	
  	if(Character.isLetter(letterIn)) {
  		if( letterIn == 'a' || letterIn == 'e' || letterIn == 'i' || letterIn == 'o' || letterIn == 'u' || 
  			letterIn == 'A' || letterIn == 'E' || letterIn == 'I' || letterIn == 'O' || 
	  		letterIn == 'U' ) {
	  		System.out.print(letterIn + " is a vowel");
	  	}
	  	else if(letterIn == 'y' || letterIn == 'Y'){
	  		System.out.print(letterIn + " can be a vowel (as in the words \"cry\", \"sky\", \"fly\" or \"why\"), or it can be a consonant (as in \"yellow\", \"yacht\", \"yam\" or \"yesterday\")");
	  	}
	  	else {
	  		System.out.print(letterIn + " is a consonant");
	  	}	
      
  	} else {
  		System.out.print(letterIn + " is an invalid input");
  	}
    
  }
}
