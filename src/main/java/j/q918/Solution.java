package j.q918;

public class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0, maxSum = nums[0], minSum = nums[0], currMin = 0, currMax = 0;
        for (int num : nums) {
            currMax = Math.max(currMax + num, num);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(currMin + num, num);
            minSum = Math.min(minSum, currMin);

            total += num;
        }

        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
}
