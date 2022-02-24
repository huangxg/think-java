public class Date {
    private static void printAmerican(String day, int date, String month, int year) {
        System.out.printf("%s, %s %d, %d\n", day, month, date, year);
    }

    private static void printEuropean(String day, int date, String month, int year) {
        System.out.printf("%s %d %s %d\n", day, date, month, year);
    }
    
    public static void main(String[] args) {
        printAmerican("Tuesday", 22, "February", 2022);
        printEuropean("Tuesday", 22, "February", 2022);
    }
}
