import java.util.Scanner;

public class Scrabble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.print("Enter tiles: ");
        String tiles = scanner.next();
        System.out.println(canSpell(word, tiles));

        scanner.close();
    }

    private static int times(char c, String word) {
        int times = 0;
        for (int i = 0; i < word.length(); i++) {
            if (c == word.charAt(i)) {
                times++;
            }
        }

        return times;
    }

    private static boolean canSpell(String word, String tiles) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (times(c, word) > times(c, tiles)) {
                return false;
            }
        }

        return true;
    }
}
