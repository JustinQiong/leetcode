package j.y2023.q1004;

public class Solution {

    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int zeros = 0;
        int max = 0;
        while (right < n) {
            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }

        return max;
    }
}
