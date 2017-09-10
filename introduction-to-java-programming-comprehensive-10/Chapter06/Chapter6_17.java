/**
*	(Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using
*	the following header:
*	public static void printMatrix(int n)
*	Each element is 0 or 1, which is generated randomly. Write a test program that
*	prompts the user to enter n and displays an n-by-n matrix
*/

import java.util.*;

public class DisplayMatrix {
	public static void main(String[] args) {
		printMatrix(3);
	}
	  
	public static void printMatrix(int n) {

		for(int i = 0, l = 1; i<n*n; i++, l++){
			System.out.print((int )(Math.random() * 2) + " ");
			
			if(l%n == 0) System.out.println();
		}
		
	}
}
