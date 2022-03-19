import java.util.Random;
import java.util.Scanner;

public class GuessAgain {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        guess(scanner, number, 1);
        scanner.close();
    }

    private static void guess(Scanner scanner, int number, int times) {
        if (times > 3) {
            System.out.println("Three times, you are out. It's " + number);
            return;
        }

        System.out.print("Type a number between 1 and 100 (including both): ");
        int guess = scanner.nextInt();

        if (guess > number) {
            System.out.println("Too high.");
            guess(scanner, number, times + 1);
        } else if (guess < number) {
            System.out.println("Too low.");
            guess(scanner, number, times + 1);
        } else {
            System.out.println("Congratulations! You got it.");
        }
    }
}
