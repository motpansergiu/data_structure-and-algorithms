package datastructures.queue.problems.implement_a_queue_using_2_stack;

import datastructures.stack.Stack;
import datastructures.stack.impl.NodeStack;

public class QueueUsingTwoStacks<T> {

    private Stack<T> stack1;
    private Stack<T> stack2;

    public QueueUsingTwoStacks() {
        stack1 = new NodeStack<>();
        stack2 = new NodeStack<>();
    }

    public void enqueue(T value) {
        stack1.push(value);
    }

    public T dequeue() {

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.isEmpty() ? null : stack2.pop();
    }

}
