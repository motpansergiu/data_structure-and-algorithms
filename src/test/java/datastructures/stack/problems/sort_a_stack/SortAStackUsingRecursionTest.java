package datastructures.stack.problems.sort_a_stack;

import datastructures.stack.Stack;
import datastructures.stack.impl.NodeStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortAStackUsingRecursionTest {
    private SortAStackUsingRecursion sortAStackUsingRecursion;
    private Stack<Integer> stack;

    @BeforeEach
    public void init() {
        stack = new NodeStack<>();
        sortAStackUsingRecursion = new SortAStackUsingRecursion();
    }

    @Test
    void sort() {
        stack.push(-2);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(5);
        stack.push(8);
        stack.push(6);

        sortAStackUsingRecursion.sort(stack);

//        System.out.println(stack);

        Integer firstValue = stack.pop();

        while (!stack.isEmpty()) {
            Integer secondValue = stack.pop();
            assertTrue(firstValue >= secondValue);
            firstValue = secondValue;
        }
    }
}