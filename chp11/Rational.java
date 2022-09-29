public class Rational {
    private int numerator, denominator;

    public static void main(String[] args) {
        Rational r = new Rational(113, 355);
        r.printRational();
        System.out.println(r);

        r.negate();
        System.out.println(r);

        r.invert();
        System.out.println(r);

        System.out.println(r.toDouble());

        System.out.printf("%s reduced to %s\n", r, r.reduce());

        r = new Rational(1024, 2048);
        System.out.printf("%s reduced to %s\n", r, r.reduce());

        r = new Rational(2, 4);
        Rational r1 = r.add(new Rational(2, 6));
        System.out.println(r1);
    }

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void printRational() {
        System.out.printf("Rational: %d/%d\n", numerator, denominator);
    }

    public String toString() {
        return String.format("Rational: %d/%d", numerator, denominator);
    }

    public void negate() {
        numerator = -numerator;
    }

    public void invert() {
        int tmp = numerator;
        numerator = denominator;
        denominator = tmp;
    }

    public double toDouble() {
        return (double)numerator / denominator;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return Math.max(a, -a);
        } else {
            return gcd(b, a % b);
        }
    }

    public Rational reduce() {
        int gcd = Rational.gcd(numerator, denominator);
        return new Rational(numerator/gcd, denominator/gcd);
    }

    public Rational add(Rational that) {
        int n = numerator * that.denominator + denominator * that.numerator;
        int d = denominator * that.denominator;
        return new Rational(n, d).reduce();
    }
}
