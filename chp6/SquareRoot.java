import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive number: ");
        double a = scanner.nextDouble();
        System.out.printf("The square root: %f", squareRoot(a));
        scanner.close();
    }

    private static double squareRoot(double a) {
        double x0 = a / 2;
        double x1 = (x0 + a/x0) / 2;

        while (Math.abs(x1 - x0) > 0.0001) {
            x0 = x1;
            x1 = (x0 + a/x0) / 2;
        }

        return x1;
    }
}
