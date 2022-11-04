public class War {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Pile p1 = new Pile();
        p1.addDeck(deck.subdeck(0, 25));
        Pile p2 = new Pile();
        p2.addDeck(deck.subdeck(26, 51));

        while (!p1.isEmpty() && !p2.isEmpty()) {
            // pop a card from each pile
            Card c1 = p1.popCard();
            Card c2 = p2.popCard();
        
            // compare the cards
            int diff = c1.getRank() - c2.getRank();
            if (diff > 0) {
                p1.addCard(c1);
                p1.addCard(c2);
            } else if (diff < 0) {
                p2.addCard(c1);
                p2.addCard(c2);
            } else {
                // it's a tie
                break;
            }
        }

        if (p2.isEmpty()) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
