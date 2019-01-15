package datastructures.stack.problems.reverse_stack;

import datastructures.stack.Stack;
import datastructures.stack.impl.ArrayStack;
import datastructures.stack.impl.NodeStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStackTest {

    private ReverseStack reverseStack;
    private Stack<Integer> stack;

    @BeforeEach
    public void init() {
        reverseStack = new ReverseStack();
        stack = new NodeStack<>();
    }

    @Test
    void reverse() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        reverseStack.reverse(stack);

        assertEquals(new Integer(1), stack.pop());
        assertEquals(new Integer(2), stack.pop());
        assertEquals(new Integer(3), stack.pop());
        assertEquals(new Integer(4), stack.pop());
        assertEquals(new Integer(5), stack.pop());
    }
}