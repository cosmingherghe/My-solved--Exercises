public class HelloWorld {
	public static void main(String[] args) {
	
	int countToTen = 0;
	
		System.out.println( "All the numbers from 100 to 1,000 that are divisible by 5 and 6:");
	 
		for(int i = 100; i<1001; i++){
		
			if( (i%5 == 0) && (i%6 == 0) ){
			
				System.out.print( i + " ");
				countToTen++;
				
				if(countToTen%10 == 0) System.out.println("");
			} 
	  	} 

	}
}
