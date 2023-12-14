package j.y2023.q437;

import j.com.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefix = new HashMap<>();
        prefix.put(0L, 1);
        return dfs(root, 0L, prefix, targetSum);
    }

    private int dfs(TreeNode root, Long sum, Map<Long, Integer> prefix, int targetSum) {
        if (root == null) {
            return 0;
        }

        int res = 0;
        sum += root.val;
        res += prefix.getOrDefault(sum - targetSum, 0);
        prefix.put(sum, prefix.getOrDefault(sum, 0) + 1);

        int left = dfs(root.left, sum, prefix, targetSum);
        int right = dfs(root.right, sum, prefix, targetSum);
        res += left + right;
        prefix.put(sum, prefix.getOrDefault(sum, 0) - 1);

        return res;
    }
}
