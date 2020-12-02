/*

Return the number of times that the string "hi" appears anywhere in the given string.


countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2

*/


class Main {  
  public static void main(String args[]) { 
    System.out.println( countHi("ABChi hi") ); 
  } 
  
    static int countHi(String str) {
      int count = 0;
      
      for(int i = 0; i < str.length() -1; i++) {
        if("hi".equals(str.substring(i, i+2)))
          count++;
      }
      return count;
    }

}
