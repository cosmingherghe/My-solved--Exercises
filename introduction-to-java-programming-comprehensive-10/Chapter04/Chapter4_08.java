import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
      int asciInt;
  	
  	  Scanner input = new Scanner(System.in);  	

      System.out.print("Enter an ASCII code: ");
	    asciInt = input.nextInt();
	
	    System.out.println("The character for ASCII code "+ asciInt +" is " + (char)asciInt);
  }
}
