/*
(Stopwatch) Design a class named StopWatch. The class contains:
■■ Private data fields startTime and endTime with getter methods.
■■ A no-arg constructor that initializes startTime with the current time.
■■ A method named start() that resets the startTime to the current time.
■■ A method named stop() that sets the endTime to the current time.
■■ A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
Draw the UML diagram for the class then implement the class. Write a test program that measures the execution time of sorting 100,000 numbers using selection sort.
*/

import java.util.Random; 
import java.util.concurrent.ThreadLocalRandom;

class Main {
  public static void main(String[] args) {
     
    //generate array with 100000 random numbers 
    double[] numberList = NumbersBook.getArrayOfRandomDoubleWithRange(100000, 0, 100000);

    System.out.println( "Start Sorting " + numberList.length + " random numbers " ); 
    
    //Create a Stopwatch
    Stopwatch watch1 = new Stopwatch();

    //Start Stopwatch
    watch1.start();

    //Start Sorting 100000 random numbers 
    NumbersBook.selectionSort(numberList);

    //Stop Stopwatch
    watch1.stop();

    System.out.println( "Execution time in milliseconds: " +  watch1.getElapsedTime() ); 
  }
}

class Stopwatch {

	private long startTime;
  private long endTime;

  //A no-arg constructor that initializes startTime with the current time.
  public Stopwatch() {
    this.startTime = System.currentTimeMillis();
  }

  public long getStartTime() {
    return startTime;
  }

  public long getEndTime(){
    return endTime;
  }

  //resets the startTime to the current time.
  public void start() {
    startTime = System.currentTimeMillis();
  }

  //sets the endTime to the current time.
  public void stop() {
    this.endTime = System.currentTimeMillis();
  }

  //returns the elapsed time for the stopwatch in milliseconds.
  public long getElapsedTime() {
    return this.endTime - this.startTime;
  }

}

class NumbersBook {
  
  public static double[] getArrayOfRandomDoubleWithRange(int num, int min, int max) {
    
    double[] numbers = new double[num];

    for(int i = 0; i < numbers.length; i++) {
      numbers[i] = ThreadLocalRandom.current().nextDouble(min, max); 
    }

    return numbers;      
  }

	/** The method for sorting the numbers */
	public static void selectionSort(double[] list) {

		for (int i = 0; i < list.length - 1; i++) {
	
			  // Find the minimum in the list[i..list.length−1]
		  	double currentMin = list[i];
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
 
