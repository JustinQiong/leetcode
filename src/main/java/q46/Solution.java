package q46;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<Integer> nums = new ArrayList<>();
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        for (int num : nums) {
            this.nums.add(num);
        }
        dfs(0);
        return res;
    }

    private void dfs(int index) {
        if (index == nums.size() - 1) {
            res.add(new ArrayList<>(nums));
            return;
        }

        for (int i = index; i < nums.size(); i++) {
            swap(index, i);
            dfs(index + 1);
            swap(i, index);
        }
    }

    private void swap(int a, int b) {
        int temp = nums.get(a);
        nums.set(a, nums.get(b));
        nums.set(b, temp);
    }

}
