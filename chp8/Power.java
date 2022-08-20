import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Please enter n: ");
        int n = scanner.nextInt();
        System.out.println(power(x, n));

        scanner.close();        
    }

    private static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            double result = power(x, n / 2);
            return result * result;
        } else {
            return x * power(x, n - 1);
        }
    }
}
