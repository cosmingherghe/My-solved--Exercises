
public class Chapter1_6 {

	/**
	 * Exercise 6 (Summation of a series)
	 */
	public static void main(String[] args) {
		
		// initialise series of numbers & sum
		int numbers = 6;
		int sum = 0;
				
		//add in the sum each number from that series
		for(int i=1; i<numbers+1; i++){
			
			sum += i;
		}

		//output summation
		System.out.println(sum);
		
	}

}