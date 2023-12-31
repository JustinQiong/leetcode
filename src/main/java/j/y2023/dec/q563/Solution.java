package j.y2023.dec.q563;

import j.com.TreeNode;

/**
 * 563. Binary Tree Tilt
 * Depth first search:
 * Search through the nodes from root to the children.
 * Calculate left subtree and right subtree by accumulating
 * the value of each node. Accumulate the tilt of each node
 * at the same time.
 */
public class Solution {

    private int res = 0;

    public int findTilt(TreeNode root) {
        dfs(root);
        return res;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return root.val;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);
        int tilt = Math.abs(left - right);
        res += tilt;
        return root.val + left + right;
    }
}
