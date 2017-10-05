// (Execution time) Write a program that randomly generates an array of 100,000
// integers and a key. Estimate the execution time of invoking the linearSearch
// method in Listing 7.6. Sort the array and estimate the execution time of invoking
// the binarySearch method in Listing 7.7. You can use the following code

// template to obtain the execution time:
// long startTime = System.currentTimeMillis();
// perform the task;
// long endTime = System.currentTimeMillis();
// long executionTime = endTime - startTime; 

class Main {
    public static void main(String[] args) { 

        //perform the task
        int[] test = randomIntsInArray(100000);  //creating array
        
        /** Applying method for finding the (4444) key in the list */
        long startTime = System.currentTimeMillis();
        
        linearSearch(test, 4444); //finding the (4444) key in the list
            
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Took " + executionTime + " to find a key in the list"); 
        
        /** Applying method for sorting the numbers */
        startTime = System.currentTimeMillis();
        
        selectionSort(test); //sorting array
        
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Took " + executionTime + " to sort the numbers");
    }
    
    public static int[] randomIntsInArray(int arrayLength) {
        int[] randomlyGeneratedArray = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            randomlyGeneratedArray[i] = (int)(1 + Math.random() * 100000 );
        }
        return randomlyGeneratedArray;
    }
    
    /** The method for finding a key in the list */
    public static int linearSearch(int[] list, int key) {
    	for (int i = 0; i < list.length; i++) {
    		if (key == list[i])
    			return i;
    	}
    	return -1;
    }
    
     /** The method for sorting the numbers */
     public static void selectionSort(int[] list) {
         
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
    }
}

