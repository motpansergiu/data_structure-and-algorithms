package datastructures.stack.problems.sort_a_stack;

import datastructures.stack.Stack;

/**
 * Given a stack, the task is to sort it such that the top of the stack has the greatest element.
 *
 */

public class SortAStackUsingRecursion {

    public void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sort(stack);
            sortItems(stack, temp);
        }

    }

    private void sortItems(Stack<Integer> stack, int currentValue) {

        if (stack.isEmpty() || currentValue >= stack.peek()) {
            stack.push(currentValue);
            return;
        }

        int temp = stack.pop();
        sortItems(stack, currentValue);
        stack.push(temp);
    }
}
