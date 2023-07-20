package q67;

class OfficialSolution {

    public String addBinary(String a, String b) {
        int maxLen = Math.max(a.length(), b.length());
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLen; i++) {
            carry += i < a.length() ? (int) a.charAt(a.length() - i - 1) - '0' : 0;
            carry += i < b.length() ? (int) b.charAt(b.length() - i - 1) - '0' : 0;
            sb.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        if (carry > 0) {
            sb.append('1');
        }

        return sb.reverse().toString();
    }

}
