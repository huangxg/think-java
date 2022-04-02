import java.util.Scanner;

public class Gauss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print(gauss(x, n));

        scanner.close();
    }

    private static double gauss(double x, int n) {
        double sum = 1;
        double term = 1;
        for (int i = 1; i <= n; i++) {
            term = -term * x * x / i;
            sum += term;
        }

        return sum;
    }
}
