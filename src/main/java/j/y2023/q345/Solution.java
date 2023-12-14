package j.y2023.q345;

public class Solution {

    public String reverseVowels(String s) {
        int n = s.length();
        char[] chs = s.toCharArray();
        int left = 0, right = n - 1;
        while (left < right) {
            while (left < n && !isVowel(chs[left])) {
                left++;
            }

            while (right > 0 && !isVowel(chs[right])) {
                right--;
            }

            if (left < right) {
                swap(chs, left, right);
                left++;
                right--;
            }

        }

        return String.valueOf(chs);
    }

    private void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }
}
