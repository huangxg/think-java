public class Recurse {
    public static void main(String[] args) {
        printString("Hello");
        System.out.println();

        printBackwrod("Hello");
        System.out.println();

        System.out.println(reverseString("Hello"));
        System.out.println();

        System.out.printf("o is palindrome: %b\n", isPalindrome("o"));
        System.out.printf("otto is palindrome: %b\n", isPalindrome("otto"));
        System.out.printf("palindromeemordnilap is palindrome: %b\n", isPalindrome("palindromeemordnilap"));
        System.out.printf("ott0 is palindrome: %b\n", isPalindrome("ott0"));
    }

    private static void printString(String s) {
        if (length(s) == 0) {
            return;
        } else {
            System.out.println(first(s));
            printString(rest(s));
        }
    }

    private static void printBackwrod(String s) {
        if (length(s) == 0) {
            return;
        } else {
            printString(rest(s));
            System.out.println(first(s));
        }
    }

    private static String reverseString(String s) {
        if (length(s) == 0) {
            return "";
        } else {
            return reverseString(rest(s)) + first(s);
        }
    }

    private static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }

    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }

    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }

    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }
}
