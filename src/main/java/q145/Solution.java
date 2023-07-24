package q145;

import com.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        traverse(root, list);
        return list;
    }

    private void traverse(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        traverse(root.left, list);
        traverse(root.right, list);
        list.add(root.val);
    }

}
