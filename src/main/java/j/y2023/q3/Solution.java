package j.y2023.q3;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        int res = 0;
        char[] chs = s.toCharArray();
        char[] cnt = new char[128];
        int left = 0;
        for (int right = 0; right < n; right++) {
            char ch = chs[right];
            cnt[ch]++;

            while (cnt[ch] > 1) {
                cnt[chs[left++]]--;
            }

            res = Math.max(res, right - left + 1);
        }

        return res;
    }

}
