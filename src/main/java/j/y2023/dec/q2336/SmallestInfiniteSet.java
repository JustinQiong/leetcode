package j.y2023.dec.q2336;

import java.util.TreeSet;

/**
 * 2336. Smallest Number in Infinite Set
 * Maintain a smallest variable to indicate the current
 * smallest number in the infinite set. Use a treeset to
 * store addback number if the number is smaller than the smallest
 * number of the infinite set.
 */
class SmallestInfiniteSet {

    private int smallest;
    private TreeSet<Integer> set;

    public SmallestInfiniteSet() {
        smallest = 1;
        set = new TreeSet<>();
    }

    public int popSmallest() {
        if (set.isEmpty()) {
            int res = smallest;
            smallest++;
            return res;
        }
        return set.pollFirst();
    }

    public void addBack(int num) {
        if (num < smallest) {
            set.add(num);
        }
    }
}
