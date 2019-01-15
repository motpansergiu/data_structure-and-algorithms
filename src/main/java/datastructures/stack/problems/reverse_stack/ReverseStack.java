package datastructures.stack.problems.reverse_stack;

import datastructures.stack.Stack;

public class ReverseStack {

    public void reverse(final Stack<Integer> stack) {

        if (!stack.isEmpty()) {

            int temp = stack.pop();
            reverse(stack);
            reverseElements(stack, temp);
        }
    }

    private void reverseElements(Stack<Integer> stack, int value) {

        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();
        reverseElements(stack, value);
        stack.push(temp);
    }
}
