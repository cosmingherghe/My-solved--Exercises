// (Game: pick four cards) Write a program that picks four cards from a deck of 52
// cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13,
// 12, and 11, respectively. Your program should display the number of picks that
// yields the sum of 24.

public class PickFourCards {  
		
			public static void main(String[] args) {
				
				String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
				String[] ranks = {"King", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "Ace"};
	 
				int sum = 24;
				int numberOfPicksThatYieldsTheSum = 0;
				int spadeStart = 0;
				int heartStart = 14;
				int diamondStart = 27;
				int clubsStart = 40;
				int numberCardsInDeck = 52;
				
				int testSum, spade, heart, diamond, clubs;
				
				for (int a = spadeStart; a < heartStart; a++) { // cards of Spades
					for (int b = heartStart; b < diamondStart; b++) { // cards of Hearts
						for (int c = diamondStart; c < clubsStart; c++) { // cards of Diamonds
							for (int d = clubsStart; d < numberCardsInDeck; d++) { // cards of Clubs
								
								testSum = 0;
								spade = a%13 == 0 ? 13 : a%13; 
								heart = b%13 == 0 ? 13 : b%13;
								diamond = c%13 == 0 ? 13 : c%13;
								clubs = d%13 == 0 ? 13 : d%13;
								testSum = spade + heart + diamond + clubs;
					 

								if(testSum == sum) {  
									
/** Test									
									System.out.println( " " + ranks[spade % 13] + " of " + suits[spade / 13] +
													  " " + ranks[heart % 13] + " of " + suits[heart / 13] +
													  " " + ranks[diamond % 13] + " of " + suits[diamond / 13] +
													  " " + ranks[clubs % 13] + " of " + suits[clubs / 13]);
*/							
									numberOfPicksThatYieldsTheSum++;
								}
							}
						}
					}
				}
					 
				System.out.println("Number of picks that yields the sum of " + sum + " = " + numberOfPicksThatYieldsTheSum);
			} 
	}
		    
		    
		    
		    
