/*
 * Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively. 
 * Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
 * lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
 * (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
 * a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
 */
 
public class gameCraps {

	public static void main(String[] args) {
		
		boolean pointEstablished = false;
		
		do{
			int firDice = 1 + (int)(Math.random() * ((12 - 1) + 1));
			int secDice = 1 + (int)(Math.random() * ((12 - 1) + 1));
			int sum = firDice + secDice;
			 
			if(isCraps(sum)) {
				System.out.printf("\nYou rolled %d + %d = %d \nYou lose\n", firDice, secDice, sum);
				break;
			}
			else if(isNatural(sum)) {  
				if(pointEstablished && sum == 7) { 
					System.out.printf("\nYou rolled %d + %d = %d \nYou lose\n", firDice, secDice, sum);
					break;
				}
				else {
					System.out.printf("\nYou rolled %d + %d = %d \nYou win\n", firDice, secDice, sum);
					break;
				}
			}
			else {
				pointEstablished = true;
				System.out.printf("\nYou rolled %d + %d = %d \npoint is %d\n", firDice, secDice, sum, sum);
			}
		}while(pointEstablished != false);
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
