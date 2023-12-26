package j.y2023.dec.q501;

import j.com.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<Integer> res = new ArrayList<>();
    private int max = 0, count = 0, base = 0;

    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] re = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            re[i] = res.get(i);
        }
        return re;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        update(root.val);
        dfs(root.right);
    }

    private void update(int val) {
        if (val == base) {
            count++;
        } else {
            count = 1;
            base = val;
        }

        if (max == count) {
            res.add(val);
        }

        if (count > max) {
            res.clear();
            res.add(val);
            max = count;
        }
    }
}
