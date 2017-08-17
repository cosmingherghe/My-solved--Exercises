/**  
 * (Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that
 * plays the scissor-rock-paper game. Revise the program to let the user continuously play until either the user or the computer wins more than two times than its
 * opponent.
 */
 
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

     	Scanner input = new Scanner(System.in);
        int ugWin = 0;
        int cgWin = 0;
        boolean winner = false;
        String whoWon = "";
      	
      	do{
	        System.out.print("Please enter a number 0, 1, or 2 representing scissor, rock, and paper: " );
			int ug = input.nextInt();
			int cg = (int)(Math.random() * 3);
		
			String ugStr;
			String cgStr;
		
			if( (ug == 0 && cg == 1) || (ug == 1 && cg == 2) || (ug == 2 && cg == 0) ) {
				System.out.print(" Computer wins !" );
				cgWin++;
			}
			else if( (ug == 0 && cg == 2) || (ug == 2 && cg == 0) || (ug == 2 && cg == 1) ) {
				System.out.print(" User wins !");
				ugWin++;
			}
			else {
				System.out.print(" Draw !");
			}
		
			if(ug == 0) {
				ugStr = "Scissor";
			} 
			else if(ug == 1) {
				ugStr = "Rock";
			} else {
				ugStr = "Paper";
			}
		
			if(cg == 0) {
				cgStr = "Scissor";
			} 
			else if(cg == 1) {
				cgStr = "Rock";
			} else {
				cgStr = "Paper";
			}
		
			System.out.println( " ( " + ugStr + " vs " + cgStr + " )");
      	
			if(cgWin - ugWin == 2) {
				winner = true;
				whoWon = "Computer";
			}
			else if(ugWin - cgWin == 2){
				winner = true;
				whoWon = "User";
			}
			
      	}while(!winner);
      	
      	System.out.println("\n\t\t\t Game over!\n" + whoWon + " wins more than two times than its opponent!");
     
	}
}
