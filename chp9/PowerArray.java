import java.util.Arrays;

public class PowerArray {
    public static void main(String[] args) {
        double[] numbers = {1.0, 2.0, 3.0};
        System.out.println(Arrays.toString(powerArray(numbers, 2)));
    }

    private static double[] powerArray(double[] numbers, int n) {
        double[] a = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            a[i] = Math.pow(numbers[i], n);
        }
        return a;
    }
}
