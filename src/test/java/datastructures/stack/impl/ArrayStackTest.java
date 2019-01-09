package datastructures.stack.impl;

import datastructures.stack.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayStackTest {

    private Stack<Integer> arrayStack;

    @BeforeEach
    public void before() {
        arrayStack = new ArrayStack<>();
    }

    @Test
    void pop() {
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);

        assertEquals(30, (int) arrayStack.pop());
        assertEquals(20, (int) arrayStack.pop());
        assertEquals(10, (int) arrayStack.pop());
    }

    @Test
    void push() {
        arrayStack.push(40);
        arrayStack.push(50);
        arrayStack.push(60);

        assertEquals(60, (int) arrayStack.pop());
        assertEquals(50, (int) arrayStack.pop());
        assertEquals(40, (int) arrayStack.pop());
    }

    @Test
    void peek() {
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);

        assertEquals(30, (int) arrayStack.peek());
    }

    @Test
    void isEmpty() {
        assertTrue(arrayStack.isEmpty());
    }
}