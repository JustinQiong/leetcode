package j.q61;

import j.com.ListNode;

public class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        int len = 1;
        while (curr.next != null){
            len++;
            curr = curr.next;
        }

        curr.next = head;

        int n = len - (k % len);
        for (int i = 0; i < n; i++) {
            curr = curr.next;
        }

        ListNode newHead = curr.next;
        curr.next = null;

        return newHead;
    }
}
