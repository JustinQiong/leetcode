package j.q98;

import j.com.TreeNode;

import javax.xml.validation.Validator;

public class Solution {

    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }

        if (root.val <= min || root.val >= max) {
            return false;
        }

        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }

}
