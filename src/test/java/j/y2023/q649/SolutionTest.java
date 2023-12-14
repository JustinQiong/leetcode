package j.y2023.q649;

import j.y2023.q649.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void predictPartyVictory() {
        Solution solution = new Solution();
        assertEquals("Radiant", solution.predictPartyVictory("RD"));
        assertEquals("Dire", solution.predictPartyVictory("RDD"));
        assertEquals("Radiant", solution.predictPartyVictory("DRRDRDRDRDDRDRDR"));
    }
}