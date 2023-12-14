package j.y2023.q17;

import java.util.*;

public class Solution {

    private Map<Character, String> phoneMap = new HashMap<>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return Collections.emptyList();
        }

        Queue<String> queue = new LinkedList<>();
        int n = digits.length();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                char ch = digits.charAt(i);
                String start = phoneMap.get(ch);
                for (char c : start.toCharArray()) {
                    queue.offer(String.valueOf(c));
                }
            } else {
                int size = queue.size();
                for (int j = 0; j < size; j++) {
                    String str = queue.poll();
                    char next = digits.charAt(i);
                    String choices = phoneMap.get(next);
                    for (char co : choices.toCharArray()) {
                        queue.offer(str + co);
                    }
                }
            }
        }

        return new ArrayList<>(queue);
    }
}
