//  (Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens
//  on a chessboard such that no two queens can attack each other (i.e., no two queens
//  are on the same row, same column, or same diagonal). There are many possible
//  solutions. 

public class EightQueens {

	public static void main(String[] args) {
 
		int[] chessboard = createBoard(); 
		int[] queens; 
		
		boolean test;
		do{
			queens = queensNumbersOnBoard(8);  //add 8 queens on the board
			test = queensOffRange(chessboard, queens);
		}while(!test);
		
		displayBoard(chessboard, queens); 
	}
	
	//generate chessboard 
	public static int[] createBoard() {
		int[] chessboard = new int[64];
		
		for (int i = 0; i < chessboard.length; i++) {
			chessboard[i] = Integer.valueOf( (i/8) + "" + (i%8) );
		}
		
		return chessboard;
	}
	
	//Queen range
	public static boolean qAttackCR(int queen, int attack) { 
        int qCol = queen/10;
        int qLine = attack/10;
        int aCol = queen%10;
        int aLine = attack%10;
         
		return  (qCol == qLine) || (aCol == aLine) || (qCol - aCol == qLine - aLine) || (qCol - aLine == qLine - aCol);
	}
	
	//Number of no two queens can attack each other
	public static boolean queensOffRange(int[] chessboardint, int[] numberOfQueens) {
		boolean range = true;
		
		for (int i = 0; i < numberOfQueens.length; i++) { 
			for (int j = i + 1; j < numberOfQueens.length; j++) {
				if( qAttackCR(chessboardint[numberOfQueens[i]], chessboardint[numberOfQueens[j]]) ){
					range = false;
				}
			}
		} 
		return range;
	}
	
	//board number == queen number
	public static boolean qeenOnBoard(int boardNumber, int[] queens) {
		boolean sameSpot = false;
		for (int i = 0; i < queens.length; i++) {
			if(boardNumber == queens[i]) 
				sameSpot = true; 
		}
		return sameSpot;
	}
	
	//
	public static int[] queensNumbersOnBoard(int numberOfQueens) {
		int[] queens = new int[numberOfQueens];
		
		for (int i = 0; i < numberOfQueens; i++) {
			queens[i] = (int)(1 + Math.random() * 63);
		}
		
		return queens;
	}
	
	//displayBoard & Queens
	public static void displayBoard(int[] board, int[] queens) {
  
		for (int i = 0; i < board.length; i++) {
			
			if(board[i] < 10) {
				if( qeenOnBoard(i,queens) ) 
					System.out.print("| Q");
				else { 
					System.out.print("| " + board[i]);
				}
			}				
			else {
				if( qeenOnBoard(i,queens) )
					System.out.print("| Q");
				else {
					System.out.print("|" + board[i]);
				} 
			} 
			
			if(i % 8 == 7)
				System.out.println("|"); 
		} 
	}
	 
}
