package j.q448;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int idx = (nums[i] - 1) % n;
            nums[idx] += n;
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (num <= n) {
                res.add(i + 1);
            }
        }

        return res;
    }
}
