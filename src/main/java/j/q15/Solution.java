package j.q15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int first = 0; first < n; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int target = -nums[first];
            int second = first + 1;
            int third = n - 1;
            while (second < third) {
                int sum = nums[second] + nums[third];
                if (sum == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    res.add(list);
                    second++;
                    third--;

                    while (second < third && nums[second] == nums[second - 1]) {
                        second++;
                    }

                    while (second < third && nums[third] == nums[third + 1]) {
                        third--;
                    }
                } else if (sum > target) {
                    third--;
                } else {
                    second++;
                }

            }
        }

        return res;
    }
}
