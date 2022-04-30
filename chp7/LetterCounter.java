import java.util.Arrays;

public class LetterCounter {
    public static void main(String[] args) {
        int[] counts = letterHist("Supercalifragilisticexpialidocious");
        System.out.println(Arrays.toString(counts));
    }

    private static int[] letterHist(String str) {
        String lower = str.toLowerCase();
        int[] counts = new int[26];

        for (int i = 0; i < lower.length(); i++) {
            char letter = lower.charAt(i);
            int index = letter - 'a';
            counts[index]++;
        }

        return counts;
    }
}
