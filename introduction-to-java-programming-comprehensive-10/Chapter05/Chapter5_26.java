/**
 *	(approximate e)   
 */
  
public class HelloWorld {
	public static void main(String[] args) {

		double e = 1.0; 
		double item = 1.0; 

		for(int i = 2; i<100001; i++){

			item /= i;
			e += item ;
			
			if(i % 10000 == 0) {
			
				System.out.println( "For i = " + i + ": E is: " + (e + 1) );
				 
			}//end if
		}//end for
		
	}
}
