import java.util.Arrays;

public class Factor {
    public static void main(String[] args) {
        areFactors(24, new int[]{2, 3, 4, 6, 8, 12});
        areFactors(24, new int[]{2, 3, 4, 6, 7});
    }

    private static boolean areFactors(int num, int[] factors) {
        System.out.printf("Checking %d with factors %s\n", num, Arrays.toString(factors));

        for (int f : factors) {
            if (num % f != 0) {
                System.out.printf("%d is not a factor of %d\n", f, num);
                return false;
            }
        }

        System.out.println("All the numbers are factors");
        return true;
    }
}
