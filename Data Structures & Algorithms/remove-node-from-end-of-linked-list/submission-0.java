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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;

        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            length++;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode newHead = dummy;
        for (int i = 0; i < length - n; i++) {
            dummy = dummy.next;
        }

        dummy.next = dummy.next.next;

        return newHead.next;
    }
}
