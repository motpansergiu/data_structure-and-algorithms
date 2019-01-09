package datastructures.stack.problems.min_stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStack2Test {

    private MinStack2 minStack2;

    @BeforeEach
    public void init() {
        minStack2 = new MinStack2(20);
    }

    @Test
    void min() {

        minStack2.push(10);
        minStack2.push(20);
        minStack2.push(20);
        minStack2.push(50);
        minStack2.push(5);
        minStack2.push(6);
        minStack2.push(5);
        minStack2.push(7);
        minStack2.push(2);
        minStack2.push(7);
        minStack2.push(2);
        minStack2.push(5);

        minStack2.pop();
        minStack2.pop();
        minStack2.pop();

        assertEquals(2, minStack2.min());

        minStack2.pop();
        minStack2.pop();
        minStack2.pop();

        assertEquals(5, minStack2.min());

        minStack2.pop();
        minStack2.pop();

        assertEquals(10, minStack2.min());
    }
}