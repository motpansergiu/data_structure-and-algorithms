package datastructures.stack.problems.store_k_in_an_array_efficently;

import java.util.Arrays;

public class ArrayStorageKStack<T> {

    private Object [] storage;
    private int [] next;
    private int [] top;
    private int free;

    public ArrayStorageKStack(int numberOfStacks, int arraySize) {
        top = new int[numberOfStacks];
        next = new int[arraySize];
        storage = new Object[arraySize];
        free = 0;
        Arrays.fill(top, -1);
        initNext(arraySize);
    }

    private void initNext(int arraySize) {
        for (int  i = 0; i < arraySize - 1; ++i) {
            next[i] = i + 1;
        }

        next[arraySize- 1] = -1;
    }

    public void push (int stack, T value) {
        if (isFull()) {
            throw new RuntimeException("The stack is full!");
        }

        int temp = free;
        free = next[temp];
        next[temp] = top[stack];
        top[stack] = temp;
        storage[temp] = value;
    }

    public T pop(int stack) {

        if (isEmpty(stack)) {
            throw new RuntimeException("The stack is empty!");
        }

        int temp = top[stack];
        top[stack] = next[temp];
        next[temp] = free;
        free = temp;

        return (T) storage[temp];
    }


    public boolean isEmpty(int stack) {
        return top[stack] == -1;
    }

    public boolean isFull() {
        return free == -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\ntop [ ");
        for (int i = 0; i < top.length; i++) {
            sb.append(top[i]).append(" ");
        }
        sb.append("]\n");

        sb.append("next [ ");
        for (int i = 0; i < next.length; i++ ) {
            sb.append(next[i]).append(" ");
        }
        sb.append(" ]\n");

        sb.append("storage [ ");
        for (int i = 0; i < storage.length; i++) {
            sb.append(storage[i]).append(" ");
        }
        sb.append(" ]");

        return sb.toString();
    }
}
