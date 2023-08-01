package j.q228;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void summaryRanges() {
        Solution solution = new Solution();
        assertIterableEquals(List.of("0->2", "4->5", "7"), solution.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        assertIterableEquals(List.of("0", "2->4", "6", "8->9"), solution.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }
}