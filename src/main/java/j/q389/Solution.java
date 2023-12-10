package j.q389;

public class Solution {
    public char findTheDifference(String s, String t) {
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();
        int res = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            res ^= chs[i] ^ cht[i];
        }
        res ^= cht[n];
        return (char) res;
    }
}
