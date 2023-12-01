package j.q75;

public class Solution {

    public String gcdOfStrings(String str1, String str2) {
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }

        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int remain = a % b;
            a = b;
            b = remain;
        }

        return a;
    }
}
