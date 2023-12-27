package j.y2023.dec.q504;

public class Solution {

    public String convertTonBase7(int num) {
        StringBuilder sb = new StringBuilder();
        String sign = "";
        if (num < 0) {
            num = -num;
            sign = "-";
        }

        do {
            sb.append(num % 7);
            num /= 7;
        } while (num != 0);
        sb.append(sign);

        return sb.reverse().toString();
    }

}
