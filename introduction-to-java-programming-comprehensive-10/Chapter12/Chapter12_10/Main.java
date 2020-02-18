import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    try {
      int[] matrix = new int[Integer.MAX_VALUE];
      for (int i = 0; i < matrix.length; ++i)
        matrix[i] = i + 1;
    } catch (Exception e) {
      e.printStackTrace();
    } catch (OutOfMemoryError e) {
      System.out.println("\n" + e.getMessage() + "\n");
    }

  }
}