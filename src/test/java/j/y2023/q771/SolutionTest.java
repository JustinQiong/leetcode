package j.y2023.q771;

import j.y2023.q771.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void numJewelsInStonesTest() {
        assertEquals(3, new Solution().numJewelsInStones("aA", "aAAbbbb"));
    }
}