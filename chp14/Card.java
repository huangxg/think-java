import java.util.Comparator;

public class Card {
    public static final String[] RANKS = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
    };

    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

    private final int rank;
    private final int suit;
    
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getSuit() {
      return suit;
    }

    public int getRank() {
        return rank;
    }

    public String toString() {
        return RANKS[rank] + " of " + SUITS[suit];
    }

    public boolean equals(Card that) {
        return rank == that.rank && suit == that.suit;
    }

    public int compareTo(Card that) {
        if (suit < that.suit) {
            return -1;
        }
        if (suit > that.suit) {
            return 1;
        }
        if (rank < that.rank) {
            return -1;
        }
        if (rank > that.rank) {
            return 1;
        }
        return 0;
    }
}
