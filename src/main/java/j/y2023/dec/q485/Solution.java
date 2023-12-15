package j.y2023.dec.q485;

/**
 * 485. Max Consecutive Ones
 *
 * Maintain a variable con to sum the
 * consecutive ones.
 * If current num is 1, con++
 * else compare the con with max.
 * If con is greater than max, then max=con.
 * return the max con.
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int con = 0;
        for (int n : nums) {
            if (n == 1) {
                con++;
            } else {
                max = Math.max(max, con);
                con = 0;
            }
        }
        max = Math.max(max, con);
        return max;
    }
}
