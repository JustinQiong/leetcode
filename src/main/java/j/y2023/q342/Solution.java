package j.y2023.q342;

public class Solution {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (0xAAAAAAAA & n) == 0;
    }
}
