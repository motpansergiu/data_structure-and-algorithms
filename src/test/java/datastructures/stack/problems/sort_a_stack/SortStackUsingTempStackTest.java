package datastructures.stack.problems.sort_a_stack;

import datastructures.stack.Stack;
import datastructures.stack.impl.NodeStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortStackUsingTempStackTest {

    private SortStackUsingTempStack stackUsingTempStack;
    private Stack<Integer> base;

    @BeforeEach
    public void init() {
        base = new NodeStack<>();
        stackUsingTempStack = new SortStackUsingTempStack(base);
    }

    @Test
    void sort() {
        base.push(-2);
        base.push(3);
        base.push(5);
        base.push(7);
        base.push(10);
        base.push(5);
        base.push(8);
        base.push(6);

        Stack<Integer> sortedStack = stackUsingTempStack.sort();

//        System.out.println(sortedStack);

        Integer firstValue = sortedStack.pop();

        while (!sortedStack.isEmpty()) {
            Integer secondValue = sortedStack.pop();
            assertTrue(firstValue >= secondValue);
            firstValue = secondValue;
        }
    }
}