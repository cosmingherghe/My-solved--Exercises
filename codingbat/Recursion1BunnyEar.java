/*

We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).


bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4
*/


class Main {  
  public static void main(String args[]) { 

    System.out.println( bunnyEars(12) ); 
  } 
  
    static int bunnyEars(int bunnies) {
      if(bunnies< 1) return 0;
      
      return  2 +  bunnyEars(bunnies - 1);
    } 
}
