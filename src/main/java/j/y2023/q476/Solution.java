package j.y2023.q476;

public class Solution {

    public int findComplement(int num) {
        int n = num;
        int x = 0;
        while (n != 0) {
            x = n;
            n -= (n & -n);
        }
        return ~num & (x - 1);
    }
}
