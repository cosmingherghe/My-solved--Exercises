/**
	(Central city) Given a set of cities, the central city is the city that has the shortest
	total distance to all other cities. Write a program that prompts the user to enter
	the number of the cities and the locations of the cities (coordinates), and finds
	the central city and its total distance to all other cities. 
	
	Enter the number of cities: 5 >>ENTER
	Enter the coordinates of the cities:
	2.5 5 5.1 3 1 9 5.4 54 5.5 2.1 >>ENTER
	The central city is at (2.5, 5.0)
	The total distance to all other cities is 60.81
*/
import java.util.*;

public class CentralCity {
	public static void main(String[] args) {

					//getCitiesAndLocations();
		double[][] cities = { {2.5, 5}, {5.1, 3}, {1, 9}, {5.4, 54}, {5.5, 2.1} }; 
		
		computeCentralCityAndDistanceToAllOtherCities( cities );
	}
	
	public static void computeCentralCityAndDistanceToAllOtherCities(double[][] locations) {
	
		double cityDistance;
		double[] cityToAllOtherCities = new double[locations.length];
		int centralCityIndex = 0;
		
		//compute distances from each city to all other cities
		for(int i = 0; i < locations.length; i++) {
			cityDistance = 0;
			for(int j = 0; j < locations.length; j++) {
				
				if(i != j)
					cityDistance += Math.sqrt( Math.pow(locations[i][1] - locations[i][0], 2) + Math.pow(locations[j][1] - locations[j][0], 2) );
			}
			cityToAllOtherCities[i] = cityDistance; //add distance to all cities for each city
			
			//get central city Index based on shortest distance
			if( i > 0 && cityToAllOtherCities[i - 1] > cityToAllOtherCities[i] )
				centralCityIndex = i;
		}
		
		System.out.printf("The central city is at (%.1f, %.1f) \n", locations[centralCityIndex][0], locations[centralCityIndex][1] );
		System.out.printf("The total distance to all other cities is %.2f", cityToAllOtherCities[centralCityIndex]);
	}
	
	public static double[][] getCitiesAndLocations() {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of cities: ");
		double[][] locations = new double[input.nextInt()][2]; 
		
		System.out.println("Enter the coordinates of the cities:");
		for(int i = 0; i < locations.length; i++) {
			for(int j = 0; j < locations[i].length; j++){
				locations[i][j] = input.nextDouble(); 
			}
		}
		return locations;
	}
}
