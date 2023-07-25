package j.q111;

import j.com.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class BreadthFirstSolution {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        int level = 1;
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = deque.poll();
                if (curr.left == null && curr.right == null) {
                    return level;
                }

                if (curr.left != null) {
                    deque.offer(curr.left);
                }

                if (curr.right != null){
                    deque.offer(curr.right);
                }
            }
            level++;
        }

        return 0;
    }
}
