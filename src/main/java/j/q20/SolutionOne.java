package j.q20;

import java.util.Stack;

class SolutionOne {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (stack.empty()) {
                if (ch == ')' || ch == ']' || ch == '}') {
                    return false;
                } else {
                    stack.push(ch);
                }
            } else {
                Character cha = stack.peek();
                if ((cha == '(' && ch == ')')
                || (cha == '[' && ch == ']')
                || (cha == '{' && ch == '}')) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        return stack.empty();
    }
}