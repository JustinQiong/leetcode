package j.q144;

import j.com.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        traverse(root, list);
        return list;
    }

    private void traverse(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        list.add(root.val);
        traverse(root.left, list);
        traverse(root.right, list);
    }
}
