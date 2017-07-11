import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
    	 Scanner input = new Scanner(System.in);
	 
	 String firstCity, secondCity, thirdCity;
	 boolean firstSecond, firstThird, SecondThird; 
	 
	 System.out.print("Enter the first city: ");
	 firstCity = input.nextLine();
	 
	 System.out.print("Enter the second city: ");
	 secondCity = input.nextLine();
	 
	 System.out.print("Enter the third city: ");
	 thirdCity = input.nextLine();
	 
	 firstSecond = firstCity.compareTo(secondCity) < 0;
	 firstThird = firstCity.compareTo(thirdCity) < 0;
	 SecondThird = secondCity.compareTo(thirdCity) < 0;
	 
	 if( !firstSecond ) {
	 
	 	if( !firstThird ) {
	 	
	 		if( !SecondThird ) {
	 		
	 			System.out.println( "The three cities in alphabetical order are "
	 			+ thirdCity 
	 			+ " " + secondCity
	 			+ " " + firstCity );
	 		}
	 		else {
	 		
	 			System.out.println( "The three cities in alphabetical order are "
	 			+ secondCity 
	 			+ " " + thirdCity
	 			+ " " + firstCity );
	 		} //end !SecondThird
	 		
	 			 
	 	}
	 	else {
	 	
	 		System.out.println( "The three cities in alphabetical order are "
	 			+ secondCity 
	 			+ " " + firstCity
	 			+ " " + thirdCity );
	 			
	 	} //end !firstThird
	 	
	 } //end !firstSecond
	 else {
	 
	 	if( !SecondThird ) {
	 		
	 			System.out.println( "The three cities in alphabetical order are "
	 			+ firstCity  
	 			+ " " + thirdCity
	 			+ " " + secondCity );
	 		}
	 		else {
	 		
	 			System.out.println( "The three cities in alphabetical order are "
	 			+ firstCity  
	 			+ " " + secondCity 
	 			+ " " + thirdCity );
	 		} //end !SecondThird
	 
	 } //end else !firstSecond 

	}
}
