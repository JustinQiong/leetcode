package j.y2024.jan.q790;

/**
 * 790. Domino and Tromino Tiling
 * Dynamic Programming Solution:
 * Each line of n has four conditions:
 * 0-tow empty grid
 * 1-up grid empty
 * 2-down grid empty
 * 3-both grids full
 * Analysis all the four conditions and calculate
 * the combinations.
 */
public class Solution {
    private static final int MOD = 1000000007;

    public int numTilings(int n) {
        int[][] dp = new int[n+1][4];
        dp[0][3] = 1;
        for (int i=1; i<=n; i++) {
            dp[i][0] = dp[i-1][3];
            dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % MOD;
            dp[i][2] = (dp[i-1][0] + dp[i-1][1]) % MOD;
            dp[i][3] = ((dp[i-1][0] + dp[i-1][1]) % MOD + (dp[i-1][2] + dp[i-1][3]) % MOD) % MOD;
        }

        return dp[n][3];
    }
}
