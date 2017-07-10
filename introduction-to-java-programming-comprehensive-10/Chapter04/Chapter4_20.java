import java.util.*;

public class Main {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String stringIn = input.nextLine();
        
        System.out.println("String length is: " + stringIn.length() );
        System.out.print("First characters is: " + stringIn.charAt(0) );
	
    }
}
