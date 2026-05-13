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
    public boolean isPalindrome(ListNode head) {
         ListNode midd = midd(head);

        ListNode reverseNode = reverse(midd);

        while (head != null) {
            if (head == midd) {
                break;
            }

            if (head.val != reverseNode.val) {
                return false;
            }

            head = head.next;
            reverseNode = reverseNode.next;
        }

        return true;
    }

    private ListNode midd(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;

        while (fast != null && fast.next != null) {
            fast= fast.next.next;
            slow= slow.next;
        }

        return slow;
    }

    private ListNode reverse(ListNode node) {
        ListNode curr = node;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}