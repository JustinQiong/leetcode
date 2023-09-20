package j.q530;

import j.com.TreeNode;

public class Solution {

    private int pre;
    private int ans;

    public int getMinimumDifference(TreeNode root) {
        pre = -1;
        ans = Integer.MAX_VALUE;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.left);
        if (pre != -1) {
            ans = Math.min(ans, root.val - pre);
        }

        pre = root.val;

        dfs(root.right);
    }

}
