package j.y2023.q2745;

public class Solution {

    public int longestString(int x, int y, int z) {
        return 2 * (2 * Math.min(x, y) + (x != y ? 1 : 0) + z);
    }
}
