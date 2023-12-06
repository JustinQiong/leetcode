package j.q2390;

import java.util.Stack;

public class Solution {
    public String removeStars(String s) {
        char[] chs = s.toCharArray();
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (chs[i] == '*' && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(chs[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public String removeStarsTwoPointers(String s) {
        int n = s.length();
        int l = 0;
        char[] chs = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (chs[i] == '*') {
                l--;
            } else {
                swap(chs, l++, i);
            }
        }

        return String.valueOf(chs, 0, l);
    }

    private void swap(char[] chs, int a, int b) {
        char temp = chs[a];
        chs[a] = chs[b];
        chs[b] = temp;
    }
}
