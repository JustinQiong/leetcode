package j.q441;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void arrangeCoins() {
        Solution solution = new Solution();
        assertEquals(2, solution.arrangeCoins(5));
        assertEquals(3, solution.arrangeCoins(6));
        assertEquals(1, solution.arrangeCoins(1));
        assertEquals(60070, solution.arrangeCoins(1804289383));
    }

    @Test
    void arrangeCoinsBinarySearch() {
        Solution solution = new Solution();
        assertEquals(2, solution.arrangeCoinsBinarySearch(5));
        assertEquals(3, solution.arrangeCoinsBinarySearch(6));
        assertEquals(1, solution.arrangeCoinsBinarySearch(1));
        assertEquals(60070, solution.arrangeCoinsBinarySearch(1804289383));
    }
}