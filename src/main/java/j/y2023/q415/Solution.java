package j.y2023.q415;

public class Solution {

    public String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int maxLen = Math.max(len1, len2);
        for (int i = 0; i < maxLen; i++) {
            carry += (len1 - i > 0 ? num1.charAt(len1 - i - 1) - '0' : 0);
            carry += (len2 - i > 0 ? num2.charAt(len2 - i - 1) - '0' : 0);
            sb.append((char) carry % 10);
            carry /= 10;
        }

        if (carry > 0) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}
