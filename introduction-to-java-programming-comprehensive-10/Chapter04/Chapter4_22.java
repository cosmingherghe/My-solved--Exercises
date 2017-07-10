import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    	String s1, s2;
    	
  	Scanner input = new Scanner(System.in);
  	
  	System.out.print("Enter string s1: ");	
  	s1 = input.nextLine();
  	
  	System.out.print("Enter string s2: ");	
  	s2 = input.nextLine();
  	
  	if( s1.substring( 0, s2.length() ).equals(s2) ) {
  		System.out.print(s1 + " is a substring of " + s2);
  	}
  	else{
  		System.out.print(s1 + " is not a substring of " + s2);
  	}
	
    }
}
