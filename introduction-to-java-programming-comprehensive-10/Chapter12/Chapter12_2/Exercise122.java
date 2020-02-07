import java.util.*;

public class Exercise122 {
    /** Main method */
    public static void main(String[] args) {

        int num1, num2; 
        System.out.println("\nPlease enter two integers.");
        
        num1 = readInt("\nEnter first integer: ");
        num2 = readInt("\nEnter second integer: ");
    
        System.out.println("\nSum of " + num1 + " + " + num2 + " is " + (num1 + num2) ); 
    
        System.out.println("\nGood-bye.\n" );
    }

    public static int readInt(String message) {
        Scanner scan = new Scanner( System.in );
        boolean correctInput;
        String num;
        
        do{
            System.out.print(message);
            num = scan.nextLine();
            correctInput = isInteger(num); 
        }
        while(!correctInput);

        return Integer.parseInt(num);
    }

    public static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
}
