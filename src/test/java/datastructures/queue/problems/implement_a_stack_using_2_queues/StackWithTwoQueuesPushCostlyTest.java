package datastructures.queue.problems.implement_a_stack_using_2_queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackWithTwoQueuesPushCostlyTest {


    private StackWithTwoQueuesPushCostly<Integer> stackWithTwoQueues;

    @BeforeEach
    public void init() {
        stackWithTwoQueues = new StackWithTwoQueuesPushCostly<>(5);
    }

    @Test
    void pushPop() {
        stackWithTwoQueues.push(4);
        stackWithTwoQueues.push(5);
        stackWithTwoQueues.push(6);

        assertEquals(new Integer(6), stackWithTwoQueues.pop());

        stackWithTwoQueues.push(7);
        stackWithTwoQueues.push(8);
        stackWithTwoQueues.push(9);

        assertEquals(new Integer(9), stackWithTwoQueues.pop());
        assertEquals(new Integer(8), stackWithTwoQueues.pop());
        assertEquals(new Integer(7), stackWithTwoQueues.pop());
        assertEquals(new Integer(5), stackWithTwoQueues.pop());

        stackWithTwoQueues.push(10);

        assertEquals(new Integer(10), stackWithTwoQueues.pop());
    }

}