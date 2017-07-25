import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
 
	 	Scanner input = new Scanner(System.in);
	 	
	 	int number = 0;
	 	int positives = 0;
	 	int negatives = 0;
	 	
	 	double total= 0;
	 	double average = 0;
	  
	 	do {
		 	System.out.print("Enter an integer, the input ends if it is 0: ");
		 	number = input.nextInt();
		 	
		 	if ( number == 0 ) break;
		 	
		 	if ( number > 0 ) positives++; 
		 	else  negatives++; 
		 	
		 	total += number;
		 	average = total / (positives + negatives);
		 	
	 	} while( number != 0 );
		
		if ( total > 0 ) {
			System.out.println( "The number of positives is " + positives ); 
			System.out.println( "The number of negatives is " + negatives ); 
			System.out.println( "The total is " + total ); 
			System.out.println( "The average is " + average ); 
		}
		else	{
	 		System.out.print( "No numbers are entered except 0" ); 
	 	}
	}
}
