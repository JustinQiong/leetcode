package j.y2023.q103;

import j.com.Node;
import j.com.TreeNode;

import java.util.*;

public class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offerFirst(root);
        boolean isLeft = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> line = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node;
                if (isLeft) {
                    node = queue.pollLast();
                    if (node.left != null) {
                        queue.offerFirst(node.left);
                    }

                    if (node.right != null) {
                        queue.offerFirst(node.right);
                    }
                } else {
                    node = queue.pollFirst();
                    if (node.right != null) {
                        queue.offerLast(node.right);
                    }

                    if (node.left != null) {
                        queue.offerLast(node.left);
                    }
                }
                line.add(node.val);
            }

            res.add(line);

            isLeft = !isLeft;
        }

        return res;
    }
}
