package j.com.q5;

public class Solution {

    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLeft = 0;
        int maxLen = 0;
        char[] chs = s.toCharArray();
        // when i>= n-(maxLen/2) all the len of the palindrome will be less than maxLen
        // so the iteration will be not necessary
        for (int i = 0; i < n - (maxLen / 2); i++) {
            int left = i - 1;
            int right = i + 1;
            int len = 1;
            while (left >= 0 && chs[left] == chs[i]) {
                len++;
                left--;
            }
            while (right < n && chs[right] == chs[i]) {
                len++;
                right++;
            }

            while (left >= 0 && right < n && chs[left] == chs[right]) {
                len += 2;
                left--;
                right++;
            }

            if (len > maxLen) {
                maxLeft = left;
                maxLen = len;
            }
        }

        return new String(chs, maxLeft + 1, maxLen);
    }

}
