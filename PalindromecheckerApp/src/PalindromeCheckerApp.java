/**
 * MAIN CLASS: PalindromeCheckerApp
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * Implement palindrome checking using
 * Object-Oriented Programming principles.
 * A separate service class handles the
 * palindrome logic.
 *
 * Key Concepts Used:
 *  - OOP (Encapsulation)
 *  - Service Class Design
 *  - Method Abstraction
 *  - Two-Pointer Technique
 *  - Clean Code Structure
 *
 * @author SHIVANSH DHINGRA
 * @version 11.0
 */

// Service Class
class PalindromeService {

    public boolean isPalindrome(String input) {

        if (input == null) {
            return false;
        }

        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "Never Odd Or Even";

        PalindromeService service = new PalindromeService();
        boolean result = service.isPalindrome(text);

        if (result) {
            System.out.println("\"" + text + "\" is a palindrome");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome");
        }
    }
}