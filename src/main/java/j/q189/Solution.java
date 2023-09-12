package j.q189;

public class Solution {

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] temp = new int[len];
        for (int i = 0; i < len; i++) {
            temp[(i + k) % len] = nums[i];
        }

        System.arraycopy(temp, 0, nums, 0, len);
    }

}
