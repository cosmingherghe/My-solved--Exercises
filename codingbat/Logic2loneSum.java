/*

Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0

*/

class Logic2loneSum {  
  public static void main(String args[]) { 
      
      
    System.out.println( loneSum(3, 3, 3)  ); 
  } 
  
  static int loneSum(int a, int b, int c) {
      int[] number = {a, b, c};
      int[] numberVer = {a, b, c};
      int sum = 0;
      
      
      // if one of the values is the same as another of the values, it does not count towards the sum.
      for(int i = 0; i < number.length -1; i++) {
        for(int j = i+1; j < number.length; j++) {
          if(number[i] == number[j]) {
            numberVer[i] = 0;
            numberVer[j] = 0;
          }
        }
      }
      
      //calculate sum
      for(int i = 0; i < number.length; i++)
        sum += numberVer[i];
      
      return  sum;
      
    }
}
