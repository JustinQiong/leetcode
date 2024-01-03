package j.y2024.jan.q2487;

import j.com.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 2487. Remove Nodes From Linked List
 * Monotone stack solution:
 * Use a stack to store Node.
 * If the value of current node is greater than
 * the one on the top of the stack, pop the top
 * node out. Push each of the node into the stack.
 * Finally, pop out the node remains in the stack
 * and form a new list. That is the answer.
 */
public class Solution {

    public ListNode removeNodes(ListNode head) {
        Deque<ListNode> stack = new LinkedList<>();
        ListNode curr = head;
        while (curr != null) {
            while (!stack.isEmpty() && stack.peek().val < curr.val) {
                stack.pop();
            }

            stack.push(curr);

            curr = curr.next;
        }

        ListNode pre = null;
        ListNode node = null;
        while (!stack.isEmpty()) {
            node = stack.pop();
            if (pre != null) {
                node.next = pre;
            }
            pre = node;
        }

        return node;
    }
}
