import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number of seconds: ");
        int totalSeconds = in.nextInt();
        int hours = totalSeconds / 3600;
        int seconds = totalSeconds % 3600;
        int minutes = seconds / 60;
        seconds = seconds % 60;
        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds.", 
            totalSeconds, hours, minutes, seconds);
        in.close();
    }
}
