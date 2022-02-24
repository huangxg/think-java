public class Multadd {
    private static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    private static double expSum(double x) {
        double b = Math.exp(-x);
        double c = Math.sqrt(1 - b);
        return multadd(x, b, c);
    }

    public static void main(String[] args) {
        System.out.println(multadd(1, 2, 3));
        double a = Math.cos(Math.PI / 4);
        double c = Math.sin(Math.PI / 4);
        System.out.println(multadd(a, 1/2, c));
        System.out.println(expSum(1));
    }
}
