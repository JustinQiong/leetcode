package j.y2024.jan.test;

public class Solution {

    public boolean palindrome(String[] arr) {
        int n = arr.length;
        return check(arr, 0, n-1);
    }

    private boolean check(String[] arr, int left, int right) {
        if (left > right) {
            return false;
        }

        String sl = arr[left];
        String sr = arr[right];
        boolean res = false;
        if (sl.length() == sr.length()) {
            if (sl.equals(sr)) {
                res = res || check(arr, left + 1, right - 1);
            } else {
                // 同时变长
                String lNext = arr[left + 1];
                String ssl = sl + lNext.charAt(0);
                String rNext = arr[right - 1];
                String ssr = lNext.charAt(rNext.length() - 1) + sr;
                if (ssl.equals(ssr)) {
                    res = res || check(arr, left + 1, right - 1);
                }
                // 同时变短
                String sssl = sl.substring(0, sl.length() - 1);
                String sssr = sr.substring(1);
                if (sssl.equals(sssr)) {
                    res = res || check(arr, left + 1, right - 1);
                }
            }
        } else if (Math.abs(sl.length() - sr.length()) == 1) {
            if (sl.length() > sr.length()) {
                if (sl.substring(0, sl.length() - 1).equals(sr)) {
                    res = res || check(arr, left + 1, right - 1);
                }
            } else {
                if (sr.substring(0, sr.length() - 1).equals(sl)) {
                    res = res || check(arr, left + 1, right - 1);
                }
            }
        }

        return res;
    }
}
