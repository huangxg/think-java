import java.util.Random;

public class Deck {
    private Card[] cards;

    private static Random random = new Random();

    public Deck(int n) {
        this.cards = new Card[n];
    }

    public Card[] getCards() {
        return cards;
    }

    public Deck() {
        cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                cards[index++] = new Card(rank, suit);
            }
        }
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("\nNew deck: ");
        System.out.println(deck);

        deck.shuffle();
        System.out.println("\nShuffled deck: ");
        System.out.println(deck);

        deck.selectionSort();
        System.out.println("\nSorted by Selection Sort: ");
        System.out.println(deck);

        deck.shuffle();
        System.out.println("\nShuffled again: ");
        System.out.println(deck);

        System.out.println("\nSorted by Almost Merge Sort: ");
        System.out.println(deck.almostMergeSort());

        deck.shuffle();
        System.out.println("\nShuffled again: ");
        System.out.println(deck);

        System.out.println("\nSorted by Merge Sort: ");
        System.out.println(deck.mergeSort());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < cards.length; i++) {
            sb.append(cards[i]);
            if (i != cards.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }

    private static int randomInt(int low, int high) {
        return low + random.nextInt(high - low + 1);
    }
    
    private void swapCards(int i, int j) {
        Card temp = cards[i];
        cards[i] = cards[j];
        cards[j] = temp;
    }

    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int j = randomInt(i, cards.length - 1);
            swapCards(i, j);
        }
    }

    private int indexLowest(int low, int high) {
        if (low == high) {
            return low;
        } else if (low > high) {
            return -1;
        } 

        int lowest = low;
        for (int i = low + 1; i <= high; i++) {
            if (cards[lowest].compareTo(cards[i]) > 0) {
                lowest = i;
            }
        }

        return lowest;
    }

    public void selectionSort() {
        for (int i = 0; i < cards.length - 1; i++) {
            int j = indexLowest(i, cards.length - 1);
            if (i != j) {
                swapCards(i, j);
            }
        }
    }

    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    private static Deck merge(Deck d1, Deck d2) {
        Card[] cards1 = d1.getCards();
        Card[] cards2 = d2.getCards();
        Deck d3 = new Deck(cards1.length + cards2.length);
        Card[] cards3 = d3.getCards();

        int i = 0;
        int j = 0;

        for (int k = 0; k < cards3.length; k++) {
            if (i == cards1.length) {
                cards3[k] = cards2[j++];
            } else if (j == cards2.length) {
                cards3[k] = cards1[i++];
            } else {
                int compare = cards1[i].compareTo(cards2[j]);
                if (compare <= 0) {
                    cards3[k] = cards1[i++];
                } else if (compare > 0) {
                    cards3[k] = cards2[j++];
                }
            }
        }

        return d3;
    }

    public Deck almostMergeSort() {
        Deck d1 = subdeck(0, 25);
        Deck d2 = subdeck(26, 51);
        d1.selectionSort();
        d2.selectionSort();

        return merge(d1, d2);
    }

    public Deck mergeSort() {
        if (cards.length < 2) {
            return this;
        } else {
            int mid = cards.length / 2;
            Deck d1 = subdeck(0, mid - 1);
            Deck d2 = subdeck(mid, cards.length - 1);
            return merge(d1.mergeSort(), d2.mergeSort());
        }
    }
}
