/*
(Use the Date class) Write a program that creates a Date object, sets its elapsed time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
10000000000, and 100000000000, and displays the date and time using the toString() method, respectively.
*/

class Main {
  public static void main(String[] args) {

    java.util.Date date = new java.util.Date();

    long elapsedTime;
  
    for(int i = 1; i<9; i++) {

      elapsedTime = 1000 * (long) Math.pow(10,i);
 
      date.setTime( elapsedTime );
      System.out.println("Elapsed time set to " +  elapsedTime
            + "\nDate and time: " +  date.toString() + "\n");
    }
    
  }
}
