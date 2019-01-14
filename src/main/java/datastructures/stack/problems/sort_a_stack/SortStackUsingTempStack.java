package datastructures.stack.problems.sort_a_stack;

import datastructures.stack.Stack;
import datastructures.stack.impl.NodeStack;

/**
 * * Given a stack, the task is to sort it such that the top of the stack has the greatest element.
 */

public class SortStackUsingTempStack {

    private final Stack<Integer> base;
    private final Stack<Integer> temp;


    public SortStackUsingTempStack(final Stack<Integer> base) {
        this.base = base;
        this.temp = new NodeStack<>();
    }

    public Stack<Integer> sort() {

        while (!base.isEmpty()) {
            int currentValue = base.pop();

            if (!temp.isEmpty() && currentValue < temp.peek()) {

                while (!temp.isEmpty() && currentValue < temp.peek()) {
                    base.push(temp.pop());
                }

            }

            temp.push(currentValue);
        }

        return temp;
    }
}
