package j.y2023.q19;

import j.com.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode fast = head;
        ListNode slow = fake;
        for (int i=0; i< n;i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return fake.next;
    }
}
