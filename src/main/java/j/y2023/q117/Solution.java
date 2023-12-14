package j.y2023.q117;

import j.com.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public Node connect(Node root) {
        if (root == null) {
            return root;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            Node pre = null;
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (pre != null) {
                    pre.next = node;
                }
                pre = node;
                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return root;
    }

    public Node connectOptimized(Node root) {
        if (root == null) {
            return root;
        }
        Node curr = root;
        while (curr != null) {
            Node dummy = new Node(0);
            Node pre = dummy;
            while (curr != null) {
                if (curr.left != null) {
                    pre.next = curr.left;
                    pre = pre.next;
                }

                if (curr.right != null) {
                    pre.next = curr.right;
                    pre = pre.next;
                }

                curr = curr.next;
            }
            curr = dummy.next;
        }

        return root;
    }

}
