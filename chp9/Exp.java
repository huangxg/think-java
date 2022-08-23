public class Exp {
    public static void main(String[] args) {
        double x = 0.1;
        for (int i = 0; i < 4; i++) {
            check(x);
            x *= 10;
        }

        x = -0.1;
        for (int i = 0; i < 4; i++) {
            check(x);
            x *= 10;
        }
    }

    private static Double exp(double x, int n) {
        double t = 1.0;
        double sum = 1.0;

        for (int i = 1; i < n; i++) {
            t *= x / i;
            sum += t;
        }

        return sum;
    }

    private static void check(double x) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d\t%f\t%f\t%f\n", i, x, exp(x, i), Math.exp(x));
        }
        System.out.println();
    }
}
