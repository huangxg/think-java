import java.math.BigInteger;

public class Big {
    public static void main(String[] args) {
        System.out.println("Factorial with int");
        for (int i = 0; i <= 30; i++) {
            System.out.printf("%d, %d\n", i, fact(i));
        }

        System.out.println("\nFactorial with long");
        for (int i = 0; i <= 30; i++) {
            System.out.printf("%d, %d\n", i, longFact(i));
        }

        System.out.println("\nFactorial with BigInteger");
        for (int i = 0; i <= 30; i++) {
            System.out.printf("%d, %d\n", i, bigFact(i));
        }
    }

    private static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        return prod;
    }

    private static long longFact(int n) {
        if (n == 0) {
            return 1;
        }

        long prod = 1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        return prod;
    }

    private static BigInteger bigFact(int n) {
        if (n == 0) {
            return BigInteger.valueOf(1);
        }

        BigInteger prod = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            prod = prod.multiply(BigInteger.valueOf(i));
        }
        return prod;
    } 
}
