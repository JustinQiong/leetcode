package j.y2023.q450;

import j.com.TreeNode;

public class Solution {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            TreeNode successor = root.right;
            while (successor.left != null) {
                successor = successor.left;
            }
            successor.left = root.left;
            root = root.right;
        }

        return root;
    }
}
