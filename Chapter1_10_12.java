public class Chapter1_10 {
	
	/**
	 *   Exercise 10 & 12 - similar 
	 * 	 Displays the average speed in miles per hour
	 *   Assume a runner runs 18 kilometers in 1hour, 35 minutes and 40 seconds
	 */
	 
	public static void main (String[] args) {

		double kmran = 18.0;
		double tran = ((60 + 35) * 60) + 40.0;  // we transform the entire time in seconds 
		
		double mps = ((18.0/1.6)/tran);  // we calculate the average mile per second speed
		
		
		System.out.println("The average speed is " + (double)Math.round(mps * 3600*100)/100 + " miles per hour: " );	// we display the average speed in miles per hour (round up to 2 decimal places)
	}
}
