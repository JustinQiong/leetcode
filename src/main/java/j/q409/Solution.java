package j.q409;

public class Solution {

    public int longestPalindrome(String s) {
        int[] tb = new int[52];
        char[] chs = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = chs[i];
            tb[position(ch)]++;
        }

        int res = 0;
        boolean hasOdd = false;
        for (int num : tb) {
            res += num / 2 * 2;
            if (!hasOdd && (num & 1) == 1) {
                hasOdd = true;
                res++;
            }
        }
        return res;
    }

    private int position(char ch) {
        if (ch < 'a') {
            return  ch - 'A';
        } else {
            return ch - 'a' + 26;
        }
    }
}
