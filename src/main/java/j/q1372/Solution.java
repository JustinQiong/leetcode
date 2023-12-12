package j.q1372;

import j.com.TreeNode;

public class Solution {

    private int max = 0;

    public int longestZigZag(TreeNode root) {
        dfs(root.left, true,0);
        dfs(root.right, false, 0);
        return max;
    }

    private void dfs(TreeNode root, boolean isLeft, int len) {
        if (root == null) {
            return;
        }

        len++;
        max = Math.max(max, len);
        if (root.left == null && root.right == null) {
            return;
        }

        if (isLeft) {
            dfs(root.left, true, 0);
            dfs(root.right, false, len);
        } else {
            dfs(root.left, true, len);
            dfs(root.right, false, 0);
        }
    }

}
