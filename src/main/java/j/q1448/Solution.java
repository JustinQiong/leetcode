package j.q1448;

import j.com.TreeNode;

public class Solution {

    private int res = 0;

    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return res;
    }

    private void dfs(TreeNode root, int max) {
        if (root == null) {
            return;
        }

        if (root.val >= max) {
            max = root.val;
            res++;
        }

        dfs(root.left, max);
        dfs(root.right, max);
    }

}
