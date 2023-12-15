package j.y2023.q476;

/**
 * 476. Number Complement
 *
 * Use lowbit method to find the highest 1 bit.
 * do n-=(n&-n) until n == 0. We assign the highest 1 bit with 0s followed by to x.
 * then get the complement code by reverse code of num masked by x-1.
 */
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
