

public class Main {
    public static void main(String[] args) {
	
	    double side, area;
	    Scanner input = new Scanner(System.in);
	
	    System.out.print("Enter the side: ");
	    side = input.nextDouble();
	
	    area = ( 6 * Math.pow(side, 2.0) ) / ( 4 * Math.tan(Math.PI/6) );
	    System.out.println( String.format( "The area of the hexagon is  %.2f", area) );  
	}
}
