/**
 * MAIN CLASS: UseCase7PalindromeCheckerApp
 * Use Case 7: Deque-Based Optimized Palindrome Checker [cite: 3, 16]
 * * Description:
 * This class validates a palindrome using a Deque (Double Ended Queue)[cite: 19].
 * Characters are inserted and compared by removing elements from both ends[cite: 20].
 * * Key Concepts Used:
 * - Deque (Double Ended Queue) [cite: 10]
 * - Front and Rear Access [cite: 11]
 * - Optimized Data Handling [cite: 12]
 * * @author SHIVANSH DHINGRA
 * @version 7.0 [cite: 26]
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {


        String input = "refer";


        Deque<Character> deque = new ArrayDeque<>();


        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }


        boolean isPalindrome = true;


        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();


            if (first != last) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}