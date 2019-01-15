package datastructures.queue.problems.implement_a_stack_using_2_queues;

import datastructures.queue.Queue;
import datastructures.queue.impl.CircularVectorQueue;

public class StackWithTwoQueuesPushCostly<T> {

    private Queue<T> queue1;
    private Queue<T> queue2;

    public StackWithTwoQueuesPushCostly(int size) {
        queue1 = new CircularVectorQueue<>(size);
        queue2 = new CircularVectorQueue<>(size);
    }

    public void push(T value) {
        queue2.enqueue(value);

        while (!queue1.isEmpty()) {
            queue2.enqueue(queue1.dequeue());
        }

        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public T pop() {

        if (queue1.isEmpty()) {
            return null;
        }

        return queue1.dequeue();
    }


}
