package j.y2023.q461;

public class Solution {

    public int hammingDistance(int x, int y) {
        int diff = x ^ y;
        int n = 0;
        while (diff != 0) {
            diff &= diff - 1;
            n++;
        }

        return n;
    }
}
