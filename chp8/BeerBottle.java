public class BeerBottle {
    public static void main(String[] args) {
        bottles(3);
    }

    private static void bottles(int n) {
        if (n == 0) {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya' can't take one down, ya' can't pass it around,");
            System.out.println("'cause there are no more bottles of beer on the wall!");
        } else {
            System.out.printf("%d bottles of beer on the wall,\n", n);
            System.out.printf("%d bottles of beer,\n", n);
            System.out.println("ya' take one down, ya' pass it around,");
            System.out.printf("%d bottles of beer on the wall.\n\n", n - 1);
            bottles(n - 1);
        }
    }
}
