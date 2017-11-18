/**
	(Geometry: rightmost lowest point) In computational geometry, often you need
	to find the rightmost lowest point in a set of points. Write the following method
	that returns the rightmost lowest point in a set of points.
	
	public static double[] getRightmostLowestPoint(double[][] points)
	
	Write a test program that prompts the user to enter the coordinates of six points
	and displays the rightmost lowest point. Here is a sample run:
	
	Enter 6 points: 1.5 2.5 -3 4.5 5.6 -7 6.5 -7 8 1 10 2.5
	The rightmost lowest point is (6.5, -7.0)
*/

import java.util.*;

public class RightmosLowestPoint {
	public static void main(String[] args) { 

		//double[][] setPoints = getPoints();
		
		double[][] setPoints =  {{ 1.5, 2.5}, {-3, 4.5}, {5.6, -7}, {6.5, -7}, {8, 1}, {10, 2.5}};

		double[] theRightmostLowestPoint = getRightmostLowestPoint(setPoints);
		
		System.out.println( "The rightmost lowest point is (" + theRightmostLowestPoint[0] + ", " + theRightmostLowestPoint[1] + ")");
	}

	public static double[] getRightmostLowestPoint(double[][] points) {
	
		double[] lowestPoint = new double[2];
		int lowestIndex, lowestXindex, lowestYindex, tempIndex;
		lowestXindex = 0;
		lowestYindex = 0;
		double maxX, minY, temp;
		maxX = points[0][0];
		minY = points[0][1];
 
		for(int i = 1; i < points.length; i++) {
	        
				if( maxX < points[i][0]) {      //Right most point
					maxX = points[i][0];	//Update lowest X Point
					lowestXindex = i;	//Updade index value of lowest X Point 
				}
	
				if( minY > points[i][1]) {
					minY = points[i][1];	//Update lowest Y Point
					lowestYindex = i;	//Updade index value of lowest Y Point
		        }
		}
        
	        temp = points[lowestXindex][1];
	        tempIndex = lowestXindex;
	        
		for(int i = 0; i < points.length; i++) {
	              
	            if(points[i][0] == points[lowestXindex][0] ) {
	                if(points[i][1] < temp) {
	                    temp = points[i][1];   
	                    tempIndex = i;
	                }
	            }
		}

	        temp = points[lowestYindex][1];
	        tempIndex = lowestYindex;
	        
		for(int i = 0; i < points.length; i++) {
	              
	            if(points[i][1] == points[lowestYindex][1] ) {
	                if(points[i][0] > temp) {
	                    temp = points[i][0];   
	                    tempIndex = i;
	                } 
	            }
		}
        
        lowestPoint[0] = points[tempIndex][0];
        lowestPoint[1] = points[tempIndex][1];
         
		return lowestPoint;
	}
	
 	public static double[][] getPoints() {

		Scanner input = new Scanner(System.in);
		double[][] points = new double[3][2]; 

		System.out.println( "Enter the coordinates of six points: ");

		for(int i = 0; i < points.length; i++) { 
			for(int j = 0; j < points[i].length; j++) { 
				points[i][j] = input.nextDouble();
			}
		}

		System.out.println(); //a new line 
		return points;
	}
}



