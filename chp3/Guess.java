import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100\n(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        Scanner in = new Scanner(System.in);
        int guess = in.nextInt();

        System.out.printf("The number I was thinking of is: %d\n", number);
        System.out.printf("You were off by: %d", guess - number);
        in.close();
    }
}
