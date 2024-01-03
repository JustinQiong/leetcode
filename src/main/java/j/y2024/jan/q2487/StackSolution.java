package j.y2024.jan.q2487;

import j.com.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 2487.Remove Nodes From LinkedList
 * Push all the nodes into a stack.
 * Pop out the node from the stack.
 * If the val of the top node is greater than
 * current node, link current node as the next
 * node of the top node of the stack. Unless,
 * just pop the top element out of the stack.
 * The new formed linked list is the answer.
 */
public class StackSolution {
    public ListNode removeNodes(ListNode head) {
        Deque<ListNode> stack = new LinkedList<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        while (!stack.isEmpty()) {
            if (head == null || stack.peek().val >= head.val) {
                stack.peek().next = head;
                head = stack.peek();
            }
            stack.pop();
        }

        return head;
    }
}
