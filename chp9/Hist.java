import java.util.Arrays;
import java.util.Random;

public class Hist {
    public static void main(String[] args) {
        int[] a = randomArray(10);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(hist(a)));
    }

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    private static int[] hist(int[] scores) {
        int[] counts = new int[100];
        for (int i = 0; i < scores.length; i++) {
            int index = scores[i];
            counts[index]++;
        }

        return counts;
    }
}
