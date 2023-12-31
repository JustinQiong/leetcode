package j.y2023.dec.q1154;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void dayOnfYear() {
        Solution solution = new Solution();
        assertEquals(9, solution.dayOfYear("2019-01-09"));
        assertEquals(41, solution.dayOfYear("2019-02-10"));
        assertEquals(69, solution.dayOfYear("2019-03-10"));
        assertEquals(70, solution.dayOfYear("2020-03-10"));
        assertEquals(339, solution.dayOfYear("2000-12-04"));
    }
}