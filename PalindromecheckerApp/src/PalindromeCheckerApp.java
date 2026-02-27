/**
 * MAIN CLASS: PalindromeCheckerApp
 * Use Case 12: Strategy Pattern for Palindrome Algorithms (Advanced)
 *
 * Description:
 * Implement multiple palindrome checking algorithms
 * using the Strategy Design Pattern. Different
 * strategies can be selected at runtime.
 *
 * Key Concepts Used:
 *  - Strategy Design Pattern
 *  - Interface Implementation
 *  - Runtime Polymorphism
 *  - Clean Architecture
 *  - Open/Closed Principle
 *
 * @author SHIVANSH DHINGRA
 * @version 12.0
 */

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

// Concrete Strategy 1: Two-Pointer Approach
class TwoPointerStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        if (input == null) return false;

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

// Concrete Strategy 2: Reverse String Approach
class ReverseStringStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        if (input == null) return false;

        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        String reversed = new StringBuilder(normalized).reverse().toString();

        return normalized.equals(reversed);
    }
}

// Context Class
class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.isPalindrome(input);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "Was It A Rat I Saw";

        // Choose Strategy 1
        PalindromeContext context =
                new PalindromeContext(new TwoPointerStrategy());

        boolean result1 = context.execute(text);

        System.out.println("Two-Pointer Strategy Result: " + result1);

        // Switch to Strategy 2
        context.setStrategy(new ReverseStringStrategy());

        boolean result2 = context.execute(text);

        System.out.println("Reverse String Strategy Result: " + result2);
    }
}