package j.y2023.dec.q575;

/**
 * 575. Distribute Candies
 * The maximum unique types will be candyType.length/2
 * if the unique types is more than candyType.length/2.
 * The maximum unique types will be unique types of candyType
 * array if the unique types is less than candyType.length/2.
 */
public class Solution {
    public int distributeCandies(int[] candyType) {
        int[] tab = new int[200001];
        int count = 0;
        int half = (candyType.length>>1);
        for (int type : candyType) {
            int i = type+100000;
            count += tab[i] == 0 ? 1 : 0;
            if (count >= half) {
                return half;
            }
            tab[type+100000]++;
        }
        return count;
    }
}
