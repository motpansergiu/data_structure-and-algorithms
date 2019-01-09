package datastructures.stack.problems.min_stack;


import datastructures.stack.Stack;
import datastructures.stack.impl.ArrayStack;

/**         ** TASK **
 * Adăugaţi structurii de stivă o nouă funcţie numită min,
 * funcţie care returnează cel mai mic element.
 * Push, pop şi min trebuie să aibă complexitate O(1)
 */


public class MinStack2 {

    private Stack<Integer> stackValue;
    private Stack<Integer> stackMin;

    public MinStack2(int size) {
        stackValue = new ArrayStack<>(size);
        stackMin = new ArrayStack<>(size);
    }

    public int min() {
        return stackMin.peek();
    }


    public void push(int value) {
        if (null == stackMin.peek() || stackMin.peek() >= value) {
            stackMin.push(value);
        }

        stackValue.push(value);
    }

    public int pop() {

        if (stackValue.peek().equals(stackMin.peek())) {
            stackMin.pop();
        }

        return stackValue.pop();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");

        while (!stackValue.isEmpty()) {
            sb.append("( ")
                    .append(stackMin.peek())
                    .append(":")
                    .append(pop())
                    .append(" ) ");
        }
        sb.append("]");
        return sb.toString();
    }
}
