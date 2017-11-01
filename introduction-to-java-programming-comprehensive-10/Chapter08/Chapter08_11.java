11 

/** 1 (Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some
  *  face up and some face down. You can represent the state of the coins using a
  *  3-by-3 matrix with values 0 (heads) and 1 (tails). Here are some examples:
  *  
  *  0 0 0 1 0 1 1 1 0 1 0 1 1 0 0
  *  0 1 0 0 0 1 1 0 0 1 1 0 1 1 1
  *  0 0 0 1 0 0 0 0 1 1 0 0 1 1 0
  *  
  *   Each state can also be represented using a binary number. For example, the preceding
  *  matrices correspond to the numbers
  *  000010000 101001100 110100001 101110100 100111110
  *  
  *   There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 3,
  *  . . . , and 511 to represent all states of the matrix. Write a program that prompts
  *  the user to enter a number between 0 and 511 and displays the corresponding
  *  matrix with the characters H and T.
  * 
  * Enter a number between 0 and 511: 7
  * H H H
  * H H H
  * T T T
  * 
  */
 
import java.util.*; 

public class NineHeadsAndTails{
	public static void main(String[] args) { 
	
		Scanner input = new Scanner(System.in);
		String[] possibilities = getPossibilities();

		System.out.print("Enter a number between 0 and 511: ");
		int index= input.nextInt();
		
		System.out.print( possibilities[index] );
	}
	
	public static String[] getPossibilities() { 
	
		String[] combinations = new String[512];
		String binaryString = "";
		int number = 0;

		for (int b = Integer.parseInt("000000000",2), index = 0; b <= Integer.parseInt("111111111",2); b++, index++) {

			number = Integer.parseInt("011000000",2);
			binaryString = Integer.toBinaryString(number);
			
			if(binaryString.length() < 9) {
				for(int i = 9 - binaryString.length(); i > 0; i--)
					binaryString = "0" + binaryString;
			}

	        	combinations[index] = binaryString;
		}
		return combinations;
	}
}
