package j.y2023.q404;

import j.com.TreeNode;

public class Solution {

    private int res = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root, false);
        return res;
    }

    public void dfs(TreeNode root, boolean isLeft) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            if (isLeft) {
                res += root.val;
            }
            return;
        }

        dfs(root.left, true);
        dfs(root.right, false);
    }
}
