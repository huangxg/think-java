public class EightFirstEights extends Eights {
    public EightFirstEights() {
        Deck deck = new Deck("Deck");
        deck.shuffle();

        // deal cards to each player
        one = new EightFirstPlayer("Allen");
        deck.deal(one.getHand(), 5);
        two = new Player("Chris");
        deck.deal(two.getHand(), 5);

        // turn one card face up
        discardPile = new Hand("Discards");
        deck.deal(discardPile, 1);

        // put the rest of the deck face down
        drawPile = new Hand("Draw pile");
        deck.dealAll(drawPile);
    }

    public static void main(String[] args) {
        EightFirstEights game = new EightFirstEights();
        game.playGame();
    }
}
