package j.y2023.q2697;

public class Solution {
    public String makeSmallestPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        char[] chs = s.toCharArray();
        while (left < right) {
            char l = chs[left];
            char r = chs[right];
            if (l < r) {
                chs[right]= l;
            } else {
                chs[left] = r;
            }
            left++;
            right--;
        }
        return new String(chs);
    }
}
