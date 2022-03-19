import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter b: ");
        int b = scanner.nextInt();
        System.out.print("Please enter c ");
        int c = scanner.nextInt();

        if (a >= b + c || b >= c + a || c >= a + b) {
            System.out.println("Are you kidding?");
        } else {
            System.out.println("You are serious.");
        }
    }
}
