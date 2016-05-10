import java.util.Scanner;


public class Chapter2_23 {
	/**
	 *		Cost of driving
	 */
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the driving distance: ");
	double driving_distance = input.nextDouble();
	
	System.out.print("Enter miles per gallon: ");
	double miles_gallon = input.nextDouble();
	
	System.out.print("Enter price per gallon: ");
	double price_gallon = input.nextDouble();
  
  	double cost_riving = ( driving_distance / miles_gallon ) * price_gallon ;
  	
	System.out.println("The cost of driving is $" + cost_riving );

	}
}
