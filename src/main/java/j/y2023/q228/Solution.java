package j.y2023.q228;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<String> summaryRanges(int[] nums) {
        int left = 0;
        int right = 0;
        int len = nums.length;
        List<String> res = new LinkedList<>();
        while (left < len) {
            while (right < len - 1 && nums[right + 1] == nums[right] + 1) {
                right++;
            }
            if (left == right) {
                res.add(String.valueOf(nums[left]));
            } else {
                res.add(nums[left] + "->" + nums[right]);
            }
            right++;
            left = right;
        }
        return res;
    }
}
