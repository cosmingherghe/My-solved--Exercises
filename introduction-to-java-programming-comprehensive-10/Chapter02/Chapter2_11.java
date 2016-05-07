import java.util.*;

public class Chapter2_11 {
	/**
	 * 	Exercise 2.11
	 * 	 (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
	 *  ■ One birth every 7 seconds
	 *  ■ One new immigrant every 45 seconds
	 *  ■ One death every 13 seconds
	 *  Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and displays the population after the number of years.
	 */
	 
	public static void main (String[] args)	{
		 
		int immigrantPS = 45;
		int birthPS = 7;
		int death = 13;
		int population = 312032486;
		
		double asouls = ((immigrantPS + birthPS)/2.0) - death; //average for a new souls in US minus average for souls out from US.. 26-13 = 13
		double ysouls = (365*24*60*60)/asouls; //calculating souls per year
		
		Scanner input = new Scanner(System.in);
 
		System.out.print( "Population now = " + population + ".\nEnter the number of years: ");
		
		int years = input.nextInt();
		
		population += ysouls * years; //calculating population for each year
		
		System.out.println( "Population in year " + years + " = " + population);
	}
}