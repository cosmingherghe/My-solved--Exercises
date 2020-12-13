/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
*/ 
 
class String2catDog {
  public static void main(String[] args) {
    System.out.println( catDog("1cat1cadodog") ); 
  }

  public static boolean catDog(String str) {

    String dogCount = str.replace("dog", "");
    String catCount = str.replace("cat", "");

    return catCount.length() == dogCount.length();
  }
}
