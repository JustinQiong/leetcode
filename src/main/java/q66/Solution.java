package q66;

class Solution {

    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = digits[i];
            if (digit == 10) {
                if (i != 0) {
                    digits[i - 1]++;
                    digits[i] = 0;
                } else {
                    digits[i] = 0;
                    int[] newDigits = new int[digits.length + 1];
                    newDigits[0] = 1;
                    for (int j = 1; j < newDigits.length; j++) {
                        newDigits[j] = digits[j - 1];
                    }
                    return newDigits;
                }
            }
        }

        return digits;
    }
}
