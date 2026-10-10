package data_structures.class_problems;

public class WordReverserAndPalindromeChecker {
    static String reverseAndCheckPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return reversed + (word.equals(reversed) ? " - palindrome" : " - not a palindrome");
    }

    public static void main(String[] args) {
        System.out.println(reverseAndCheckPalindrome("level"));
        System.out.println(reverseAndCheckPalindrome("java"));
    }
}
