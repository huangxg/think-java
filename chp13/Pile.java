import java.util.ArrayList;

public class Pile {
    private ArrayList<Card> cards;

    public Pile() {
        this.cards = new ArrayList<Card>();
    }

    public Card popCard() {
        return this.cards.remove(0);  // from the top of the pile
    }

    public void addCard(Card card) {
        this.cards.add(card);        // to the bottom of the pile
    }

    public boolean isEmpty() {
        return this.cards.isEmpty();
    }

    public void addDeck(Deck deck) {
        for (Card card : deck.getCards()) {
            this.cards.add(card);
        }
    }
}
