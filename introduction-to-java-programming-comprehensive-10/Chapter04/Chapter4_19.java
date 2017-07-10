import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    	Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String ISBN = input.nextLine(); 
	
        int d1 = (int)ISBN.charAt(0);
        int d2 = (int)ISBN.charAt(1);
        int d3 = (int)ISBN.charAt(2);
        int d4 = (int)ISBN.charAt(3);
        int d5 = (int)ISBN.charAt(4);
        int d6 = (int)ISBN.charAt(5);
        int d7 = (int)ISBN.charAt(6);
        int d8 = (int)ISBN.charAt(7);
        int d9 = (int)ISBN.charAt(8);

        System.out.println("The ISBN-10 number is: " +
                d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 +
                +  ((d1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11));    
    	
    }
}
