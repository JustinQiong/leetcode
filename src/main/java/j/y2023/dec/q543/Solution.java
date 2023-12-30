package j.y2023.dec.q543;

import j.com.TreeNode;

/**
 * 543. Diameter of Binary Tree
 * Find the max depth of both left and right
 * subtrees. Traverse all the nodes and update
 * the max leftDepth+rightDepth. It's the diameter
 * of the binary tree.
 */
public class Solution {

    private int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return res;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = depth(root.left);
        int right = depth(root.right);
        res = Math.max(res, left + right);
        return Math.max(left, right) + 1;
    }

}
