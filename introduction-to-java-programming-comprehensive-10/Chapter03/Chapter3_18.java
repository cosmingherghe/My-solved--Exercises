import java.util.Scanner;
 
public class Main {
   public static void main(String[ ] args) {
    
	Scanner input = new Scanner(System.in);
      	System.out.print("Enter the weight of the package (e.g. 7): ");
      
      int w = input.nextInt();
	if( (0 < w) && (w <= 1) ){
		System.out.println("Shipping cost: $3.5");
	}
	else if( (1 < w) && (w <= 3) ){
		System.out.println("Shipping cost: $5.5");
	}
	else if( (3 < w) && (w <= 10) ){
		System.out.println("Shipping cost: $8.5");
	}
	else if( (10 < w) && (w <= 20) ){
		System.out.println("Shipping cost: $10.5");
	}
	else if( (20 < w) && (w <= 50) ){
		System.out.println("Shipping cost: $30.5");
	}
	else {
		System.out.println("The package cannot be shipped. (weight is greater than 50)");
	}
  }
} 
