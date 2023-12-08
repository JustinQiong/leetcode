package j.q328;

import j.com.ListNode;

public class Solution {

    public ListNode oddEvenList(ListNode head) {
        int i = 0;
        ListNode curr = head;
        ListNode oddDummy = new ListNode(0);
        ListNode odd = oddDummy;
        ListNode evenDummy = new ListNode(0);
        ListNode even = evenDummy;
        while (curr != null) {
            if (i % 2 == 0) {
                odd.next = curr;
                odd = odd.next;
            } else {
                even.next = curr;
                even = even.next;
            }

            curr = curr.next;
            i++;
        }

        odd.next = evenDummy.next;
        even.next = null;
        return oddDummy.next;
    }
}
