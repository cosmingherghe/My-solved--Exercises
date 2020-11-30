// We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.

class Logic2MakeBricks {  
  public static void main(String args[]) { 
      
      
    System.out.println( makeBricks(6, 0, 11)  ); 
  } 
  
  static boolean makeBricks(int small, int big, int goal) {
      
     //check how many big Briks are Needed & if enough
     int bigBriksNeeded = ( big >= (goal / 5) ) ? goal/5 : big;

     //check how many small Briks are Needed
     int smallBriksNeeded = (goal - (bigBriksNeeded * 5) );

    //check if enough
     return (small - smallBriksNeeded >= 0) ? true : false ;
  }
}
