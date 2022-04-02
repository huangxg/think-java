import java.util.Scanner;

public class Abecedarian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        System.out.println(isAbecedarian(scanner.next()));

        scanner.close();
    }

    private static boolean isAbecedarian(String word) {
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i-1) >= word.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
