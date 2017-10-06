// (Revise selection sort) In Section 7.11, you used selection sort to sort an array.
// The selection-sort method repeatedly finds the smallest number in the current
// array and swaps it with the first. Rewrite this program by finding the largest number
// and swapping it with the last. Write a test program that reads in ten double
// numbers, invokes the method, and displays the sorted numbers.

import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
		
		
		double[] userInput = {3.3, 4.4, 2.3, 2.3, 5.5, 8.8, 7.7, 6.6, 9.9, 2.8};

		selectionSort(userInput);
		
		for (int i = 0; i < userInput.length; i++) {
			System.out.print(userInput[i] + " ");
		}
		
	}
	
     /** The method for sorting the numbers */
     public static void selectionSort(double[] list) {
         
         for (int i = 0; i < list.length - 1; i++) {
             
         // Find the minimum in the list[i..list.length-1]
         double currentMax = list[i];
         int currentMaxIndex = i;
 
         for (int j = i + 1; j < list.length; j++) {
            if (currentMax < list[j]) {
                currentMax = list[j];
                currentMaxIndex = j;
            }
        }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
