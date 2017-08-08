/**
 *	(Sum a series)   
 */
  
public class HelloWorld {
	public static void main(String[] args) {

		double sum = 0; 
		 
		for(int i = 1; 98>i; i++ ){ 
		
			sum += (double)i/(i+2);
		} 
		
		System.out.print( "Sum: " + sum ); 
	}
}
