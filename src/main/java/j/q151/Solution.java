package j.q151;

public class Solution {
    public String reverseWords(String s) {
        s = " " + s;
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        for (int left = n - 1, right = n; left >= 0; left--) {
            if (s.charAt(left) == ' ') {
                if (left + 1 < right) {
                    ans.append(s, left + 1, right);
                    ans.append(' ');
                }
                right = left;
            }
        }
        return ans.substring(0, ans.length() - 1);
    }
}
