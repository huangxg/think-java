public class EightFirstPlayer extends Player {
    public EightFirstPlayer(String name) {
        super(name);
    }

    public Card searchForEight() {
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.getCard(i);
            if (card.getRank() == 6) {
                return hand.popCard(i);
            }
        }
        return null;
    }

    public Card play(Eights eights, Card prev) {
        Card card = searchForEight();
        if (card == null) {
            return super.play(eights, prev);
        }
        return card;
    }
}
