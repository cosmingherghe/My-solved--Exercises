/*
(Use the Random class) Write a program that creates a Random object with seed 1000 and displays the first 50 random integers between 0 and 100 using the nextInt(100) method. 
*/

import java.util.*;

class Main {
  public static void main(String[] args) {

    //create random object
    Random rand = new Random();

    //set random seed to 100
    rand.setSeed(1000);

    //displays the first 50 random integers between 0 and 100
    System.out.println( "The first 50 random integers between 0 and 100 are:" ); 
    for(int i=0; i<50; i++) {
      System.out.print( rand.nextInt(100) + "  " ); 
    }
    
  }
}
