/** (All closest pairs of points) Revise Listing 8.3, FindNearestPoints.java, to
  * display all closest pairs of points with the same minimum distance.
  * 
  * Enter the number of points: 8
  * Enter 8 points: 0 0 1 1 -1 -1 2 2 -2 -2 -3 -3 -4 -4 5 5
  * The closest two points are (0.0, 0.0) and (1.0, 1.0)
  * The closest two points are (0.0, 0.0) and (-1.0, -1.0)
  * The closest two points are (1.0, 1.0) and (2.0, 2.0)
  * The closest two points are (-1.0, -1.0) and (-2.0, -2.0)
  * The closest two points are (-2.0, -2.0) and (-3.0, -3.0)
  * The closest two points are (-3.0, -3.0) and (-4.0, -4.0)
  * Their distance is 1.4142135623730951
  */

import java.util.Scanner;

public class FindNearestPoints {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		int numberOfPoints = input.nextInt();

		// Create an array to store points
		double[][] points = new double[numberOfPoints][2];
		System.out.print("Enter " + numberOfPoints + " points: ");
		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}

		// Initialize shortestDistance
		double shortestDistance = distance(points[0][0], points[0][1], points[1][0], points[1][1]); 

		//calculate number of 2 points combinations for array distances
		double[][] pointsDistances = new double[ numberOfPoints * ( numberOfPoints - 1 ) / 2 ][5];
        	int pointsDistancesIndex = 0; 

		// Compute distance for every two points 
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1],
							   points[j][0], points[j][1]); // Find distance

				pointsDistances[pointsDistancesIndex][0] = points[i][0]; //add point 1
				pointsDistances[pointsDistancesIndex][1] = points[i][1];
				pointsDistances[pointsDistancesIndex][2] = points[j][0]; //add point 2
				pointsDistances[pointsDistancesIndex][3] = points[j][1];
				pointsDistances[pointsDistancesIndex][4] = distance;     //add distance
                		pointsDistancesIndex++; 

				if (shortestDistance > distance) { 
					shortestDistance = distance; // Update shortestDistance
				}
			}
		}


		// Display all closest pairs of points with the same minimum distance.
		for (int i = 0; i < pointsDistances.length; i++) {
            
			if(pointsDistances[i][4] == shortestDistance) {
				System.out.printf("The closest two points are (%.2f, %.2f) and (%.2f, %.2f)\n", 
						pointsDistances[i][0], pointsDistances[i][1], pointsDistances[i][2], pointsDistances[i][3] );
			}
		}
		
		System.out.println("Their distance is " + shortestDistance );
	}

	/** Compute the distance between two points (x1, y1) and (x2, y2)*/
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
	 
}  
