import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = scanner.next();
        System.out.print("Please enter another word: ");
        String word1 = scanner.next();

        word.replaceAll("\\s","");
        word1.replaceAll("\\s","");
        if (areAnagrams(word, word1)) {
            System.out.println("They are anagrams");
        } else {
            System.out.println("They are not anagrams");
        }

        scanner.close();
    }

    private static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                if (times(c, str1) != times(c, str2)) {
                    return false;
                }
            }

            return true;
        }
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
