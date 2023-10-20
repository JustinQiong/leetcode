package j.q236;

import j.com.TreeNode;

public class Solution {

    TreeNode ans;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return ans;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }

        boolean leftSon = dfs(root.left, p, q);
        boolean rightSon = dfs(root.right, p, q);

        if ((leftSon && rightSon) || ((root.val == p.val || root.val == q.val) && (leftSon || rightSon))) {
            ans = root;
        }

        return leftSon || rightSon || root.val == p.val || root.val == q.val;
    }
}
