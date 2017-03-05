public class Main {

    public static void main(String[] args) {

        int cardRand = (int)(Math.random() * 13) + 1;
        int suitRand = (int)(Math.random() * 4) + 1;


        String cardRank = null;
        switch (cardRand) {
            case 1: cardRank = "Ace";
                break;
            case 11: cardRank = "Jack";
                break;
            case 12: cardRank = "Queen";
                break;
            case 13: cardRank = "King";
                break;
            default: cardRank = String.valueOf(cardRand);
                break;
        }

        String cardSuit = null;
        switch (suitRand) {
            case 1: cardSuit = "Clubs";
                break;
            case 2: cardSuit = "Diamonds";
                break;
            case 3: cardSuit = "Hearts";
                break;
            case 4: cardSuit = "Spades";
                break;
        }

        System.out.println( "The card you picked is " + cardRank + " of " + cardSuit  );
    }
}
