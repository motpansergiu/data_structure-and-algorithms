package datastructures.queue.impl;

import datastructures.queue.Deque;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class NodeDequeTest {

    private Deque<Integer> nodeDeque;

    @BeforeEach
    public void before() {
        nodeDeque = new NodeDeque<>();
    }

    @Test
    void addFirst() {

        nodeDeque.addFirst(20);
        nodeDeque.addFirst(10);

        assertEquals(20, (int) nodeDeque.pollLast());

    }

    @Test
    void addLast() {
        nodeDeque.addLast(10);
        nodeDeque.addLast(20);
        nodeDeque.addLast(30);

        assertEquals(10, (int) nodeDeque.pollFirst());
    }

    @Test
    void pollFirst() {

        nodeDeque.addFirst(20);
        nodeDeque.addFirst(10);
        nodeDeque.addFirst(30);

        assertEquals(30, (int) nodeDeque.pollFirst());

    }

    @Test
    void pollLast() {
        nodeDeque.addLast(10);
        nodeDeque.addLast(20);
        nodeDeque.addLast(30);

        assertEquals(30, (int) nodeDeque.pollLast());
    }

    @Test
    void peekFirst() {
        nodeDeque.addLast(10);
        nodeDeque.addLast(20);
        nodeDeque.addLast(30);

        assertEquals(10, (int) nodeDeque.peekFirst());
    }

    @Test
    void peekLast() {
        nodeDeque.addFirst(20);
        nodeDeque.addFirst(10);
        nodeDeque.addFirst(30);

        assertEquals(20, (int) nodeDeque.peekLast());
    }

    @Test
    void isEmptyTrue() {
        assertTrue(nodeDeque.isEmpty());
    }

    @Test
    void isEmptyFalse() {
        nodeDeque.addFirst(20);

        assertFalse(nodeDeque.isEmpty());
    }
}