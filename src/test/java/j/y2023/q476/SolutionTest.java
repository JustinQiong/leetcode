package j.y2023.q476;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findComplement() {
        Solution solution = new Solution();
        assertEquals(2, solution.findComplement(5));
        assertEquals(0, solution.findComplement(1));
        assertEquals(0, solution.findComplement(2147483647));
    }
}