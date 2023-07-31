package j.q225;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    void testStack() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.top());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.top());
        assertFalse(stack.empty());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.empty());
    }

}