package j.y2023.q872;

import j.com.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafs1 = new ArrayList<>();
        List<Integer> leafs2 = new ArrayList<>();
        dfs(leafs1, root1);
        dfs(leafs2, root2);
        if (leafs1.size() != leafs2.size()) {
            return false;
        }

        for (int i=0; i<leafs1.size(); i++) {
            if (!leafs1.get(i).equals(leafs2.get(i))) {
                return false;
            }
        }

        return true;
    }

    private void dfs(List<Integer> leafs, TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            leafs.add(root.val);
        }

        dfs(leafs, root.left);
        dfs(leafs, root.right);
    }
}
