//        (Game: heads or tails) Write a program that lets the user guess whether the flip of
//        a coin results in heads or tails. The program randomly generates an integer 0 or 1,
//        which represents head or tail. The program prompts the user to enter a guess and
//        reports whether the guess is correct or incorrect.

import java.util.Scanner;

public class Main {

   public static void main(String[ ] args)
   {
   	Scanner input = new Scanner(System.in);
 	    System.out.println("Guess whether the flip of a coin results in heads or tails.\ne.g. Type 0 for head or 1 for tail, then press enter");
	    int guess = input.nextInt();
	    int coin = (int) (Math.random() * 10) %2;
	
	    if(guess == coin) 
		      System.out.println("Correct ");
	    else 
		      System.out.println("Incorrect ");
	
	    System.out.println("The answer is " + ((coin == 0)?"head.":"tail."));
   }   

}
