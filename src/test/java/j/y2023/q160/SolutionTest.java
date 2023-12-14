package j.y2023.q160;

import j.com.ListNode;
import j.y2023.q160.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void getIntersectionNode() {
        //[4,1,8,4,5]
        //[5,6,1,8,4,5]
        ListNode head1 = new ListNode(4);
        ListNode one = new ListNode(1);
        head1.next = one;

        ListNode head2 = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode one1 = new ListNode(1);
        head2.next = six;
        six.next = one1;

        ListNode eight = new ListNode(8);
        ListNode four1 = new ListNode(4);
        ListNode five1 = new ListNode(5);
        eight.next = four1;
        four1.next = five1;

        one.next = eight;
        one1.next = eight;
        Solution solution = new Solution();
        assertEquals(8, solution.getIntersectionNode(head1, head2).val);

        ListNode headA = new ListNode(1);
        ListNode headB = headA;
        assertEquals(1, solution.getIntersectionNode(headA, headB).val);
    }
}