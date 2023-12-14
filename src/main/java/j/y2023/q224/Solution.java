package j.y2023.q224;

import java.util.Stack;

public class Solution {

    public int calculate(String s) {
        Stack<Integer> ops = new Stack<>();
        ops.push(1);
        int ret = 0;
        int sign = 1;

        int n = s.length();
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == ' ') {
                i++;
            } else if (s.charAt(i) == '+') {
                sign = ops.peek();
                i++;
            } else if (s.charAt(i) == '-') {
                sign = -ops.peek();
                i++;
            } else if (s.charAt(i) == '(') {
                ops.push(sign);
                i++;
            } else if (s.charAt(i) == ')') {
                ops.pop();
                i++;
            } else {
                int num = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = 10 * num + (s.charAt(i) - '0');
                    i++;
                }
                ret += sign * num;
            }
        }

        return ret;
    }

}
