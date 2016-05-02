class Chapter1_13 {
 
	/**
	 * 	Exercise 13 
	 * 	 	(Algebra: solve 2 * 2 linear equations)
	 * 		3.4x + 50.2y = 44.5
	 * 		2.1x + .55y = 5.9
	 */
 
	public static void main (String[] args) {
 
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = 0.55;
		double e = 44.5;
		double f = 5.9;

		//calculating x, y and rounding to 2 digits 
		double x = (double)Math.round( ( (e*d - b*f) / (a*d - b*c) )*100)/100;
		double y = (double)Math.round( ( (a*f - e*c) / (a*d - b*c) )*100)/100;
		
		//Display X and Y
		System.out.println("x = " + x );
		System.out.println("y = " + y );
	}
} 
