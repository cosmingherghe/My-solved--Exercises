public class Chapter1_11 {
	/**
	 * 	Exercise 11 
	 * 	 (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
	 *  ■ One birth every 7 seconds
	 *  ■ One new immigrant every 45 seconds
	 *  ■ One death every 13 seconds
	 * 
	 * Display the population for each of the next five years. Assume the current population is 312032486 and one year has 365 days. 
	 */
	 
	public static void main (String[] args)	{
		 
		int immigrantPS = 45;
		int birthPS = 7;
		int death = 13;
		int population = 312032486;
		
		double asouls = ((immigrantPS + birthPS)/2.0) - death; //average for a new souls in US minus average for souls out from US.. 26-13 = 13
		double ysouls = (365*24*60*60)/asouls; //calculating souls per year
		
 
		System.out.println( "Population now = " + population );
		for( int i=1; i<6; i++) {

			population +=ysouls; //calculating population for each year
			System.out.println( "Population in year " + i + " = " + (int)(population));
		}
	}
}
