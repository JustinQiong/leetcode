package j.y2023.q1318;

/**
 * 1318. Minimum Flips to Make a OR b Equal to c
 * (n >> i) & 1 to calculate the bit of each position
 * and check if ba&bb is equals to bc or not.
 * Sum up the reverse times of the bit.
 */
public class Solution {
    public int minFlips(int a, int b, int c) {
        int res = 0;
        for (int i = 0; i < 31; i++) {
            int ba = (a >> i) & 1;
            int bb = (b >> i) & 1;
            int bc = (c >> i) & 1;
            res += (ba | bb) != bc ? ba + bb + bc : 0;
        }

        return res;
    }
}
