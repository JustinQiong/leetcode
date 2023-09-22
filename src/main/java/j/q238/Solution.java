package j.q238;

public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return new int[0];
        }
        int[] ans = new int[len];
        ans[0] = 1;
        for (int i = 1; i < len; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int tmp = 1;
        for (int i = len - 2; i >= 0; i--) {
            tmp *= nums[i + 1];
            ans[i] *= tmp;
        }

        return ans;
    }
}
