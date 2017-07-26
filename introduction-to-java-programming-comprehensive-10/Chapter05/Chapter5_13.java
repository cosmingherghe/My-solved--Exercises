public class HelloWorld {
	public static void main(String[] args) {
	 
		int i = 1;
	
		System.out.print( "A while loop finds that ");
	 
		while(Math.pow(i,3) < 12000) { 
			i++;
	  	}
	  	
	  	System.out.print( (--i) + " the largest integer n such that n^3 is less than 12,000.");

	}
}
