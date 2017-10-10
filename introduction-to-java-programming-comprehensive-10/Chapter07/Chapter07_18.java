	//(Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubblesort algorithm makes several passes through the array. On each pass, successive
//neighboring pairs are compared. If a pair is not in order, its values are swapped;
//otherwise, the values remain unchanged. The technique is called a bubble sort or
//sinking sort because the smaller values gradually “bubble” their way to the top
//and the larger values “sink” to the bottom. Write a test program that reads in ten
//double numbers, invokes the method, and displays the sorted numbers.

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

        double[] userDoubles = get10Doubles(); 
        bubbleSorting(userDoubles);
        
        for(int i = 0; i < userDoubles.length; i++) {
	        System.out.print(userDoubles[i] + " "); 
        }
        
    }
    
     /** Bubble sorting */
     public static void bubbleSorting(double[] numbers) {
         boolean sorted = true;
         double temp = numbers[0];
         
         do{
             for(int i = 0; i < numbers.length -1; i++){
                 sorted = false;
                 
                 if(numbers[i] > numbers[i+1]){
                         temp = numbers[i];
                         numbers[i] = numbers[i+1];
                         numbers[i+1] = temp;
                         sorted = true;
                 }   
             }
         }while(sorted);
     }
    
    public static double[] get10Doubles() {
	    Scanner input = new Scanner(System.in);
        double[] userInputs = new double[10];
	    System.out.print("To test program please enter 10 double numbers: "); 
	    
        for(int i = 0; i < 10; i++) {
            userInputs[i] = input.nextDouble();
        }
        
        return userInputs;
    }
}
