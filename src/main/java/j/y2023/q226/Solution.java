package j.y2023.q226;

import j.com.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;
        root.right = left;
        root.left = right;
        invertTree(left);
        invertTree(right);
        return root;
    }
}
