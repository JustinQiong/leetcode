package j.y2023.q1493;

public class Solution {
    public int longestSubarray(int[] nums) {
        int zeros = 1;
        int right;
        int left = 0;
        for (right = 0; right < nums.length; right++) {
            zeros -= nums[right] == 0 ? 1 : 0;
            if (zeros < 0) {
                zeros += nums[left++] == 0 ? 1 : 0;
            }
        }

        return right - left - 1;
    }
}
