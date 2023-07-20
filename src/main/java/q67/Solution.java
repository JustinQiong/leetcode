package q67;

class Solution {

    public String addBinary(String a, String b) {
        int maxLen = Math.max(a.length(), b.length());
        int[] res = new int[maxLen + 1];
        int carry = 0;
        for (int i = 0; i < maxLen + 1; i++) {
            carry += i < a.length() ? (int) a.charAt(a.length() - i - 1) - '0' : 0;
            carry += i < b.length() ? (int) b.charAt(b.length() - i - 1) - '0' : 0;
            res[maxLen - i] = carry % 2;
            carry /= 2;
        }

        // 头部为0且非单个0的情况，需要移除头部的0
        int i = 0;
        int l = maxLen + 1;
        if (res[0] == 0 && res.length != 1) {
            i = 1;
            l--;
        }
        char[] str = new char[l];
        for (int j = 0; j < l; j++, i++) {
            str[j] = (char) (res[i] + '0');
        }

        return new String(str);
    }

}
