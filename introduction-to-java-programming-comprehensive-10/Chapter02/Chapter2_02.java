import java.util.*; 

public class Chapter2_02 {

	/**
	 *  Compute the volume of a cylinder
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius and length of a cylinder with a space between: ");
		
		double radius = input.nextDouble();
		double length = input.nextDouble();
		double area = radius * radius * Math.PI;
		
		System.out.println( "The area is: " + area 
							+ "\nThe volume is: " + (area * length));

	}

}
