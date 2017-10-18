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
				int numberCardsInDeck = 52;
				
				int testSum, card1, card2, card3, card4;
				
				for (int a = 0; a < 52; a++) {
					for (int b = a + 1; b < numberCardsInDeck; b++) { // b != a so b = a + 1;
						
						for (int c = b + 1; c < numberCardsInDeck; c++) {   // c != a or b ; c = a + 1;
							for (int d = c + 1; d < numberCardsInDeck; d++) {  // d != a or b or c ; d = c + 1;
								
								testSum = 0;
								card1 = a%13 == 0 ? 13 : a%13; 
								card2 = b%13 == 0 ? 13 : b%13;
								card3 = c%13 == 0 ? 13 : c%13;
								card4 = d%13 == 0 ? 13 : d%13;
								testSum = card1 + card2 + card3 + card4;
					 

								if(testSum == sum) {  
 							
									numberOfPicksThatYieldsTheSum++;
								}
							}
						}
					}
				}
					 
				System.out.println("Number of picks that yields the sum of " + sum + " = " + numberOfPicksThatYieldsTheSum);
			} 
	}
		    
		    
		    
		    
