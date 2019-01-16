package datastructures.queue.problems.implement_a_queue_using_2_stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueUsingTwoStacksTest {

    private QueueUsingTwoStacks<Integer> stack;

    @BeforeEach
    public void init() {
        stack = new QueueUsingTwoStacks<>();
    }

    @Test
    void enqueue() {
        stack.enqueue(10);
        stack.enqueue(20);
        stack.enqueue(30);
        stack.enqueue(40);

        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
        stack.enqueue(50);
        System.out.println(stack.dequeue());

    }
}