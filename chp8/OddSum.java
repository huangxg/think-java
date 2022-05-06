public class OddSum {
    public static void main(String[] args) {
        System.out.println(oddSum(9));
    }

    private static int oddSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + oddSum(n - 2);
        }
    }
}
