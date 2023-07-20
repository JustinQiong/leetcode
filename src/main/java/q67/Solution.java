package q67;

class Solution {

    public String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int maxLen = Math.max(aLen, bLen);
        int[] res = new int[maxLen + 1];
        for (int i = 0; i < maxLen + 1; i++) {
            int aIndex = aLen - i - 1;
            int aCh = aIndex >= 0 ? (int) a.charAt(aIndex) - 48 : 0;
            int bIndex = bLen - i - 1;
            int bCh = bIndex >= 0 ? (int) b.charAt(bIndex) - 48 : 0;
            int curr = res[maxLen - i];
            int sum = aCh + bCh + curr;
            if (sum >= 2) {
                res[maxLen - i - 1] = 1;
                res[maxLen - i] = sum % 2;
            } else {
                res[maxLen - i] = sum;
            }
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
            str[j] = (char) (res[i] + 48);
        }

        return new String(str);
    }

}
