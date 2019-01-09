package datastructures.stack.problems.min_stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStack1Test {
    private MinStack1 minStack1;

    @BeforeEach
    public void init() {
        minStack1 = new MinStack1();
    }

    @Test
    void min() {

        minStack1.push(10);
        minStack1.push(20);
        minStack1.push(20);
        minStack1.push(50);
        minStack1.push(5);
        minStack1.push(6);
        minStack1.push(5);
        minStack1.push(7);
        minStack1.push(2);
        minStack1.push(7);
        minStack1.push(2);
        minStack1.push(5);

        minStack1.pop();
        minStack1.pop();
        minStack1.pop();

        assertEquals(2, minStack1.min());

        minStack1.pop();
        minStack1.pop();
        minStack1.pop();

        assertEquals(5, minStack1.min());

        minStack1.pop();
        minStack1.pop();

        assertEquals(10, minStack1.min());
    }
}