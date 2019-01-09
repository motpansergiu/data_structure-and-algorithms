package datastructures.stack.impl;

import datastructures.stack.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NodeStackTest {

    private Stack<Integer> nodeStack;

    @BeforeEach
    public void before() {
        nodeStack = new NodeStack<>();
    }

    @Test
    void pop() {
        nodeStack.push(10);
        nodeStack.push(20);
        nodeStack.push(30);

        assertEquals(30, (int) nodeStack.pop());
        assertEquals(20, (int) nodeStack.pop());
        assertEquals(10, (int) nodeStack.pop());
    }

    @Test
    void push() {
        nodeStack.push(40);
        nodeStack.push(50);
        nodeStack.push(60);

        assertEquals(60, (int) nodeStack.pop());
        assertEquals(50, (int) nodeStack.pop());
        assertEquals(40, (int) nodeStack.pop());
    }

    @Test
    void peek() {
        nodeStack.push(10);
        nodeStack.push(20);
        nodeStack.push(30);

        assertEquals(30, (int) nodeStack.peek());
    }

    @Test
    void isEmpty() {
        assertTrue(nodeStack.isEmpty());
    }
}