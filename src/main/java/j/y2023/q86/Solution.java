package j.y2023.q86;

import j.com.ListNode;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode smallHead = small;
        ListNode large = new ListNode(0);
        ListNode largeHead = large;
        while (head != null) {
            if (head.val < x) {
                small = small.next = head;
            } else {
                large = large.next = head;
            }

            head = head.next;
        }

        large.next = null;
        small.next = largeHead.next;

        return smallHead.next;
    }
}
