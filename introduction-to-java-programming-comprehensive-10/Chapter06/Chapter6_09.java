/**
*	(Conversions between feet and meters) Write a class that contains the following
*	two methods:
*	
*	/** Convert from feet to meters */
*	public static double footToMeter(double foot)
*	/** Convert from meters to feet */
*	public static double meterToFoot(double meter)
*	
*	The formula for the conversion is:
*	meter = 0.305 * foot
*	foot = 3.279 * meter
*	Write a test program that invokes these methods to display the following tables:
*	Feet 	Meters 	| Meters 	Feet
*	1.0 	0.305 	| 20.0 		65.574
*	2.0 	0.610 	| 25.0 		81.967
*	...
*	9.0 	2.745 	| 60.0 		196.721
*	10.0 	3.050 	| 65.0 		213.115
*/

public class ConversionsFeetMeters {

	public static void main(String[] args) {

		System.out.println("Feet \t Meters \t| \tMeters \t   Feet");
		System.out.println("---------------------------------------------------------------");
		
		for(int f = 1, m = 20; f <= 10; f++, m += 5){
			double foot = f;
			double meter = m;
			System.out.printf( "%4.1f \t %.3f \t\t| \t%.1f \t %7.3f \n", 
					foot, footToMeter(foot), meter, meterToFoot(meter));
		}

	}

	/** Convert from feet to meters */
	public static double footToMeter(double foot){
		return 0.305 * foot; // return meters
	}
	
	/** Convert from meters to feet */
	public static double meterToFoot(double meter){
		return 3.279 * meter; //return feet
	}
}
