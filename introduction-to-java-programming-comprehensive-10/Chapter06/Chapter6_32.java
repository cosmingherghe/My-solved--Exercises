/**	(Game: chance of winning at craps) Revise Exercise 6.30 to run it 10,000 times
*	and display the number of winning games.
*/

public class ChanceOfWinningAtCraps {

	public static void main(String[] args) {

			int winningGames = 0;
			
			for(int i= 0; i< 10000;i++){
				if(runCraps())
					winningGames++;
			}
			
			System.out.println("Number of winning games: " + winningGames);
	}
	
	public static boolean runCraps() {
		boolean runCraps = false;
		boolean pointEstablished = false;
		
		do{
			int firDice = 1 + (int)(Math.random() * ((12 - 1) + 1));
			int secDice = 1 + (int)(Math.random() * ((12 - 1) + 1));
			int sum = firDice + secDice;
			 
			if(isCraps(sum)) {
				runCraps = false; 
				break;
			}
			else if(isNatural(sum)) {  
				if(pointEstablished && sum == 7) { 
					runCraps = false; 
					break;
				}
				else {
					runCraps = true; 
					break;
				}
			}
			else {
				pointEstablished = true;
			}
		}while(pointEstablished != false); 
		
		return runCraps;
	}
	
	public static boolean isNatural(int sum) {
		if(sum == 7 || sum == 11)
			return true;
		else
			return false;
	}
	public static boolean isCraps(int sum) {
		if(sum == 2 || sum == 3 || sum == 12)
			return true;
		else
			return false;
	}
}
