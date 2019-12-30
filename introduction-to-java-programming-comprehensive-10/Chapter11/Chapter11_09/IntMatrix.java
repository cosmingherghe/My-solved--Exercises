import java.util.*;
import java.lang.*;

public class IntMatrix {
  private ArrayList<ArrayList<Integer>> matrixList = new ArrayList<ArrayList<Integer>>();
  private ArrayList<Integer> rowCount1s = new ArrayList<>(); 
  private ArrayList<Integer> colCount1s = new ArrayList<>();

  public IntMatrix(int n) {
    //create Matrix
    for(int x = 0; x<n; x++) {
      this.matrixList.add(new ArrayList<Integer>());
      for(int y = 0; y<n; y++) {
         this.matrixList.get(x).add(y, (int)Math.round( Math.random() ) );
      }
    }

    //add colCount1s & rowCount1s
    count1sInRowsAndCols();
  }

  public void displayRowCount1s() {
    int max =  Collections.max(this.rowCount1s);
    String message = "Most 1s are on Row:";

    for(int i = 0; i < this.rowCount1s.size(); i++) {
      if(max == this.rowCount1s.get(i))
	      message += " " + (i + 1);
    }

    System.out.println( "\nThe largest row index: >> " + Arrays.toString( this.rowCount1s.toArray() ) );
    System.out.println( message );
  }
  
  public void displayColCount1s() {
    int max =  Collections.max(this.colCount1s);
    String message = "The largest column index:";

    for(int i = 0; i < this.colCount1s.size(); i++) {
      if(max == this.colCount1s.get(i))
	      message += " " + (i + 1);
    }

    System.out.println( "\nColumns counting 1s >> " + Arrays.toString( this.colCount1s.toArray() ) );
    System.out.println( message );
  }

  public void count1sInRowsAndCols() {  

    for(int x = 0; x < this.matrixList.size(); x++) { 
      int colTemp = 0;
      int rowTemp = 0;

      for(int y = 0; y < this.matrixList.get(x).size(); y++) {

        if( this.matrixList.get(x).get(y) == 1){
           colTemp++;
        }

        if( this.matrixList.get(y).get(x) == 1){
           rowTemp++;
        } 
      }

      this.colCount1s.add(colTemp);
      this.rowCount1s.add(rowTemp);
		} 
  }

  public void displayMatrix() {
    System.out.println("\nThe random matrix is:");

    for(int x = 0; x < this.matrixList.size(); x++) {
      System.out.println();
      for(int y = 0; y < this.matrixList.get(x).size(); y++) {
        System.out.print( " " + this.matrixList.get(x).get(y) );
      }
		}

    System.out.println();
  }

}
