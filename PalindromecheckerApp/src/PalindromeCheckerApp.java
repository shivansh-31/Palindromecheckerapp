/**
 * MAIN CLASS: PalindromeCheckerApp
 * Use Case 9: Recursive Palindrome Check
 *
 * Description:
 * Check whether a given string is a palindrome
 * using Recursion by comparing characters
 * from start and end moving inward.
 *
 * Key Concepts Used:
 *  - Recursion
 *  - Base Case & Recursive Case
 *  - String Indexing
 *  - Call Stack Understanding
 *  - Time Complexity Awareness (O(n))
 *
 * @author SHIVANSH DHINGRA
 * @version 9.0
 */

public class PalindromeCheckerApp {

    // Recursive Method to Check Palindrome
    public static boolean isPalindrome(String word, int start, int end) {

        // Base Case
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        // Recursive Call
        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "madam";

        boolean result = isPalindrome(word, 0, word.length() - 1);

        if (result) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}