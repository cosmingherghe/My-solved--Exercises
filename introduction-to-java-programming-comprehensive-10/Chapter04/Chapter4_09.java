import java.util.*;

public class Main {
    public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);  	

	    System.out.print("Enter a character: ");
	
	    char inputLine = input.nextLine().charAt(0);
	    int asciChar = (int)inputLine;
	
	    System.out.println("The Unicode for the character "+ inputLine +" is " + asciChar);
  }
}
