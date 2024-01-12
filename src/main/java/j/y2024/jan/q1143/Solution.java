package j.y2024.jan.q1143;

/**
 * 1143. Longest Common Subsequence
 * Dynamic Programming Solution
 * The longest common subsequence of position
 * i of text1 and j of text2 is calculating from
 * the result of i-1 and j-1 and the comparison
 * result of the char on position i and j.
 */
public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n+1][m+1];
        char[] chs1 = text1.toCharArray();
        char[] chs2 = text2.toCharArray();
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                if (chs1[i-1]==chs2[j-1]) {
                    dp[i][j] = dp[i-1][j-1]+1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
}
