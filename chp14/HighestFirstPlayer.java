public class HighestFirstPlayer extends Player {
    public HighestFirstPlayer(String name) {
        super(name);
    }

    public Card play(Eights eights, Card prev) {
        // Sort by rank in decreasing order
        hand.cards.sort((c1, c2) -> c2.getRank() - c1.getRank());
        return super.play(eights, prev);
    }
}
