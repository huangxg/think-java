import java.util.Scanner;

public class Doubloon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        System.out.println(isDoubloon(scanner.next().toLowerCase()));

        scanner.close();
    }

    private static boolean isDoubloon(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (times(word.charAt(i), word) != 2) {
                return false;
            }
        }

        return true;
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
}
