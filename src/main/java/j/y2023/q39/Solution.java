package j.y2023.q39;

import java.util.*;

public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }

        Deque<Integer> path = new LinkedList<>();
        dfs(candidates, target, 0, len, path, res);
        return res;
    }

    private void dfs(int[] candidates, int target, int start, int len, Deque<Integer> path, List<List<Integer>> res) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < len; i++) {
            path.addFirst(candidates[i]);
            dfs(candidates, target - candidates[i], i, len, path, res);
            path.pollFirst();
        }
    }
}
