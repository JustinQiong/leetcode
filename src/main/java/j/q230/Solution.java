package j.q230;

import j.com.TreeNode;

public class Solution {

    private int count;
    private int ans;

    public int kthSmallest(TreeNode root, int k) {
        count=0;
        ans = -1;
        dfs(root, k);
        return ans;
    }

    private void dfs(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        dfs(root.left, k);
        count++;
        if (count == k) {
            ans = root.val;
            return;
        }
        dfs(root.right, k);
    }
}
