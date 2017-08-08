/**
 *	(approximate PI)   
 */
  
public class HelloWorld {
	public static void main(String[] args) {

		double pi = 1;

		for(int i = 2; i<100001; i++){

			pi += Math.pow(-1, i + 1) / (2 * i - 1.0);
			
			if(i % 10000 == 0) {
			
				System.out.println( "For i = " + i + ": PI is: " + pi * 4);
				 
			}//end if
		}//end for
		
	}
}
