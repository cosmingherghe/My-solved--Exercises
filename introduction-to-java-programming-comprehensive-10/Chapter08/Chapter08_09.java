/** (Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
marking an available cell in a 3 * 3 grid with their respective tokens (either
X or O). When one player has placed three tokens in a horizontal, vertical, or
diagonal row on the grid, the game is over and that player has won. A draw (no
winner) occurs when all the cells on the grid have been filled with tokens and
neither player has achieved a win. Create a program for playing tic-tac-toe.
The program prompts two players to enter an X token and O token alternately. Whenever a token is entered, the program redisplays the board on the
console and determines the status of the game (win, draw, or continue). 
import java.util.Scanner;
*/

import java.util.Scanner;

public class PlayAticTacToeGame { 
	public static void main(String[] args) {

		int[][] board = { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} };
		int playerToStart = 2;
		boolean winner = true;
		
		displayGame(board);
		
		while(winner){  
			playerToStart = (playerToStart == 1) ? 2 : 1;
			
			player(playerToStart, board);
			displayGame(board);
			
			int[][] gameInfo = checkWinner(board);
			
			if(gameInfo[0][0] == 1) {
				winner = false; 
				System.out.print( (gameInfo[0][1] == 1) ? "X player won" : "O player won" );
			}
			 
			
		}
	}
	
	public static void player(int player, int[][] board) {
		Scanner input = new Scanner(System.in);
		int row = 0;
		int column = 0;
		
		String playerXO = (player == 1) ? "X" : "Y";
		System.out.print("Enter a row (0, 1, or 2) for player " + playerXO + ": ");
		row = input.nextInt();
		System.out.print("Enter a column (0, 1, or 2) for player " + playerXO + ": ");
		column = input.nextInt();
		System.out.println();
		
		board[row][column] = (player == 1) ? 1 : 2; //add token on the board 
	}
	
	public static int[][] checkWinner(int[][] cells) {
		int[][] winner = new int[1][2];
		//if winner[0][0] = 1 - we have a winner
		//if winner[0][1] == 1 () winner = X
		//if winner[0][1] == 2 () winner = O
		
		for (int i = 0; i < cells.length; i++) {
			//check rows & columns 
			if( (cells[i][0] == cells[i][1] && cells[i][1] == cells[i][2])
			 || (cells[0][i] == cells[1][i] && cells[1][i] == cells[2][i]) ) {
				
				for (int j = 0; j < cells.length; j++) {
					if( cells[j][i] == 1 || cells[j][i] == 2 ) {
						winner[0][0] = 1;
						winner[0][1] = (cells[j][i] == 1) ? 1 : 2; 
					}
				}
			}
		}
		
		//check diagonals 
		if( cells[0][0] == cells[1][1] && cells[1][1] == cells[2][2]
		 || cells[2][0] == cells[1][1] && cells[1][1] == cells[0][2] ) {
			if( cells[1][1] == 1 || cells[1][1] == 2 ) { 
				winner[0][0] = 1;
				winner[0][1] =  (cells[1][1] == 1) ? 1 : 2;
			} 
		} 
		
		return winner;
	}
	
	public static void displayGame(int[][] cells) {

		System.out.println("-------------");
		for (int i = 0; i < cells.length; i++) {
			 
			for (int j = 0; j < cells.length; j++) {
				if( cells[i][j] == 1 ){
					System.out.print("| X ");
				}
				else if( cells[i][j] == 2 ){
					System.out.print("| O ");
				}
				else{
					System.out.print("|   ");
				}
			} 
			System.out.println("|");// new line
			System.out.println("-------------");
		}
		System.out.println();// new line
	}
 
}
