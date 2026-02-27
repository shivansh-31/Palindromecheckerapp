/**
 * MAIN CLASS: PalindromeCheckerApp
 * Use Case 13: Performance Comparison of Palindrome Algorithms
 *
 * Description:
 * Compare the performance of two different
 * palindrome checking approaches:
 *   1. Two-Pointer Technique
 *   2. Reverse String Technique
 * Measure execution time using System.nanoTime().
 *
 * Key Concepts Used:
 *  - Performance Measurement
 *  - System.nanoTime()
 *  - Strategy Comparison
 *  - Time Complexity Awareness
 *  - Basic Benchmarking
 *
 * @author SHIVANSH DHINGRA
 * @version 13.0
 */

public class PalindromeCheckerApp {

    // Two-Pointer Approach
    public static boolean twoPointerCheck(String input) {

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

    // Reverse String Approach
    public static boolean reverseStringCheck(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        String reversed = new StringBuilder(normalized).reverse().toString();

        return normalized.equals(reversed);
    }

    public static void main(String[] args) {

        String text = "Able was I ere I saw Elba";

        // Measure Two-Pointer Execution Time
        long startTime1 = System.nanoTime();
        boolean result1 = twoPointerCheck(text);
        long endTime1 = System.nanoTime();

        long duration1 = endTime1 - startTime1;

        // Measure Reverse String Execution Time
        long startTime2 = System.nanoTime();
        boolean result2 = reverseStringCheck(text);
        long endTime2 = System.nanoTime();

        long duration2 = endTime2 - startTime2;

        System.out.println("Two-Pointer Result: " + result1);
        System.out.println("Two-Pointer Execution Time (ns): " + duration1);

        System.out.println("Reverse String Result: " + result2);
        System.out.println("Reverse String Execution Time (ns): " + duration2);
    }
}