package j.y2023.q66;

class Solution {

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                for (int j = i+1; j < len; j++) {
                    digits[j] = 0;
                }
                return digits;
            }
        }

        // 所有的元素都为9的情况，需要新建一个长度+1的数组
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}
