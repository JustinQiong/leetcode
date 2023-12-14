package j.y2023.q268;

public class Solution {

    public int missingNumberMath(int[] nums) {
        int total = nums.length * (nums.length + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return total - sum;
    }

    public int missingNumberDigit(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        for (int i = 0; i <= nums.length; i++) {
            xor ^= i;
        }

        return xor;
    }

}
