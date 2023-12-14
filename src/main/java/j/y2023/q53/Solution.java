package j.y2023.q53;

public class Solution {

    public int maxSubArray(int[] nums) {
        int pre = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            max = Math.max(pre, max);
        }

        return max;
    }

}
