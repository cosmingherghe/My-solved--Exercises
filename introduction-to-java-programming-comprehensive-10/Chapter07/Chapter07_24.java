public class HelloWorld {
	public static void main(String[] args) {
		
		/* get a shuffled deck of cards **/
		int[] deck = getShuffledDeck();
				
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		
		boolean[] fourCardsFromEachSuit = new boolean[4];
		int pickCardNumber;
		int numberOfPicks = 0;
		
		while(!areAllKeysTrue(fourCardsFromEachSuit)) {
			pickCardNumber = (int) Math.floor(Math.random() * 52);
			numberOfPicks++;
			
			if(!fourCardsFromEachSuit[pickCardNumber/13]){
		
				System.out.println( ranks[pickCardNumber%13] + " of " + suits[pickCardNumber/13] );
		
				fourCardsFromEachSuit[pickCardNumber/13] = !fourCardsFromEachSuit[pickCardNumber/13];
			}
		}
		
		System.out.println( "Number of picks: " + numberOfPicks );
		 
	}

	public static boolean areAllKeysTrue(boolean[] keys) {
		boolean test = true;
		for(int i = 0; i < keys.length; i++){
			if(!keys[i])
				test = false;
		}
		return test;
	}
	
	public static int[] getShuffledDeck() {
	
		int[] deck = new int[52];

		// Initialize the cards
		for (int i = 0; i < deck.length; i++)
		deck[i] = i;

		// Shuffle the cards
		for (int i = 0; i < deck.length; i++) {
			// Generate an index randomly
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		return deck;
	}
	
}
