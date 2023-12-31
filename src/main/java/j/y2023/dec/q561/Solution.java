package j.y2023.dec.q561;

import java.util.Arrays;

/**
 * 561. Array Partition
 * Sort the nums array and then calculate
 * each pair of the nums by step 2. Sum the
 * min of the pair, return the sum.
 */
public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }
        return sum;
    }
}
