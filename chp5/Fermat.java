import java.util.Scanner;

public class Fermat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        check(scanner);
    }

    private static void check(Scanner scanner) {
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn’t work.");
        }
    }
}
