package j.y2023.q1456;

public class Solution {

    public int maxVowels(String s, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += vowelNum(s.charAt(i));
        }

        int max = sum;
        for (int i = k; i < s.length(); i++) {
            sum += vowelNum(s.charAt(i)) - vowelNum(s.charAt(i - k));
            max = Math.max(max, sum);
        }

        return max;
    }

    private int vowelNum(char ch) {
        return "aeiou".indexOf(ch) >= 0 ? 1 : 0;
    }
}
