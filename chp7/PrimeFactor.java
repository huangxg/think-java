import java.util.Arrays;

public class PrimeFactor {
    public static void main(String[] args) {
        arePrimeFactors(210, new int[]{2, 3, 5, 7});
        arePrimeFactors(210, new int[]{2, 3, 5, 6});
        arePrimeFactors(120, new int[]{2, 3, 5});
    }

    private static boolean arePrimeFactors(int num, int[] factors) {
        System.out.printf("Checking %d with factors %s\n", num, Arrays.toString(factors));
        boolean[] primes = sieve(num);
        int product = 1;
 
        for (int f : factors) {
            if (!primes[f]) {
                System.out.printf("%d is not a prime\n", f);
                return false;
            }

            product *= f;
        }

        if (num == product) {
            System.out.println("They are prime factors");
            return true;
        } else {
            System.out.println("They are prime numbers, but their product is not right");
            return false;
        }
    }

    private static boolean[] sieve(int n) {
        boolean[] primes = new boolean[n];
    
        for (int i = 2; i < n; i++) {
            primes[i] = true;
        } 

        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                for (int j = 2; i * j < n; j++) {
                    primes[i * j] = false;
                }
            }
        }

        return primes;
    }
}
