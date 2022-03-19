import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter b: ");
        int b = scanner.nextInt();
        System.out.print("Please enter c ");
        int c = scanner.nextInt();
        int delta = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("a can't be zero.");
        } else if (delta < 0) {
            System.out.println("delta can't be negative.");
        } else if (delta == 0) {
            System.out.printf("One solution: %f", (-b / 2.0 / a));
        } else {
            double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b + sqrtDelta) / 2 / a;
            double x2 = (-b - sqrtDelta) / 2 / a;
            System.out.printf("Two solutions: %f, %f", x1, x2);
        }

        scanner.close();
    }
}
