public class Date {
    private int day, month, year;

    public static void main(String[] args) {
        Date birthday = new Date(1879, 3, 14);
        System.out.println(birthday);
    }

    public Date() {
        day = 1;
        month = 1;
        year = 1970;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return String.format("Date: %d, %d, %d", year, month, day);
    }
}
