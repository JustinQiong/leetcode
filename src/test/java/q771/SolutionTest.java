package q771;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numJewelsInStonesTest() {
        assertEquals(3, new Solution().numJewelsInStones("aA", "aAAbbbb"));
    }
}