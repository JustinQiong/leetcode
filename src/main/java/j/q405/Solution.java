package j.q405;

public class Solution {

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        StringBuilder res = new StringBuilder();
        for (int i = 7; i >= 0; i--) {
            int val = (num >> (i * 4)) & 0xf;
            if (val > 0 || res.length() > 0) {
                char digit = val < 10 ? (char) ('0' + val) : (char) ('a' + val - 10);
                res.append(digit);
            }
        }

        return res.toString();
    }

}
