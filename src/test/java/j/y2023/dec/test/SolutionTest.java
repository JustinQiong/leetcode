package j.y2023.dec.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void solution() {
        Main test = new Main();
        assertEquals(3, test.solution(new int[]{6, 2, 3, 8}));
        assertEquals(15, test.solution(new int[]{6, 2, 3, 20}));
    }
}