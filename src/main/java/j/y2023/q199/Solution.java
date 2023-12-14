package j.y2023.q199;

import j.com.TreeNode;

import java.util.*;

public class Solution {

    private List<Integer> res = new ArrayList<>();
    private boolean[] viewed = new boolean[100];

    public List<Integer> rightSideView(TreeNode root) {
        rightView(root, 0);
        return res;
    }

    private void rightView(TreeNode root, int depth) {
        if (root == null) {
            return;
        }

        if (!viewed[depth]) {
            res.add(root.val);
        }

        viewed[depth] = true;
        depth++;

        rightView(root.right, depth);
        rightView(root.left, depth);

    }

    public List<Integer> rightSideViewBFS(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> view = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i == size - 1) {
                    view.add(node.val);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return view;
    }

}
