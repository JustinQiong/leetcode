package j.q222;

import j.com.TreeNode;

public class Solution {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = high(root.left);
        int right = high(root.right);
        if (left == right) {
            return countNodes(root.right) + (1 << left);
        } else {
            return countNodes(root.left) + (1 << right);
        }
    }

    private int high(TreeNode root) {
        int high = 0;
        while (root != null) {
            high++;
            root = root.left;
        }

        return high;
    }
}
