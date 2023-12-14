package j.y2023.q231;

public class Solution {
    public boolean isPowerOfTwoCountBit(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }

    /**
     * 位运算 n & (n-1) 可以去掉最低位的1,
     * 如果去掉这一位的1等于0 则说明是2的n次幂
     */
    public boolean isPowerOfTwoBit(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public boolean isPowerOfTwoBit2(int n) {
        return n > 0 && ((n & -n) == n);
    }
}
