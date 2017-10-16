 
 /**(Merge two sorted lists) Write the following method that merges two sorted lists
 * into a new sorted list.
 * 
 * public static int[] merge(int[] list1, int[] list2)
 * 
 * Implement the method in a way that takes at most list1.length + list2.
 * length comparisons. Write a test program that prompts the user to enter two
 * sorted lists and displays the merged list. Here is a sample run. Note that the first
 * number in the input indicates the number of the elements in the list. This number
 * is not part of the list.
 */
 
import java.util.*;

class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] list1, list2;
		String userInput;
		
//		System.out.print("Enter list1: "); 
//		userInput = input.nextLine();
		
		userInput = "1 6 3 8 4";
		list1 = getListNumbers(userInput);
		
//		System.out.print("Enter list2: "); 
//		userInput = input.nextLine();

		userInput = "2 8 4 6 7 4 9";
		list2 = getListNumbers(userInput);
		
		list1 = selectionSort(list1);
		list2 = selectionSort(list2);
		
		System.out.println( Arrays.toString(list1) );
		System.out.println( Arrays.toString(list2) );
		
		System.out.print("The merged list is: " + Arrays.toString( merge(list1, list2) ) ); 
		
	}
	
	public static int[] merge(int[] list1, int[] list2) {
	
		int[] merge = new int[list1.length + list2.length];
		int index = 0;
		
		//add first array list
		while(index < list1.length){
			merge[index] = list1[index];
			index++;
		}
		
		//add second array list
		while(index < list1.length + list2.length){ 
			merge[index] = list2[(list1.length + list2.length - 1) - index];
			index++;
		}
		
		return selectionSort(merge);
	}
	
	public static int[] getListNumbers(String userInput) { 
		int numberOfNumbers = 0;
		int[] numbers;

		//check how long the array should be
		Scanner countNumbers = new Scanner(userInput);
		while(countNumbers.hasNextInt()){
				countNumbers.nextInt();
			numberOfNumbers++;
		}

		//create the array
		countNumbers = new Scanner(userInput);
		numbers = new int[numberOfNumbers];

		//add values in the array
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = countNumbers.nextInt();
		} 

		return numbers;
	}
	
	public static int[] selectionSort(int[] list) {
	
		for (int i = 0; i < list.length - 1; i++) {
		
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;
	
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
	
			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
		return list;
	}
}
