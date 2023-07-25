package j.q2600;

public class Solution {

    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes) {
            return k;
        } else if (k > numOnes && k <= numOnes + numZeros) {
            return numOnes;
        } else {
            return numOnes + numOnes + numZeros - k;
        }
    }
}
