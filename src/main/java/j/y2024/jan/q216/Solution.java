package j.y2024.jan.q216;

import java.util.ArrayList;
import java.util.List;

/**
 * 216. Combination Sum III
 *
 * <a href="https://leetcode.cn/problems/combination-sum-iii/solutions/2595838/216-zu-he-zong-he-iii-hui-su-yi-dong-jie-9ztt/?envType=study-plan-v2&envId=leetcode-75">My Leetcode Solution</a>
 *
 */
public class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTrack(k, n, 1, 0, new ArrayList<>());
        return res;
    }

    private void backTrack(int k, int n, int x, int sum, List<Integer> list) {
        if (x > 9) {
            return;
        }

        // choose x
        list.add(x);
        if (list.size() == k) {
            if (sum + x == n) {
                res.add(new ArrayList<>(list));
            }
        }
        backTrack(k, n, x + 1, sum + x, list);

        // not choose x
        list.remove(list.size() - 1);
        backTrack(k, n, x + 1, sum, list);
    }
}
