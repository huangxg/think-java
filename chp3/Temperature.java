import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        double tempC = in.nextDouble();
        double tempF = tempC * 9 / 5 + 32;
        System.out.printf("%3.1f C = %3.1f F", tempC, tempF);
        in.close();
    }
}
