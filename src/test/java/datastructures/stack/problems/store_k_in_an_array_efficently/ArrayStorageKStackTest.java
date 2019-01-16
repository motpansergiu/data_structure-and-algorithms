package datastructures.stack.problems.store_k_in_an_array_efficently;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStorageKStackTest {

    private ArrayStorageKStack<Integer> stack;

    @BeforeEach
    public void init() {
        stack = new ArrayStorageKStack<>(3, 10);
    }

    @Test
    void pushAndGetException() {
        stack = new ArrayStorageKStack<>(1, 2);
        stack.push(0, 1);
        stack.push(0, 2);
        assertThrows(RuntimeException.class, () -> stack.push(1, 13));
    }

    @Test
    void pushAndPop() {
        stack.push(0, 1);
        stack.push(0, 2);
        System.out.println(stack);

        stack.push(1, 11);
        stack.push(1, 12);
        System.out.println(stack);

        stack.push(0, 3);
        System.out.println(stack);


        System.out.println(stack.pop(0));
        System.out.println(stack);

        System.out.println(stack.pop(1));
        System.out.println(stack);

    }
}