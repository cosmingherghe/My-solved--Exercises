public class Main {

    public static void main(String[] args) {


        int deckCard = (int)(Math.random() * 52) + 1;
        int cardRand = deckCard % 13;
        int suitRand = deckCard % 4;

        String cardRank = null;
        switch (cardRand) {
            case 0: cardRank = "Ace";
                break;
            case 10: cardRank = "Jack";
                break;
            case 11: cardRank = "Queen";
                break;
            case 12: cardRank = "King";
                break;
            default: cardRank = String.valueOf(cardRand);
                break;
        }

        String cardSuit = null;
        switch (suitRand) {
            case 0: cardSuit = "Clubs";
                break;
            case 1: cardSuit = "Diamonds";
                break;
            case 2: cardSuit = "Hearts";
                break;
            case 3: cardSuit = "Spades";
                break;
        }

        System.out.println( "The card you picked is " + cardRank + " of " + cardSuit  );
    }
}
