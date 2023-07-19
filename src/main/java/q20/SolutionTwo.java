package q20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class SolutionTwo {

    public Map<Character, Character> map = new HashMap<>() {{
        put('(', ')');
        put('[', ']');
        put('{', '}');
        put('?', '?');
    }};

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push('?');
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                stack.push(ch);
            } else if (map.get(stack.pop()) != ch) {
                return false;
            }
        }
        return stack.size() == 1;
    }
}
