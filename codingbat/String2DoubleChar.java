/*

Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
*/


class Main {  
  public static void main(String args[]) { 
    System.out.println( doubleChar("Hi-There") ); 
  } 
  
    static String doubleChar(String str) {
      char[] doubleChar = new char[str.length() * 2];
      
      for(int i = 0, j = 0,k = 1; i < str.length(); i++, j += 2,k += 2 ) {
        doubleChar[j] = str.charAt(i);
        doubleChar[k] = str.charAt(i);
      }
       
      return String.valueOf(doubleChar);
    }

}
