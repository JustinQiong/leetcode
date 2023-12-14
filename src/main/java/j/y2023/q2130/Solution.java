package j.y2023.q2130;

import j.com.ListNode;

public class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        // fast slow pointers to find the middle node
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode pre = null;
        ListNode curr = slow.next;
        // reverse the second half of the LinkedList
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        ListNode second = pre;
        ListNode first = head;
        int max = 0;
        while (second != null) {
            max = Math.max(second.val + first.val, max);
            second = second.next;
            first = first.next;
        }
        return max;
    }
}
