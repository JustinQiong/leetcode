package j.y2024.jan.q62;

import java.util.Arrays;

/**
 * 62. Unique Paths
 * Dynamic Programing Solution:
 * dp[i][j] = dp[i-1][j]+dp[i][j-1]
 *
 * Optimized dp solution:
 * dp[j] = dp[j]+dp[j-1]
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i=1; i<m; i++) {
            for (int j=1; j<n; j++) {
                dp[j] += dp[j-1];
            }
        }

        return dp[n-1];
    }
}
