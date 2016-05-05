public class Chapter1_07 {

	/**
	 *  Exercise 7 
	 *  display result:
	 *  	- 4 x ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 )
	 *  	- 4 x (  1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 )
	 */

	public static void main(String[] args) {
		
		int oddno = 6;	// initialise how many odd numbers we need
		int startodd = 1;	//initialise from where odd numbers start		
		double inbrace = 1.0;	//initialise the operations in braces
		
		for( int i = 2; i<oddno+2; i++){

			startodd += 2; //getting the next odd number 
			
			//staring with the first number after 1 for each number is adding - and +, and starts calculating
			if( (i%2 == 0)){
				inbrace -= 1.0/i;
			}
			else { 
				inbrace += 1.0/i;
			}
		}
		
		System.out.println(4*inbrace); // the result in braces is multiplied by 4
	}
}
