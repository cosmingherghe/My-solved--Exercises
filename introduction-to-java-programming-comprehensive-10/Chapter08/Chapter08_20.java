/**
 	(Game: connect four) Connect four is a two-player board game in which the
	players alternately drop colored disks into a seven-column, six-row vertically
	suspended grid.
	The objective of the game is to connect four same-colored disks in a row, a column, 
	or a diagonal before your opponent can do likewise. The program prompts
	two players to drop a red or yellow disk alternately. In the preceding figure, the
	red disk is shown in a dark color and the yellow in a light color. Whenever a disk
	is dropped, the program redisplays the board on the console and determines the
	status of the game (win, draw, or continue).
 */

import java.util.*;

public class GameConnectFour {

	public static void main(String[] args) {

		int[][] board = new int[7][7];
		Scanner input = new Scanner(System.in);
		boolean winner = false;
		boolean player = true;
		String diskPlayer;

		int disk;

		do{  
			showBoard(board);

			player = !player; //  prompts two players to drop a red or yellow disk alternately
			diskPlayer = (player) ? "yellow" : "red";
			System.out.print("Drop a " + diskPlayer + " disk at column (0–6): ");
			disk = input.nextInt();

			addDisk(board, player, disk);
			
			if( checkWinner(board) == 1) {
				showBoard(board);
				System.out.println("The red player won"); 
				winner = !winner;
			}
			else if (checkWinner(board) == 2) {
				showBoard(board);
				System.out.println("The yellow player won"); 
				winner = !winner;
			}
			
		}while(!winner);
		
	}
	
	public static int checkWinner(int[][] game) {
		
		//matrix diagonals = (matrix.length - 1) + (matrix.length - 2) 
		for (int i = game.length - 4; i > 0; i--) {
			int red1 = 1;  	//1 = first   diagonal
			int yellow1 = 1;
			int red2 = 1;	//2 = second   diagonal
			int yellow2 = 1;
			
			for (int column = i, row = 0; column < game.length - 1; column++, row++ ) { //r = row , c = column
	 
					if(game[column][row] == game[column + 1][row + 1] && game[column + 1][row + 1] == 1) {
						red1++; 
						if(red1 == 4)
							return 1;
					}
					else {
						red1 = 1;
					}
					
					if(game[column][row] == game[column + 1][row + 1] && game[column + 1][row + 1] == 2){
						yellow1++; 
						if(yellow1 == 4)
							return 2;
					} 
					else { 
						yellow1 = 1;
					}   
					
					//------------
					
					if(game[row][column] == game[row + 1][column + 1] && game[row + 1][column + 1] == 1) {
						red2++; 
						if(red2 == 4)
							return 1;
					}
					else {
						red2 = 1;
					}
					
					if(game[row][column] == game[row + 1][column + 1] && game[row + 1][column + 1] == 2){
						yellow2++; 
						if(yellow2 == 4)
							return 2;
					} 
					else { 
						yellow2 = 1;
					}
					
			} 
		}//end for i
		   
		//compute major diagonals
		int red1 = 1;  	//1 = first major diagonal
		int yellow1 = 1;
		int red2 = 1;	//2 = second major diagonal
		int yellow2 = 1;
		for (int row = 0, column = game.length - 1; row < game.length - 1; row++, column-- ) { 
				
				if(game[row][row] == game[row + 1][row  + 1] && game[row + 1][row + 1] == 1) {
					red1++; 
					if(red1 == 4)
						return 1;
				}
				else {
					red1 = 1;
				}
					
				if(game[row][row] == game[row + 1][row  + 1] && game[row + 1][row + 1] == 2){
					yellow1++; 
					if(yellow1 == 4)
						return 2;
				} 
				else {
					yellow1 = 1;
				}
				
				//second major diag
				
				if(game[column][row] == game[column - 1][row + 1] && game[column - 1][row + 1] == 1) {
					red2++; 
					System.out.println(column + "" + row + "=" + (column - 1) + "" + (row + 1) + ">" + red1);
					if(red2 == 4)
						return 1;
				}
				else {
					red2 = 1;
				}
					
				if(game[column][row] == game[column - 1][row + 1] && game[column - 1][row + 1] == 2){
					yellow2++; 
					if(yellow2 == 4)
						return 2;
				} 
				else {
					yellow2 = 1;
				} 
		} 

		
		 
		 //check rows
		 for (int column = 0; column < game.length; column++) {
			int red = 1;
			int yellow = 1;
			for (int row = 0; row < game.length - 1; row++) { 
					
					if(game[column][row] == game[column][row + 1] && game[column][row + 1] == 1) {
						red++; 
						if(red == 4)
							return 1;
					}
					else {
						red = 1;
					}
					
					if(game[column][row] == game[column][row + 1] && game[column][row + 1] == 2){
						yellow++; 
						if(yellow == 4)
							return 2;
					} 
					else { 
						yellow = 1;
					} 
			} 
		 }
		
		 //check columns
		 for (int row = 0; row < game.length; row++) { 
			int red = 1;
			int yellow = 1;
			for (int column = 0; column < game.length - 1; column++) {
					
					if(game[column][row] == game[column + 1][row] && game[column + 1][row] == 1) { 
						red++; 
						if(red == 4)
							return 1;
					}
					else {
						red = 1;
					}
						 
					if(game[column][row] == game[column + 1][row] && game[column + 1][row] == 2){
						yellow++; 
						if(yellow == 4)
							return 2;
					} 
					else { 
						yellow = 1;
					} 
			} 
		 }
		 
		 return 0;
	}
	
	public static void addDisk(int[][] game, boolean player, int column) {
		boolean columnAdded = true;
		
		do{
			if( column > -1 && column < game.length && game[0][column] == 0) {
				for (int i = game.length - 1; i >= 0 ; i--) { 
					if(game[i][column] == 0) {
						game[i][column] = player ? 2 : 1;
						break;
					}
				}
				columnAdded = !columnAdded;
			}
			else{
				Scanner input = new Scanner(System.in);
				if(game[0][column] != 0)
					System.out.println("\nColumn " + column + " is full!");
					
				System.out.print("Drop a " + ( (player) ? "yellow" : "red" ) + " disk at column (0–6): ");
				column = input.nextInt();
			}
		} while(columnAdded);
	}
	
	public static void showBoard(int[][] game) {
		System.out.println();
		for (int i = 0; i < game.length; i++) {
			System.out.print("|");
			for (int j = 0; j < game.length; j++) {
				if(game[i][j] == 0) 
					System.out.print(" |"); 
				else
					System.out.print( (game[i][j] == 1) ? "R|" : "Y|" );
			}
			System.out.println();
		}
		System.out.println("---------------");
	}
 
}
