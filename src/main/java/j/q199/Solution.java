package j.q199;

import j.com.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<Integer> res = new ArrayList<>();
    private boolean[] viewed = new boolean[100];

    public List<Integer> rightSideView(TreeNode root) {
        rightView(root, 0);
        return res;
    }

    private void rightView(TreeNode root, int depth) {
        if (root == null) {
            return;
        }

        if (!viewed[depth]) {
            res.add(root.val);
        }

        viewed[depth] = true;
        depth++;

        rightView(root.right, depth);
        rightView(root.left, depth);

    }

}
