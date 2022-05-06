public class Max {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 7};
        System.out.printf("The max is %d", max(numbers));
    }

    private static int maxInRange(int[] numbers, int low, int high) {
        if (low == high) {
            return numbers[low];
        } else {
            int mid = (low + high) / 2;
            int max1 = maxInRange(numbers, low, mid);
            int max2 = maxInRange(numbers, mid + 1, high);
            return max1 > max2 ? max1 : max2;
        }
    }

    private static int max(int[] numbers) {
        return maxInRange(numbers, 0, numbers.length - 1);
    }
}
