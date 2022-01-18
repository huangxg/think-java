public class Time {
    public static void main(String[] args) {
        int hour = 20;
        int minute = 53;
        int second = 53;

        int secondsPassed = 3600 * hour + 60 * minute + second;
        System.out.println("Seconds since midnight: " + secondsPassed);
        int secondsRemaining = 86400 - secondsPassed;
        System.out.println("Seconds remaining in the day: " + secondsRemaining);
        double percentagePassed = secondsPassed / 86400.0 * 100;
        System.out.println("Percentage passed: " + percentagePassed + "%");

        int hour1 = 21;
        int minute1 = 3;
        int second1 = 30;
        int secondsPassed1 = 3600 * hour1 + 60 * minute1 + second1;
        System.out.println("Time spent on this homework question: " + (secondsPassed1 - secondsPassed));
    }
}
