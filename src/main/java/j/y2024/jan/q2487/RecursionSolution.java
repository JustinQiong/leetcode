package j.y2024.jan.q2487;

import j.com.ListNode;

/**
 * 2487. Remove Nodes From Linked List
 * The next node of current node will be
 * the one recursively removeNodes of the node
 * node.next. When doing the removal,
 * compare the vals of root and root.next, return
 * the one with the greater val.
 */
public class RecursionSolution {

    public ListNode removeNodes(ListNode root) {
        if (root == null) {
            return null;
        }
        root.next = removeNodes(root.next);
        if (root.next != null && root.next.val > root.val) {
            return root.next;
        } else {
            return root;
        }
    }
}
