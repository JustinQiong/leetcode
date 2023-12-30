package j.y2023.dec.q557;

/**
 * Reverse words III
 * Use two pointers start and end, reverse
 * the chars between start and end. Find the
 * start and end pointers by blank char or not.
 */
public class Solution {

    public String reverseWords(String s) {
        int i = 0;
        int n = s.length();
        char[] chs = s.toCharArray();
        while (i < n) {
            while (i < n && chs[i] == ' ') {
                i++;
            }
            int start = i;
            while (i < n && chs[i] != ' ') {
                i++;
            }
            reverse(chs, start, i - 1);
        }
        return new String(chs);
    }

    private void reverse(char[] chs, int left, int right) {
        while (left < right) {
            char tmp = chs[left];
            chs[left++] = chs[right];
            chs[right--] = tmp;
        }
    }
}
