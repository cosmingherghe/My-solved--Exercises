import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	
	    int sides;
	    double sideLength, area;
	    
	    Scanner input = new Scanner(System.in);
	
	    System.out.print("Enter the number of sides: ");
	    sides = input.nextInt();	
	    
	    System.out.print("Enter the side: ");
	    sideLength = input.nextDouble();
	
	    area = ( sides * Math.pow(sideLength, 2.0) ) / ( 4 * Math.tan(Math.PI/sides) );
	    System.out.println( String.format( "The area of the polygon is  %.2f", area) );  
	}
}
