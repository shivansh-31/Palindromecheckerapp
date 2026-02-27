/**
 * MAIN CLASS: PalindromeCheckerApp
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome Check
 *
 * Description:
 * Check whether a given string is a palindrome
 * by ignoring case differences and spaces.
 * The string is first normalized, then checked
 * using the Two-Pointer Technique.
 *
 * Key Concepts Used:
 *  - String Normalization
 *  - toLowerCase()
 *  - replaceAll()
 *  - Two-Pointer Technique
 *  - Time Complexity Awareness (O(n))
 *
 * @author SHIVANSH DHINGRA
 * @version 10.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Normalize the string (remove spaces and convert to lowercase)
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome (ignoring case and spaces)");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome");
        }
    }
}