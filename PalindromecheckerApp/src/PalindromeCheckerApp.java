/**
 * MAIN CLASS: PalindromeCheckerApp
 * Use Case 8: Linked List Based Palindrome Check
 *
 * Description:
 * Create a singly linked list and check whether
 * the linked list is a palindrome using the
 * Two-Pointer Technique and in-place reversal.
 *
 * Key Concepts Used:
 *  - Singly Linked List
 *  - Node Class
 *  - Two-Pointer Technique (Slow & Fast Pointer)
 *  - In-place Reversal
 *  - Time Complexity Awareness (O(n))
 *
 * @author SHIVANSH DHINGRA
 * @version 8.0
 */

public class PalindromeCheckerApp {

    // Node Class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of Linked List
    static Node head = null;

    // Insert Node at End
    public static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Check Palindrome
    public static boolean isPalindrome() {

        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;
        Node next;

        // Reverse first half while finding middle
        while (fast != null && fast.next != null) {
            fast = fast.next.next;

            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Skip middle element for odd length
        if (fast != null) {
            slow = slow.next;
        }

        // Compare both halves
        while (prev != null && slow != null) {
            if (prev.data != slow.data) {
                return false;
            }
            prev = prev.next;
            slow = slow.next;
        }

        return true;
    }

    public static void main(String[] args) {

        // Example Linked List: 1 → 2 → 3 → 2 → 1
        insert(1);
        insert(2);
        insert(3);
        insert(2);
        insert(1);

        if (isPalindrome()) {
            System.out.println("Linked List is a palindrome");
        } else {
            System.out.println("Linked List is not a palindrome");
        }
    }
}