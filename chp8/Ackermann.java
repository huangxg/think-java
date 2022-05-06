import java.util.Scanner;

public class Ackermann {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter m: ");
        int m = scanner.nextInt();
        System.out.print("Please enter n: ");
        int n = scanner.nextInt();
        System.out.println(ack(m, n));

        scanner.close();
    }

    private static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ack(m - 1, 1);
        } else {
            return ack(m - 1, ack(m, n - 1));
        }
    }
}
