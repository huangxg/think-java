public class MaxIndex {
    public static void main(String[] args) {
        int[] numbers = {};
        System.out.printf("The index of the largest number in the array is %d\n", indexOfMax(numbers));

        int[] numbers1 = { 3 };
        System.out.printf("The index of the largest number in the array is %d\n", indexOfMax(numbers1));

        int[] numbers2 = { 3, 1, 4 };
        System.out.printf("The index of the largest number in the array is %d\n", indexOfMax(numbers2));
    }

    private static int indexOfMax(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        } else if (numbers.length == 1) {
            return 0;
        }

        int maxIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[maxIndex] < numbers[i]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
