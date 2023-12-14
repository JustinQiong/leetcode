package j.y2023.q394;

import java.util.Collections;
import java.util.LinkedList;

public class Solution {

    private int point;

    public String decodeString(String s) {
        point = 0;
        LinkedList<String> stack = new LinkedList<>();
        int n = s.length();
        while (point < n) {
            char ch = s.charAt(point);
            if (Character.isDigit(ch)) {
                String num = findTheNumber(s);
                stack.addLast(num);
            } else if (Character.isLetter(ch) || ch == '[') {
                stack.addLast(String.valueOf(ch));
                point++;
            } else {
                point++;
                LinkedList<String> sub = new LinkedList<>();
                while (!"[".equals(stack.peekLast())) {
                    sub.addLast(stack.removeLast());
                }
                Collections.reverse(sub);
                stack.removeLast();
                int times = Integer.parseInt(stack.removeLast());
                StringBuilder sb = new StringBuilder();
                String sbstr = getString(sub);
                while (times-- >0) {
                    sb.append(sbstr);
                }
                stack.addLast(sb.toString());
            }
        }

        return getString(stack);
    }

    private String findTheNumber(String s) {
        StringBuilder sb = new StringBuilder();
        while (Character.isDigit(s.charAt(point))) {
            sb.append(s.charAt(point++));
        }
        return sb.toString();
    }

    private String getString(LinkedList<String> v) {
        StringBuilder sb = new StringBuilder();
        for (String s : v) {
            sb.append(s);
        }
        return sb.toString();
    }
}
