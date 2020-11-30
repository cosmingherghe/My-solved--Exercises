/*
Given 3 int values, a b c, return their sum. 
However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. 
So for example, if b is 13, then both b and c do not count.


luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1
*/


class Main {  
  public static void main(String args[]) { 
      
      
    System.out.println( "luckySum: " + luckySum(13, 2, 3)   ); 
  } 
  
    static int luckySum(int a, int b, int c) {
          int[] number = {a, b, c};
          int[] numberVer = number;
          int sum = 0;
          
          
          // if one of the values is 13 then it does not count towards the sum and values to its right do not count
          for(int i = 0; i < number.length; i++) {
              if(number[i] == 13) {
                for(int j = i; j < number.length; j++)
                  numberVer[j] = 0;
              }
          }
          
          //calculate sum
          for(int i = 0; i < number.length; i++)
            sum += numberVer[i];
          
          return  sum;
    }
}
