// (Sorted?) Write the following method that returns true if the list is already sorted
// in increasing order.
// 
// public static boolean isSorted(int[] list)
// 
// Write a test program that prompts the user to enter a list and displays whether
// the list is sorted or not. Here is a sample run. Note that the first number in the
// input indicates the number of the elements in the list. This number is not part
// of the list. 
 
import java.util.*;

public class IsSorted {

    public static void main(String[] args) {
        
    	
		Scanner input = new Scanner(System.in);
		        
        System.out.print("The first number in the input indicates the number of the elements in the list\nEnter list: "); 
        
		int indexUserInputs = 0; 
		int[] userInputs = new int[input.nextInt()];
		 
		while(input.hasNextInt()){
			userInputs[indexUserInputs] = input.nextInt();
			indexUserInputs++;
		}  
		
		System.out.println( isSorted(userInputs) );   
    }
  
	public static boolean isSorted(int[] list) { 
		boolean isSorted = true; 
	    
		for(int i = 1; i < list.length; i++) {
			for(int j = i + 1; j < list.length; j++) {
				System.out.print(list[i] + " <= "+ list[j]);
				System.out.println(" : " + (list[i] <= list[j]));
				if(list[i] <= list[j]) {
					isSorted = false;
				}
			}
		} 
		return isSorted;
	}
	
}
