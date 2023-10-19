package j.q150;

import java.util.Stack;

public class Solution {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Integer.valueOf(token));
            } else {
                int number1 = stack.pop();
                int number2 = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(number2 + number1);
                        break;
                    case "-":
                        stack.push(number2 - number1);
                        break;
                    case "*":
                        stack.push(number2 * number1);
                        break;
                    case "/":
                        stack.push(number2 / number1);
                        break;
                    default:

                }
            }
        }

        return stack.pop();
    }

    private boolean isNumber(String token) {
        return !"+".equals(token) && !"-".equals(token)
                && !"*".equals(token) && !"/".equals(token);
    }
}
