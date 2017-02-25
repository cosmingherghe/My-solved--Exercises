import java.util.Scanner;
 
public class Main {
    public static void main(String[ ] args)  {
    
	Scanner input = new Scanner(System.in);

	System.out.print("Enter three edges of a triangle (e.g. 2 4 5): ");

	int edgeA = input.nextInt();
	int edgeB = input.nextInt();
	int edgeC = input.nextInt();

	if ( ((edgeA + edgeB) < edgeC) || ((edgeA + edgeC) < edgeB) || ((edgeB + edgeC) < edgeA) ){
		System.out.println("The input is invalid");
	} else {
		System.out.println("The perimeter is: " + (edgeA + edgeB + edgeC));
	}
   }
} 



