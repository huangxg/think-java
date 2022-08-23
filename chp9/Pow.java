import java.math.BigInteger;

public class Pow {
    public static void main(String[] args) {
        System.out.println("Pow with int");
        for (int i = 0; i < 10; i++) {
            System.out.printf("1024 to the %dth pow: %d\n", i, pow(1024, i));    
        }

        System.out.println("\nPow with long");
        for (int i = 0; i < 10; i++) {
            System.out.printf("1024 to the %dth pow: %d\n", i, longPow(1024, i));    
        }

        System.out.println("\nPow with BigInteger");
        for (int i = 0; i < 10; i++) {
            System.out.printf("1024 to the %dth pow: %d\n", i, bigPow(1024, i));    
        }
    }
    
    private static int pow(int x, int n) {
        if (n == 0) return 1;
    
        // find x to the n/2 recursively
        int t = pow(x, n / 2);
    
        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x
        if (n % 2 == 0) {
            return t * t;
        } else {
            return t * t * x;
        }
    }

    private static long longPow(int x, int n) {
        if (n == 0) return 1;
    
        long t = longPow(x, n / 2);
    
        if (n % 2 == 0) {
            return t * t;
        } else {
            return t * t * x;
        }
    }

    private static BigInteger bigPow(int x, int n) {
        if (n == 0) return BigInteger.valueOf(1);
    
        BigInteger t = bigPow(x, n / 2);
    
        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        }
    }
}
