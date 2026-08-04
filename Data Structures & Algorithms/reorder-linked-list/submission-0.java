/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode middle = getMiddle(head);

        ListNode reverse = getReverse(middle);

        ListNode dummy = new ListNode(0);
        ListNode newHead = dummy;

        while (head != null && head.next != null && reverse != null) {
            dummy.next = head;
            head = head.next;

            dummy = dummy.next;

            dummy.next = reverse;
            reverse = reverse.next;

            dummy = dummy.next;
        }
        head = newHead.next;
    }

    private ListNode getMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode getReverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
