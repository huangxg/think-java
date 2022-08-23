public class Calc {
    public static void main(String[] args) {
        System.out.println(count("((3 + 7) * 2)"));
        System.out.println(count("(3 + 7) * 2)"));
        System.out.println(count("((3 + 7) * 2"));
    }

    private static int count(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }

        return count;
    }
}
