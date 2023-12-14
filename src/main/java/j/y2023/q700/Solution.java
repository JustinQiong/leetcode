package j.y2023.q700;

import j.com.TreeNode;

public class Solution {

    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) {
                return root;
            }

            root = val < root.val ? root.left : root.right;
        }

        return null;
    }

}
