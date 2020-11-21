package Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class StackTest {
    private Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void newStack_isEmpty() throws Exception {
        assertTrue(stack.isEmpty(), "Stack should be empty after creation");
//        assertFalse(stack.isEmpty(), "Stack should not be empty");
    }

    @Test
    public void afterOnePush_isNotEmpty() throws Exception {
        stack.push(0);
        assertFalse(stack.isEmpty(), "Stack should not be empty");
    }

    @Test()
    void willThrowUnderflow_whenEmptyStackIsPopped() throws Exception {
        assertThrows(Stack.Underflow.class, () -> {
            stack.pop();
        });
    }
}