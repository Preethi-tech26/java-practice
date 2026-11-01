package junitdemo;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("banker"));
        System.out.println(isPalindrome("Madam"));
    }

    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        return text.equalsIgnoreCase(sb.toString());
    }
}


