import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        boolean[] primes = sieve(n);

        for (int i = 0; i < n; i++) {
            if (primes[i]) {
                System.out.println(i);
            }
        }

        scanner.close();
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
