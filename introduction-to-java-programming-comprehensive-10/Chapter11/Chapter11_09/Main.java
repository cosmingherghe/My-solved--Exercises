import java.util.Scanner;

class Main {
  public static void main(String[] args) { 

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the array size n: "); 
    int matrixSize = keyboard.nextInt();
    
    IntMatrix m = new IntMatrix(matrixSize);

    m.displayMatrix(); 
    m.displayRowCount1s();
    m.displayColCount1s();
 
  } 
}
