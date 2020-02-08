import java.lang.Math; 
import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int[] randArrInts = getRandomInts(100);
    
    System.out.print("Enter an index of the array: ");
    int userIndex = scan.nextInt();
    displayArrKeyValue(randArrInts, userIndex);
  }

  public static void displayArrKeyValue(int[] m, int k) {
    try{
      System.out.println("The corresponding element value is " + m[k]);
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("Out of Bounds");
    }
  }

  public static int[] getRandomInts(int noKeys) {
    int[] randArr = new int[noKeys];
    // generate random numbers within 1 to 100 
    for (int i = 0; i < noKeys; i++) { 
      randArr[i] = (int)(Math.random() * 100) + 1; 
    }
    return randArr;
  }
}
