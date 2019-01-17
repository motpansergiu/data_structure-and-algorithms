package datastructures.queue.impl;

import datastructures.queue.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListQueueTest {

    private static final int SIZE = 5;
    private Queue<Integer> queue;

    @BeforeEach
    public void init() {
        queue = new LinkedListQueue<>();
    }

    @Test
    void enqueueAndDequeue() {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        assertEquals(new Integer(10), queue.dequeue());
        assertEquals(new Integer(20), queue.dequeue());
        assertEquals(new Integer(30), queue.dequeue());
        assertEquals(new Integer(40), queue.dequeue());
        assertEquals(new Integer(50), queue.dequeue());
    }

    @Test
    void enqueueAndDequeueMixedOperations() {
        queue.enqueue(30);
        queue.enqueue(20);
        queue.enqueue(10);
        queue.enqueue(100);
        queue.enqueue(200);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(1000);

        assertEquals(new Integer(10), queue.dequeue());
        assertEquals(new Integer(100), queue.dequeue());
        assertEquals(new Integer(200), queue.dequeue());
        assertEquals(new Integer(1000), queue.dequeue());
    }

    @Test
    void front() {
        queue.enqueue(30);
        queue.enqueue(20);
        queue.enqueue(10);
        queue.dequeue();

        assertEquals(new Integer(20), queue.front());
    }

    @Test
    void isEmpty() {
        assertTrue(queue.isEmpty());
    }

}