import java.util.Arrays;
import java.util.Random;

public class Card {
    public static final String[] RANKS = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
    };

    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

    private final int rank;
    private final int suit;

    public static void main(String[] args) {
        Card[] deck = makeDeck();
        System.out.println(deck[0]);
        System.out.println(deck[51]);

        Card[] cards = dealHand(deck, 10);
        System.out.println(Arrays.toString(cards));
        System.out.printf("The hand has flush: %b\n", hasFlush(cards));
    }

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
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

    public static Card[] makeDeck() {
        Card[] cards = new Card[52];
        int index = 0;

        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                cards[index++] = new Card(rank, suit);
            }
        }

        return cards;
    }

    public static int[] suitHist(Card[] hand) {
        int[] counts = new int[SUITS.length];
        for (int i = 0; i < hand.length; i++) {
            int index = hand[i].getSuit();
            counts[index]++;
        }

        return counts;
    }

    public static Card[] dealHand(Card[] deck, int n) {
        Card[] cards = new Card[n];
        Random r = new Random();
        for (int i = 0; i < n; i ++) {
            cards[i] = deck[r.nextInt(deck.length)];
        }

        return cards;
    }

    public static boolean hasFlush(Card[] hand) {
        int[] suitHist = suitHist(hand);
        System.out.println(Arrays.toString(suitHist));

        for (int count : suitHist) {
            if (count > 4) {
                return true;
            }
        }

        return false;
    }
}
